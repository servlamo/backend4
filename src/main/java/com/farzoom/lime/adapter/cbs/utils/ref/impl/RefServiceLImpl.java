package com.farzoom.lime.adapter.cbs.utils.ref.impl;

import com.farzoom.common.persistence.es.repositories.base.EsRepository;
import com.farzoom.lime.adapter.cbs.utils.ref.RefItemL;
import org.camunda.spin.json.SpinJsonNode;

import java.util.ArrayList;
import java.util.List;

import static org.camunda.spin.Spin.JSON;

public class RefServiceLImpl implements RefServiceL {
    private EsRepository esRepository;

    public RefServiceLImpl(EsRepository esRepository) {
        this.esRepository = esRepository;
    }

    @Override
    public List<RefItemL> getItems(String refName) {
        List<RefItemL> RefItemLs = new ArrayList<>();

        String jsonResult = esRepository.search("ref", refName, null, 10000, null);

        for (SpinJsonNode node : JSON(jsonResult).elements()) {
            String value = node.prop("_id").stringValue();
            SpinJsonNode source = node.prop("_source");
            String name = source.prop("name").stringValue();
            String code = source.hasProp("code") ? source.prop("code").stringValue() : null;

            RefItemLs.add(new RefItemL(value, name, code));
        }

        return RefItemLs;
    }
}
