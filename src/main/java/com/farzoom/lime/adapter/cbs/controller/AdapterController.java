package com.farzoom.lime.adapter.cbs.controller;

import com.farzoom.lime.adapter.cbs.model.RestRequest;
import com.farzoom.lime.adapter.cbs.model.RestResponse;
import com.farzoom.lime.adapter.cbs.service.integration.CbsIntegrationService;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.response.AddGuaranteeResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.response.SPRCustCheckResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.response.AgencyFeeAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response.CheckLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.response.CloseLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.response.CommissionResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.BkiResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response.CustCheckListResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.response.StatusResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response.StopFactorResponse;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class AdapterController {
    private final CbsIntegrationService cbsIntegrationService;

    @ApiOperation(
            value = "Marshall create agreement",
            notes = "Создание договора (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-add-guarantee", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse createAgreementRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createAddGuaranteeRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall create agreement",
            notes = "Создание договора (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-add-guarantee", consumes = MediaType.APPLICATION_XML_VALUE)
    public AddGuaranteeResponse createAgreementResponse(@RequestBody String body) {
        return cbsIntegrationService.createAddGuaranteeResponse(body);
    }



    @ApiOperation(
            value = "Marshall stop factor",
            notes = "Получение стоп-факторов (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-stop-factor", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse stopFactorRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createStopFactorRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall stop factor",
            notes = "Получение стоп-факторов (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-stop-factor", consumes = MediaType.APPLICATION_XML_VALUE)
    public StopFactorResponse stopFactorResponse(@RequestBody String body) {
        return cbsIntegrationService.createStopFactorResponse(body);
    }



    @ApiOperation(
            value = "Marshall close limit",
            notes = "Разморозка лимита (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-close-limit", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse closeLimitRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createCloseLimitRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall close checklimit",
            notes = "Разморозка лимита (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-close-limit", consumes = MediaType.APPLICATION_XML_VALUE)
    public CloseLimitResponse closeLimitResponse(@RequestBody String body) {
        return cbsIntegrationService.createCloseLimitResponse(body);
    }



    @ApiOperation(
            value = "Marshall check limit",
            notes = "Проверка и установка лимита (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-check-limit", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse checkLimitRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createCheckLimitRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall check checklimit",
            notes = "Проверка лимита (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-check-limit", consumes = MediaType.APPLICATION_XML_VALUE)
    public CheckLimitResponse checkLimitRequest(@RequestBody String body) {
        return cbsIntegrationService.createCheckLimitResponse(body);
    }



    @ApiOperation(
            value = "Marshall status request",
            notes = "Изменение статуса договора (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-change-status", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse actionRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createStatusRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall action agreement",
            notes = "Изменение статуса договора (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-change-status", consumes = MediaType.APPLICATION_XML_VALUE)
    public StatusResponse actionAgreementResponse(@RequestBody String body) {
        return cbsIntegrationService.createStatusResponse(body);
    }



    @ApiOperation(
            value = "Marshall bki request",
            notes = "Запрос бки (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-bki", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse bkiRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createBkiRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall bki response",
            notes = "Получение ответа бки (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-bki", consumes = MediaType.APPLICATION_XML_VALUE)
    public BkiResponse bkiResponse(@RequestBody String body) {
        return cbsIntegrationService.createBkiResponse(body);
    }


    @ApiOperation(
            value = "Marshall bki head person request",
            notes = "Запрос бки (сборка данных для запроса) по руководителю"
    )
    @PostMapping(value = "/marshall-bki-head-person", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse bkiHeadPersonRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createBkiHeadPersonRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall bki head person response",
            notes = "Получение ответа бки (разборка данных из ответа) по руководителю"
    )
    @PostMapping(value = "/unmarshall-bki-head-person", consumes = MediaType.APPLICATION_XML_VALUE)
    public BkiResponse bkiHeadPersonResponse(@RequestBody String body) {
        return cbsIntegrationService.createBkiHeadPersonResponse(body);
    }



    @ApiOperation(
            value = "Marshall commission request",
            notes = "Запрос комиссии (сборка данных для запроса)"
    )
    @PostMapping(value = "/marshall-commission", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public RestResponse commissionRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createCommissionRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall commission response",
            notes = "Получение ответа по коммиссии (разборка данных из ответа)"
    )
    @PostMapping(value = "/unmarshall-commission", consumes = MediaType.APPLICATION_XML_VALUE)
    public CommissionResponse commissionResponse(@RequestBody String body) {
        return cbsIntegrationService.createCommissionResponse(body);
    }



    @ApiOperation(
            value = "Marshall IDBANK CustCheckListInqRq",
            notes = "Запрос IDBANK (идентификация и валидация клиентов банка через сервисы госорганов в СМЭВ)"
    )
    @PostMapping(value = "/marshall-cust-check-list")
    public RestResponse custCheckListRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createCustCheckListRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall IDBANK CustCheckListInqRq",
            notes = "Получение ответа IDBANK (идентификация и валидация клиентов банка через сервисы госорганов в СМЭВ)"
    )
    @PostMapping(value = "/unmarshall-cust-check-list")
    public CustCheckListResponse custCheckListResponse(@RequestBody String body) {
        return cbsIntegrationService.createCustCheckListResponse(body);
    }



    @ApiOperation(
            value = "Marshall AFS SPRCustCheckInqRq",
            notes = "Запрос AFS"
    )
    @PostMapping(value = "/marshall-spr-cust-check")
    public RestResponse sprCustCheckRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createSPRCustCheckRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall AFS SPRCustCheckInqRq",
            notes = "Получение ответа AFS"
    )
    @PostMapping(value = "/unmarshall-spr-cust-check")
    public SPRCustCheckResponse sprCustCheckResponse(@RequestBody String body) {
        return cbsIntegrationService.createSPRCustCheckResponse(body);
    }


    @ApiOperation(
            value = "Marshall Agency Fee Add Request",
            notes = "Запрос передачи данных по комиссионному вознаграждению в АБС"
    )
    @PostMapping(value = "/marshall-agency-fee-add")
    public RestResponse agencyFeeAddRequest(@RequestBody RestRequest restRequest) throws Exception {
        return new RestResponse(cbsIntegrationService.createAgencyFeeAddRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall Agency Fee Add Response",
            notes = "Получение ответа по передачи данных по комиссионному вознаграждению в АБС"
    )
    @PostMapping(value = "/unmarshall-agency-fee-add")
    private AgencyFeeAddResponse agencyFeeAddResponse(@RequestBody String body) {
        return cbsIntegrationService.createAgencyFeeAddResponse(body);
    }
}
