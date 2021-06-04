package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamGroup;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.model.DocumentFile;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.DocInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
@AllArgsConstructor
public class AgreemtListAddService implements IntegrationService<AgreemtListAddRequest> {

    private final GenParamService genParamService;

    @Override
    public AgreemtListAddRequest createRequest(Order order, Company principal, Product product) {
        AgreemtListAddRequest request = new AgreemtListAddRequest();
        request.setServerInfo(serverInfo());
        request.setBankSvcRq(bankSvcRq(order, principal));
        return request;
    }

    private ServerInfoType serverInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("AVK");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("AgreemtListAddRq");
        serverInfoType.setBpId("MTS_LOAD_AGREEM");
        return serverInfoType;
    }

    private AgreemtListAddRequest.BankSvcRq bankSvcRq(Order order, Company principal) {
        AgreemtListAddRequest.BankSvcRq bankSvcRq = new AgreemtListAddRequest.BankSvcRq();
        bankSvcRq.setOrgInfo(orgInfo(principal));
        bankSvcRq.setAgreemtList(agreemtList(order));
        return bankSvcRq;
    }

    private AgreemtListAddRequest.BankSvcRq.OrgInfo orgInfo(Company principal) {
        AgreemtListAddRequest.BankSvcRq.OrgInfo orgInfo = new AgreemtListAddRequest.BankSvcRq.OrgInfo();
        orgInfo.setOrgId(orgId(principal));
        return orgInfo;
    }

    private AgreemtListAddRequest.BankSvcRq.AgreemtList agreemtList(Order order) {
        AgreemtListAddRequest.BankSvcRq.AgreemtList agreemtList = new AgreemtListAddRequest.BankSvcRq.AgreemtList();

        agreemtList.getAgreemtRec().add(agreemtRec(order));

        return agreemtList;
    }

    private AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec agreemtRec(Order order) {
        AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec agreemtRec = new AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec();

        agreemtRec.setAgreemtId(agreemtId(order.getProductId()));
        agreemtRec.setAgreemtType("9");

        // Получаем группу с информацией о файлах АЮЛ
        GenParamGroup aulGroup = genParamService.load("order", order.getId(), "order.files.aul");
        // Парамс "имя + тип"
        GenParam nameDocTypeParam = aulGroup.getItems()
                .stream()
                .filter(p -> "order.files.aul.name.docType".equals(p.getAttributeId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Param order.files.aul.name.docType not found for order id " + order.getId()));
        // Парамс "имя + лик"
        GenParam nameLinkParam = aulGroup.getItems()
                .stream()
                .filter(p -> "order.files.aul.name.link".equals(p.getAttributeId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Param order.files.aul.name.link not found for order id " + order.getId()));
        // Разбираем и объединяем инфу + маппим в DocInfoType
        List<DocInfoType> docInfoTypes = nameDocTypeParam.getValues().stream()
                .map(v -> {
                    String fileRec = v.getStringValue();
                    String[] fileRecParts = fileRec.split("@");
                    String fileName = fileRecParts[0];
                    String docType = fileRecParts[1];

                    DocumentFile documentFile = new DocumentFile(docType, fileName, null, null, null);

                    nameLinkParam.getValues().stream()
                            .filter(gpv -> gpv.getStringValue() != null)
                            .filter(gpv -> gpv.getStringValue().startsWith(fileName))
                            .findFirst()
                            .map(GenParam.GenParamValue::getStringValue)
                            .ifPresent(s -> {
                                String[] fileNameLink = s.split("@");
                                String link = fileNameLink[1];
                                documentFile.setLink(link);
                            });

                    return documentFile;
                })
                .map(DocumentFile::toDocInfoType)
                .collect(Collectors.toList());

        agreemtRec.setDocList(docList(docInfoTypes));

        return agreemtRec;
    }

    private AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec.DocList docList(List<DocInfoType> docInfoTypes) {
        AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec.DocList docList = new AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec.DocList();

        docInfoTypes.forEach(d -> docList.getDocRec().add(d));

        return docList;
    }

    private String orgId(Company principal) {
        GenParam param = genParamService.loadOne("company", principal.getId(), "company.rko.absCompany");
        if (!GenParamUtils.hasStringValue(param)) {
            throw new RuntimeException("Не заполнен параметр company.rko.absCompany для компании " + principal.getId());
        }
        return param.getValue().getStringValue();
    }

    private String agreemtId(String productId) {
        GenParam param = genParamService.loadOne("product", productId, "product.rko.agreemtId");
        if (!GenParamUtils.hasStringValue(param)) {
            throw new RuntimeException("Не заполнен параметр product.rko.agreemtId для продукта " + productId);
        }
        return param.getValue().getStringValue();
    }

}
