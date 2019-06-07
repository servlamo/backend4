package com.farzoom.lime.adapter.cbs;

import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.CbsMarshallerImpl;
import com.farzoom.lime.adapter.cbs.service.integration.CbsRequestFactory;
import com.farzoom.lime.adapter.cbs.service.integration.CbsRequestFactoryImpl;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request.AddGuaranteeRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.request.SPRCustCheckRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.response.SPRCustCheckResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.request.AgencyFeeAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.response.AgencyFeeAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request.CheckLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response.CheckLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request.CloseLimitRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.request.CommissionRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.request.BkiRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.BkiResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request.CustCheckListRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response.CustCheckListResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.request.StatusRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request.StopFactorRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response.StopFactorResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Resources;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

@Slf4j
public class CbsIntegrationTest {
    private static final String ES_BASE_URL = "http://localhost:9200";
    private static final String AGENT_BILLING_BASE_URL = "http://proxy/api/bg-agent-billing";
    private static final String ORDER_ID = "AWh2Oyiz_8lAJG07_z0Q";
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    private static AppConfig config = new AppConfig() {{
        setElasticsearchBaseUrl(ES_BASE_URL);
        setAgentBillingBaseUrl(AGENT_BILLING_BASE_URL);
    }};

    private static final CbsRequestFactory factory = new CbsRequestFactoryImpl(config);
    private static final CbsMarshallerImpl cbsMarshaller = new CbsMarshallerImpl();

    //1 стоп факторы
    @Ignore
    @Test
    public void createStopFactorRequestXmlTest() {
        StopFactorRequest request = factory.stopRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, StopFactorRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //2 проверка лимита
    @Ignore
    @Test
    public void createCheckLimitRequestXmlTest() {
        CheckLimitRequest request = factory.checkLimitRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CheckLimitRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //3 разморозка лимита
    @Ignore
    @Test
    public void createCloseLimitRequestXmlTest() {
        CloseLimitRequest request = factory.closeRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CloseLimitRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //4 создание договора
    @Ignore
    @Test
    public void createAddGuaranteeRequestXmlTest() {
        AddGuaranteeRequest request = factory.addGuaranteeRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, AddGuaranteeRequest.class);
        log.info("requestXml:\n{}", requestXml);
        Assert.assertTrue(requestXml.contains("<Amt>10000.00</Amt>"));
    }

    //5 получение комиссии
    @Ignore
    @Test
    public void createCommissionRequestXmlTest() {
        CommissionRequest request = factory.createCommissionRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, CommissionRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //6 статус договора
    @Ignore
    @Test
    public void createStatusRequestXmlTest() {
        StatusRequest request = factory.statusRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, StatusRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    //7 бки
    @Ignore
    @Test
    public void bkiRequestTest() {
        BkiRequest request = factory.createBkiRequest(ORDER_ID);
        log.info("request: {}", request);

        String requestXml = cbsMarshaller.marshallRequest(request, BkiRequest.class);
        log.info("requestXml:\n{}", requestXml);
    }

    // бки персона
    @Ignore
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
        log.info("response:\n{}", OBJECT_MAPPER.writeValueAsString(response));
    }

    @Test
    public void bkiResponse2Test() throws JsonProcessingException {
        String responseXml = readResource("test-data/bki-response-02.xml");
        log.info("bki response xml: {}", responseXml);

        BkiResponse response = (BkiResponse) cbsMarshaller.unmarshallResponse(responseXml, BkiResponse.class);
        log.info("response:\n{}", OBJECT_MAPPER.writeValueAsString(response));
    }

    @Test
    public void testStopFactorResponse() throws JsonProcessingException {
        String responseXml = readResource("test-data/stop-response-01.xml");
        log.info("stop factor response xml: {}", responseXml);

        StopFactorResponse response = (StopFactorResponse) cbsMarshaller.unmarshallResponse(responseXml, StopFactorResponse.class);
        log.info("response:\n{}", response);

        String json = OBJECT_MAPPER.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Test
    public void testCheckLimitResponse() throws JsonProcessingException {
        String responseXml = readResource("test-data/check-response-01.xml");
        log.info("stop factor response xml: {}", responseXml);

        CheckLimitResponse response = (CheckLimitResponse) cbsMarshaller.unmarshallResponse(responseXml, CheckLimitResponse.class);
        log.info("response:\n{}", response);

        String json = OBJECT_MAPPER.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Ignore
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
        String json = OBJECT_MAPPER.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Ignore
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
        String json = OBJECT_MAPPER.writeValueAsString(response);
        log.info("json: {}", json);
    }

    @Ignore
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
        String json = OBJECT_MAPPER.writeValueAsString(response);
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
