package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.AddressRepository;
import com.farzoom.common.persistence.es.repositories.AttributeRepository;
import com.farzoom.common.persistence.es.repositories.GroupRepository;
import com.farzoom.common.persistence.es.repositories.ParamRepository;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.request.SvcPackModRq;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import com.farzoom.lime.adapter.cbs.utils.ref.RefItemL;
import com.farzoom.lime.adapter.cbs.utils.ref.impl.RefServiceL;
import com.farzoom.lime.adapter.cbs.utils.ref.impl.RefServiceLImpl;
import lombok.extern.java.Log;

import java.util.Optional;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static java.util.Objects.isNull;

@Log
public class SvcPackModService implements IntegrationService<SvcPackModRq> {

    private final GroupRepository groupRepository;
    private final ParamRepository paramRepository;
    private final AttributeRepository attributeRepository;
    private final EsRepository esRepository;
    private final AddressRepository addressRepository;
    RefServiceL refService;
    GenParamService genParamService;

    public SvcPackModService(AppConfig config) {
        groupRepository = new GroupRepository(config.getElasticsearchBaseUrl());
        paramRepository = new ParamRepository(config.getElasticsearchBaseUrl());
        attributeRepository = new AttributeRepository(config.getElasticsearchBaseUrl());
        esRepository = new EsRepository(config.getElasticsearchBaseUrl());
        refService = new RefServiceLImpl(esRepository);
        addressRepository = new AddressRepository((config.getElasticsearchBaseUrl()));
        genParamService = new GenParamServiceImpl(attributeRepository, groupRepository, paramRepository, new RefServiceImpl(esRepository), addressRepository);
    }

    @Override
    public SvcPackModRq createRequest(Order order, Company principal, Product product) {
        SvcPackModRq rq = new SvcPackModRq();
        rq.setServerInfo(setServerInfo());
        rq.setBankSvcRq(bankSvcRq(order, principal, product));
        return rq;
    }

    private SvcPackModRq.BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        SvcPackModRq.BankSvcRq svcRq = new SvcPackModRq.BankSvcRq();
        svcRq.setBankAcctInfo(getBankAcctInfo(product));
        svcRq.setRequestInfo(getReqInfo(product));
        svcRq.setSvcPackInfo(getSvcPackInfo(product));
        svcRq.setActionType(0);
        return svcRq;
    }

    private SvcPackModRq.BankSvcRq.BankAcctInfo getBankAcctInfo(Product product) {
        SvcPackModRq.BankSvcRq.BankAcctInfo info = new SvcPackModRq.BankSvcRq.BankAcctInfo();

        GenParam paramAcc = genParamService.loadOne("product", product.getId(), "product.rko.accNumber");
        if (isNull(paramAcc) || isNull(paramAcc.getValue()) || isNull(paramAcc.getValue().getStringValue())) {
            throw new RuntimeException("Не заполнен параметр product.rko.accNumber для продукта " + product.getId());
        }

        GenParam paramId = genParamService.loadOne("product", product.getId(), "product.rko.accNumberId");
        if (isNull(paramId) || isNull(paramId.getValue()) || isNull(paramId.getValue().getStringValue())) {
            throw new RuntimeException("Не заполнен параметр product.rko.accNumberId для продукта " + product.getId());
        }
        info.setId(paramId.getValue().getStringValue());
        info.setAcctId(paramAcc.getValue().getStringValue());
        return info;
    }

    private SvcPackModRq.BankSvcRq.RequestInfo getReqInfo(Product product) {
        SvcPackModRq.BankSvcRq.RequestInfo info = new SvcPackModRq.BankSvcRq.RequestInfo();
        info.setRequestId(getRequestId(product));
        return info;
    }

    private SvcPackModRq.BankSvcRq.SvcPackInfo getSvcPackInfo(Product product) {
        SvcPackModRq.BankSvcRq.SvcPackInfo info = new SvcPackModRq.BankSvcRq.SvcPackInfo();

        GenParam param = genParamService.loadOne("product", product.getId(), "product.rko.tariff");
        if (isNull(param) || isNull(param.getValue()) || isNull(param.getValue().getKeyValue())) {
            throw new RuntimeException("Не заполнен параметр product.rko.tariff  для продукта " + product.getId());
        }
        String packId = param.getValue().getKeyValue();
        info.setPackId(packId);

        String packCode = "";
        Optional<RefItemL> tariff = refService.getItems("rkoTariffPlanType")
                .stream()
                .filter(refItem -> refItem.getValue().equalsIgnoreCase(packId))
                .findFirst();
        if (tariff.isPresent()) {
            packCode = tariff.get().getCode();
        }

        info.setPackCode(packCode);
        return info;
    }

    private ServerInfoType setServerInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("SvcPackModRq");
        serverInfoType.setBpId("MTS_PACKAGE_MOD");
        return serverInfoType;
    }

    private ServerInfoType setServerInfo(Product product) {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(getRequestId(product));
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("SvcPackModRq");
        serverInfoType.setBpId("MTS_PACKAGE_MOD");
        return serverInfoType;
    }

    private String getRequestId(Product product) {
        String retId = CORRELATION_ID_PLACEHOLDER;
        GenParam param = genParamService.loadOne("product", product.getId(), "product.rko.requestId");
        if (GenParamUtils.hasStringValue(param)) {
            retId = param.getValue().getStringValue();
        }
        else log.warning("Не заполнен параметр product.rko.requestId для продукта " + product.getId());
        return retId;
    }
}
