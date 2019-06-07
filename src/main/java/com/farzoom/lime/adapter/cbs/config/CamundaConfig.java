package com.farzoom.lime.adapter.cbs.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("camunda")
@Data
public class CamundaConfig {
    private String baseUrl;
    private String username;
    private String password;
}
