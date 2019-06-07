```
$JAVA_HOME/bin/xjc \
-encoding UTF-8 \
-d src/main/java \
-p com.farzoom.lime.adapter.cbs.service.integration.model.cre.request \
-b src/main/resources/CRE/bindings.xjb \
src/main/resources/CRE/Common.xsd \
src/main/resources/CRE/FDX.SPRExtCheckInqRq.xsd
```

```
$JAVA_HOME/bin/xjc \
-encoding UTF-8 \
-d src/main/java \
-p com.farzoom.lime.adapter.cbs.service.integration.model.cre.response \
-b src/main/resources/CRE/bindings-response.xjb \
src/main/resources/CRE/Common.xsd \
src/main/resources/CRE/FDX.SPRExtCheckInqRs.xsd
```