package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest.BankSvcRq;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
public class StatusServiceImpl implements IntegrationService<StatusRequest> {

    @Override
    public StatusRequest createRequest(Order order, Company principal, Product product) {
        return new StatusRequest() {{
            setBankSvcRq(fillBankSvcRq(order));
            setServerInfo(fillServerInfo());
        }};
    }

    private static BankSvcRq fillBankSvcRq(Order order) {
        return new BankSvcRq() {{
            //ID сделки в МООСе необязательное поле
            setRequestId(order.getId());
            //номер договора в АБС
            setAgreemtNum(order.getOrderNumber());
//            setGuarantyStatus();
        }};
    }

    private static ServerInfoType fillServerInfo() {
        return new ServerInfoType() {{
            setRqUID(CORRELATION_ID_PLACEHOLDER);
            setMsgUID(UUID.randomUUID().toString());
            setSPName("FARZOOM");
            setMsgReceiver("IBSO");
            setServerDt(getNow());
            setMsgType("GuarantyStatusModRq");
            setBpId("MTS_STATE_GARANT");
        }};
    }

}
