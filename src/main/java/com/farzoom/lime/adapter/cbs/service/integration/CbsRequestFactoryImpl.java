package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.CompanyRepository;
import com.farzoom.common.persistence.es.repositories.OrderRepository;
import com.farzoom.common.persistence.es.repositories.ProductRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.AddGuaranteeRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.request.SPRCustCheckRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.AgencyFeeAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rq.BankAcctAddRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.BankAcctModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request.CheckLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.BkiRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.request.FileAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.CustCheckListRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.SmsBankInfoModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.request.SvcPackModRq;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@AllArgsConstructor
public class CbsRequestFactoryImpl implements CbsRequestFactory {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final CompanyRepository companyRepository;
    private final BkiServiceImpl bkiService;
    private final BkiHeadPersonServiceImpl bkiHeadPersonService;
    private final AddGuaranteeServiceImpl addGuaranteeService;
    private final StopFactorServiceImpl stopFactorService;
    private final CloseLimitServiceImpl closeLimitService;
    private final CheckLimitServiceImpl checkLimitService;
    private final StatusServiceImpl statusService;
    private final CommissionServiceImpl commissionService;
    private final CustCheckListServiceImpl custCheckListService;
    private final AfsServiceImpl afsService;
    private final AgencyFeeAddServiceImpl agencyFeeAddService;
    private final SvcPackModService svcPackModService;
    private final BankAcctAddService bankAcctAddService;
    private final BankAcctModService bankAcctModService;
    private final OrgQuestionnaireAddService orgQuestionnaireAddService;
    private final SmsBankInfoModService smsBankInfoModService;
    private final AmlOrgQuestionnaireAddService amlOrgQuestionnaireAddService;
    private final OrgAcctAddResponseService orgAcctAddResponseService;
    private final AgreemtListAddService agreemtListAddService;
    private final FileAddService fileAddService;

    @Override
    public AddGuaranteeRequest addGuaranteeRequest(String orderId) {
        // Gather all required data
        Order order = orderRepository.load(orderId);
        Company company = companyRepository.load(order.getPrincipalCompanyId());
        com.farzoom.common.persistence.es.model.Product product = productRepository.load(order.getProductId());

        return addGuaranteeService.createRequest(order, company, product);
    }

    @Override
    public StopFactorRequest stopRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company company = companyRepository.load(order.getPrincipalCompanyId());
        com.farzoom.common.persistence.es.model.Product product = productRepository.load(order.getProductId());

        return stopFactorService.createRequest(order, company, product);
    }

    @Override
    public CloseLimitRequest closeRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company company = companyRepository.load(order.getPrincipalCompanyId());
        com.farzoom.common.persistence.es.model.Product product = productRepository.load(order.getProductId());

        return closeLimitService.createRequest(order, company, product);
    }

    @Override
    public CheckLimitRequest checkLimitRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        com.farzoom.common.persistence.es.model.Product product = productRepository.load(order.getProductId());
        return checkLimitService.createRequest(order, principal, product);
    }


    @Override
    public StatusRequest statusRequest(String orderId) {
        Order order = orderRepository.load(orderId);

        return statusService.createRequest(order, null, null);
    }

    @Override
    public BkiRequest createBkiRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        com.farzoom.common.persistence.es.model.Product product = productRepository.load(order.getProductId());
        principal.setPermissionsInfo(new Company.PermissionsInfo() {{
            setCreditHistoryPermission(new CreditHistoryPermission());
        }});
        principal.getPermissionsInfo().getCreditHistoryPermission().setActiveFrom(new Date());
        principal.getPermissionsInfo().getCreditHistoryPermission().setActiveTill(new Date());
        if (principal.getPermissionsInfo() == null
                || principal.getPermissionsInfo().getCreditHistoryPermission() == null
                || principal.getPermissionsInfo().getCreditHistoryPermission().getActiveTill() == null)
            throw new RuntimeException("BkiPermissionDate is not set in order: " + orderId);

        if (principal.getPermissionsInfo().getCreditHistoryPermission().getActiveTill().before(new java.util.Date()))
            throw new RuntimeException("BkiPermissionDate is expired");

        return bkiService.createRequest(order, principal, product);
    }

    @Override
    public BkiRequest createBkiHeadPersonRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return bkiHeadPersonService.createRequest(order, principal, product);
    }

    @Override
    public CommissionRequest createCommissionRequest(String orderId) {
        Order order = orderRepository.load(orderId);

        return commissionService.createRequest(order, null, null);
    }

    @Override
    public CustCheckListRequest createCustCheckListRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        return custCheckListService.createRequest(null, principal, null);
    }

    @Override
    public SPRCustCheckRequest createSPRCustCheckRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        return afsService.createRequest(order, principal, null);
    }

    @Override
    public AgencyFeeAddRequest createAgencyFeeAddRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        return agencyFeeAddService.createRequest(order, principal, null);
    }

    @Override
    public AgreemtListAddRequest createAgreemtListAddRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return agreemtListAddService.createRequest(order, principal, product);
    }

    @Override
    public BankAcctAddRq createBankAcctAddRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return bankAcctAddService.createRequest(order, principal, product);
    }

    @Override
    public BankAcctModRequest createBankAcctModRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return bankAcctModService.createRequest(order, principal, product);
    }

    @Override
    public OrgQuestionnaireAddRequest createOrgQuestionnaireAddRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return orgQuestionnaireAddService.createRequest(order, principal, product);
    }

    public SmsBankInfoModRequest createSmsBankInfoModRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return smsBankInfoModService.createRequest(order, principal, product);
    }

    @Override
    public SvcPackModRq createSvcPackModRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return svcPackModService.createRequest(order, principal, product);
    }

    @Override
    public OrgQuestionnaireAddRequest createAmlOrgQuestionnaireAddRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return amlOrgQuestionnaireAddService.createRequest(order, principal, product);
    }

    @Override
    public FileAddRequest createFileAddRequest(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return fileAddService.createRequest(order, principal, product);
    }

    @Override
    public OrgAcctAddResponse createOrgAcctAddResponse(String orderId) {
        Order order = orderRepository.load(orderId);
        Company principal = companyRepository.load(order.getPrincipalCompanyId());
        Product product = productRepository.load(order.getProductId());
        return orgAcctAddResponseService.createRequest(order, principal, product);
    }

}
