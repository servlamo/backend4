package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.AttributeRepository;
import com.farzoom.common.persistence.es.repositories.GroupRepository;
import com.farzoom.common.persistence.es.repositories.ParamRepository;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.PhoneNum;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.SmsBankInfoModRequest;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static java.util.Objects.isNull;

public class SmsBankInfoModService implements IntegrationService<SmsBankInfoModRequest> {

    private final GroupRepository groupRepository;
    private final ParamRepository paramRepository;
    private final AttributeRepository attributeRepository;
    private final EsRepository esRepository;
    RefService refService;
    GenParamService genParamService;

    public SmsBankInfoModService(AppConfig config) {
        groupRepository = new GroupRepository(config.getElasticsearchBaseUrl());
        paramRepository = new ParamRepository(config.getElasticsearchBaseUrl());
        attributeRepository = new AttributeRepository(config.getElasticsearchBaseUrl());
        esRepository = new EsRepository(config.getElasticsearchBaseUrl());
        refService = new RefServiceImpl(esRepository);
        genParamService = new GenParamServiceImpl(attributeRepository, groupRepository, paramRepository, refService);
    }

    @Override
    public SmsBankInfoModRequest createRequest(Order order, Company principal, Product product) {
        SmsBankInfoModRequest rq = new SmsBankInfoModRequest();
        rq.setServerInfo(setServerInfo());
        rq.setBankSvcRq(bankSvcRq(order, principal, product));
        return rq;
    }

    private SmsBankInfoModRequest.BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        SmsBankInfoModRequest.BankSvcRq bankSvcRq = new SmsBankInfoModRequest.BankSvcRq();

        bankSvcRq.setOrgInfo(orgInfo(principal));
        bankSvcRq.setBankAcctList(getAccList(order, product));
        //bankSvcRq.setAction();
        bankSvcRq.setStartDt(getDate());
        return bankSvcRq;
    }

    private com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.Date getDate() {
        com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.Date retDate = new
                com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.Date();
        LocalDate dd = LocalDate.now();
        retDate.setYear(dd.getYear());
        retDate.setMonth(dd.getMonthValue());
        retDate.setDay(dd.getDayOfMonth());
        return retDate;
    }

    private SmsBankInfoModRequest.BankSvcRq.BankAcctList getAccList(Order order, Product product) {
        SmsBankInfoModRequest.BankSvcRq.BankAcctList bankAcctList = new SmsBankInfoModRequest.BankSvcRq.BankAcctList();
        List<SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec> bankAcctRec = bankAcctList.getBankAcctRec();

        SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec rec = new SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec();

        GenParam paramAcc = genParamService.loadOne("product", product.getId(), "product.rko.accNumber");
        if (isNull(paramAcc) || isNull(paramAcc.getValue()) || isNull(paramAcc.getValue().getStringValue())) {
            throw new RuntimeException("Не заполнен параметр product.rko.accNumber для продукта " + product.getId());
        }

        GenParam paramId = genParamService.loadOne("product", product.getId(), "product.rko.accNumberId");
        if (isNull(paramId) || isNull(paramId.getValue()) || isNull(paramId.getValue().getStringValue())) {
            throw new RuntimeException("Не заполнен параметр product.rko.accNumberId для продукта " + product.getId());
        }
        rec.setAcctId(paramAcc.getValue().getStringValue());
        rec.setAcctFee(1);
        rec.setId(paramId.getValue().getStringValue());
        rec.setBankInfo(getBankInfo());
        rec.setSvcList(getSvcList(order));
        bankAcctRec.add(rec);

        return bankAcctList;
    }

    private SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec.SvcList getSvcList(Order order) {
        SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec.SvcList list =
                new SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec.SvcList();
        SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec.SvcList.SvcRec rec =
                new SmsBankInfoModRequest.BankSvcRq.BankAcctList.BankAcctRec.SvcList.SvcRec();
        GenParam paramCellPhone = genParamService.loadOne("order", order.getId(), "order.rko.contacts.cellPhone");
        if (GenParamUtils.hasKeyValue(paramCellPhone)) {
            PhoneNum phoneNum = new PhoneNum();
            phoneNum.setPhone(paramCellPhone.getValue().getKeyValue().replaceAll("[^+0-9]", ""));
            rec.setPhoneNum(phoneNum);
        }
        list.getSvcRec().add(rec);
        return list;
    }

    private com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.BankInfo getBankInfo() {
        return new com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.BankInfo();
    }

    private SmsBankInfoModRequest.BankSvcRq.OrgInfo orgInfo(Company principal) {
        SmsBankInfoModRequest.BankSvcRq.OrgInfo orgInfo = new SmsBankInfoModRequest.BankSvcRq.OrgInfo();

        GenParam param = genParamService.loadOne("company", principal.getId(), "company.rko.absCompany");
        if (isNull(param) || isNull(param.getValue()) || isNull(param.getValue().getStringValue()))
            throw new RuntimeException("Не заполнен параметр company.rko.absCompany для компании " + principal.getId());

        orgInfo.setOrgId(param.getValue().getStringValue());
        orgInfo.setName(principal.getDisplayName());
        orgInfo.setTaxId(principal.getINN());
        return orgInfo;
    }

    private ServerInfoType setServerInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);;
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("SMSBankInfoModRq");
        serverInfoType.setBpId("MTS_SMSREG_CRM");
        return serverInfoType;
    }
}
