package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Person;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.config.AppConfig;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest.BankSvcRq;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList.PropertyRec;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import lombok.extern.java.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Log
public class AmlOrgQuestionnaireAddService implements IntegrationService<OrgQuestionnaireAddRequest> {
    private static final SimpleDateFormat DATE_FMT = new SimpleDateFormat("dd.MM.yyyy");

    private final GroupRepository groupRepository;
    private final ParamRepository paramRepository;
    private final AttributeRepository attributeRepository;
    private final EsRepository esRepository;
    private final RelationRepository relationRepository;
    private final PersonRepository personRepository;
    private final RefService refService;
    private final GenParamService genParamService;
    private final AddressRepository addressRepository;

    public AmlOrgQuestionnaireAddService(AppConfig config) {
        groupRepository = new GroupRepository(config.getElasticsearchBaseUrl());
        paramRepository = new ParamRepository(config.getElasticsearchBaseUrl());
        attributeRepository = new AttributeRepository(config.getElasticsearchBaseUrl());
        relationRepository = new RelationRepository((config.getElasticsearchBaseUrl()));
        personRepository = new PersonRepository((config.getElasticsearchBaseUrl()));
        esRepository = new EsRepository(config.getElasticsearchBaseUrl());
        refService = new RefServiceImpl(esRepository);
        addressRepository = new AddressRepository((config.getElasticsearchBaseUrl()));
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
        serverInfoType.setMsgReceiver("AML");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("OrgQuestionnaireAddRq");
        return serverInfoType;
    }

    private ServerInfoType serverInfo(Product product) {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(getRequestId(product));
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("AML");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("OrgQuestionnaireAddRq");
        return serverInfoType;
    }

    private BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        BankSvcRq bankSvcRq = new BankSvcRq();
        bankSvcRq.setProductList(productList(principal));
        bankSvcRq.setSPInfo(spInfo(product, principal));
        return bankSvcRq;
    }

    private BankSvcRq.ProductList productList(Company principal) {
        BankSvcRq.ProductList list = new BankSvcRq.ProductList();
        list.getProductRec().add(productExecutive(companyHead(principal)));
        for (Person companyBeneficiary : companyBeneficiaries(principal)) {
            list.getProductRec().add(productBeneficiaryQuestionnaire(companyBeneficiary));
        }
        list.getProductRec().add(productQuestionnaire(principal));
        return list;
    }

    private BankSvcRq.SPInfo spInfo(Product product, Company principal) {
        BankSvcRq.SPInfo info = new BankSvcRq.SPInfo();
        info.setOrgId(orgId(principal));
        info.setRequestId(getRequestId(product));
        return info;
    }

    private ProductRec productExecutive(Person companyHead) {
        ProductRec product = new ProductRec();
        product.setCode("EXECUTIVE");
        product.setName("Должностные лица");
        ProductRec.PropertyList propertyList = personProperties(companyHead);
        propertyList.getPropertyRec().add(prop("QUEST_TYPE", product.getName(), product.getCode()));
        product.setPropertyList(propertyList);
        return product;
    }

    private ProductRec productBeneficiaryQuestionnaire(Person companyBeneficiary) {
        ProductRec product = new ProductRec();
        product.setCode("BENEFIC_QUEST");
        product.setName("АНКЕТА БЕНЕФИЦИАРНОГО ВЛАДЕЛЬЦА");
        ProductRec.PropertyList propertyList = personProperties(companyBeneficiary);
        propertyList.getPropertyRec().add(prop("QUEST_TYPE", product.getName(), product.getCode()));
        product.setPropertyList(propertyList);
        return product;
    }

    private ProductRec productQuestionnaire(Company principal) {
        ProductRec product = new ProductRec();
        if (isUL(principal)) {
            product.setCode("UL_QUEST");
            product.setName("Анкета-опрос (Клиента - юридического лица)");
        } else {
            product.setCode("IP_QUEST");
            product.setName("Анкета-опрос (индивидуального предпринимателя, физического лица)");
        }
        ProductRec.PropertyList propertyList = new ProductRec.PropertyList();
        //Тип Анкеты (код)
        propertyList.getPropertyRec().add(prop("QUEST_TYPE", product.getName(), product.getCode()));
        //ID клиента в ИБСО
        propertyList.getPropertyRec().add(prop("IBSO_CLIENT_ID", orgId(principal)));
        //ИНН
        propertyList.getPropertyRec().add(prop("ORG_INN", principal.getINN()));
        //ОГРН
        propertyList.getPropertyRec().add(prop("ORG_OGRN", principal.getOGRN()));
        product.setPropertyList(propertyList);
        return product;
    }

    private ProductRec.PropertyList personProperties(Person person) {
        ProductRec.PropertyList propertyList = new ProductRec.PropertyList();
        // Фамилия
        propertyList.getPropertyRec().add(prop("CL_SURNAME", person.getLastName()));
        // Имя
        propertyList.getPropertyRec().add(prop("CL_FIRSTNAME", person.getFirstName()));
        // Отчество
        propertyList.getPropertyRec().add(prop("CL_MIDDLENAME", person.getSecondName()));
        // Дата рождения
        propertyList.getPropertyRec().add(prop("BIRTH_DATE", formatDate(person.getBirthDate())));
        // Место рождения
        propertyList.getPropertyRec().add(prop("BIRTH_PLACE", person.getBirthPlace()));
        // Гражданство
        if ("rf".equals(person.getCitizenship())) {
            propertyList.getPropertyRec().add(prop("SITIZENSHIP", "РОССИЙСКАЯ ФЕДЕРАЦИЯ", "643"));
        } else if ("other".equals(person.getCitizenship())) {
            propertyList.getPropertyRec().add(prop("SITIZENSHIP", person.getOtherCitizenship()));
        }
        // ИНН
        propertyList.getPropertyRec().add(prop("INN", person.getINN()));
        // паспортные данные
        if (person.getIdentityDocuments() != null) {
            person.getIdentityDocuments().stream()
//                    .filter(doc -> "passportRF".equals(doc.getIdentityDocumentTypeRefId()))
                    .findFirst()
                    .ifPresent(passport -> {
                        // Документ, удостоверяющий личность
//                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC", "Паспорт гражданина РФ", "PersDoc_Passport"));
//                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC_NAME", "PersDoc_Passport"));
                        // Серия
                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC_SER", passport.getSeries()));
                        // Номер
                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC_NUM", passport.getNumber()));
                        // Дата выдачи
                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC_START_DATE", formatDate(passport.getIssuedDate())));
                        // Кем выдан
                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC_SERVICE_NAME", passport.getIssuingAuthority()));
                        // Код подразделения
                        propertyList.getPropertyRec().add(prop("IDENTITY_DOC_SERVICE_CODE", passport.getIssuingAuthorityCode()));
                    });
        }
        return propertyList;
    }

    private PropertyRec prop(String code, String value) {
        return prop(code, value, value);
    }

    private PropertyRec prop(String code, String value, String valueCode) {
        PropertyRec prop = new PropertyRec();
        prop.setCode(code);
        prop.setValue(value);
        prop.setValueCode(valueCode);
        return prop;
    }

    private String formatDate(Date date) {
        return date != null ? DATE_FMT.format(date) : null;
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

    private Person companyHead(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:employee AND employee.isMain:true", principal.getId());
        return relationRepository.search(query, 1, null).stream()
                .map(r -> personRepository.load(r.getLeftId()))
                .findFirst()
                .orElseThrow(
                        () -> new RuntimeException("Не найден Руководитель компании " + principal.getId())
                );
    }

    private List<Person> companyBeneficiaries(Company principal) {
        String query = String.format("rightId:%s AND relationTypeRefId:personBeneficiary", principal.getId());
        return this.relationRepository.search(query, 10000, null).stream()
                .map(r -> personRepository.load(r.getLeftId()))
                .collect(Collectors.toList());
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
}