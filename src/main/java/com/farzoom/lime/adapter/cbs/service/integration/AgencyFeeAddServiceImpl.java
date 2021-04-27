package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.bg.business.agentbilling.BgAgentBillingService;
import com.farzoom.bg.business.agentbilling.model.ActDTO;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.CompanyRepository;
import com.farzoom.common.persistence.es.repositories.RelationRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static org.apache.logging.log4j.util.Strings.isEmpty;

@Service
@AllArgsConstructor
public class AgencyFeeAddServiceImpl implements IntegrationService<AgencyFeeAddRequest> {
    private static final ObjectFactory OBJECT_FACTORY = new ObjectFactory();

    private final RelationRepository relationRepository;
    private final CompanyRepository companyRepository;
    private final BgAgentBillingService bgAgentBillingService;

    @Override
    public AgencyFeeAddRequest createRequest(Order order, Company principal, Product product) {
        AgencyFeeAddRequest fdx = OBJECT_FACTORY.createFDX();
        fdx.setServerInfo(fillServerInfo());
        fdx.setBankSvcRq(bankSvcRq(order));
        return fdx;
    }

    private AgencyFeeAddRequest.BankSvcRq bankSvcRq(Order order) {
        String query = String.format(
                "leftId:%s AND relationTypeRefId:bgAgent", order.getPrincipalCompanyId());

        AgencyFeeAddRequest.BankSvcRq.OrgInfo orgInfo = OBJECT_FACTORY.createFDXBankSvcRqOrgInfo();
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

        CurrencyAmount curAmt = OBJECT_FACTORY.createCurrencyAmount();
        curAmt.setAmt(detail.getAgentCommission());

        Fee fee = OBJECT_FACTORY.createFee();
        fee.setCurAmt(curAmt);

        orgInfo.setFee(fee);

        AgencyFeeAddRequest.BankSvcRq bankSvcRq = OBJECT_FACTORY.createFDXBankSvcRq();
        bankSvcRq.setOrgInfo(orgInfo);
        return bankSvcRq;
    }

    private ServerInfoType fillServerInfo() {
        ServerInfoType serverInfoType = OBJECT_FACTORY.createServerInfoType();
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
