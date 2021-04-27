package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.doc.DocumentService;
import com.farzoom.common.business.doc.model.Document;
import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.DocInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.ServerInfoType;
import com.farzoom.lime.adapter.cbs.utils.GenParamUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
@AllArgsConstructor
public class AgreemtListAddService implements IntegrationService<AgreemtListAddRequest> {
    private static final List<String> ORDER_DOC_TYPES = Arrays.asList("beneficiaryInfo", "scanBankDocuments", "signSampleCard", "checkList");
    private static final List<String> CONTRAGENT_DOC_TYPES = Arrays.asList("finDeclaration","persConsent","internetRating","noAccMoney","charter","executiveBody","dulHead","propertyPerm","edoRko","otherClientDocs","scanClientOriginal","scanClientCopy","questionaryRko");

    private final GenParamService genParamService;
    private final DocumentService documentService;

    @Override
    public AgreemtListAddRequest createRequest(Order order, Company principal, Product product) {
        AgreemtListAddRequest request = new AgreemtListAddRequest();
        request.setServerInfo(serverInfo());
        request.setBankSvcRq(bankSvcRq(order, principal, product));
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

    private AgreemtListAddRequest.BankSvcRq bankSvcRq(Order order, Company principal, Product product) {
        AgreemtListAddRequest.BankSvcRq bankSvcRq = new AgreemtListAddRequest.BankSvcRq();
        bankSvcRq.setOrgInfo(orgInfo(principal));
        bankSvcRq.setAgreemtList(agreemtList(order, principal));
        return bankSvcRq;
    }

    private AgreemtListAddRequest.BankSvcRq.OrgInfo orgInfo(Company principal) {
        AgreemtListAddRequest.BankSvcRq.OrgInfo orgInfo = new AgreemtListAddRequest.BankSvcRq.OrgInfo();
        orgInfo.setOrgId(orgId(principal));
        return orgInfo;
    }

    private AgreemtListAddRequest.BankSvcRq.AgreemtList agreemtList(Order order, Company principal) {
        AgreemtListAddRequest.BankSvcRq.AgreemtList agreemtList = new AgreemtListAddRequest.BankSvcRq.AgreemtList();

        agreemtList.getAgreemtRec().add(agreemtRec(order, principal));

        return agreemtList;
    }

    private AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec agreemtRec(Order order, Company principal) {
        AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec agreemtRec = new AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec();

        agreemtRec.setAgreemtId(agreemtId(order.getProductId()));
        agreemtRec.setAgreemtType("9");

        List<Document> docs = documentService.getDocsListByEntity("orders", order.getId(), ORDER_DOC_TYPES);
        List<Document> companyDocs = documentService.getDocsListByEntity("contragents", principal.getId(), CONTRAGENT_DOC_TYPES);
        docs.addAll(companyDocs);

        List<DocInfoType> docInfoTypes = docs.stream()
                .flatMap(d -> d.getFiles()
                        .stream()
                        .map(f -> new DocumentFile(d.getType(), f.getName(), documentService.download(f.getId()))))
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

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocumentFile {
        private String docType;
        private String fileName;
        private byte[] data;

        private static Map<String, String> docTypeMap;

        static {
            docTypeMap = new HashMap<>();
            docTypeMap.put("finDeclaration", "accounting_taxReporting");
            docTypeMap.put("beneficiaryInfo", "clientsQuests");
            docTypeMap.put("persConsent", "consentPersData");
            docTypeMap.put("internetRating", "reviewsBusinessReputation");
            docTypeMap.put("noAccMoney", "reviewsBusinessReputation");
            docTypeMap.put("charter", "charter");
            docTypeMap.put("scanBankDocuments", "agreementRKO");
            docTypeMap.put("executiveBody", "resolutionFoundSharPart");
            docTypeMap.put("dulHead", "identificationCard");
            docTypeMap.put("propertyPerm", "contract_of_tenancy");
            docTypeMap.put("edoRko", "opportunityOpenCloseAcc");
            docTypeMap.put("signSampleCard", "cardSamplesSignatures");
            docTypeMap.put("checkList", "scanAudits");
            docTypeMap.put("otherClientDocs", "accountOtherDocs");
            docTypeMap.put("scanClientOriginal", "accountOtherDocs");
            docTypeMap.put("scanClientCopy", "accountOtherDocs");
            docTypeMap.put("questionaryRko", "questionnaireSurvey");
        }

        public DocInfoType toDocInfoType() {
            DocInfoType docInfoType = new DocInfoType();

            docInfoType.setName(this.fileName);
            docInfoType.setDocTypeName(docTypeMap.getOrDefault(this.docType, "accountOtherDocs"));
            docInfoType.setData(this.data);

            return docInfoType;
        }
    }

}
