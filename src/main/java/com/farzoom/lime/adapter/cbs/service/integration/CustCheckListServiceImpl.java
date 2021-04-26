package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.PersonRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Slf4j
@Service
@AllArgsConstructor
public class CustCheckListServiceImpl implements IntegrationService<CustCheckListRequest> {
    private static final ObjectFactory OBJECT_FACTORY = new ObjectFactory();

    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;

    @Override
    public CustCheckListRequest createRequest(Order order, Company principal, Product product) {
        CustCheckListRequest request = OBJECT_FACTORY.createFDX();
        request.setServerInfo(fillServerInfo());
        request.setBankSvcRq(bankSvcRq(principal.getId()));
        return request;
    }

    private CustCheckListRequest.BankSvcRq bankSvcRq(String principalId) {
        CustCheckListRequest.BankSvcRq.CheckList checkList = OBJECT_FACTORY.createFDXBankSvcRqCheckList();
        checkList.getCheckType().add("ID_VALIDITY_OFFLINE");

        CustList custList = OBJECT_FACTORY.createCustList();

        String query = String.format("rightId:%s", principalId);
        log.info("Query load relations: {}", query);
        List<Relation> relations = relationRepository.search(query, 1000, null);
        List<String> personIds = relations.stream()
                .filter(x -> !"companyFounder".equalsIgnoreCase(x.getRelationTypeRefId())
                        && (x.getPersonBeneficiary() != null
                        || x.getSigner() != null
                        || (x.getEmployee() != null && x.getEmployee().getIsMain() != null && x.getEmployee().getIsMain()))
                ).map(Relation::getLeftId)
                .collect(Collectors.toList());

        query = "_id:" + String.join(" or _id:", personIds);
        log.info("Query load persons by ids: {}", query);
        List<Person> persons = personRepository.search(query, personIds.size(), null);
        persons.forEach(person -> {
            PersonNameType personName = OBJECT_FACTORY.createPersonNameType();
            personName.setFirstName(person.getFirstName());
            personName.setLastName(person.getLastName());
            personName.setMiddleName(person.getSecondName());

            Date personBirthday = OBJECT_FACTORY.createDate();
            LocalDate birthDate = person.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            personBirthday.setYear(String.valueOf(birthDate.getYear()));
            personBirthday.setMonth(String.format("%02d", birthDate.getMonthValue()));
            personBirthday.setDay(String.format("%02d", birthDate.getDayOfMonth()));

            PersonInfo.IdentityCards identityCards = OBJECT_FACTORY.createPersonInfoIdentityCards();
            List<IdentityDocument> documents = person.getIdentityDocuments();
            if (!CollectionUtils.isEmpty(documents)) {
                documents.forEach(doc -> {
                    IdentityCard identityCard = OBJECT_FACTORY.createIdentityCard();
                    identityCard.setIdType("21"); // всегда паспорт
                    identityCard.setIdNum(doc.getNumber());
                    identityCard.setIdSeries(doc.getSeries());
                    if (doc.getIssuedDate() != null) {
                        Date issueDt = OBJECT_FACTORY.createDate();
                        LocalDate issueLocalDate = doc.getIssuedDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        issueDt.setYear(String.valueOf(issueLocalDate.getYear()));
                        issueDt.setMonth(String.format("%02d", issueLocalDate.getMonthValue()));
                        issueDt.setDay(String.format("%02d", issueLocalDate.getDayOfMonth()));
                        identityCard.setIssueDt(issueDt);
                    }
                    identityCards.getIdentityCard().add(identityCard);
                });
            }

            PersonInfo personInfo = OBJECT_FACTORY.createPersonInfo();
            personInfo.setPersonName(personName);
            personInfo.setBirthday(personBirthday);
            personInfo.setIdentityCards(identityCards);

            CustInfoType custInfo = OBJECT_FACTORY.createCustInfoType();
            custInfo.setPersonInfo(personInfo);

            custList.getCustRec().add(custInfo);
        });

        CustCheckListRequest.BankSvcRq bankSvcRq = OBJECT_FACTORY.createFDXBankSvcRq();
        bankSvcRq.setCheckList(checkList);
        bankSvcRq.setCustList(custList);
        return bankSvcRq;
    }

    private ServerInfoType fillServerInfo() {
        ServerInfoType serverInfoType = OBJECT_FACTORY.createServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IDBANK");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("CustCheckListInqRq");
        serverInfoType.setBpId("LONG_RESP");
        return serverInfoType;
    }

}
