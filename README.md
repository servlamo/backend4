# Lime Api Cbs Adapter

## Description

Сервис сбора и преобразования данных в xml и обратно

## Build

```bash
mvn clean package -U
```

## Deployment

As usual Spring Boot service.

## Configure

```yaml
server:
  port: 44444

swagger:
  host: localhost:44444

spring:
  profiles:
    active: swagger

elasticsearch:
  baseUrl: http://localhost:19200
  
agentBilling:
  baseUrl: http://proxy/api/bg-agent-billing/
```

## TODO

- Добавить mock-режим
