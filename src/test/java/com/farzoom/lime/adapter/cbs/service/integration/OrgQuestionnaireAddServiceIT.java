package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefItem;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Relation;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.camunda.spin.Spin.JSON;

@Slf4j
public class OrgQuestionnaireAddServiceIT {
    private static final String ES_BASE_URL = "http://127.0.0.1:29200";

    private RefService refService;
    private GenParamService genParamService;
    private RelationRepository relationRepository;

    @Before
    public void setUp() throws Exception {
        EsRepository esRepository = new EsRepository(ES_BASE_URL);
        refService = new RefServiceImpl(esRepository);

        AttributeRepository attributeRepository = new AttributeRepository(ES_BASE_URL);
        GroupRepository groupRepository = new GroupRepository(ES_BASE_URL);
        ParamRepository paramRepository = new ParamRepository(ES_BASE_URL);
        AddressRepository addressRepository = new AddressRepository(ES_BASE_URL);
        genParamService = new GenParamServiceImpl(
                attributeRepository, groupRepository, paramRepository, refService, addressRepository
        );

        relationRepository = new RelationRepository(ES_BASE_URL);
    }

    @Test
    public void position_test() {
        String id = "AXZQiyXBKExYfisxq-mJ";
        String value = keyParam("relation", id, "relation.position");
        log.info(value);

        List<RefItem> positionTypes = refService.getItems("positionType");
        Optional<String> position = positionTypes.stream()
                .filter(r -> value.equals(r.getValue()))
                .map(RefItem::getName)
                .findFirst();

        if (position.isPresent()) {
            log.info("position: {}", position.get());
        } else {
            log.info("NOT FOUND");
        }
    }

    @Test
    public void position_relation_test() {
        String id = "AXZQiyXBKExYfisxq-mJ";
        Relation relation = relationRepository.load(id);

        OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList props = new OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList();

        String codeValue = keyParam("relation", relation.getId(), "relation.position");
        if (!StringUtils.isEmpty(codeValue)) {
            List<RefItem> positionTypes = refService.getItems("positionType");
            Optional<String> position = positionTypes.stream()
                    .filter(r -> codeValue.equals(r.getValue()))
                    .map(RefItem::getName)
                    .findFirst();
            if (position.isPresent()) {
                addRef(props, "POSITION", position.get(), codeValue);
                addString(props, "POSITION_NAME", position.get());
            } else {
                addRef(props, "POSITION", "Генеральный директор", "15");
                addString(props, "POSITION_NAME", "Генеральный директор");
            }
        } else {
            addRef(props, "POSITION", "Генеральный директор", "15");
            addString(props, "POSITION_NAME", "Генеральный директор");
        }

        log.info(JSON(props).toString());
    }

    @Test
    public void division_test_1() {
        BigDecimal value = moneyParam("relation", "AWoQycHC3YP_a9w2YAxm", "companyTax.amount");
        log.info("value: {}", value.toPlainString());
        BigDecimal divided = value.divide(OrgQuestionnaireAddService.ONE_THOUSAND, 0, 2);
        log.info("divided: {}", divided.toPlainString());
    }

    @Test
    public void division_test_2() {
        BigDecimal value = moneyParam("relation", "AWiZsQHi_8lAJG07_z4w", "companyTax.amount");
        log.info("value: {}", value.toPlainString());
        BigDecimal divided = value.divide(OrgQuestionnaireAddService.ONE_THOUSAND, 0, 1);
        log.info("divided: {}", divided.toPlainString());
    }

    @Test
    public void moneyParam_test_preprod_2021_01_29() {
        String s = "{\"attributeId\":\"companyTax.amount\",\"subject\":{\"type\":\"relation\",\"id\":\"AXdJwohfPdTL7JOXGqiO\"},\"updatedDateTime\":\"2021-01-28T16:18:21.089Z\",\"value\":{},\"multiple\":false}";
        GenParam param = JSON(s).mapTo(GenParam.class);

        BigDecimal bigDecimal = Optional.of(param.getValue())
                .filter(v -> v.getMoneyValue() != null)
                .map(v -> BigDecimal.valueOf(v.getMoneyValue(), 2))
                .orElse(null);
        System.out.println(bigDecimal);
    }

    @Test
    public void address_test_prod_2021_01_29() {
        Company principal = new Company();

        Company.AddressInfo addressInfo1 = new Company.AddressInfo();
        principal.setPostalAddress(addressInfo1);
        addressInfo1.setAddressId("postal");

        Company.AddressInfo addressInfo2 = new Company.AddressInfo();
        addressInfo2.setAddressId("legal");
        principal.setLegalAddress(addressInfo2);

        String s = principal.getPostalAddress() != null && principal.getPostalAddress().getEqualsLegalAddress() != null && principal.getPostalAddress().getEqualsLegalAddress() ?
                principal.getPostalAddress().getAddressId() : principal.getLegalAddress().getAddressId();

        System.out.println(s);
    }

    private String keyParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "key").map(GenParam.GenParamValue::getKeyValue).orElse(null);
    }

    private BigDecimal moneyParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "money").map(v -> BigDecimal.valueOf(v.getMoneyValue(), 2)).orElse(null);
    }

    private Optional<GenParam.GenParamValue> param(String entity, String entityId, String name, String type) {
        GenParam param = genParamService.loadOne(entity, entityId, name);
        if (!type.equals(param.getType())) {
            throw new RuntimeException(String.format("Expected \"%s\" of type [%s] but it's [%s]", name, type, param.getType()));
        }
        return Optional.ofNullable(param.getValue());
    }

    private void addRef(OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList props, String name, String value, String valueCode) {
        if (valueCode != null) {
            props.getPropertyRec().add(prop(name, value, valueCode));
        }
    }

    private void addString(OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList props, String name, String value) {
        if (value != null) {
            props.getPropertyRec().add(prop(name, value));
        }
    }

    private OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList.PropertyRec prop(String code, String value) {
        return prop(code, value, value);
    }

    private OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList.PropertyRec prop(String code, String value, String valueCode) {
        OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList.PropertyRec prop = new OrgQuestionnaireAddRequest.BankSvcRq.ProductList.ProductRec.PropertyList.PropertyRec();
        prop.setCode(code);
        prop.setValue(value);
        prop.setValueCode(valueCode);
        prop.setUpdated(true);
        return prop;
    }

}