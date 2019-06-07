package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.bg.business.agentbilling.BgAgentBillingService;
import com.farzoom.bg.business.agentbilling.model.ActDTO;
import com.farzoom.bg.business.agentbilling.restclient.BgAgentBillingServiceRestClientImpl;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.CompanyRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.*;

import java.time.LocalDate;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static org.apache.logging.log4j.util.Strings.isEmpty;

public class AgencyFeeAddServiceImpl implements IntegrationService<AgencyFeeAddRequest> {
    private final ObjectFactory of;
    private final RelationRepository relationRepository;
    private final CompanyRepository companyRepository;
    private final BgAgentBillingService bgAgentBillingService;

    public AgencyFeeAddServiceImpl(AppConfig config) {
        of = new ObjectFactory();
        relationRepository = new RelationRepository(config.getElasticsearchBaseUrl());
        companyRepository = new CompanyRepository(config.getElasticsearchBaseUrl());
        bgAgentBillingService = new BgAgentBillingServiceRestClientImpl(config.getAgentBillingBaseUrl());
    }

    @Override
    public AgencyFeeAddRequest createRequest(Order order, Company principal, Product product) {
        AgencyFeeAddRequest fdx = of.createFDX();
        fdx.setServerInfo(fillServerInfo());
        fdx.setBankSvcRq(bankSvcRq(order));
        return fdx;
    }

    private AgencyFeeAddRequest.BankSvcRq bankSvcRq(Order order) {
        String query = String.format(
                "leftId:%s AND relationTypeRefId:bgAgent", order.getPrincipalCompanyId());

        AgencyFeeAddRequest.BankSvcRq.OrgInfo orgInfo = of.createFDXBankSvcRqOrgInfo();
        orgInfo.setRequestId(order.getId()); // orderId

        ActDTO act = relationRepository.search(query, 1, null).stream()
                .map(r -> companyRepository.load(r.getRightId())).findFirst()
                .map(c -> {
                    orgInfo.setTaxId(c.getINN()); // ИНН компании-агента
                    String cName = c.getFullName();
                    if (isEmpty(cName))
                        cName = c.getDisplayName();
                    orgInfo.setName(cName); // fullName компании-агента
                    orgInfo.setExtOrgId(c.getBillingId()); // billingId компании агента
                    return c.getBillingId();
                })
                .map(bId -> bgAgentBillingService.getAct(
                        LocalDate.now().getYear(), LocalDate.now().getMonthValue(), bId))
                .orElseThrow(() -> new RuntimeException("Can't get agent billing act."));

        ActDTO.Detail detail = act.getDetails().stream().filter(d -> d.getCrmOrderId().equals(order.getId()))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Can't find order in agent billing act"));

        CurrencyAmount curAmt = of.createCurrencyAmount();
        curAmt.setAmt(detail.getAgentCommission());

        Fee fee = of.createFee();
        fee.setCurAmt(curAmt);

        orgInfo.setFee(fee);

        AgencyFeeAddRequest.BankSvcRq bankSvcRq = of.createFDXBankSvcRq();
        bankSvcRq.setOrgInfo(orgInfo);
        return bankSvcRq;
    }

    private ServerInfoType fillServerInfo() {
        ServerInfoType serverInfoType = of.createServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("AgencyFeeAddRq");
        serverInfoType.setBpId("MTS_AGENT_PAY");
        return serverInfoType;
    }

}
