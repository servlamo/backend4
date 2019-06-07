package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.PersonRepository;
import com.farzoom.common.persistence.es.repositories.ProductRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.request.*;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
public class AfsServiceImpl implements IntegrationService<SPRCustCheckRequest> {

    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final ProductRepository productRepository;
    private final ObjectFactory of;

    public AfsServiceImpl(AppConfig config) {
        this.relationRepository = new RelationRepository(config.getElasticsearchBaseUrl());
        this.personRepository = new PersonRepository(config.getElasticsearchBaseUrl());
        this.productRepository = new ProductRepository(config.getElasticsearchBaseUrl());
        this.of = new ObjectFactory();
    }

    @Override
    public SPRCustCheckRequest createRequest(Order order, Company principal, Product product) {
        SPRCustCheckRequest request = of.createFDX();
        request.setBankSvcRq(fillBankSvcRq(order, principal));
        request.setServerInfo(fillServerInfo());
        return request;
    }

    private SPRCustCheckRequest.BankSvcRq fillBankSvcRq(Order order, Company principal) {
        Person director = findDirector(principal.getId());

        SPRCustCheckRequest.BankSvcRq bankSvcRq = of.createFDXBankSvcRq();

        SPRCustCheckRequest.BankSvcRq.SPRInfo sprInfo = fillSPRInfo(order);
        bankSvcRq.setSPRInfo(sprInfo);

        SPRCustCheckRequest.BankSvcRq.OrgList orgList = fillOrgList(principal);
        bankSvcRq.setOrgList(orgList);

        SPRCustCheckRequest.BankSvcRq.CustList custList = fillCustList(director);
        bankSvcRq.setCustList(custList);

        SPRCustCheckRequest.BankSvcRq.IdentityCards identityCards = fillIdentityCards(director);
        bankSvcRq.setIdentityCards(identityCards);

        SPRCustCheckRequest.BankSvcRq.RequestList requestList = fillRequestList();
        bankSvcRq.setRequestList(requestList);

        SPRCustCheckRequest.BankSvcRq.Cust2OrgLinks cust2OrgLinks = fillCust2OrgLinks();
        bankSvcRq.setCust2OrgLinks(cust2OrgLinks);

        SPRCustCheckRequest.BankSvcRq.Cust2RequestLinks cust2RequestLinks = fillCust2RequestLinks();
        bankSvcRq.setCust2RequestLinks(cust2RequestLinks);

        SPRCustCheckRequest.BankSvcRq.SPInfo spInfo = fillSPInfo();
        bankSvcRq.setSPInfo(spInfo);

        return bankSvcRq;
    }

    private Person findDirector(String principalId) {
        String query = String.format("rightId:%s AND relationTypeRefId:employee AND employee.isMain:true", principalId);
        List<Relation> relations = relationRepository.search(query, 1, null);
        return relations.stream().map(r -> personRepository.load(r.getLeftId())).findFirst().get();
    }

    private SPRCustCheckRequest.BankSvcRq.SPRInfo fillSPRInfo(Order order) {
        SPRCustCheckRequest.BankSvcRq.SPRInfo sprInfo = of.createFDXBankSvcRqSPRInfo();
        sprInfo.setId(Integer.valueOf(
                productRepository.load(order.getProductId())
                        .getBankGuarantee()
                        .getBgNumber()
                        .replaceAll("[^\\d]", "")));
        sprInfo.setType("1");
        sprInfo.setOrigDt(toAfsDateTime(order.getCreatedDateTime()));
        return sprInfo;
    }

    private SPRCustCheckRequest.BankSvcRq.OrgList fillOrgList(Company principal) {
        SPRCustCheckRequest.BankSvcRq.OrgList orgList = of.createFDXBankSvcRqOrgList();
        AfsOrgInfoType orgInfoType = of.createAfsOrgInfoType();
        orgInfoType.setId(1);
        orgInfoType.setTaxId(principal.getINN());
        orgInfoType.setLegalName(principal.getFullName());
        orgInfoType.setName(principal.getShortName());
        orgList.getOrgRec().add(orgInfoType);
        return orgList;
    }

    private SPRCustCheckRequest.BankSvcRq.CustList fillCustList(Person person) {
        SPRCustCheckRequest.BankSvcRq.CustList custList = of.createFDXBankSvcRqCustList();
        AfsCustInfoType custInfoType = of.createAfsCustInfoType();
        custInfoType.setId(1);
        AfsCustInfoType.PersonInfo personInfo = fillPersonInfo(person);
        custInfoType.setPersonInfo(personInfo);
        custList.getCustRec().add(custInfoType);
        return custList;
    }

    private AfsCustInfoType.PersonInfo fillPersonInfo(Person person) {
        AfsCustInfoType.PersonInfo personInfo = of.createAfsCustInfoTypePersonInfo();
        personInfo.setBirthday(toAfsDate(person.getBirthDate()));
        PersonNameType personName = of.createPersonNameType();
        personName.setFirstName(person.getFirstName());
        personName.setMiddleName(person.getSecondName());
        personName.setLastName(person.getLastName());
        personInfo.setPersonName(personName);
        return personInfo;
    }

    private SPRCustCheckRequest.BankSvcRq.IdentityCards fillIdentityCards(Person person) {
        SPRCustCheckRequest.BankSvcRq.IdentityCards identityCards = of.createFDXBankSvcRqIdentityCards();
        AfsIdentityCardType afsIdentityCard = of.createAfsIdentityCardType();
        afsIdentityCard.setId(1);
        afsIdentityCard.setIdSeries(person.getIdentityDocuments().get(0).getSeries());
        afsIdentityCard.setIdNum(person.getIdentityDocuments().get(0).getNumber());
        identityCards.getIdentityCard().add(afsIdentityCard);
        return identityCards;
    }

    private SPRCustCheckRequest.BankSvcRq.RequestList fillRequestList() {
        SPRCustCheckRequest.BankSvcRq.RequestList requestList = of.createFDXBankSvcRqRequestList();
        AfsRequestInfoType afsRequestInfo = of.createAfsRequestInfoType();
        afsRequestInfo.setId(1);
        afsRequestInfo.setSalesSource("FARZOOM");
        requestList.getRequestRec().add(afsRequestInfo);
        return requestList;
    }

    private SPRCustCheckRequest.BankSvcRq.Cust2OrgLinks fillCust2OrgLinks() {
        SPRCustCheckRequest.BankSvcRq.Cust2OrgLinks cust2OrgLinks = of.createFDXBankSvcRqCust2OrgLinks();
        SPRCustCheckRequest.BankSvcRq.Cust2OrgLinks.Cust2OrgLink cust2OrgLink = of.createFDXBankSvcRqCust2OrgLinksCust2OrgLink();
        cust2OrgLink.setLinkType("EMPLOYEE");
        cust2OrgLink.setCustId("1");
        cust2OrgLink.setOrgId("1");
        cust2OrgLink.setEmploymentType("WORKACTIVITY.1");
        cust2OrgLinks.getCust2OrgLink().add(cust2OrgLink);
        return cust2OrgLinks;
    }

    private SPRCustCheckRequest.BankSvcRq.Cust2RequestLinks fillCust2RequestLinks() {
        SPRCustCheckRequest.BankSvcRq.Cust2RequestLinks cust2RequestLinks = of.createFDXBankSvcRqCust2RequestLinks();
        SPRCustCheckRequest.BankSvcRq.Cust2RequestLinks.Cust2RequestLink cust2RequestLink = of.createFDXBankSvcRqCust2RequestLinksCust2RequestLink();
        cust2RequestLink.setLinkType("ROLE.IN.DEAL.1");
        cust2RequestLink.setRole("ROLE.IN.DEAL.1");
        cust2RequestLink.setCustId("1");
        cust2RequestLink.setRequestId("1");
        cust2RequestLinks.getCust2RequestLink().add(cust2RequestLink);
        return cust2RequestLinks;
    }

    private SPRCustCheckRequest.BankSvcRq.SPInfo fillSPInfo() {
        SPRCustCheckRequest.BankSvcRq.SPInfo spInfo = of.createFDXBankSvcRqSPInfo();
        spInfo.setAction("matchUpdate");
        spInfo.setRuleSetId("farzoom");
        return spInfo;
    }

    private DateTime toAfsDateTime(java.util.Date date) {
        DateTime afsDateTime = of.createDateTime();
        ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());

        afsDateTime.setYear(zdt.getYear());
        afsDateTime.setMonth(zdt.getMonthValue());
        afsDateTime.setDay(zdt.getDayOfMonth());
        afsDateTime.setHour(zdt.getHour());
        afsDateTime.setMinute(zdt.getMinute());
        afsDateTime.setSecond(zdt.getSecond());

        return afsDateTime;
    }

    private Date toAfsDate(java.util.Date date) {
        Date afsDate = of.createDate();
        ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());

        afsDate.setYear(zdt.getYear());
        afsDate.setMonth(zdt.getMonthValue());
        afsDate.setDay(zdt.getDayOfMonth());

        return afsDate;
    }

    private ServerInfoType fillServerInfo() {
        ServerInfoType serverInfoType = of.createServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("AFS");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("SPRCustCheckInqRq");
        serverInfoType.setBpId("LONG_RESP");
        return serverInfoType;
    }
}
