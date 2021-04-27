package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.lime.adapter.cbs.model.RestRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.AddGuaranteeRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.response.AddGuaranteeResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.request.SPRCustCheckRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.response.SPRCustCheckResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.AgencyFeeAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.response.AgencyFeeAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.response.AgreemtListAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.orgacctstatusmodnf.OrgAcctStatusModNf;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.orgmodrq.OrgModRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.requeststatusmodnf.RequestStatusModNf;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rq.BankAcctAddRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rs.BankAcctAddRs;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.BankAcctModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.response.BankAcctModResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request.CheckLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response.CheckLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.response.CloseLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.response.CommissionResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.BkiRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.BkiResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.CustCheckListRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response.CustCheckListResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.leadlistadd.notify.LeadListAddNotification;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.request.OrgAcctAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.response.OrgAcctAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.response.OrgQuestionnaireAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.SmsBankInfoModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.response.SmsBankInfoModResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.response.StatusResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response.StopFactorResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.request.SvcPackModRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.response.SvcPackModRs;
import com.farzoom.lime.adapter.cbs.utils.AgreemtListSplitter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class CbsIntegrationService {
    private static final ObjectWriter OBJECT_WRITER = new ObjectMapper().writer().withDefaultPrettyPrinter();

    private final CbsRequestFactoryImpl cbsRequestFactory;
    private final CbsMarshallerImpl cbsMarshaller;

    public String createAddGuaranteeRequest(RestRequest restRequest) {
        AddGuaranteeRequest request = cbsRequestFactory.addGuaranteeRequest(restRequest.getOrderId());
        tryToLog("createAddGuaranteeRequest", request);
        return cbsMarshaller.marshallRequest(request, AddGuaranteeRequest.class);
    }

    public String createStopFactorRequest(RestRequest restRequest) {
        StopFactorRequest request = cbsRequestFactory.stopRequest(restRequest.getOrderId());
        tryToLog("createStopFactorRequest", request);
        return cbsMarshaller.marshallRequest(request, StopFactorRequest.class);
    }

    public String createCloseLimitRequest(RestRequest restRequest) {
        CloseLimitRequest request = cbsRequestFactory.closeRequest(restRequest.getOrderId());
        tryToLog("createCloseLimitRequest", request);
        return cbsMarshaller.marshallRequest(request, CloseLimitRequest.class);
    }

    public String createCheckLimitRequest(RestRequest restRequest) {
        CheckLimitRequest request = cbsRequestFactory.checkLimitRequest(restRequest.getOrderId());
        tryToLog("createCheckLimitRequest", request);
        return cbsMarshaller.marshallRequest(request, CheckLimitRequest.class);
    }

    public String createStatusRequest(RestRequest restRequest) {
        StatusRequest request = cbsRequestFactory.statusRequest(restRequest.getOrderId());
        tryToLog("createStatusRequest", request);
        return cbsMarshaller.marshallRequest(request, StatusRequest.class);
    }

    public String createBkiRequest(RestRequest restRequest) {
        BkiRequest request = cbsRequestFactory.createBkiRequest(restRequest.getOrderId());
        tryToLog("createBkiRequest", request);
        return cbsMarshaller.marshallRequest(request, BkiRequest.class);
    }

    public String createBkiHeadPersonRequest(RestRequest restRequest) {
        BkiRequest request = cbsRequestFactory.createBkiHeadPersonRequest(restRequest.getOrderId());
        tryToLog("createBkiHeadPersonRequest", request);
        return cbsMarshaller.marshallRequest(request, BkiRequest.class);
    }

    public String createCommissionRequest(RestRequest restRequest) {
        CommissionRequest request = cbsRequestFactory.createCommissionRequest(restRequest.getOrderId());
        tryToLog("createCommissionRequest", request);
        return cbsMarshaller.marshallRequest(request, CommissionRequest.class);
    }

    public String createCustCheckListRequest(RestRequest restRequest) {
        CustCheckListRequest request = cbsRequestFactory.createCustCheckListRequest(restRequest.getOrderId());
        tryToLog("createCustCheckListRequest", request);
        return cbsMarshaller.marshallRequest(request, CustCheckListRequest.class);
    }

    public String createSPRCustCheckRequest(RestRequest restRequest) {
        SPRCustCheckRequest request = cbsRequestFactory.createSPRCustCheckRequest(restRequest.getOrderId());
        tryToLog("createCustCheckListRequest", request);
        return cbsMarshaller.marshallRequest(request, SPRCustCheckRequest.class);
    }

    public String createAgencyFeeAddRequest(RestRequest restRequest) {
        AgencyFeeAddRequest request = cbsRequestFactory.createAgencyFeeAddRequest(restRequest.getOrderId());
        tryToLog("createAgencyFeeAddRequest", request);
        return cbsMarshaller.marshallRequest(request, AgencyFeeAddRequest.class);
    }

    public String createBankAcctAddRequest(RestRequest restRequest) {
        BankAcctAddRq request = cbsRequestFactory.createBankAcctAddRequest(restRequest.getOrderId());
        tryToLog("createBankAcctAddRequest", request);
        return cbsMarshaller.marshallRequest(request, BankAcctAddRq.class);
    }

    public String createBankAcctModRequest(RestRequest restRequest) {
        BankAcctModRequest request = cbsRequestFactory.createBankAcctModRequest(restRequest.getOrderId());
        tryToLog("createBankAcctModRequest", request);
        return cbsMarshaller.marshallRequest(request, BankAcctModRequest.class);
    }

    public String createOrgQuestionnaireAddRequest(RestRequest restRequest) {
        OrgQuestionnaireAddRequest request = cbsRequestFactory.createOrgQuestionnaireAddRequest(restRequest.getOrderId());
        tryToLog("createOrgQuestionnaireAddRequest", request);
        return cbsMarshaller.marshallRequest(request, OrgQuestionnaireAddRequest.class);
    }

    public String createSmsBankInfoModRequest(RestRequest restRequest) {
        SmsBankInfoModRequest request = cbsRequestFactory.createSmsBankInfoModRequest(restRequest.getOrderId());
        tryToLog("createSmsBankInfoModRequest", request);
        return cbsMarshaller.marshallRequest(request, SmsBankInfoModRequest.class);
    }

    public String createSvcPackModRequest(RestRequest restRequest) {
        SvcPackModRq request = cbsRequestFactory.createSvcPackModRequest(restRequest.getOrderId());
        tryToLog("createSvcPackModRequest", request);
        return cbsMarshaller.marshallRequest(request, SvcPackModRq.class);
    }

    public String createAmlOrgQuestionnaireAddRequest(RestRequest restRequest) {
        OrgQuestionnaireAddRequest request = cbsRequestFactory.createAmlOrgQuestionnaireAddRequest(restRequest.getOrderId());
        tryToLog("createAmlOrgQuestionnaireAddRequest", request);
        return cbsMarshaller.marshallRequest(request, OrgQuestionnaireAddRequest.class);
    }

    public String createOrgAcctAddResponse(RestRequest restRequest) {
        OrgAcctAddResponse message = cbsRequestFactory.createOrgAcctAddResponse(restRequest.getOrderId());
        tryToLog("createOrgAcctResponse", message);
        return cbsMarshaller.marshallRequest(message, OrgAcctAddResponse.class);
    }

    public List<String> createAgreemtListAddRequest(RestRequest restRequest) {
        AgreemtListAddRequest message = cbsRequestFactory.createAgreemtListAddRequest(restRequest.getOrderId());
        tryToLog("createAgreemtListAddRequest", message);
        List<AgreemtListAddRequest> messages = AgreemtListSplitter.split(message);
        tryToLog("createAgreemtListAddRequests", messages);
        return messages.stream().map(r -> cbsMarshaller.marshallRequest(r, AgreemtListAddRequest.class)).collect(Collectors.toList());
    }

    /// -- INPUT ---

    public StatusResponse createStatusResponse(String body) {
        tryToLog("createStatusResponse", body);
        return (StatusResponse) cbsMarshaller.unmarshallResponse(body, StatusResponse.class);
    }

    public CheckLimitResponse createCheckLimitResponse(String body) {
        tryToLog("createCheckLimitResponse", body);
        return (CheckLimitResponse) cbsMarshaller.unmarshallResponse(body, CheckLimitResponse.class);
    }

    public CloseLimitResponse createCloseLimitResponse(String body) {
        tryToLog("createCloseLimitResponse", body);
        return (CloseLimitResponse) cbsMarshaller.unmarshallResponse(body, CloseLimitResponse.class);
    }

    public AddGuaranteeResponse createAddGuaranteeResponse(String body) {
        tryToLog("createAddGuaranteeResponse", body);
        return (AddGuaranteeResponse) cbsMarshaller.unmarshallResponse(body, AddGuaranteeResponse.class);
    }

    public StopFactorResponse createStopFactorResponse(String body) {
        tryToLog("createStopFactorResponse", body);
        return (StopFactorResponse) cbsMarshaller.unmarshallResponse(body, StopFactorResponse.class);
    }

    public BkiResponse createBkiResponse(String body) {
        tryToLog("createBkiResponse", body);
        return (BkiResponse) cbsMarshaller.unmarshallResponse(body, BkiResponse.class);
    }

    public BkiResponse createBkiHeadPersonResponse(String body) {
        tryToLog("createBkiHeadPersonResponse", body);
        return (BkiResponse) cbsMarshaller.unmarshallResponse(body, BkiResponse.class);
    }

    public CommissionResponse createCommissionResponse(String body) {
        tryToLog("createCommissionResponse", body);
        return (CommissionResponse) cbsMarshaller.unmarshallResponse(body, CommissionResponse.class);
    }

    public CustCheckListResponse createCustCheckListResponse(String body) {
        tryToLog("createCustCheckListResponse", body);
        return (CustCheckListResponse) cbsMarshaller.unmarshallResponse(body, CustCheckListResponse.class);
    }

    public SPRCustCheckResponse createSPRCustCheckResponse(String body) {
        tryToLog("createSPRCustCheckResponse", body);
        return (SPRCustCheckResponse) cbsMarshaller.unmarshallResponse(body, SPRCustCheckResponse.class);
    }

    public AgencyFeeAddResponse createAgencyFeeAddResponse(String body) {
        tryToLog("createAgencyFeeAddResponse", body);
        return (AgencyFeeAddResponse) cbsMarshaller.unmarshallResponse(body, AgencyFeeAddResponse.class);
    }

    public BankAcctAddRs createBankAcctAddResponse(String body) {
        tryToLog("createBankAcctAddResponse", body);
        return (BankAcctAddRs) cbsMarshaller.unmarshallResponse(body, BankAcctAddRs.class);
    }

    public RequestStatusModNf createRequestStatusModNfResponse(String body) {
        tryToLog("createRequestStatusModNfResponse", body);
        return (RequestStatusModNf) cbsMarshaller.unmarshallResponse(body, RequestStatusModNf.class);
    }

    public OrgModRq createOrgModRqResponse(String body) {
        tryToLog("createOrgModRqResponse", body);
        return (OrgModRq) cbsMarshaller.unmarshallResponse(body, OrgModRq.class);
    }

    public OrgAcctStatusModNf createOrgAcctStatusModNfResponse(String body) {
        tryToLog("createOrgAcctStatusModNfResponse", body);
        return (OrgAcctStatusModNf) cbsMarshaller.unmarshallResponse(body, OrgAcctStatusModNf.class);
    }

    public BankAcctModResponse createBankAcctModResponse(String body) {
        tryToLog("createBankAcctModResponse", body);
        return (BankAcctModResponse) cbsMarshaller.unmarshallResponse(body, BankAcctModResponse.class);
    }

    public OrgQuestionnaireAddResponse createOrgQuestionnaireAddResponse(String body) {
        tryToLog("createOrgQuestionnaireAddResponse", body);
        return (OrgQuestionnaireAddResponse) cbsMarshaller.unmarshallResponse(body, OrgQuestionnaireAddResponse.class);
    }

    public OrgQuestionnaireAddResponse createAmlOrgQuestionnaireAddResponse(String body) {
        tryToLog("createAmlOrgQuestionnaireAddResponse", body);
        return (OrgQuestionnaireAddResponse) cbsMarshaller.unmarshallResponse(body, OrgQuestionnaireAddResponse.class);
    }

    public SmsBankInfoModResponse createSmsBankInfoModResponse(String body) {
        tryToLog("createRequestStatusModNfResponse", body);
        return (SmsBankInfoModResponse) cbsMarshaller.unmarshallResponse(body, SmsBankInfoModResponse.class);
    }

    public SvcPackModRs createSvcPackModResponse(String body) {
        tryToLog("createSvcPackModResponse", body);
        return (SvcPackModRs) cbsMarshaller.unmarshallResponse(body, SvcPackModRs.class);
    }

    public AgreemtListAddResponse createAgreemtListAddResponse(String body) {
        tryToLog("createAgreemtListAddResponse", body);
        return (AgreemtListAddResponse) cbsMarshaller.unmarshallResponse(body, AgreemtListAddResponse.class);
    }

    public LeadListAddNotification createLeadListAddNotification(String body) {
        tryToLog("createLeadListAddNotification", body);
        return (LeadListAddNotification) cbsMarshaller.unmarshallResponse(body, LeadListAddNotification.class);
    }

    public OrgAcctAddRequest createOrgAcctAddRequest(String body) {
        tryToLog("createOrgAcctAddRequest", body);
        return (OrgAcctAddRequest) cbsMarshaller.unmarshallResponse(body, OrgAcctAddRequest.class);
    }

    private void tryToLog(String method, Object request) {
        try {
            log.info("{}: {}", method, OBJECT_WRITER.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            log.error(e.getMessage(), e);
        }
    }
}
