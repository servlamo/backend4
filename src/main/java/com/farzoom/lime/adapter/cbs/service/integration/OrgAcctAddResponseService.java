package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse.BankSvcRs;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse.BankSvcRs.RequestInfo;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse.BankSvcRs.RequestInfo.RequestStatus;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.Status;
import lombok.extern.java.Log;

import java.text.SimpleDateFormat;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Log
public class OrgAcctAddResponseService implements IntegrationService<OrgAcctAddResponse> {
    private static final SimpleDateFormat DATE_FMT = new SimpleDateFormat("dd.MM.yyyy");

    private final GroupRepository groupRepository;
    private final ParamRepository paramRepository;
    private final AttributeRepository attributeRepository;
    private final EsRepository esRepository;
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final RefService refService;
    private final GenParamService genParamService;
    private final AddressRepository addressRepository;

    public OrgAcctAddResponseService(AppConfig config) {
        groupRepository = new GroupRepository(config.getElasticsearchBaseUrl());
        paramRepository = new ParamRepository(config.getElasticsearchBaseUrl());
        attributeRepository = new AttributeRepository(config.getElasticsearchBaseUrl());
        relationRepository = new RelationRepository((config.getElasticsearchBaseUrl()));
        personRepository = new PersonRepository((config.getElasticsearchBaseUrl()));
        esRepository = new EsRepository(config.getElasticsearchBaseUrl());
        refService = new RefServiceImpl(esRepository);
        addressRepository = new AddressRepository((config.getElasticsearchBaseUrl()));
        genParamService = new GenParamServiceImpl(attributeRepository, groupRepository, paramRepository, refService, addressRepository);
    }

    @Override
    public OrgAcctAddResponse createRequest(Order order, Company principal, Product product) {
        OrgAcctAddResponse rq = new OrgAcctAddResponse();
        rq.setServerInfo(serverInfo());
        rq.setBankSvcRs(bankSvcRq(order, principal, product));
        return rq;
    }

    private ServerInfoType serverInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("WEB.SITE");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("OrgAcctAddRs");
        return serverInfoType;
    }

    private BankSvcRs bankSvcRq(Order order, Company principal, Product product) {
        BankSvcRs bankSvcRs = new BankSvcRs();
        bankSvcRs.setRequestInfo(requestInfo());
        bankSvcRs.setStatus(status());
        return bankSvcRs;
    }

    private RequestInfo requestInfo() {
        RequestInfo requestInfo = new RequestInfo();
        requestInfo.setRequestId(CORRELATION_ID_PLACEHOLDER);
        RequestStatus requestStatus = new RequestStatus();
        requestStatus.setRequestStatusCode("1");
        requestInfo.setRequestStatus(requestStatus);
        return requestInfo;
    }

    private Status status() {
        Status status = new Status();
        status.setStatusCode("0");
        return status;
    }
}