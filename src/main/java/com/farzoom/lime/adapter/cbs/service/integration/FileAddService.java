package com.farzoom.lime.adapter.cbs.service.integration;

import com.farzoom.common.business.doc.DocumentService;
import com.farzoom.common.business.doc.model.Document;
import com.farzoom.common.business.genparam.GenParam;
import com.farzoom.common.business.genparam.GenParamService;
import com.farzoom.common.persistence.es.model.Company;
import com.farzoom.common.persistence.es.model.Order;
import com.farzoom.common.persistence.es.model.Product;
import com.farzoom.lime.adapter.cbs.model.DocumentFile;
import com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.request.FileAddRequest;
import com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.request.ServerInfoType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.farzoom.lime.adapter.cbs.utils.DateUtils.getNow;

@Service
@AllArgsConstructor
public class FileAddService implements IntegrationService<FileAddRequest> {
    private static final List<String> ORDER_DOC_TYPES = Arrays.asList("beneficiaryInfo", "scanBankDocuments", "signSampleCard", "checkList");
    private static final List<String> CONTRAGENT_DOC_TYPES = Arrays.asList("finDeclaration", "persConsent", "internetRating", "noAccMoney", "charter", "executiveBody", "dulHead", "propertyPerm", "edoRko", "otherClientDocs", "scanClientOriginal", "scanClientCopy", "questionaryRko");
    private static final String GEN_PARAM_VALUE_TEMPLATE = "%s@%s";

    private final DocumentService documentService;
    private final GenParamService genParamService;

    @Override
    public FileAddRequest createRequest(Order order, Company principal, Product product) {
        FileAddRequest request = new FileAddRequest();
        request.setServerInfo(serverInfo());
        request.setBankSvcRq(bankSvcRq(order.getId(), principal.getId()));
        return request;
    }

    private ServerInfoType serverInfo() {
        ServerInfoType serverInfoType = new ServerInfoType();
        serverInfoType.setRqUID(CORRELATION_ID_PLACEHOLDER);
        serverInfoType.setMsgUID(UUID.randomUUID().toString());
        serverInfoType.setSPName("FARZOOM");
        serverInfoType.setMsgReceiver("ESB");
        serverInfoType.setServerDt(getNow());
        serverInfoType.setMsgType("FileAddRq");
        return serverInfoType;
    }

    private FileAddRequest.BankSvcRq bankSvcRq(String orderId, String companyId) {
        FileAddRequest.BankSvcRq bankSvcRq = new FileAddRequest.BankSvcRq();

        List<Document> docs = documentService.getDocsListByEntity("orders", orderId, ORDER_DOC_TYPES);
        docs.addAll(documentService.getDocsListByEntity("contragents", companyId, CONTRAGENT_DOC_TYPES));

        // получаем документы из хранилища, форматируем
        List<DocumentFile> documentFiles = docs.stream()
                .flatMap(d -> d.getFiles()
                        .stream()
                        .map(f -> new DocumentFile(d.getType(), f.getName(), f.getId(), null, documentService.download(f.getId()))))
                .filter(f -> f.getData() != null)
                .collect(Collectors.toList());

        // сохраняем в es данные по документам
        List<GenParam.GenParamValue> genParamValues = documentFiles.stream()
                .map(d -> {
                    GenParam.GenParamValue value = new GenParam.GenParamValue();
                    value.setStringValue(String.format(GEN_PARAM_VALUE_TEMPLATE, d.updateName(), d.getDocType()));
                    return value;
                })
                .collect(Collectors.toList());
        GenParam genParam = new GenParam();
        genParam.setAttributeId("order.files.aul.name.docType");
        genParam.setValues(genParamValues);
        genParamService.storeOne("order", orderId, genParam);

        // создаем объекты для xml
        List<FileAddRequest.BankSvcRq.FileList.FileRec> fileRecs = documentFiles.stream()
                .map(DocumentFile::toFileRec)
                .collect(Collectors.toList());

        FileAddRequest.BankSvcRq.FileList fileList = new FileAddRequest.BankSvcRq.FileList();
        fileList.getFileRec().addAll(fileRecs);

        bankSvcRq.setFileList(fileList);

        return bankSvcRq;
    }

}
