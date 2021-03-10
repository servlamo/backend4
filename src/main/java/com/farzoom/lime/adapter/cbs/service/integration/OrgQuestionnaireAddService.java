package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParam.GenParamValue;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefItem;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.*;
import com.farzoom.common.persistence.es.model.gen.Param;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.es.repositories.TaskRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest.BankSvcRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList.PropertyRec;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import com.farzoom.lime.adapter.cbs.utils.ref.RefPositions;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;
import static org.springframework.util.StringUtils.isEmpty;
import static org.springframework.util.StringUtils.tokenizeToStringArray;

@Log
public class OrgQuestionnaireAddService implements IntegrationService<OrgQuestionnaireAddRequest> {
    public static final BigDecimal ONE_THOUSAND = BigDecimal.valueOf(1000);

    private static final SimpleDateFormat DATE_FMT = new SimpleDateFormat("dd.MM.yyyy");
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final GroupRepository groupRepository;
    private final ParamRepository paramRepository;
    private final AttributeRepository attributeRepository;
    private final EsRepository esRepository;
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final CompanyRepository companyRepository;
    private final AddressRepository addressRepository;
    private final RefService refService;
    private final GenParamService genParamService;
    private final TaskRepository taskRepository;

    public OrgQuestionnaireAddService(AppConfig config) {
        groupRepository = new GroupRepository(config.getElasticsearchBaseUrl());
        paramRepository = new ParamRepository(config.getElasticsearchBaseUrl());
        attributeRepository = new AttributeRepository(config.getElasticsearchBaseUrl());
        relationRepository = new RelationRepository((config.getElasticsearchBaseUrl()));
        personRepository = new PersonRepository((config.getElasticsearchBaseUrl()));
        companyRepository = new CompanyRepository((config.getElasticsearchBaseUrl()));
        addressRepository = new AddressRepository((config.getElasticsearchBaseUrl()));
        esRepository = new EsRepository(config.getElasticsearchBaseUrl());
        refService = new RefServiceImpl(esRepository);
        taskRepository = new TaskRepository(config.getElasticsearchBaseUrl());
        genParamService = new GenParamServiceImpl(attributeRepository, groupRepository, paramRepository, refService, addressRepository);
    }

    @Override
    public OrgQuestionnaireAddRequest createRequest(Order order, Company principal, Product product) {
        OrgQuestionnaireAddRequest rq = new OrgQuestionnaireAddRequest();
        rq.setServerInfo(serverInfo());
        rq.setBankSvcRq(bankSvcRq(order, principal, product));
        return rq;
    }

    private ServerInfoType serverInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("OrgQuestionnaireAddRq");
        serverInfoType.setBpId("MTS_LOAD_ANKETA");
        return serverInfoType;
    }

    private ServerInfoType serverInfo(Product product) {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(getRequestId(product));
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("IBSO");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("OrgQuestionnaireAddRq");
        serverInfoType.setBpId("MTS_LOAD_ANKETA");
        return serverInfoType;
    }

    private BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        BankSvcRq bankSvcRq = new BankSvcRq();
        bankSvcRq.setProductList(productList(order, principal, product));
        bankSvcRq.setSPInfo(spInfo(product, principal));
        return bankSvcRq;
    }

    private BankSvcRq.ProductList productList(Order order, Company principal, Product product) {
        BankSvcRq.ProductList list = new BankSvcRq.ProductList();
        Relation companyHeadRelation = companyHead(principal);
        list.getProductRec().add(productQuestionnaire(order, principal, product, companyHeadRelation));

        ProductRec companyHeadRec = productExecutive(companyHeadRelation, principal);
        updateCompanyHeadRec(companyHeadRec);

        List<Relation> kopManagers = kopManagers(principal);
        if (CollectionUtils.isEmpty(kopManagers)) {
            updateKopRec(companyHeadRec, companyHeadRelation);
        } else {
            kopManagers.stream()
                    .filter(r -> r.getLeftId().equals(companyHeadRelation.getLeftId()))
                    .findFirst()
                    .ifPresent(r -> {
                        updateKopRec(companyHeadRec, r);
                        kopManagers.remove(r);
                    });
        }
        list.getProductRec().add(companyHeadRec);

        for (Relation kopManager : kopManagers) {
            ProductRec kopRec = productExecutive(kopManager, principal);
            updateKopRec(kopRec, kopManager);
            list.getProductRec().add(kopRec);
        }
        for (Relation benOwner : beneficiaryOwners(principal)) {
            list.getProductRec().add(productBeneficiaryOwnerQuestionnaire(benOwner));
        }
        for (Person personBeneficiary : personBeneficiaries(principal)) {
            list.getProductRec().add(productPersonBeneficiaryQuestionnaire(personBeneficiary));
        }
        for (Company companyBeneficiary : companyBeneficiaries(principal)) {
            list.getProductRec().add(productCompanyBeneficiaryQuestionnaire(companyBeneficiary));
        }
        return list;
    }

    private BankSvcRq.SPInfo spInfo(Product product, Company principal) {
        BankSvcRq.SPInfo info = new BankSvcRq.SPInfo();
        info.setOrgId(orgId(principal));
        info.setRequestId(getRequestId(product));
        info.setMethod("QuestFromApplication");
        return info;
    }

    private ProductRec productExecutive(Relation relation, Company principal) {
        Person person = personRepository.load(relation.getLeftId());
        ProductRec product = new ProductRec();
        product.setCode("EXECUTIVE");
        product.setName("Должностные лица");
        ProductRec.PropertyList props = new ProductRec.PropertyList();

        boolean isUl = isUL(principal);
        setHeadRolePosition(isUl, props, relation);

        addPerson(props, person);
        product.setPropertyList(props);
        return product;
    }

    private void setHeadRolePosition(boolean isUl, ProductRec.PropertyList props, Relation relation) {
        PositionDto headRolePosition = headRolePosition(isUl, relation);
        addRef(props, "POSITION", headRolePosition.value, headRolePosition.code);
        addString(props, "POSITION_NAME", headRolePosition.value);
    }

    private PositionDto headRolePosition(boolean isUl, Relation relation) {
        if (isUl) {
            String code = keyParam("relation", relation.getId(), "relation.position");
            if (!StringUtils.isEmpty(code)) {
                List<RefItem> positionTypes = refService.getItems("positionType");
                return positionTypes.stream()
                        .filter(r -> code.equals(r.getValue()))
                        .map(RefItem::getName)
                        .findFirst()
                        .map(s -> new PositionDto(code, s))
                        .orElseGet(() -> new PositionDto("15", "Генеральный директор"));
            } else {
                return new PositionDto("15", "Генеральный директор");
            }
        } else {
            return new PositionDto("2666", "ИП");
        }
    }

    private void setLicensePositions(Company principal, ProductRec.PropertyList props) {
        String licName, licValue, prefix = "LIC_";
        int suffix = 0;
        Map<String, String> licPositions = RefPositions.createLicensePositions();
        List<Company.License> licenses = principal.getLicenses();
        if (!CollectionUtils.isEmpty(principal.getLicenses())) {
            for (Company.License license : licenses) {
                if (suffix < 4) {
                    licName = isEmpty(license.getActivities()) ? "деятельность не подлежит лицензированию" : license.getActivities().toLowerCase();
                    licValue = licPositions.get(licName);
                    if (licValue == null) {
                        licName = "деятельность не подлежит лицензированию";
                        licValue = "0";
                    }
                    String licDateBegin = license.getIssuedDate() == null ? "" : DATE_FMT.format(license.getIssuedDate());
                    String licDateEnd = license.getExpiredDate() == null ? "" : DATE_FMT.format(license.getExpiredDate());
                    addRef(props, prefix + "TYPE_CODE_" + suffix, licName, licValue); //тип лицензии
                    addString(props, prefix + "NUM_" + suffix, license.getNumber()); //Номер лицензии
                    addString(props, prefix + "WHO_" + suffix, license.getIssuingAuthority()); //Наименование органа, выдавшего лицензию
                    addString(props, prefix + "DATE_BEGIN_" + suffix, licDateBegin); //Дата начала действия лицензии
                    addString(props, prefix + "DATE_END_" + suffix, licDateEnd); //Дата конца действия лицензии
                    suffix++;
                }
            }
        } else {
            addRef(props, prefix + "TYPE_CODE_0", "Деятельность не подлежит лицензированию", "0");
        }
    }

    private void setRiskLevelPositions(Company principal, ProductRec.PropertyList props) {
        String name, value;
        GenParam param = genParamService.loadOne("company", principal.getId(), "company.riskInfo.riskLevel");
        if (!GenParamUtils.hasKeyValue(param)) {
            log.warning("Не заполнен параметр company.riskInfo.riskLevel для компании " + principal.getId());
            return;
        }
        value = param.getValue().getKeyValue();
        Optional<RefItem> ref = refService.getItems("riskLevelType")
                .stream()
                .filter(refItem -> refItem.getValue().equalsIgnoreCase(value))
                .findFirst();
        if (ref.isPresent()) {
            name = ref.get().getName();
            addString(props, "RISK_LEVEL", name);
        } else {
            //если не заполнено - передаем пустой тег
            addString(props, "RISK_LEVEL", "");
        }
    }

    private void setRiskCriteriaPositions(Company principal, ProductRec.PropertyList props) {
        String name, value;
        int suffix = 0;
        GenParam genParam = genParamService.loadOne("company", principal.getId(), "company.riskInfo.riskCriteria");
        if (genParam == null || CollectionUtils.isEmpty(genParam.getValues())) {
            log.warning("Не заполнен параметр company.riskInfo.riskCriteria для компании " + principal.getId());
            return;
        }
        List<GenParamValue> params = genParam.getValues();
        for (GenParamValue param : params) {
            if (suffix < 20) {
                value = param.getKeyValue();
                String finalValue = value;
                Optional<RefItem> ref = refService.getItems("riskCriteriaType")
                        .stream()
                        .filter(refItem -> refItem.getValue().equalsIgnoreCase(finalValue))
                        .findFirst();
                if (ref.isPresent()) {
                    name = ref.get().getName();
                    addRef(props, "RISK_CRIT_" + suffix, name, value);
                } else {
                    //если не заполнено - передаем пустой тег
                    addRef(props, "RISK_CRIT_0", "", "");
                }
                suffix++;
            }
        }
    }

    private void setIndustryPositions(Company company, ProductRec.PropertyList props) {
        String industryKey = keyParam("company", company.getId(), "company.industry");
        if (StringUtils.isEmpty(industryKey)) {
            log.warning("Не заполнен параметр company.industry для компании " + company.getId());
            addRef(props, "SCTR_ECONOMY", "Прочее", "20");
            return;
        }
        List<RefItem> companyIndustries = refService.getItems("companyIndustry");
        Optional<RefItem> industryValue = companyIndustries.stream()
                .filter(refItem -> refItem.getValue().equalsIgnoreCase(industryKey))
                .findFirst();

        if (industryValue.isPresent()) {
            addRef(props, "SCTR_ECONOMY", industryValue.get().getName(), industryKey);
        } else {
            addRef(props, "SCTR_ECONOMY", "Прочее", "20");
        }
    }

    //changed by SUPPORT-2429
    private void setCurrencyRelationsPositions(Product product, ProductRec.PropertyList props) {
        GenParam param = genParamService.loadOne("product", product.getId(), "product.rko.currency");
        if (!GenParamUtils.hasKeyValue(param)) {
            log.warning("Не заполнен параметр product.rko.currency для продукта " + product.getId());
            addRef(props, "DEPOSITION", "Долгосрочные отношения. проведение расчетов в рублях", "ДО");
            return;
        }

        String currency = param.getValue().getKeyValue();
        String valueCode = "RUB".equals(currency) ? "ДО" : "ПРВ";
        String value = "ДО".equals(valueCode) ? "Долгосрочные отношения. проведение расчетов в рублях" : "Проведение расчетов в валюте";
        addRef(props, "DEPOSITION", value, valueCode);
    }

    private void setAddressCorpCharter(Product product, ProductRec.PropertyList props) {
        GenParam param = genParamService.loadOne("product", product.getId(), "product.bg.locationAddress");
        if (param != null && param.getValue() != null && !StringUtils.isEmpty(param.getValue().getAddressValue())) {
            addAddress(props, "ADDRESS_CORP_CHARTER_", "", "CORP", param.getValue().getAddressValue());
        }
        //SUPPORT-2382 Новое требование: Если Адрес местонахождения не заполнен - то параметр ADDRESS_CORP_CHARTER_ не передается вообще
        //else {
        //    addAddress(props, "ADDRESS_CORP_CHARTER_", "", "CORP", principal.getLegalAddress().getAddressId());
        //}
    }

    private void setClientRegistrationDate(Company principal, ProductRec.PropertyList props) {
        Date date = principal.getRegistrationDate();
        String regDate = DATE_FMT.format(date);
        addString(props, "REG_DATE", regDate);
    }

    private void setClientBusRep(Company principal, Order order, ProductRec.PropertyList props) {
        String regDate = DATE_FMT.format(principal.getRegistrationDate());
        String accountOpeningDate = "НЕ УКАЗАНО";
        String principalSite = principal.getWww();
        if (principalSite == null) {
            principalSite = "нет необходимости";
        }
        String mainLine = stringParam("company", principal.getId(), "company.reputation_1");
        if (mainLine == null) {
            mainLine = "НЕ УКАЗАНО";
        }

        String query = String.format("{\"size\":1,\"sort\":{\"startTime\":\"desc\"}," +
                "\"query\":{\"bool\":{\"must\":[{\"term\":{\"processInstanceBusinessKey\":\"%s\"}}," +
                "{\"terms\":{\"taskDefinitionKey\":[\"UserTask_CheckOb\",\"UserTask_CheckObRework\",\"UserTask_AddDocument\",\"UserTask_FillAnketa\"]}}," +
                "{\"exists\":{\"field\":\"endTime\"}}]}}}", order.getId());
        if (!CollectionUtils.isEmpty(taskRepository.searchEx(query))) {
            accountOpeningDate = DATE_FMT.format(
                    taskRepository.searchEx(query)
                            .get(0)
                            .getEndTime()
            );
        }

        String busRepText = String.format("Клиент работает на рынке с %s. " +
                        "Основное направление бизнеса: %s. Сайт в сети интернет - %s.\n" +
                        "На дату открытия счета %s негативных сведений в открытых источниках информации не выявлено",
                regDate, mainLine, principalSite, accountOpeningDate);
        addString(props, "BUS_REP_TEXT", busRepText);
    }

    private void setMoneySource(Company principal, ProductRec.PropertyList props) {
        GenParam genParam = genParamService.loadOne("company", principal.getId(), "company.activity.source");
        List<GenParamValue> params = genParam.getValues();
        int i = 1;
        Map<String, Boolean> paramsData = new LinkedHashMap<>();
        paramsData.put("rko_ms_own", false);
        paramsData.put("rko_ms_personal", false);
        paramsData.put("rko_ms_business", false);
        paramsData.put("rko_ms_work", false);
        paramsData.put("rko_ms_other", false);
        for (GenParamValue param : params) {
            refService.getItems("rkoMoneySourceType")
                    .stream()
                    .filter(refItem -> refItem.getValue().equals(param.getKeyValue()))
                    .findFirst()
                    .ifPresent(refItem -> paramsData.replace(refItem.getValue(), true));
        }
        if (!paramsData.containsValue(true)) {
            setMoneySourceOld(principal, paramsData);
        }

        for (Map.Entry<String, Boolean> entry : paramsData.entrySet()) {
            if (entry.getKey().equals("rko_ms_other") && entry.getValue()) {
                if (stringParam("company", principal.getId(), "company.activity.sourceOther") != null) {
                    addString(props, "ORIGIN_MONEY_5", stringParam("company", principal.getId(), "company.activity.sourceOther"));
                } else {
                    addBool(props, "ORIGIN_MONEY_5", entry.getValue());
                }
            } else {
                addBool(props, "ORIGIN_MONEY_" + i, entry.getValue());
            }
            i++;
        }
    }

    private void setMoneySourceOld(Company principal, Map<String, Boolean> paramsData) {
        int i = 1;
        for (Map.Entry<String, Boolean> entry : paramsData.entrySet()) {
            if (i <= 4 && boolParam("company", principal.getId(), "company.moneySource_ref" + i) != null) {
                paramsData.replace(entry.getKey(), true);
            }
            i++;
        }
        if (stringParam("company", principal.getId(), "company.activity.sourceOther") != null) {
            paramsData.replace("rko_ms_other", true);
        }
    }

    private void setFoundersShares(Company principal, ProductRec.PropertyList props) {
        int i = 1;
        List<Relation> personShareholders = personShareholders(principal, 1);
        if (!personShareholders.isEmpty()) {
            for (Relation shareholder : personShareholders) {
                BigDecimal share = shareholder.getPersonFounder().getShare().getPercent();
                Person person = personRepository.load(shareholder.getLeftId());
                String inn = person.getINN() != null ? person.getINN() : "нет данных";
                addString(props, "FOUNDER_SURNAME_" + i, person.getLastName());
                addString(props, "FOUNDER_FIRSTNAME_" + i, person.getFirstName());
                addString(props, "FOUNDER_MIDDLENAME_" + i,
                        person.getSecondName() == null || person.getSecondName().equals("-") ? "" : person.getSecondName());
                addString(props, "FOUNDER_INN_" + i, inn);
                addString(props, "FOUNDER_SHARE_" + i, share.toString());
                i++;
            }
        }
        List<Relation> companyShareholders = companyShareholders(principal, 1);
        if (!companyShareholders.isEmpty()) {
            for (Relation shareholder : companyShareholders) {
                BigDecimal share = shareholder.getCompanyFounder().getShare().getPercent();
                Company company = companyRepository.load(shareholder.getLeftId());
                String shortName = company.getShortName() != null ? company.getShortName() : "нет данных";
                String inn = company.getINN() != null ? company.getINN() : "нет данных";
                addString(props, "FOUNDER_ORG_NAME_" + i, shortName);
                addString(props, "FOUNDER_ORG_INN_" + i, inn);
                addString(props, "FOUNDER_ORG_SHARE_" + i, share.toString());
                i++;
            }
        }
    }

    private void setFinInfo(Company principal, ProductRec.PropertyList props) {
        GenParam genParam = genParamService.loadOne("company", principal.getId(), "company.fp.template");
        if (!GenParamUtils.hasKeyValue(genParam)) {
            log.warning("Не заполнен параметр company.fp.template для компании " + principal.getId());
            return;
        }
        if (genParam.getValue().getKeyValue().equals("rko_fp_needControl")) {
            String taxPeriod = "не указано", taxAmount = "не указано";
            for (Relation row : paramTable(principal.getId(), "companyTax")) {
                taxPeriod = stringParam("relation", row.getId(), "companyTax.period");
                taxAmount = moneyParam("relation", row.getId(), "companyTax.amount").divide(
                        ONE_THOUSAND, 0, 2
                ).toPlainString();
            }
            String date = longParam("company", principal.getId(), "company.fp.lastYear") != null
                    ? longParam("company", principal.getId(), "company.fp.lastYear").toString() : "не указано";
            Long income = longParam("company", principal.getId(), "company.reputation_7");
            long incomeTs = income == null ? 0 : income / 1000;
            Long profit = longParam("company", principal.getId(), "company.fp.profit");
            long profitTs = profit == null ? 0 : profit;
            addString(props, "FIN_SIT_TEXT",
                    String.format("Система налогообложения: Предоставлен годовой бух. баланс за %s год, выручка " +
                                    "составила %d тыс. руб. Прибыль %d тыс. руб. Налоговая декларация по НДС за %s, " +
                                    "налоговая декларация по налогу на прибыль за %s год. Суммы уплаченных налогов: %s тыс. руб.",
                            date, incomeTs, profitTs, taxPeriod, taxPeriod, taxAmount));
        } else {
            addString(props, "FIN_SIT_TEXT",
                    String.format("Финансовое положения установлено на основании сведений из Единого федерального " +
                            "ресурса сведений о банкротстве http://bankrot.fedresurs.ru. Сведения о банкротстве " +
                            "клиента по состоянию на %s отсутствуют", DATE_FMT.format(new Date())));
        }
    }

    private void setCompanyControlInfo(Company principal, Person companyHead, ProductRec.PropertyList props) {
        String controlName = keyParam("company", principal.getId(), "company.control") == null ?
                "Единоличный исполнительный орган" : keyParam("company", principal.getId(), "company.control");
        String companyHeadInfo = String.join(" ", "Руководитель:", getShareholdersInfo(companyHead));
        String personsShareholdersInfo = "";
        List<Relation> personShareholders = personShareholders(principal, 25);
        if (!personShareholders.isEmpty()) {
            for (Relation shareholder : personShareholders) {
                Person person = personRepository.load(shareholder.getLeftId());
                BigDecimal share = shareholder.getPersonFounder().getShare().getPercent();
                personsShareholdersInfo = personsShareholdersInfo.concat(
                        String.join(", ", getShareholdersInfo(person), "доля участия: " + share.toString() + "%"));
                personsShareholdersInfo = String.join(" ", "Участник/акционер:", personsShareholdersInfo + ";\n");
            }
        }
        String companyShareholdersInfo = "";
        List<Relation> companyShareholders = companyShareholders(principal, 25);
        if (!companyShareholders.isEmpty()) {
            for (Relation shareholder : companyShareholders) {
                Company company = companyRepository.load(shareholder.getLeftId());
                BigDecimal share = shareholder.getCompanyFounder().getShare().getPercent();
                companyShareholdersInfo = companyShareholdersInfo.concat(
                        String.join(", ", getShareholdersInfo(company), "доля участия: " + share.toString() + "%"));
                companyShareholdersInfo = String.join(" ", "Участник/акционер:", companyShareholdersInfo + ";\n");
            }
        }

        String controlInfo = String.format("%s;\n%s;\n%s%s",
                controlName, companyHeadInfo, personsShareholdersInfo, companyShareholdersInfo);
        addString(props, "CONTROL_TEXT", controlInfo);
    }

    private String getShareholdersInfo(Person person) {
        String fio = String.join(" ",
                person.getLastName(),
                person.getFirstName(),
                person.getSecondName());
        String passportData = "Паспорт гражданина РФ";
        if (!CollectionUtils.isEmpty(person.getIdentityDocuments())) {
            Optional<IdentityDocument> doc = person.getIdentityDocuments().stream().findFirst();
            if (doc.isPresent()) {
                passportData = String.join(" ",
                        passportData,
                        formatXX_XX(doc.get().getSeries()),
                        doc.get().getNumber());
            }
        } else {
            passportData = String.join(" ", passportData, "нет данных");
        }
        String inn = person.getINN() != null ?
                String.join(" ", "ИНН", person.getINN()) :
                String.join(" ", "ИНН", "нет данных");
        return String.join(", ", fio, passportData, inn);
    }

    private String getShareholdersInfo(Company company) {
        String shortName = company.getShortName() != null ? company.getShortName() : "нет данных";
        String inn = company.getINN() != null ? company.getINN() : "нет данных";
        return String.join(", ", shortName, inn);
    }

    private String updatePhone(String phone) {
        if (phone != null) {
            return phone.replaceAll("[()\\-]", "");
        } else {
            return null;
        }
    }

    private void addTransactions(Long money, String suffix, int value, ProductRec.PropertyList props) {
        if (money != null) {
            addNumber(props, "WEEK_" + suffix, money / 4);
            addNumber(props, "MONTH_" + suffix, money)
                    .ifPresent(prop -> {
                        prop.setOrderBy(BigInteger.valueOf(value));
                    });
            addNumber(props, "QUARTER_" + suffix, money * 3);
            addNumber(props, "YEAR_" + suffix, money * 12);
        }
    }

    private ProductRec productBeneficiaryOwnerQuestionnaire(Relation relation) {
        Person person = personRepository.load(relation.getLeftId());
        ProductRec product = new ProductRec();
        product.setCode("BENEFIC_QUEST");
        product.setName("АНКЕТА БЕНЕФИЦИАРНОГО ВЛАДЕЛЬЦА");
        ProductRec.PropertyList props = new ProductRec.PropertyList();
        addPerson(props, person);

        addBool(props, "IPDL_PDL", boolParam("person", person.getId(), "person.isIpdl") != null
                ? boolParam("person", person.getId(), "person.isIpdl") : false);
        addBool(props, "IPDL_PDL_RELATIVE", boolParam("person", person.getId(), "person.isIpdlRelative") != null
                ? boolParam("person", person.getId(), "person.isIpdlRelative") : false);

        String reason = keyParam("relation", relation.getId(), "relation.beneficiary.reason");
        addBool(props, "ORG_LINK_STOCK", "ownsShares".equals(reason));
        addBool(props, "ORG_LINK_OWNER", "isFounderMemberOwner".equals(reason));
        addString(props, "ORG_LINK_OTHER", "hasAbilityControlClientActions".equals(reason) ?
                "Имеет возможность контролировать действия клиента" : "");

        product.setPropertyList(props);
        return product;
    }

    private ProductRec productPersonBeneficiaryQuestionnaire(Person beneficiary) {
        ProductRec product = new ProductRec();
        boolean ip = Boolean.TRUE.equals(boolParam("person", beneficiary.getId(), "person.isIp"));
        if (!ip) {
            product.setCode("FL_PROFIT_QUEST");
            product.setName("СВЕДЕНИЯ О ВЫГОДОПРИОБРЕТАТЕЛЕ - ФИЗИЧЕСКОМ ЛИЦЕ");
        } else {
            product.setCode("IP_PROFIT_QUEST");
            product.setName("СВЕДЕНИЯ О ВЫГОДОПРИОБРЕТАТЕЛЕ - ИНДИВИДУАЛЬНОМ ПРЕДПРИНИМАТЕЛЕ");
        }
        ProductRec.PropertyList props = new ProductRec.PropertyList();
        addPerson(props, beneficiary);
        addString(props, "SNILS", keyParam("person", beneficiary.getId(), "person.snils"));
        if (ip) {
            addString(props, "OGRNIP", keyParam("person", beneficiary.getId(), "person.ogrnip"));
            addString(props, "REGISTRATION_AUTHORITY", stringParam("person", beneficiary.getId(), "person.ipRegPlace"));
        }
        product.setPropertyList(props);
        return product;
    }

    private ProductRec productCompanyBeneficiaryQuestionnaire(Company beneficiary) {
        ProductRec product = new ProductRec();
        product.setCode("UL_PROFIT_QUEST");
        product.setName("СВЕДЕНИЯ О ВЫГОДОПРИОБРЕТАТЕЛЕ - ЮРИДИЧЕСКОМ ЛИЦЕ");
        ProductRec.PropertyList props = new ProductRec.PropertyList();
        addCompany(props, beneficiary);
        product.setPropertyList(props);
        return product;
    }

    private ProductRec productQuestionnaire(Order order, Company principal, Product product, Relation companyHeadRelation) {
        ProductRec productRec = new ProductRec();
        boolean isUl = isUL(principal);
        if (isUl) {
            productRec.setCode("UL_QUEST");
            productRec.setName("Анкета-опрос (Клиента - юридического лица)");
        } else {
            productRec.setCode("IP_QUEST");
            productRec.setName("Анкета-опрос (индивидуального предпринимателя, физического лица)");
        }
        ProductRec.PropertyList props = new ProductRec.PropertyList();
        addString(props, "ORG_INN", principal.getINN());
        addString(props, "ORG_OGRN", principal.getOGRN());
        addRef(props, "TAX_RES_STATE", "Российская Федерация", "643");

        addString(props, "PHONE_MAIN", updatePhone(keyParam("order", order.getId(), "order.rko.contacts.cellPhone")));
        addString(props, "SITE_MAIN", stringParam("company", principal.getId(), "company.reputation_11"));
        addString(props, "MAIL_MAIN", keyParam("order", order.getId(), "order.rko.contacts.email"));
        addString(props, "M_PHONE_MAIN", updatePhone(keyParam("order", order.getId(), "order.rko.contacts.workPhone")));

        String[] contactFio = tokenizeToStringArray(stringParam("order", order.getId(), "order.rko.contacts.fio"), " ");
        addString(props, "CONT_SURNAME", contactFio.length > 0 ? contactFio[0] : "");
        addString(props, "CONT_FIRSTNAME", contactFio.length > 1 ? contactFio[1] : "");
        addString(props, "CONT_MIDDLENAME", contactFio.length > 2 ? contactFio[2] : "");

        addNumber(props, "EMPL_NUMBER", longParam("company", principal.getId(), "company.staffInfo"));
        addNumber(props, "FOT", longParam("company", principal.getId(), "company.staff.wage"));

        Boolean otherBank = boolParam("company", principal.getId(), "company.isOtherBank");
        addBool(props, "ACCS_OTHER_ORGS", otherBank);
        addString(props, "ACC_OPENED_IN", Boolean.TRUE.equals(otherBank) ?
                param("company", principal.getId(), "company.otherBankName", "bank")
                        .map(GenParamValue::getBankValue).map(Param.BankValue::getBankName).orElse(null) : "");

        addNumber(props, "AUTH_CAPITAL_REG", longParam("company", principal.getId(), "company.capital.state"));
        addNumber(props, "AUTH_CAPITAL_P", longParam("company", principal.getId(), "company.capital.paid"));

        addBool(props, "COUNTRY_TAX_USA", boolParam("company", principal.getId(), "company.fatca.isUsa"));
        addBool(props, "COUNTRY_TAX_OESR", boolParam("company", principal.getId(), "company.fatca.isOesr"));
        addBool(props, "TAXPAYER_USA", boolParam("company", principal.getId(), "company.fatca.isOther"));

        String principalType = keyParam("company", principal.getId(), "company.principalType");
        addBool(props, "OWN_STRUCTURE_1", "rko_ul_state".equals(principalType));
        addBool(props, "OWN_STRUCTURE_2", "rko_ul_neres".equals(principalType));
        addBool(props, "OWN_STRUCTURE_3", "rko_ul_emitent".equals(principalType));
        addBool(props, "OWN_STRUCTURE_4", "rko_ul_none".equals(principalType));

        String activityPurpose = keyParam("company", principal.getId(), "company.activity.purpose");
        addBool(props, "FHD_PURPOS_1", "rko_inc_income".equals(activityPurpose));
        addBool(props, "FHD_PURPOS_2", "rko_inc_uncomm".equals(activityPurpose));
        addString(props, "FHD_PURPOS_3", "rko_inc_other".equals(activityPurpose) ?
                stringParam("company", principal.getId(), "company.activity.purposeOther") : "");

        addBool(props, "FL_PAYMENT", boolParam("company", principal.getId(), "company.activity.isFiz"));
        String fizType = keyParam("company", principal.getId(), "company.activity.fizType");
        addBool(props, "ACTIVITY_1", "rko_pay_agent".equals(fizType));
        addBool(props, "ACTIVITY_2", "rko_pay_subagent".equals(fizType));
        addBool(props, "ACTIVITY_3", "rko_pay_operator".equals(fizType));

        addString(props, "PAYMENT_AGENT_ACC", stringParam("company", principal.getId(), "company.activity.account"));
        addBool(props, "NONRES_PAYMENT", boolParam("company", principal.getId(), "company.activity.isNeres"));

        String nalogType = keyParam("company", principal.getId(), "company.activity.nalogType");
        addBool(props, "TAXATION_SYS_1", "rko_nalog_common".equals(nalogType));
        addBool(props, "TAXATION_SYS_2", "rko_nalog_special".equals(nalogType));
        addBool(props, "TAXATION_SYS_3", "rko_nalog_eshn".equals(nalogType));
        addBool(props, "TAXATION_SYS_4", "rko_nalog_usno".equals(nalogType));
        addBool(props, "TAXATION_SYS_5", "rko_nalog_patent".equals(nalogType));
        addBool(props, "TAXATION_SYS_6", "rko_nalog_envd".equals(nalogType));

        for (ListIterator<Relation> it = paramTable(principal.getId(), "companyTax").listIterator(); it.hasNext(); ) {
            int idx = it.nextIndex() + 1;
            Relation row = it.next();
            addString(props, "TAX_PERIOD_" + idx, stringParam("relation", row.getId(), "companyTax.period"));
            addString(props, "TAX_TYPE_" + idx, stringParam("relation", row.getId(), "companyTax.type"));
            addNumber(props, "TAX_SUM_" + idx, moneyParam("relation", row.getId(), "companyTax.amount"));
        }

        addString(props, "ACTIVITY_WITH_BANK", stringParam("company", principal.getId(), "company.activity.bankActivity"));
        addNumber(props, "ACCOUNT_PERIOD", longParam("company", principal.getId(), "company.fp.lastYear"));
        addNumber(props, "PROFIT", longParam("company", principal.getId(), "company.fp.profit"));
        addNumber(props, "LOSS", longParam("company", principal.getId(), "company.fp.loss"));
        addDate(props, "REPORT_DATE", dateParam("company", principal.getId(), "company.fp.date"));

        String principalTypeFP = keyParam("company", principal.getId(), "company.fp.principalType");
        addBool(props, "ORG_TYPE_1", "rko_pt2_strat".equals(principalTypeFP));
        addBool(props, "ORG_TYPE_2", "rko_pt2_federal".equals(principalTypeFP));
        addBool(props, "ORG_TYPE_3", "rko_pt2_corp".equals(principalTypeFP));
        addBool(props, "ORG_TYPE_4", "rko_pt2_none".equals(principalTypeFP));

        addBool(props, "ANOTHER_PERSON_PROFIT_SIGN", boolParam("company", principal.getId(), "company.fp.isOtherProfit"));

        for (int i = 1; i <= 6; i++) {
            addBool(props, "FIN_POS_DOC_" + i, boolParam("company", principal.getId(), "company.finApprove_ref" + i));
        }

        //disable by SUPPORT-2449
        //addString(props, "MAIN_LINE_BUSINESS", stringParam("company", principal.getId(), "company.reputation_1"));
        addString(props, "TARGET_MARKET_SEGMENT", stringParam("company", principal.getId(), "company.reputation_2"));
        addString(props, "TENDERER", stringParam("company", principal.getId(), "company.reputation_3"));
        addString(props, "TENDER_SUBJECT", stringParam("company", principal.getId(), "company.reputation_4"));
        addString(props, "ORGANIZED", stringParam("company", principal.getId(), "company.reputation_5"));
        addString(props, "GROUP", stringParam("company", principal.getId(), "company.reputation_6"));
        addNumber(props, "REVENUE_VOLUME", longParam("company", principal.getId(), "company.reputation_7"));
        addString(props, "SITE", stringParam("company", principal.getId(), "company.reputation_10"));
        addString(props, "ABSENCE_REASON", stringParam("company", principal.getId(), "company.reputation_11"));
        addString(props, "SOURCE_PUBLIC_INF", stringParam("company", principal.getId(), "company.reputation_12"));

        for (int i = 1; i <= 8; i++) {
            addBool(props, "FATCA_" + i, boolParam("company", principal.getId(), "company.taxUsa_" + i));
        }

        addBool(props, "PDL_IPDL_1", boolParam("company", principal.getId(), "person.isIpdl") != null
                ? boolParam("company", principal.getId(), "person.isIpdl") : false);
        addBool(props, "PDL_IPDL_2", boolParam("company", principal.getId(), "person.isIpdlRelative") != null
                ? boolParam("company", principal.getId(), "person.isIpdlRelative") : false);
        addBool(props, "PDL_IPDL_3", boolParam("company", principal.getId(), "person.isPdl") != null
                ? boolParam("company", principal.getId(), "person.isPdl") : false);
        addBool(props, "PDL_IPDL_4", boolParam("company", principal.getId(), "person.isPdlRelative") != null
                ? boolParam("company", principal.getId(), "person.isPdlRelative") : false);

        addString(props, "TRANSACTIONS_INF_RUB", "");
        addTransactions(longParam("company", principal.getId(), "company.rko.operRFQuant"), "NUMBER_RUB", 74, props);
        addTransactions(longParam("company", principal.getId(), "company.rko.operRFSumma"), "SUM_RUB", 75, props);
        addString(props, "TRANSACTIONS_INF_CASH", "");
        addTransactions(longParam("company", principal.getId(), "company.rko.operWithdrawQuant"), "NUMBER_CASH", 76, props);
        addTransactions(longParam("company", principal.getId(), "company.rko.operWithdrawSumma"), "SUM_CASH", 77, props);
        addString(props, "TRANSACTIONS_INF_FOREIGN", "");
        addTransactions(longParam("company", principal.getId(), "company.rko.operTradeQuant"), "NUMBER_FOREIGN", 78, props);
        addTransactions(longParam("company", principal.getId(), "company.rko.operTradeSumma"), "SUM_FOREIGN", 79, props);

        for (ListIterator<Relation> it = paramTable(principal.getId(), "companyContragent").listIterator(); it.hasNext(); ) {
            int idx = it.nextIndex() + 1;
            Relation row = it.next();
            if (isUl) {
                addString(props, "PARTNER_TYPE_" + idx, rkoContragent(keyParam("relation", row.getId(), "company.contragent.type")));
                addString(props, "PARTNER_PAYER_NAME_" + idx, stringParam("relation", row.getId(), "company.contragent.name"));
                addString(props, "PARTNER_PAYER_INN_" + idx, stringParam("relation", row.getId(), "company.contragent.inn"));
//                addString(props, "CONTRACT_TYPE_" + idx, stringParam("relation", row.getId(), "company.contragent.agreement"));
            } else {
                addStringOrdered(props, "PARTNERS" + idx + "_TYPE", rkoContragent(keyParam("relation", row.getId(), "company.contragent.type")), 104);
                addStringOrdered(props, "PARTNER_PAYER" + idx + "_NAME", stringParam("relation", row.getId(), "company.contragent.name"), 105);
                addStringOrdered(props, "PARTNER_PAYER" + idx + "_INN", stringParam("relation", row.getId(), "company.contragent.inn"), 106);
                addStringOrdered(props, "CONTRACT" + idx + "_TYPE", stringParam("relation", row.getId(), "company.contragent.agreement"), 107);
            }
        }

        //SUPPORT-2429
        //addBool(props, "RKO", boolParam("company", principal.getId(), "company.rkoPurpose_ref1"));
        //addBool(props, "PAYMENTS_RUB", boolParam("company", principal.getId(), "company.rkoPurpose_ref2"));
        //addBool(props, "PAYMENTS_FOREIGN_CURR", boolParam("company", principal.getId(), "company.rkoPurpose_ref3"));
        //addBool(props, "LOAN", boolParam("company", principal.getId(), "company.rkoPurpose_ref4"));
        //addBool(props, "DEPOSIT", boolParam("company", principal.getId(), "company.rkoPurpose_ref5"));
        //addBool(props, "SECURITIES", boolParam("company", principal.getId(), "company.rkoPurpose_ref6"));
        //addBool(props, "GUARANTEE", boolParam("company", principal.getId(), "company.rkoPurpose_ref7"));
        //addBool(props, "SALARY", boolParam("company", principal.getId(), "company.rkoPurpose_ref8"));
        //addBool(props, "OTHER", boolParam("company", principal.getId(), "company.rkoPurpose_ref99"));

        setMoneySource(principal, props);

        addAddress(props, "ADDRESS_", "", "FACT", Boolean.TRUE.equals(principal.getActualAddress().getEqualsLegalAddress()) ?
                principal.getLegalAddress().getAddressId() : principal.getActualAddress().getAddressId());

        if (isUl) {
            Person companyHead = personRepository.load(companyHeadRelation.getLeftId());
            PositionDto companyHeadPosition = headRolePosition(true, companyHeadRelation);

            addString(props, "MANAG_TYPE", "ЕИО");
            addString(props, "MAN_CASTA_PHL_1", companyHeadPosition.value);
            addDate(props, "MAN_BIRTHDAY_PHL_1", companyHead.getBirthDate());
            addString(props, "MAN_BIRTH_PLACE_PHL_1", companyHead.getBirthPlace());
            addString(props, "MAN_FAMILY_NAME_PHL_1", companyHead.getLastName());
            addString(props, "MAN_NAME_PHL_1", companyHead.getFirstName());
            addString(props, "MAN_SURNAME_PHL_1", companyHead.getSecondName());
            if (!CollectionUtils.isEmpty(companyHead.getIdentityDocuments())) {
                companyHead.getIdentityDocuments().stream()
                        .findFirst()
                        .ifPresent(d -> {
                            addRef(props, "MAN_DOC_TYPE_PHL_1", "Паспорт гражданина РФ", "PersDoc_Passport");
                            addString(props, "MAN_DOC_SERIAL_PHL_1", formatXX_XX(d.getSeries()));
                            addString(props, "MAN_DOC_NUM_PHL_1", d.getNumber());
                            addString(props, "MAN_DOC_WHO_PHL_1", d.getIssuingAuthority());
                            addString(props, "MAN_DOC_WHO_CODE_PHL_1", d.getIssuingAuthorityCode());
                            addDate(props, "MAN_DOC_DATE_PHL_1", d.getIssuedDate());
                        });
            }
            if (!CollectionUtils.isEmpty(companyHead.getContacts())) {
                companyHead.getContacts().stream()
                        .findFirst()
                        .ifPresent(c -> {
                            addString(props, "MAN_MAIL_PHL_1", c.getEmail());
                            addString(props, "MAN_PHONE_PHL_1", updatePhone(c.getPhone()));
                        });
            }
            if (!StringUtils.isEmpty(companyHead.getRegistrationAddressId())) {
                addAddress(props, "ADDRESS_", "_PHL_1", "REGISTRATION", companyHead.getRegistrationAddressId());
            }

            setAddressCorpCharter(product, props);
            setCompanyControlInfo(principal, companyHead, props);
        }

        addString(props, "MAN_USER", order.getInitiator().getLogin());
        addString(props, "OPEN_USER", order.getInitiator().getLogin());
        addString(props, "PROOV_USER", order.getInitiator().getLogin());
        if (isUl) {
            addString(props, "CONTROL", keyParam("company", principal.getId(), "company.control") == null ?
                    "Единоличный исполнительный орган" : keyParam("company", principal.getId(), "company.control"));
        }
        if (!StringUtils.isEmpty(principal.getIFNS().getRegCode())) {
            addString(props, "REG_FNS", principal.getIFNS().getRegCode());
        } else {
            addString(props, "REG_FNS", principal.getIFNS().getCode());
        }
        addString(props, "OKATO", principal.getOKATO());
        addString(props, "OKTMO", principal.getOKTMO());
        addString(props, "OKPO", principal.getOKPO());
        addString(props, "OKFS", principal.getOKFS());
        addString(props, "OKOGU", principal.getOKOGU());
        addString(props, "RUS.OKOPF", principal.getOKOPF());

        addAddress(props, "ADDRESS_CORP_", "", "CORP", principal.getLegalAddress().getAddressId());
        addAddress(props, "ADDRESS_POST_", "", "POST",
                principal.getPostalAddress() != null && principal.getPostalAddress().getEqualsLegalAddress() != null && principal.getPostalAddress().getEqualsLegalAddress() ?
                        principal.getPostalAddress().getAddressId() : principal.getLegalAddress().getAddressId());

        setFinInfo(principal, props);
        setFoundersShares(principal, props);
        setClientRegistrationDate(principal, props);
        setLicensePositions(principal, props);
        setRiskLevelPositions(principal, props);
        setRiskCriteriaPositions(principal, props);
        setIndustryPositions(principal, props);
        setClientBusRep(principal, order, props);
        setCurrencyRelationsPositions(product, props);

        addRef(props, "CL_CATEGORY", "субъект малого бизнеса", "SMALL");
        // TODO: хардкод, т.к. пока только SMALL, но вот заготовка на будущее:
        /*
        Map<String, String> catPositions = RefPositions.createClientCategoriesPositions();
        String catName = keyParam("company", company.getCompanyTypeRefId(), "???"); // узнать параметр, отвечающий за Категория типа бизнеса клиента
        String catValue = catPositions.get(catName.toLowerCase());
        if (catValue != null) {
            addRef(props,"CL_CATEGORY", catName, catValue);
        } else {
            addRef(props,"CL_CATEGORY", "субъект малого бизнеса", "SMALL");
        }
        */
        productRec.setPropertyList(props);
        return productRec;
    }

    private void updateCompanyHeadRec(ProductRec rec) {
        addBool(rec.getPropertyList(), "MANAG_MEMBER", true);
        addBool(rec.getPropertyList(), "IS_PRINCIPAL", true);
    }

    private void updateKopRec(ProductRec rec, Relation rel) {
        addBool(rec.getPropertyList(), "SIGN_TODAY", true);
        addString(rec.getPropertyList(), "SIGN_REASON_NAME", rel.getEmployee().getAuthorizingDoc());
        Date startDate = dateParam("relation", rel.getId(), "relation.authorizationStartDate");
        if (startDate != null) {
            addDate(rec.getPropertyList(), "SIGN_REASON_BEG", startDate);
        }
        Date endDate = dateParam("relation", rel.getId(), "relation.authorizationExpirationDate");
        if (startDate != null) {
            addDate(rec.getPropertyList(), "SIGN_REASON_END", endDate);
        }
    }

    private void addPerson(ProductRec.PropertyList props, Person person) {
        addString(props, "CL_SURNAME", person.getLastName());
        addString(props, "CL_FIRSTNAME", person.getFirstName());
        addString(props, "CL_MIDDLENAME", person.getSecondName());
        addDate(props, "BIRTH_DATE", person.getBirthDate());
        addString(props, "BIRTH_PLACE", person.getBirthPlace());
        if ("rf".equals(person.getCitizenship())) {
            addRef(props, "SITIZENSHIP", "РОССИЙСКАЯ ФЕДЕРАЦИЯ", "643"); //XXX: SITIZENSHIP - не опечатка
            addString(props, "INN", person.getINN());
            if (person.getIdentityDocuments() != null) {
                person.getIdentityDocuments().stream()
                        .findFirst()
                        .ifPresent(doc -> {
                            addRef(props, "IDENTITY_DOC", "Паспорт гражданина РФ", "PersDoc_Passport");
                            addString(props, "IDENTITY_DOC_NAME", "PersDoc_Passport");
                            addString(props, "IDENTITY_DOC_SER", formatXX_XX(doc.getSeries()));
                            addString(props, "IDENTITY_DOC_NUM", doc.getNumber());
                            addDate(props, "IDENTITY_DOC_START_DATE", doc.getIssuedDate());
                            addString(props, "IDENTITY_DOC_SERVICE_NAME", doc.getIssuingAuthority());
                            addString(props, "IDENTITY_DOC_SERVICE_CODE", doc.getIssuingAuthorityCode());
                        });
            }
        } else if ("other".equals(person.getCitizenship())) {
            addString(props, "SITIZENSHIP", person.getOtherCitizenship());
            if (person.getOtherDocuments() != null) {
                person.getOtherDocuments().stream()
                        .filter(doc -> "migrCard".equals(doc.getDocType()))
                        .findFirst()
                        .ifPresent(migrCard -> {
                            addString(props, "MIGRATION_CARD_NUM", migrCard.getNumber());
                            addDate(props, "MIGRATION_CARD_START_DATE", migrCard.getStartDate());
                            addDate(props, "MIGRATION_CARD_END_DATE", migrCard.getEndDate());
                        });
                person.getOtherDocuments().stream()
                        .filter(doc -> "visa".equals(doc.getDocType()) ||
                                "residence".equals(doc.getDocType()) ||
                                "tempPermission".equals(doc.getDocType()) ||
                                "otherExt".equals(doc.getDocType())
                        )
                        .findFirst()
                        .ifPresent(doc -> {
                            addString(props, "ELIGIBILITY_DOC_NAME", identityDocumentType(doc.getDocType()));
                            addString(props, "ELIGIBILITY_DOC_SER", doc.getSeries());
                            addString(props, "ELIGIBILITY_DOC_NUM", doc.getNumber());
                            addDate(props, "ELIGIBILITY_DOC_START_DATE", doc.getStartDate());
                            addDate(props, "ELIGIBILITY_DOC_END_DATE", doc.getEndDate());
                        });
            }
        }
        addAddress(props, "ADDRESS_REGISTRATION_", "", "REGISTRATION", person.getRegistrationAddressId());
        addAddress(props, "ADDRESS_REAL_LIVE_", "", "REAL_LIVE", person.getActualAddressId());
        if (person.getContacts() != null) {
            int phoneIdx = 0;
            int emailIdx = 0;
            for (Contact contact : person.getContacts()) {
                if (contact.getPhone() != null) {
                    addString(props, "PHONES" + (++phoneIdx) + "_NUM", updatePhone(contact.getPhone()));
                }
                if (contact.getEmail() != null) {
                    addString(props, "EMAIL_" + (++emailIdx), contact.getEmail());
                }
            }
        }
    }

    private String formatXX_XX(String series) {
        return series != null && series.length() == 4 ? series.substring(0, 2) + ' ' + series.substring(2) : series;
    }

    private void addCompany(ProductRec.PropertyList props, Company company) {
        addString(props, "NAME", company.getDisplayName());
        addString(props, "INN", company.getINN());
        addString(props, "OGRN", company.getOGRN());
    }

    private void addAddress(ProductRec.PropertyList props, String prefix, String suffix, String type, String addressId) {
        if (addressId != null) {
            Address address = addressRepository.load(addressId);
            addString(props, prefix + "TYPE_CODE" + suffix, type);
            addString(props, prefix + "COUNTRY" + suffix, address.getCountry());
            addString(props, prefix + "REGION" + suffix, address.getRegion());
            addString(props, prefix + "REGION_TYPE" + suffix, address.getRegion_type());
            addString(props, prefix + "DISTRICT" + suffix, address.getArea());
            addString(props, prefix + "DISTRICT_TYPE" + suffix, address.getArea_type());
            addString(props, prefix + "CITY" + suffix, address.getCity());
            addString(props, prefix + "CITY_TYPE" + suffix, address.getCity_type());
            addString(props, prefix + "INCITY_TERR" + suffix, address.getSettlement());
            addString(props, prefix + "INCITY_TERR_TYPE" + suffix, address.getSettlement_type());
            addString(props, prefix + "STREET" + suffix, address.getStreet());
            addString(props, prefix + "STREET_TYPE" + suffix, address.getStreet_type());
            addString(props, prefix + "HOUSE" + suffix, address.getHouse());
            addString(props, prefix + "BLOCK" + suffix, address.getBlock());
            addString(props, prefix + "ROOM" + suffix, address.getFlat());
            addString(props, prefix + "INDEX" + suffix, address.getPostal_code());
            addString(props, prefix + "KLADR" + suffix, address.getKladr_id());
            addString(props, prefix + "FIAS" + suffix, address.getFias_id());
            addString(props, prefix + "LINE" + suffix, address.getResult());
            //Данные о гос регистрации, указываем тегом в анкете IP_QUEST или UL_QUEST
            addString(props, "REG_CITY", address.getKladr_id());
        }
    }

    private void addAddress(OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList props, String prefix, String suffix, String type, Address address) {
        addString(props, prefix + "TYPE_CODE" + suffix, type);
        addString(props, prefix + "COUNTRY" + suffix, address.getCountry());
        addString(props, prefix + "REGION" + suffix, address.getRegion());
        addString(props, prefix + "REGION_TYPE" + suffix, address.getRegion_type());
        addString(props, prefix + "DISTRICT" + suffix, address.getArea());
        addString(props, prefix + "DISTRICT_TYPE" + suffix, address.getArea_type());
        addString(props, prefix + "CITY" + suffix, address.getCity());
        addString(props, prefix + "CITY_TYPE" + suffix, address.getCity_type());
        addString(props, prefix + "INCITY_TERR" + suffix, address.getSettlement());
        addString(props, prefix + "INCITY_TERR_TYPE" + suffix, address.getSettlement_type());
        addString(props, prefix + "STREET" + suffix, address.getStreet());
        addString(props, prefix + "STREET_TYPE" + suffix, address.getStreet_type());
        addString(props, prefix + "HOUSE" + suffix, address.getHouse());
        addString(props, prefix + "BLOCK" + suffix, address.getBlock());
        addString(props, prefix + "ROOM" + suffix, address.getFlat());
        addString(props, prefix + "INDEX" + suffix, address.getPostal_code());
        addString(props, prefix + "KLADR" + suffix, address.getKladr_id());
        addString(props, prefix + "FIAS" + suffix, address.getFias_id());
        addString(props, prefix + "LINE" + suffix, address.getResult());
        //Данные о гос регистрации, указываем тегом в анкете IP_QUEST или UL_QUEST
        addString(props, "REG_CITY", address.getKladr_id());
    }

    private void addBool(ProductRec.PropertyList props, String name, Boolean value) {
        if (value != null) {
            props.getPropertyRec().add(prop(name, value.toString()));
        }
    }

    private void addDate(ProductRec.PropertyList props, String name, Date value) {
        if (value != null) {
            props.getPropertyRec().add(prop(name, DATE_FMT.format(value)));
        }
    }

    private Optional<PropertyRec> addNumber(ProductRec.PropertyList props, String name, Number value) {
        if (value == null) {
            return Optional.empty();
        }
        PropertyRec prop = prop(name, value.toString());
        props.getPropertyRec().add(prop);
        return Optional.of(prop);
    }

    private void addString(ProductRec.PropertyList props, String name, String value) {
        if (value != null) {
            props.getPropertyRec().add(prop(name, value));
        }
    }

    private void addStringOrdered(ProductRec.PropertyList props, String name, String value, long orderBy) {
        PropertyRec prop = prop(name, value, value, orderBy);
        props.getPropertyRec().add(prop);
    }

    private void addRef(ProductRec.PropertyList props, String name, String value, String valueCode) {
        if (valueCode != null) {
            props.getPropertyRec().add(prop(name, value, valueCode));
        }
    }

    private PropertyRec prop(String code, String value) {
        return prop(code, value, value);
    }

    private PropertyRec prop(String code, String value, String valueCode) {
        PropertyRec prop = new PropertyRec();
        prop.setCode(code);
        prop.setValue(value);
        prop.setValueCode(valueCode);
        prop.setUpdated(true);
        return prop;
    }

    private PropertyRec prop(String code, String value, String valueCode, long orderBy) {
        PropertyRec prop = new PropertyRec();
        prop.setCode(code);
        prop.setOrderBy(BigInteger.valueOf(orderBy));
        prop.setValue(value);
        prop.setValueCode(valueCode);
        prop.setUpdated(true);
        return prop;
    }

    private boolean isUL(Company principal) {
        if ("legalentity".equals(principal.getCompanyTypeRefId())) {
            return true;
        } else if ("individual".equals(principal.getCompanyTypeRefId())) {
            return false;
        }
        throw new RuntimeException(String.format("Тип компании %s не поддерживается: %s",
                principal.getCompanyTypeRefId(), principal.getId()));
    }

    private String orgId(Company principal) {
        GenParam param = genParamService.loadOne("company", principal.getId(), "company.rko.absCompany");
        if (!GenParamUtils.hasStringValue(param)) {
            throw new RuntimeException("Не заполнен параметр company.rko.absCompany для компании " + principal.getId());
        }
        return param.getValue().getStringValue();
    }

    private Relation companyHead(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:employee AND employee.isMain:true", principal.getId());
        return relationRepository.search(query, 1, null).stream()
                .findFirst()
                .orElseThrow(
                        () -> new RuntimeException("Не найден Руководитель компании " + principal.getId())
                );
    }

    private List<Relation> kopManagers(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:personKopManager", principal.getId());
        return relationRepository.search(query, 10000, null);
    }

    private List<Relation> beneficiaryOwners(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:personBeneficiary", principal.getId());
        return relationRepository.search(query, 10000, null);
    }

    private List<Person> personBeneficiaries(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:rkoPersonBeneficiary", principal.getId());
        return relationRepository.search(query, 10000, null).stream()
                .map(r -> personRepository.load(r.getLeftId()))
                .collect(Collectors.toList());
    }

    private List<Relation> personShareholders(Company principal, int shareMore) {
        String query = String.format("rightId:%s AND relationTypeRefId:personShareholder AND personFounder.share.percent:>=%s", principal.getId(), shareMore);
        return relationRepository.search(query, 10000, null);
    }

    private List<Relation> companyShareholders(Company principal, int shareMore) {
        String query = String.format("rightId:%s AND relationTypeRefId:companyShareholder AND companyFounder.share.percent:>=%s", principal.getId(), shareMore);
        return relationRepository.search(query, 10000, null);
    }

    private List<Company> companyBeneficiaries(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:rkoCompanyBeneficiary", principal.getId());
        return relationRepository.search(query, 10000, null).stream()
                .map(r -> companyRepository.load(r.getLeftId()))
                .collect(Collectors.toList());
    }

    private String rkoContragent(String id) {
        return refName("rkoContragent", id);
    }

    private String identityDocumentType(String id) {
        return refName("identityDocumentType", id);
    }

    private String refName(String type, String id) {
        try {
            return OBJECT_MAPPER.readValue(esRepository.load("ref", type, id), GenParam.RefValue.class).getName();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(String.format("Unable to get ref item \"%s\" %s", type, id), e);
        }
    }

    private List<Relation> paramTable(String entityId, String relationType) {
        String query = String.format("rightId:%s AND relationTypeRefId:%s", entityId, relationType);
        return this.relationRepository.search(query, 10000, null);
    }

    private Optional<GenParamValue> param(String entity, String entityId, String name, String type) {
        GenParam param = genParamService.loadOne(entity, entityId, name);
        if (!type.equals(param.getType())) {
            throw new RuntimeException(String.format("Expected \"%s\" of type [%s] but it's [%s]", name, type, param.getType()));
        }
        return Optional.ofNullable(param.getValue());
    }

    private String stringParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "string").map(GenParamValue::getStringValue).orElse(null);
    }

    private String keyParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "key").map(GenParamValue::getKeyValue).orElse(null);
    }

    private Long longParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "long").map(GenParamValue::getLongValue).orElse(null);
    }

    private BigDecimal moneyParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "money")
                .filter(v -> v.getMoneyValue() != null)
                .map(v -> BigDecimal.valueOf(v.getMoneyValue(), 2))
                .orElse(null);
    }

    private Date dateParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "date").map(GenParamValue::getDateValue).orElse(null);
    }

    private Boolean boolParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "boolean").map(GenParamValue::getBooleanValue).orElse(null);
    }

    private String getRequestId(Product product) {
        String retId = CORRELATION_ID_PLACEHOLDER;
        GenParam param = genParamService.loadOne("product", product.getId(), "product.rko.requestId");
        if (GenParamUtils.hasStringValue(param)) {
            retId = param.getValue().getStringValue();
        } else {
            log.warning("Не заполнен параметр product.rko.requestId для продукта " + product.getId());
        }
        return retId;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PositionDto {
        private String code;
        private String value;
    }

}
