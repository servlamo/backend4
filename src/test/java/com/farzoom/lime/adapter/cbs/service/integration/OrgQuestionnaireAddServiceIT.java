package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.business.genparam.impl.GenParamServiceImpl;
import com.farzoom.common.business.ref.RefItem;
import com.farzoom.common.business.ref.RefService;
import com.farzoom.common.business.ref.impl.RefServiceImpl;
import com.farzoom.common.persistence.es.model.Relation;
import com.farzoom.common.persistence.es.repositories.*;
import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.service.integration.model.orgquestadd.request.OrgQuestionnaireAddRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.StringUtils;

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

    private String keyParam(String entity, String entityId, String name) {
        return param(entity, entityId, name, "key").map(GenParam.GenParamValue::getKeyValue).orElse(null);
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