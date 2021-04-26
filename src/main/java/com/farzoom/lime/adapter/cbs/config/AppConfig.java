package com.farzoom.lime.adapter.cbs.config;

import com.farzoom.bg.business.agentbilling.BgAgentBillingService;
import com.farzoom.bg.business.agentbilling.restclient.BgAgentBillingServiceRestClientImpl;
import com.farzoom.common.business.doc.DocumentService;
import com.farzoom.common.business.doc.client.DocumentServiceClientImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfig {
    @Value("${elasticsearch.baseUrl}")
    private String elasticsearchBaseUrl;

    @Value("${agentBilling.baseUrl}")
    private String agentBillingBaseUrl;

    @Value("${docapi.baseUrl}")
    private String docapiBaseUrl;

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return mapper;
    }

    @Bean
    public BgAgentBillingService bgAgentBillingService() {
        return new BgAgentBillingServiceRestClientImpl(agentBillingBaseUrl);
    }

    @Bean
    public DocumentService documentService() {
        return new DocumentServiceClientImpl(docapiBaseUrl);
    }

}
