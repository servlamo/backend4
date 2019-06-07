package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;

/**
 * Created by vladimir on 04.09.2018.
 */
public interface IntegrationService<T> {
    String CORRELATION_ID_PLACEHOLDER = "CORRELATION_ID";
    T createRequest(Order order, Company principal, Product product);
}
