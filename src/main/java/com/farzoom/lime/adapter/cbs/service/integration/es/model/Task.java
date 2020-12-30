package com.farzoom.lime.adapter.cbs.service.integration.es.model;

import com.farzoom.common.persistence.es.model.base.EsObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import spinjar.com.fasterxml.jackson.annotation.JsonFormat;
import spinjar.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Task extends EsObject {
    private String processInstanceId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date dueDate;
    private String description;
    private String processDefinitionKey;
    private String taskDefinitionKey;
    private String lastEventType;
    private String processInstanceBusinessKey;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date startTime;
    private String rootProcessInstanceId;
    private String assignee;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date endTime;
    private List<IdentityLink> identityLinks;
    private List<Property> properties;
}
