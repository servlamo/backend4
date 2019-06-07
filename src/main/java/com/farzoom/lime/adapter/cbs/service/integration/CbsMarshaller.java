package com.farzoom.lime.adapter.cbs.service.integration;


/**
 * Created by vladimir on 03.09.2018.
 */
public interface CbsMarshaller {
    <T> String marshallRequest(T request, Class<T> clazz);

    <T> Object unmarshallResponse(String xml, Class<T> clazz);
}
