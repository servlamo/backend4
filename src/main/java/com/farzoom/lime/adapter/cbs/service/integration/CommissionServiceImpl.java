package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest.BankSvcRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.ServerInfoType;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

/**
 * Created by vladimir on 03.09.2018.
 */
@Service
public class CommissionServiceImpl implements IntegrationService<CommissionRequest> {

    @Override
    public CommissionRequest createRequest(Order order, Company principal, Product product) {
        return new CommissionRequest() {{
            setBankSvcRq(fillBankSvcRq(order));
            setServerInfo(fillServerInfo());
        }};
    }

    private static BankSvcRq fillBankSvcRq(Order order) {
        return new BankSvcRq() {{
            //ID сделки в МООСе необязательное поле
            setRequestId(order.getId());

            setAgreemtNum(order.getOrderNumber());

            setFeeStatus(fillFeeStatus());
        }};
    }

    private static BankSvcRq.FeeStatus fillFeeStatus() {
        return new BankSvcRq.FeeStatus() {{
            setFeeStatusCode("Paid");
//            setStatusDesc();
        }};
    }

    private static ServerInfoType fillServerInfo() {
        return new ServerInfoType() {{
            setRqUID(CORRELATION_ID_PLACEHOLDER);
            setMsgUID(UUID.randomUUID().toString());
            setSPName("FARZOOM");
            setMsgReceiver("CR");
            setServerDt(getNow());
            setMsgType("FeeStatusModRq");
            setBpId("MTS_INFO_GARANT");
        }};
    }
}
