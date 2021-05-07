package com.farzoom.lime.adapter.cbs;

import com.farzoom.lime.adapter.cbs.service.integration.CbsMarshallerImpl;
import com.farzoom.lime.adapter.cbs.service.integration.CbsRequestFactory;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.AddGuaranteeRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.request.SPRCustCheckRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.response.SPRCustCheckResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.AgencyFeeAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.response.AgencyFeeAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.orgacctstatusmodnf.OrgAcctStatusModNf;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.requeststatusmodnf.RequestStatusModNf;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rq.BankAcctAddRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rs.BankAcctAddRs;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request.BankAcctModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.response.BankAcctModResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request.CheckLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response.CheckLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.BkiRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.BkiResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.CustCheckListRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response.CustCheckListResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.response.OrgQuestionnaireAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.request.SmsBankInfoModRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.response.SmsBankInfoModResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response.StopFactorResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.request.SvcPackModRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.response.SvcPackModRs;
import com.farzoom.lime.adapter.cbs.utils.AgreemtListSplitter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class CbsIntegrationIT {

    private static final String ORDER_ID = "AXEWBilaWcibk64Vdyvr";

    @Autowired
    private CbsRequestFactory factory;

    @Autowired
    private CbsMarshallerImpl cbsMarshaller;

    @Autowired
    private ObjectMapper objectMapper;

    //1 стоп факторы
    @Test
    public void createStopFactorRequestXmlTest() {
        StopFactorRequest request = factory.stopRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, StopFactorRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //2 проверка лимита
    @Test
    public void createCheckLimitRequestXmlTest() {
        CheckLimitRequest request = factory.checkLimitRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CheckLimitRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //3 разморозка лимита
    @Test
    public void createCloseLimitRequestXmlTest() {
        CloseLimitRequest request = factory.closeRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CloseLimitRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //4 создание договора
    @Test
    public void createAddGuaranteeRequestXmlTest() {
        String orderId = "AXG9ImBPWcibk64Vdzgm";
        AddGuaranteeRequest request = factory.addGuaranteeRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, AddGuaranteeRequest.class);
        log.info("requestXml:\n{}", requestXml);
        Assert.assertTrue(requestXml.contains("<Amt>10000.00</Amt>"));
    }

    //5 получение комиссии
    @Test
    public void createCommissionRequestXmlTest() {
        CommissionRequest request = factory.createCommissionRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CommissionRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //6 статус договора
    @Test
    public void createStatusRequestXmlTest() {
        StatusRequest request = factory.statusRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, StatusRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //7 бки
    @Test
    public void bkiRequestTest() {
        BkiRequest request = factory.createBkiRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, BkiRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    // бки персона
    @Test
    public void bkiPersonRequestTest() throws JsonProcessingException {
        BkiRequest request = factory.createBkiHeadPersonRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, BkiRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void bkiResponse1Test() throws JsonProcessingException {
        String responseXml = readResource("test-data/bki-response-01.xml");
        log.info("bki response xml: {}", responseXml);

        BkiResponse response = (BkiResponse) cbsMarshaller.unmarshallResponse(responseXml, BkiResponse.class);
        log.info("response:\n{}", objectMapper.writeValueAsString(response));
    }

    @Test
    public void bkiResponse2Test() throws JsonProcessingException {
        String responseXml = readResource("test-data/bki-response-02.xml");
        log.info("bki response xml: {}", responseXml);

        BkiResponse response = (BkiResponse) cbsMarshaller.unmarshallResponse(responseXml, BkiResponse.class);
        log.info("response:\n{}", objectMapper.writeValueAsString(response));
    }

    @Test
    public void testStopFactorResponse() throws JsonProcessingException {
        String responseXml = readResource("test-data/stop-response-01.xml");
        log.info("stop factor response xml: {}", responseXml);

        StopFactorResponse response = (StopFactorResponse) cbsMarshaller.unmarshallResponse(responseXml, StopFactorResponse.class);
        log.info("response:\n{}", response);

        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void testCheckLimitResponse() throws JsonProcessingException {
        String responseXml = readResource("test-data/check-response-01.xml");
        log.info("stop factor response xml: {}", responseXml);

        CheckLimitResponse response = (CheckLimitResponse) cbsMarshaller.unmarshallResponse(responseXml, CheckLimitResponse.class);
        log.info("response:\n{}", response);

        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void custCheckListReqTest() {
        CustCheckListRequest request = factory.createCustCheckListRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CustCheckListRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void custCheckListRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/cust-check-list-response.xml");
        log.info("responseXml:\n{}", responseXml);

        CustCheckListResponse response = (CustCheckListResponse) cbsMarshaller.unmarshallResponse(responseXml, CustCheckListResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void sprCustCheckReqTest() {
        SPRCustCheckRequest request = factory.createSPRCustCheckRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, SPRCustCheckRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void sprCustCheckRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/spr-cust-check-response.xml");
        log.info("responseXml:\n{}", responseXml);

        SPRCustCheckResponse response = (SPRCustCheckResponse) cbsMarshaller.unmarshallResponse(responseXml, SPRCustCheckResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void agencyFeeAddReqTest() {
        AgencyFeeAddRequest request = factory.createAgencyFeeAddRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, AgencyFeeAddRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void agencyFeeAddRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/agency-fee-add-response.xml");
        log.info("responseXml:\n{}", responseXml);

        AgencyFeeAddResponse response = (AgencyFeeAddResponse) cbsMarshaller.unmarshallResponse(responseXml, AgencyFeeAddResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void bankAcctModReqTest() {
        String orderId = "AXOzZFBMwrlpDa_Bor8N";
        BankAcctModRequest request = factory.createBankAcctModRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, BankAcctModRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void AmlOrgQuestAddReqTest() {
        String orderId = "AXOzZFBMwrlpDa_Bor8N";
        OrgQuestionnaireAddRequest request = factory.createAmlOrgQuestionnaireAddRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, OrgQuestionnaireAddRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void bankAcctModRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/bank-acct-mod-response.xml");
        log.info("responseXml:\n{}", responseXml);

        BankAcctModResponse response = (BankAcctModResponse) cbsMarshaller.unmarshallResponse(responseXml, BankAcctModResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void orgQuestionnaireAddRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/org-quest-add-response.xml");
        log.info("responseXml:\n{}", responseXml);

        OrgQuestionnaireAddResponse response = (OrgQuestionnaireAddResponse) cbsMarshaller.unmarshallResponse(responseXml, OrgQuestionnaireAddResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void orgQuestionnaireAddReqTest() throws JsonProcessingException {
        String orderId = "AXeqX_NACVKJm_Gj2JdI"; // "AXWIPrcnKExYfisxq3yz";
        OrgQuestionnaireAddRequest request = factory.createOrgQuestionnaireAddRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, OrgQuestionnaireAddRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void agreemtListAddReqTest() {
        String orderId = "AXg1nGNTCVKJm_Gj2McV";
        AgreemtListAddRequest request = factory.createAgreemtListAddRequest(orderId);
        log.info("request: {}", request);

        List<AgreemtListAddRequest> messages = AgreemtListSplitter.split(request);
        messages.stream()
                .map(r -> cbsMarshaller.marshallRequest(r, AgreemtListAddRequest.class))
                .forEach(s -> log.info("requestXml:\n{}", s));
    }

    @Test
    public void bankAcctAddReqTest() {
        String orderId = "AXQRWM5bKExYfisxqx3U";
        BankAcctAddRq request = factory.createBankAcctAddRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, BankAcctAddRq.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void bankAcctAddRsRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/bank-acct-add-response.xml");
        log.info("responseXml:\n{}", responseXml);

        BankAcctAddRs response = (BankAcctAddRs) cbsMarshaller.unmarshallResponse(responseXml, BankAcctAddRs.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }


    @Test
    public void svcPackModReqTest() throws JsonProcessingException {
        String orderId = "AXQkXUY7KExYfisxqyHQ";
        SvcPackModRq request = factory.createSvcPackModRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, SvcPackModRq.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void svcPackModRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/svc-pack-mod-response.xml");
        log.info("responseXml:\n{}", responseXml);

        SvcPackModRs response = (SvcPackModRs) cbsMarshaller.unmarshallResponse(responseXml, SvcPackModRs.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void orgAcctsStatusModNfRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/org-acct-status-mod-nf-response.xml");
        log.info("responseXml:\n{}", responseXml);

        OrgAcctStatusModNf response = (OrgAcctStatusModNf) cbsMarshaller.unmarshallResponse(responseXml, OrgAcctStatusModNf.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void OrgQuestionnaireAmlRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/org-quest-add-aml-response.xml");
        log.info("responseXml:\n{}", responseXml);

        OrgQuestionnaireAddResponse response = (OrgQuestionnaireAddResponse) cbsMarshaller.unmarshallResponse(responseXml, OrgQuestionnaireAddResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }


    @Test
    public void requestStatusModNfRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/request-status-mod-nf-response.xml");
        log.info("responseXml:\n{}", responseXml);

        RequestStatusModNf response = (RequestStatusModNf) cbsMarshaller.unmarshallResponse(responseXml, RequestStatusModNf.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }


    @Test
    public void smsBankInfoModReqTest() throws JsonProcessingException {
        String orderId = "AXQkXUY7KExYfisxqyHQ";
        SmsBankInfoModRequest request = factory.createSmsBankInfoModRequest(orderId);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, SmsBankInfoModRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    @Test
    public void smsBankInfoModRespTest() throws JsonProcessingException {
        String responseXml = readResource("test-data/sms-bank-info-mod-response.xml");
        log.info("responseXml:\n{}", responseXml);

        SmsBankInfoModResponse response = (SmsBankInfoModResponse) cbsMarshaller.unmarshallResponse(responseXml, SmsBankInfoModResponse.class);
        String json = objectMapper.writeValueAsString(response);
        log.info("json: {}", json);
    }

    private String readResource(String xmlFilePath) {
        URL resource = Resources.getResource(xmlFilePath);
        try {
            return Resources.toString(resource, Charset.defaultCharset());
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return "";
        }
    }

}
