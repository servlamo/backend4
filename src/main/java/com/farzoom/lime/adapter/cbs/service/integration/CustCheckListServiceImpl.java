package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.PersonRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
@Slf4j
public class CustCheckListServiceImpl implements IntegrationService<CustCheckListRequest> {
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final ObjectFactory of;

    public CustCheckListServiceImpl(AppConfig config) {
        this.relationRepository = new RelationRepository(config.getElasticsearchBaseUrl());
        this.personRepository = new PersonRepository(config.getElasticsearchBaseUrl());
        this.of = new ObjectFactory();
    }

    @Override
    public CustCheckListRequest createRequest(Order order, Company principal, Product product) {
        CustCheckListRequest request = of.createFDX();
        request.setServerInfo(fillServerInfo());
        request.setBankSvcRq(bankSvcRq(principal.getId()));
        return request;
    }

    private CustCheckListRequest.BankSvcRq bankSvcRq(String principalId) {
        CustCheckListRequest.BankSvcRq.CheckList checkList = of.createFDXBankSvcRqCheckList();
        checkList.getCheckType().add("ID_VALIDITY_OFFLINE");

        CustList custList = of.createCustList();

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
            PersonNameType personName = of.createPersonNameType();
            personName.setFirstName(person.getFirstName());
            personName.setLastName(person.getLastName());
            personName.setMiddleName(person.getSecondName());

            Date personBirthday = of.createDate();
            LocalDate birthDate = person.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            personBirthday.setYear(String.valueOf(birthDate.getYear()));
            personBirthday.setMonth(String.format("%02d", birthDate.getMonthValue()));
            personBirthday.setDay(String.format("%02d", birthDate.getDayOfMonth()));

            PersonInfo.IdentityCards identityCards = of.createPersonInfoIdentityCards();
            List<IdentityDocument> documents = person.getIdentityDocuments();
            if (!CollectionUtils.isEmpty(documents)) {
                documents.forEach(doc -> {
                    IdentityCard identityCard = of.createIdentityCard();
                    identityCard.setIdType("21"); // всегда паспорт
                    identityCard.setIdNum(doc.getNumber());
                    identityCard.setIdSeries(doc.getSeries());
                    if (doc.getIssuedDate() != null) {
                        Date issueDt = of.createDate();
                        LocalDate issueLocalDate = doc.getIssuedDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        issueDt.setYear(String.valueOf(issueLocalDate.getYear()));
                        issueDt.setMonth(String.format("%02d", issueLocalDate.getMonthValue()));
                        issueDt.setDay(String.format("%02d", issueLocalDate.getDayOfMonth()));
                        identityCard.setIssueDt(issueDt);
                    }
                    identityCards.getIdentityCard().add(identityCard);
                });
            }

            PersonInfo personInfo = of.createPersonInfo();
            personInfo.setPersonName(personName);
            personInfo.setBirthday(personBirthday);
            personInfo.setIdentityCards(identityCards);

            CustInfoType custInfo = of.createCustInfoType();
            custInfo.setPersonInfo(personInfo);

            custList.getCustRec().add(custInfo);
        });

        CustCheckListRequest.BankSvcRq bankSvcRq = of.createFDXBankSvcRq();
        bankSvcRq.setCheckList(checkList);
        bankSvcRq.setCustList(custList);
        return bankSvcRq;
    }

    private ServerInfoType fillServerInfo() {
        ServerInfoType serverInfoType = of.createServerInfoType();
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
