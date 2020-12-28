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

## Генерация моделей данных под интеграционные XSD

Ниже приведен приблизительный порядок действий
для генерации Java модели данных по XSD.
Он применялся для создания уже имеющих моделей
(com.farzoom.lime.adapter.cbs.service.integration.model.*),
так же можно применять для создания новых моделей.

- Создаем папку под XSD(схемы) интеграционного метода. Пример: src/main/resources/BANKACCTMOD

- В созданную папку помещаем полученные от Банка XSD файлы.
Один файл на сообщение-запрос, один файл на сообщение-ответ + все схемы-зависимости.
Пример:
```
FDX.BankAcctModRq.xsd
FDX.BankAcctModRs.xsd
FDX.xsd
```

В схемах, если необходимо, надо поправить include тэги,
проставив правильные относительные пути до схем-зависимостей

было:
```
<xs:include schemaLocation="..\!Include\FDX.xsd"/>
```

стало
```
<xs:include schemaLocation="FDX.xsd"/>
```

- запускаем команду `xjc` из JDK для генерации моделей

Одна команда для генерации модели запроса,
указываем название пакета (`-p` опция),
папку с кодом  (`-d` опция),
путь до файлов XSD

Пример:
```
 $JAVA_HOME/bin/xjc \
-p com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request \
-d src/main/java \
src/main/resources/BANKACCTMOD/FDX.xsd src/main/resources/BANKACCTMOD/FDX.BankAcctModRq.xsd
```

Аналогичная команда для генерации модели ответа.

Пример:
```
 $JAVA_HOME/bin/xjc \
-p com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.response \
-d src/main/java \
src/main/resources/BANKACCTMOD/FDX.xsd src/main/resources/BANKACCTMOD/FDX.BankAcctModRs.xsd
```

_ВАЖНО:_ при генерации модели в Windows, добавить опцию `-encoding UTF-8`

- классы `FDX` в сгенерированных пакетах для запроса и ответа переименовываются 
для удобства использования в `*Request` и `*Response`

  Пример:

  в пакете `com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.request` 
`FDX` переименовать в `BankAcctModRequest`

  в пакете `com.farzoom.lime.adapter.cbs.service.integration.model.bankacctmod.response` 
`FDX` переименовать в `BankAcctModResponse`

- по созданным моделям добавляются соответствующие методы в 
`com.farzoom.lime.adapter.cbs.controller.AdapterController`
совместно с необходимым классами по заполнению запроса,
пример `com.farzoom.lime.adapter.cbs.service.integration.BankAcctAddService`
