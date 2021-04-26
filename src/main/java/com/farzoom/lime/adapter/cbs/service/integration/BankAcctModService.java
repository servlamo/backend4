package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.BankAcctIdType;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.BankAcctModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.BankAcctStatusType;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static java.util.Objects.isNull;

@Slf4j
@Service
@AllArgsConstructor
public class BankAcctModService implements IntegrationService<BankAcctModRequest> {

    private final GenParamService genParamService;

    @Override
    public BankAcctModRequest createRequest(Order order, Company principal, Product product) {
        BankAcctModRequest rq = new BankAcctModRequest();
        rq.setServerInfo(setServerInfo());
        rq.setBankSvcRq(bankSvcRq(order, principal, product));
        return rq;
    }

    private BankAcctModRequest.BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        BankAcctModRequest.BankSvcRq bankSvcRq = new BankAcctModRequest.BankSvcRq();
        bankSvcRq.setOrgInfo(orgInfo(principal));
        bankSvcRq.setBankAcctId(bankAcctId(product));
        bankSvcRq.setBankAcctStatus(bankAcctStatus());
        return bankSvcRq;
    }

    private BankAcctModRequest.BankSvcRq.OrgInfo orgInfo(Company principal) {
        BankAcctModRequest.BankSvcRq.OrgInfo orgInfo = new BankAcctModRequest.BankSvcRq.OrgInfo();

        GenParam param = genParamService.loadOne("company", principal.getId(), "company.rko.absCompany");
        if (isNull(param) || isNull(param.getValue()) || isNull(param.getValue().getStringValue()))
            throw new RuntimeException("Не заполнен параметр company.rko.absCompany для компании " + principal.getId());

        orgInfo.setOrgId(param.getValue().getStringValue());
        return orgInfo;
    }

    private BankAcctIdType bankAcctId(Product product) {
        BankAcctIdType acc = new BankAcctIdType();
        GenParam param = genParamService.loadOne("product", product.getId(), "product.rko.accNumber");
        if (isNull(param) || isNull(param.getValue()) || isNull(param.getValue().getStringValue())) {
            throw new RuntimeException("Не заполнен параметр product.rko.accNumber для продукта " + product.getId());
        }
        acc.setAcctId(param.getValue().getStringValue());

         param = genParamService.loadOne("product", product.getId(), "product.rko.accNumberId");
        if (!isNull(param) && !isNull(param.getValue()) && !isNull(param.getValue().getStringValue())) {
            acc.setId(param.getValue().getStringValue());
        }

        return acc;
    }

    private BankAcctStatusType bankAcctStatus() {
        BankAcctStatusType acc = new BankAcctStatusType();
        acc.setBankAcctStatusCode("Open");
        return acc;
    }

    private ServerInfoType setServerInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("BankAcctModRq");
        serverInfoType.setBpId("MTS_ACC_STAT_UPD");
        return serverInfoType;
    }

    private ServerInfoType setServerInfo(Product product) {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(getRequestId(product));
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("BankAcctModRq");
        serverInfoType.setBpId("MTS_ACC_STAT_UPD");
        return serverInfoType;
    }

    private String getRequestId(Product product) {
        String retId = CORRELATION_ID_PLACEHOLDER;
        GenParam param = genParamService.loadOne("product", product.getId(), "product.rko.requestId");
        if (GenParamUtils.hasStringValue(param)) {
            retId = param.getValue().getStringValue();
        } else {
            log.warn("Не заполнен параметр product.rko.requestId для продукта {}", product.getId());
        }
        return retId;
    }

}
