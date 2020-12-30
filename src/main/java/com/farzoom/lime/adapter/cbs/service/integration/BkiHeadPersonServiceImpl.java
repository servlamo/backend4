package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.AddressRepository;
import com.farzoom.common.persistence.es.repositories.PersonRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static com.farzoom.lime.adapter.cbs.utils.MoneyUtils.toMoney;

@Service
public class BkiHeadPersonServiceImpl implements IntegrationService<BkiRequest> {
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    public BkiHeadPersonServiceImpl(AppConfig config) {
        this.relationRepository = new RelationRepository((config.getElasticsearchBaseUrl()));
        this.personRepository = new PersonRepository((config.getElasticsearchBaseUrl()));
        this.addressRepository = new AddressRepository(config.getElasticsearchBaseUrl());
    }

    @Override
    public BkiRequest createRequest(Order order, Company principal, Product product) {
        BkiRequest bkiRequest = new BkiRequest();
        bkiRequest.setServerInfo(serverInfoType());
        bkiRequest.setBankSvcRq(bankSvcRq(order, principal, product));
        return bkiRequest;
    }

    private ServerInfoType serverInfoType() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("CR");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("SPRExtCheckInqRq");
        return serverInfoType;
    }

    private BkiRequest.BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        Person director = findDirector(order.getPrincipalCompanyId());

        LocalDate consentEndDate = principal.getPermissionsInfo() != null &&
                principal.getPermissionsInfo().getCreditHistoryPermission() != null &&
                principal.getPermissionsInfo().getCreditHistoryPermission().getActiveTill() != null ?
                principal.getPermissionsInfo()
                        .getCreditHistoryPermission().getActiveTill()
                        .toInstant().atZone(ZoneId.systemDefault()).toLocalDate() :
                LocalDate.now();

        LocalDate consentDate = principal.getPermissionsInfo() != null &&
                principal.getPermissionsInfo().getCreditHistoryPermission() != null &&
                principal.getPermissionsInfo().getCreditHistoryPermission().getActiveFrom() != null ?
                principal.getPermissionsInfo()
                        .getCreditHistoryPermission().getActiveFrom()
                        .toInstant().atZone(ZoneId.systemDefault()).toLocalDate() :
                LocalDate.now();


        LocalDateTime dt = LocalDateTime.now();

        BankInfo bankInfo = new BankInfo();
        bankInfo.setAgencyId("999");

        EmplInfoType emplInfo = new EmplInfoType();
        emplInfo.setName(" ");
        emplInfo.setBankInfo(bankInfo);

        DateTime origDt = new DateTime();
        origDt.setYear(dt.getYear());
        origDt.setMonth(dt.getMonthValue());
        origDt.setDay(dt.getDayOfMonth());
        origDt.setHour(dt.getHour());
        origDt.setMinute(dt.getMinute());
        origDt.setSecond(dt.getSecond());

        BkiRequest.BankSvcRq.RequestInfo.ProdInfo prodInfo =
                new BkiRequest.BankSvcRq.RequestInfo.ProdInfo();
        prodInfo.setProdType("CREDITTYPE.4");
        prodInfo.setProdCode("MTS.WEEKEND.CC");
        prodInfo.setAcctCur("RUB");
        CurrencyAmount requestAmt = new CurrencyAmount();
        if (product.getAmount() != null && product.getAmount() != 0)
            requestAmt.setAmt(toMoney(product.getAmount()));
        else
            requestAmt.setAmt(BigDecimal.ZERO);
        prodInfo.setRequestAmt(requestAmt);

        BkiRequest.BankSvcRq.RequestInfo requestInfo =
                new BkiRequest.BankSvcRq.RequestInfo();
        requestInfo.setOrigDt(origDt);
        requestInfo.setProdInfo(prodInfo);
        requestInfo.setRequestId(order.getId());

        CRECustInfoType.PersonInfo personInfo =
                new CRECustInfoType.PersonInfo();
        personInfo.setGender("1");
        personInfo.setBirthPlace(director.getBirthPlace());
        personInfo.setBirthday(toBkiDate(
                director.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));

        PersonNameType personName = new PersonNameType();
        personName.setLastName(director.getLastName());
        personName.setFirstName(director.getFirstName());
        personName.setMiddleName(director.getSecondName());
        personInfo.setPersonName(personName);

        Citizenship citizenship = new Citizenship();
        citizenship.setCountry(director.getCitizenship());
        personInfo.setCitizenship(citizenship);


        personInfo.setMaritalStatus("");
        personInfo.setEducationStatus("");
        personInfo.setTaxId(director.getINN());
        personInfo.setDependents("");

        if (director.getIdentityDocuments().size() > 0) {
            IdentityDocument identityDocument = director.getIdentityDocuments().get(0);
            IdentityCard identityCard = new IdentityCard();
            identityCard.setPrimary(true);
            identityCard.setIdType("21");
            identityCard.setIdNum(identityDocument.getNumber());
            identityCard.setIdSeries(identityDocument.getSeries());
            identityCard.setIssuedBy(identityDocument.getIssuingAuthority());
            identityCard.setIssueDt(toBkiDate(
                    identityDocument.getIssuedDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));

            CRECustInfoType.PersonInfo.IdentityCards identityCards = new CRECustInfoType.PersonInfo.IdentityCards();
            identityCards.setIdentityCard(identityCard);
            personInfo.setIdentityCards(identityCards);
        }

        Address regAddress = addressRepository.load(director.getRegistrationAddressId());

        ContactInfo.PostAddrs postAddrs = new ContactInfo.PostAddrs();
        postAddrs.getPostAddr().add(toBkiAddr(regAddress, "ADDRESS.TYPE.1"));
        postAddrs.getPostAddr().add(toBkiAddr(regAddress, "ADDRESS.TYPE.2"));

        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setPostAddrs(postAddrs);
        if (director.getContacts().size() > 0) {
            PhoneNum phoneNum = new PhoneNum();
            phoneNum.setPhone(director.getContacts().get(0).getPhone());
            ContactInfo.PhoneNums phoneNums = new ContactInfo.PhoneNums();
            phoneNums.getPhoneNum().add(phoneNum);
            contactInfo.setPhoneNums(phoneNums);
        }

        personInfo.setContactInfo(contactInfo);

        FlagsType flags = new FlagsType();
        flags.setPassBKI(true);
        flags.setPassBKIDt(toBkiDate(consentDate));

        CRECustInfoType custInfo = new CRECustInfoType();
        custInfo.setPersonInfo(personInfo);
        custInfo.setFlags(flags);

        BkiRequest.BankSvcRq.SPRInfo sprInfo = new BkiRequest.BankSvcRq.SPRInfo();
        sprInfo.setProcessCode("MTS.MONEY.CODE.PROCESS");

        BkiRequest.BankSvcRq.SPRInfo.ConnectorList connectorList =
                new BkiRequest.BankSvcRq.SPRInfo.ConnectorList();

        BkiRequest.BankSvcRq.SPRInfo.ConnectorList.ConnectorRec connectorRec0 =
                new BkiRequest.BankSvcRq.SPRInfo.ConnectorList.ConnectorRec();
        connectorRec0.setConnectorCode("0");
        connectorList.getConnectorRec().add(connectorRec0);

        BkiRequest.BankSvcRq.SPRInfo.ConnectorList.ConnectorRec connectorRec3 =
                new BkiRequest.BankSvcRq.SPRInfo.ConnectorList.ConnectorRec();
        connectorRec3.setConnectorCode("3");
        connectorList.getConnectorRec().add(connectorRec3);

        BkiRequest.BankSvcRq.SPRInfo.ConnectorList.ConnectorRec connectorRec6 =
                new BkiRequest.BankSvcRq.SPRInfo.ConnectorList.ConnectorRec();
        connectorRec6.setConnectorCode("6");
        connectorList.getConnectorRec().add(connectorRec6);

        sprInfo.setConnectorList(connectorList);

        sprInfo.setCacheUse("-1");
        sprInfo.setConsentPurposeCode("1");
        sprInfo.setConsentEndDt(toBkiDate(consentEndDate));
        sprInfo.setConsentDt(toBkiDate(consentDate));
        sprInfo.setReason("CREDIT.DECISIONSPR2");
        sprInfo.setConsentUser("ПАО &quot;МТС-БАНК&quot;");

        BkiRequest.BankSvcRq bankSvcRq = new BkiRequest.BankSvcRq();
        bankSvcRq.setSPRInfo(sprInfo);
        bankSvcRq.setRequestInfo(requestInfo);
        bankSvcRq.setEmplInfo(emplInfo);
        bankSvcRq.setCustInfo(custInfo);

        return bankSvcRq;
    }

    @SuppressWarnings("Duplicates")
    private Person findDirector(String principalId) {
        String query = String.format("rightId:%s AND relationTypeRefId:employee AND employee.isMain:true", principalId);
        List<Relation> relations = relationRepository.search(query, 1, null);
        return relations.stream().map(r -> personRepository.load(r.getLeftId())).findFirst().get();
    }

    private Date toBkiDate(LocalDate localDate) {
        if (localDate == null)
            return null;
        Date bkiDate = new Date();
        bkiDate.setYear(localDate.getYear());
        bkiDate.setMonth(localDate.getMonthValue());
        bkiDate.setDay(localDate.getDayOfMonth());
        return bkiDate;
    }

    private AddrType toBkiAddr(Address address, String type) {
        AddrType addr = new AddrType();
        addr.setAddrType(type);
        addr.setCountryCode(address.getCountry().equals("Россия") ? "RU" : address.getCountry());
        addr.setRegion(address.getRegion());
        addr.setRegionCode(address.getRegion_type());
        addr.setCity(address.getCity());
        addr.setCityCode(address.getCity_type());
        addr.setStateProv(address.getSettlement());
        addr.setStateProvCode(address.getSettlement_type());
        addr.setStreet(address.getStreet());
        addr.setStreetCode(address.getStreet_type());
        if (address.getHouse() != null) {
            String houseNum = address.getHouse().replaceAll("[^\\d]", "");
            if (!houseNum.isEmpty())
                addr.setHouseNum(new BigInteger(houseNum));
        }
        addr.setKladrCode(address.getKladr_id());
        addr.setPostalCode(address.getPostal_code());
        return  addr;
    }

}
