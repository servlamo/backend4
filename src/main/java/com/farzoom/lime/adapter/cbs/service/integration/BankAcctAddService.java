package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefItem;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.*;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rq.BankAcctAddRq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static java.util.Objects.isNull;

public class BankAcctAddService implements IntegrationService<BankAcctAddRq> {

    private final RelationRepository relationRepository;
    private final CompanyRepository companyRepository;
    private final PersonRepository personRepository;
    private final RefService refService;
    private final GenParamService genParamService;


    public BankAcctAddService(AppConfig config) {
        relationRepository = new RelationRepository(config.getElasticsearchBaseUrl());
        companyRepository = new CompanyRepository(config.getElasticsearchBaseUrl());
        refService = new RefServiceImpl(new EsRepository(config.getElasticsearchBaseUrl()));
        this.personRepository = new PersonRepository(config.getElasticsearchBaseUrl());
        this.genParamService = new GenParamServiceImpl(
                new AttributeRepository(config.getElasticsearchBaseUrl()),
                new GroupRepository(config.getElasticsearchBaseUrl()),
                new ParamRepository(config.getElasticsearchBaseUrl()),
                refService
        );
    }

    @Override
    public BankAcctAddRq createRequest(Order order, Company principal, Product product) {
        BankAcctAddRq rq = new BankAcctAddRq();
        rq.setServerInfo(serverInfo());
        rq.setBankSvcRq(bankSvcRq(order, principal, product));
        return rq;
    }

    private BankAcctAddRq.BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        BankAcctAddRq.BankSvcRq bankSvcRq = new BankAcctAddRq.BankSvcRq();
        bankSvcRq.setSPInfo(spInfo(order));
        bankSvcRq.setCustInfo(custInfo(order));
        bankSvcRq.setOrgInfo(orgInfo(principal, product));
        bankSvcRq.setChannel("DO");
        return bankSvcRq;
    }

    private BankAcctAddRq.BankSvcRq.OrgInfo orgInfo(Company principal, Product product) {
        BankAcctAddRq.BankSvcRq.OrgInfo orgInfo = new BankAcctAddRq.BankSvcRq.OrgInfo();
        orgInfo.setLegalName(principal.getFullName());
        orgInfo.setClassifierId(classifier(principal));
        orgInfo.setTaxId(principal.getINN());
        orgInfo.setStateRegPrimeNum(principal.getOGRN());
        orgInfo.setBankInfo(getBankInfo(product.getId()));
        return orgInfo;
    }

    private ClassifierId classifier(Company principal) {
        ClassifierId classifierId = new ClassifierId();
        classifierId.setClassifierType("RUS.OKOPF");
        classifierId.setClassifierCode(findOkopf(principal.getOKOPF()));
        return classifierId;
    }

    private String findOkopf(String okopf) {
        String okopfName = okopf;
        Optional<RefItem> refOkopf = refService.getItems("okopfCode")
                .stream()
                .filter(refItem -> refItem.getValue().equalsIgnoreCase(okopf))
                .findFirst();
        if (refOkopf.isPresent()) {
            okopfName = refOkopf.get().getName();
        }

        return okopfName;
    }

    private BankAcctAddRq.BankSvcRq.OrgInfo.BankInfo getBankInfo(String productId) {
        BankAcctAddRq.BankSvcRq.OrgInfo.BankInfo info = new BankAcctAddRq.BankSvcRq.OrgInfo.BankInfo();
        String podrId = "__";
        String podrName = "MTS_BANK";
        GenParam param = genParamService.loadOne("product", productId, "product.rko.filial");
        if (!isNull(param) && !isNull(param.getValue()) && !isNull(param.getValue().getKeyValue()))
            podrId = param.getValue().getKeyValue();
        else
            throw new RuntimeException("Required key param  product.rko.filial  is not set for product " + productId);
        String podrIdS = podrId;
        Optional<RefItem> filial = refService.getItems("rkoFilialType")
                .stream()
                .filter(refItem -> refItem.getValue().equalsIgnoreCase(podrIdS))
                .findFirst();
        if (filial.isPresent()) {
            podrName = filial.get().getName();
        }

        info.setAgencyId(podrId);
        info.setAgencyName(podrName);
        return info;
    }

    private BankAcctAddRq.BankSvcRq.CustInfo custInfo(Order order) {
        //  Person director = findDirector(order.getPrincipalCompanyId());
        // директора в этот момент ещё нет, надо брать из контактного лица, т.е. из парамсов
        String fio = getParamValue(order.getId(), "order.rko.contacts.fio", "string");
        String email = getParamValue(order.getId(), "order.rko.contacts.email", "key");
        String phone = getParamValue(order.getId(), "order.rko.contacts.cellPhone", "key");

        BankAcctAddRq.BankSvcRq.CustInfo custInfo = new BankAcctAddRq.BankSvcRq.CustInfo();
        custInfo.setFullName(fio);
        custInfo.setPersonInfo(personInfo(fio, email, phone));
        return custInfo;
    }

    private BankAcctAddRq.BankSvcRq.CustInfo.PersonInfo personInfo(String fio, String email, String phone) {
        BankAcctAddRq.BankSvcRq.CustInfo.PersonInfo personInfo = new BankAcctAddRq.BankSvcRq.CustInfo.PersonInfo();
        personInfo.setPersonName(personName(fio));
        personInfo.setResident(true);
        personInfo.setContactInfo(contactInfo(email, phone));
        return personInfo;
    }

    private ContactInfo contactInfo(String email, String phone) {
        ContactInfo contactInfo = new ContactInfo();
        List<PhoneNum> phoneNumsList = new ArrayList<>();
        List<String> emailAddrsList = new ArrayList<>();

        PhoneNum phoneNum = new PhoneNum();
        phoneNum.setPhone(phone);
        phoneNumsList.add(phoneNum);
        emailAddrsList.add(email);

        PhoneNums phoneNums = new PhoneNums();
        phoneNums.getPhoneNum().addAll(phoneNumsList);
        contactInfo.setPhoneNums(phoneNums);

        EmailAddrs emailAddrs = new EmailAddrs();
        emailAddrs.getEmailAddr().addAll(emailAddrsList);
        contactInfo.setEmailAddrs(emailAddrs);

        return contactInfo;
    }

    private PersonNameType personName(String fio) {
        PersonNameType personName = new PersonNameType();
        String name1;
        String name2;
        String name3;
        int pos = fio.indexOf(" ");
        if (pos < 0) {
            name1 = fio;
            name2 = "-"; // required
            name3 = "";
        } else {
            name1 = fio.substring(0, pos);
            String fio2 = fio.substring(pos + 1);
            pos = fio2.indexOf(" ");
            if (pos < 0) {
                name2 = fio2;
                name3 = "";
            } else {
                name2 = fio2.substring(0, pos);
                name3 = fio2.substring(pos + 1);
            }
        }

        personName.setLastName(name1);
        personName.setFirstName(name2);
        personName.setMiddleName(name3);
        return personName;
    }

    @SuppressWarnings("Duplicates")
    private Person findDirector(String principalId) {
        String query = String.format("rightId:%s AND relationTypeRefId:employee AND employee.isMain:true", principalId);
        List<Relation> relations = relationRepository.search(query, 1, null);
        return relations.stream().map(r -> personRepository.load(r.getLeftId())).findFirst().get();
    }

    private BankAcctAddRq.BankSvcRq.SPInfo spInfo(Order order) {
        BankAcctAddRq.BankSvcRq.SPInfo spInfo = new BankAcctAddRq.BankSvcRq.SPInfo();
        spInfo.setProdCode("RKO");
        spInfo.setCashCount(BigInteger.ZERO);
        spInfo.setRequestId(CORRELATION_ID_PLACEHOLDER);
        return spInfo;
    }

    private ServerInfoType serverInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);;
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("BankAcctAddRq");
        serverInfoType.setBpId("MTS_RES_ACC_CRM");
        return serverInfoType;
    }

    private String getParamValue(String orderId, String paramName, String type) {
        GenParam param = genParamService.loadOne("order", orderId, paramName);
        if ("string".equalsIgnoreCase(type)) {
            if (isNull(param) || isNull(param.getValue()) || isNull(param.getValue().getStringValue())) {
                throw new RuntimeException("Required string param " + paramName + " is not set for order " + orderId);
            } else return param.getValue().getStringValue();

        } else {
            if (isNull(param) || isNull(param.getValue()) || isNull(param.getValue().getKeyValue())) {
                throw new RuntimeException("Required key param " + paramName + " is not set for order " + orderId);
            } else return param.getValue().getKeyValue();
        }
    }
}
