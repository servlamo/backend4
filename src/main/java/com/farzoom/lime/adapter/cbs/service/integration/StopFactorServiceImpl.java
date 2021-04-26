package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest.BankSvcRq;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
public class StopFactorServiceImpl implements IntegrationService<StopFactorRequest> {

    @Override
    public StopFactorRequest createRequest(Order order, Company principal, Product product) {
        return new StopFactorRequest() {{
            setBankSvcRq(fillBankSvcRq(order, principal));
            setServerInfo(fillServerInfo());
        }};
    }

    private static BankSvcRq fillBankSvcRq(Order order, Company principal) {
        return new BankSvcRq() {{
            //ID сделки в МООСе необязательное поле
            setRequestId(order.getId());
            //Гуид Клиента в АБС заполняется не всегда
            setOrgId(null);
            //ИД Клиента в Фазуме необязательно поле
            setExtOrgId(order.getPrincipalCompanyId());
            setOrgInfo(fillOrgInfo(principal));
        }};
    }

    private static BankSvcRq.OrgInfo fillOrgInfo(Company principal) {
        return new BankSvcRq.OrgInfo() {{
            // Наименование клиента заполняется всегда
            setName(principal.getDisplayName());
            // ИНН Клиента заполняется всегда
            setTaxId(principal.getINN());
            // КПП Клиента заполняется не всегда у ИП его может не быть
            setTaxRegCode(principal.getKPP());
            // ОГРН Клиента
            setStateRegPrimeNum(principal.getOGRN());
        }};
    }

    private static ServerInfoType fillServerInfo() {
        return new ServerInfoType() {{
            setRqUID(CORRELATION_ID_PLACEHOLDER);
            setMsgUID(UUID.randomUUID().toString());
            setSPName("FARZOOM");
            setMsgReceiver("IBSO");
            setServerDt(getNow());
            setMsgType("OrgStopInqRq");
            setBpId("MTS_STOP_FACTOR");
        }};
    }
}
