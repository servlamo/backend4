package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse.BankSvcRs;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse.BankSvcRs.RequestInfo;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse.BankSvcRs.RequestInfo.RequestStatus;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Slf4j
@Service
public class OrgAcctAddResponseService implements IntegrationService<OrgAcctAddResponse> {

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