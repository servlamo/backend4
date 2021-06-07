package com.farzoom.lime.adapter.cbs.controller;

import com.farzoom.lime.adapter.cbs.model.RestRequest;
import com.farzoom.lime.adapter.cbs.model.RestResponse;
import com.farzoom.lime.adapter.cbs.service.integration.CbsIntegrationService;
import com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.response.AddGuaranteeResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.afs.response.SPRCustCheckResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agency_fee_add.response.AgencyFeeAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.response.AgreemtListAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.orgacctstatusmodnf.OrgAcctStatusModNf;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.orgmodrq.OrgModRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.requeststatusmodnf.RequestStatusModNf;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rs.BankAcctAddRs;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.response.BankAcctModResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response.CheckLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.response.CloseLimitResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.comission.response.CommissionResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.BkiResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.response.FileAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response.CustCheckListResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.leadlistadd.notify.LeadListAddNotification;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgacctadd.request.OrgAcctAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.response.OrgQuestionnaireAddResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.smsinfomod.response.SmsBankInfoModResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.status.response.StatusResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response.StopFactorResponse;
import com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.response.SvcPackModRs;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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

    @ApiOperation(
            value = "Marshall BankAcctAdd Request",
            notes = "Запрос на резервирование счета"
    )
    @PostMapping(value = "/marshall-bank-acct-add")
    public RestResponse bankAcctAddRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createBankAcctAddRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall BankAcctAdd Response",
            notes = "Получение подтверждения, что запрос на резервирование счета обработан"
    )
    @PostMapping(value = "/unmarshall-bank-acct-add")
    public BankAcctAddRs bankAcctAddResponse(@RequestBody String body) {
        return cbsIntegrationService.createBankAcctAddResponse(body);
    }

    @ApiOperation(
            value = "Marshall BankAcctMod Request",
            notes = "Запрос на активацию счета"
    )
    @PostMapping(value = "/marshall-bank-acct-mod")
    public RestResponse bankAcctModRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createBankAcctModRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall BankAcctMod Response",
            notes = "Получение подтверждения активации счета"
    )
    @PostMapping(value = "/unmarshall-bank-acct-mod")
    public BankAcctModResponse bankAcctModResponse(@RequestBody String body) {
        return cbsIntegrationService.createBankAcctModResponse(body);
    }

    @ApiOperation(
            value = "Marshall OrgQuestAdd Request",
            notes = "Запрос на передачу анкеты клиента"
    )
    @PostMapping(value = "/marshall-org-quest-add")
    public RestResponse orgQuestionnaireAddRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createOrgQuestionnaireAddRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall OrgQuestAdd Response",
            notes = "Получение подтверждения передачи анкеты клиента"
    )
    @PostMapping(value = "/unmarshall-org-quest-add")
    public OrgQuestionnaireAddResponse orgQuestionnaireAddResponse(@RequestBody String body) {
        return cbsIntegrationService.createOrgQuestionnaireAddResponse(body);
    }

    @ApiOperation(
            value = "Marshall SvcPackMod Request",
            notes = "Запрос на передачу тарифа"
    )
    @PostMapping(value = "/marshall-svc-pack-mod")
    public RestResponse svcPackModRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createSvcPackModRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall SvcPackMod Response",
            notes = "Получение подтверждения передачи тарифа"
    )
    @PostMapping(value = "/unmarshall-svc-pack-mod")
    public SvcPackModRs svcPackModResponse(@RequestBody String body) {
        return cbsIntegrationService.createSvcPackModResponse(body);
    }

    @ApiOperation(
            value = "Marshall SmsBankInfoMod Request",
            notes = "Запрос на подключение SMS"
    )
    @PostMapping(value = "/marshall-sms-bank-info-mod")
    public RestResponse smsBankInfoModRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createSmsBankInfoModRequest(restRequest));
    }


    @ApiOperation(
            value = "Unmarshall SmsBankInfoMod Response",
            notes = "Получение подтверждения запроса на подключение SMS"
    )
    @PostMapping(value = "/unmarshall-sms-bank-info-mod")
    public SmsBankInfoModResponse smsBankInfoModResponse(@RequestBody String body) {
        return cbsIntegrationService.createSmsBankInfoModResponse(body);
    }

    @ApiOperation(
            value = "Unmarshall RequestStatusModNf Response",
            notes = "Получение ответа со статусом по резервированию счета"
    )
    @PostMapping(value = "/unmarshall-request-status-mod-nf")
    public RequestStatusModNf requestStatusModNfResponse(@RequestBody String body) {
        return cbsIntegrationService.createRequestStatusModNfResponse(body);
    }

    @ApiOperation(
            value = "Unmarshall OrgModRq Response",
            notes = "Получение ответа с анкетой клиента"
    )
    @PostMapping(value = "/unmarshall-org-mod-rq")
    public OrgModRq orgModRqResponse(@RequestBody String body) {
        return cbsIntegrationService.createOrgModRqResponse(body);
    }

    @ApiOperation(
            value = "Unmarshall OrgAcctStatusModNf Response",
            notes = "Получение ответа с номером зарезервированного счета клиента"
    )
    @PostMapping(value = "/unmarshall-org-acct-status-mod-nf")
    public OrgAcctStatusModNf orgAcctStatusModNfResponse(@RequestBody String body) {
        return cbsIntegrationService.createOrgAcctStatusModNfResponse(body);
    }

    @ApiOperation(
            value = "Unmarshall BankAcctAdd-related responses",
            notes = "Получение одного из 4 ответов по запросу BankAcctAddRequest"
    )
    @PostMapping(value = "/unmarshall-bank-acct-responses")
    public Object bankAcctGenericResponse(@RequestBody String body) {
        //generic unmarshall endpoint for multiple bankAcctAdd-related responses, for convenience
        if (body.contains("BankAcctAdd")) {
            return bankAcctAddResponse(body);
        } else if (body.contains("RequestStatusModNf")) {
            return requestStatusModNfResponse(body);
        } else if (body.contains("OrgModRq")) {
            return orgModRqResponse(body);
        } else if (body.contains("OrgAcctStatusModNf")) {
            return orgAcctStatusModNfResponse(body);
        } else {
            return null;
        }
    }

    @ApiOperation(
            value = "Unmarshall BankAcctMod-related responses",
            notes = "Получение одного из 2 ответов по запросу BankAcctModRequest"
    )
    @PostMapping(value = "/unmarshall-bank-acct-mod-responses")
    public Object bankAcctModGenericResponse(@RequestBody String body) {
        //generic unmarshall endpoint for multiple bankAcctMod-related responses, for convenience
        if (body.contains("BankAcctMod")) {
            return bankAcctModResponse(body);
        } else if (body.contains("OrgAcctStatusModNf")) {
            return orgAcctStatusModNfResponse(body);
        } else {
            return null;
        }
    }

    @ApiOperation(
            value = "Unmarshall LeadListAddNf Notification",
            notes = "Получение уведомления с номером телефона клиента с сайта банка"
    )
    @PostMapping(value = "/unmarshall-lead-list-add-nf")
    public LeadListAddNotification leadListAddNotification(@RequestBody String body) {
        return cbsIntegrationService.createLeadListAddNotification(body);
    }

    @ApiOperation(
            value = "Unmarshall OrgAcctAddRequest request",
            notes = "Получение данных клиента с сайта банка"
    )
    @PostMapping(value = "/unmarshall-org-acct-add-request")
    public OrgAcctAddRequest orgAcctAddRequest(@RequestBody String body) {
        return cbsIntegrationService.createOrgAcctAddRequest(body);
    }

    @ApiOperation(
            value = "Marshall OrgAcctAddResponse",
            notes = "Подтверждение получения данных клиента с сайта банка"
    )
    @PostMapping(value = "/marshall-org-acct-add-response")
    public RestResponse orgAcctAddResponse(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createOrgAcctAddResponse(restRequest));
    }

    @ApiOperation(
            value = "Marshall OrgQuestAdd Request to AML",
            notes = "Запрос на передачу анкеты клиента в AML"
    )
    @PostMapping(value = "/marshall-aml-org-quest-add")
    public RestResponse amlOrgQuestionnaireAddRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createAmlOrgQuestionnaireAddRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall OrgQuestAdd Response from AML",
            notes = "Получение подтверждения передачи анкеты клиента из AML"
    )
    @PostMapping(value = "/unmarshall-aml-org-quest-add")
    public OrgQuestionnaireAddResponse amlOrgQuestionnaireAddResponse(@RequestBody String body) {
        return cbsIntegrationService.createAmlOrgQuestionnaireAddResponse(body);
    }

    @ApiOperation(
            value = "Marshall AgreemtListAdd Request",
            notes = "Запрос на передачу документов в АЮЛ"
    )
    @PostMapping(value = "/marshall-agreemt-list-add")
    public RestResponse agreemtListAddRequest(@RequestBody RestRequest restRequest) {
        return new RestResponse(cbsIntegrationService.createAgreemtListAddRequest(restRequest));
    }

    @ApiOperation(
            value = "Unmarshall AgreemtListAdd Response",
            notes = "Получение подтверждения передачи документов в АЮЛ"
    )
    @PostMapping(value = "/unmarshall-agreemt-list-add")
    public AgreemtListAddResponse agreemtListAddResponse(@RequestBody String body) {
        return cbsIntegrationService.createAgreemtListAddResponse(body);
    }

    @ApiOperation(
            value = "Marshall FileAdd Request",
            notes = "Запрос на перекладывание документов"
    )
    @PostMapping(value = "/marshall-file-add")
    public List<RestResponse> fileAddRequest(@RequestBody RestRequest restRequest) {
        return cbsIntegrationService.createFileAddRequest(restRequest).stream()
                .map(RestResponse::new)
                .collect(Collectors.toList());
    }

    @ApiOperation(
            value = "Unmarshall FileAdd Response",
            notes = "Получение ссылки на документ"
    )
    @PostMapping(value = "/unmarshall-file-add")
    public FileAddResponse fileAddResponse(@RequestBody String body) {
        return cbsIntegrationService.createFileAddResponse(body);
    }

}
