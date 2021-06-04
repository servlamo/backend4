package com.farzoom.lime.adapter.cbs.model;

import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.DocInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.request.FileAddRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentFile {
    private String docType;
    private String fileName;
    private String fileId;
    private String link;
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

    public FileAddRequest.BankSvcRq.FileList.FileRec toFileRec() {
        FileAddRequest.BankSvcRq.FileList.FileRec fileRec = new FileAddRequest.BankSvcRq.FileList.FileRec();

        String newName = updateName();
        fileRec.setName(newName);

        FileAddRequest.BankSvcRq.FileList.FileRec.Data fileRecData = new FileAddRequest.BankSvcRq.FileList.FileRec.Data();
        fileRecData.setValue(this.data);
        fileRec.setData(fileRecData);

        return fileRec;
    }

    public String updateName() {
        boolean hasDots = this.fileName.contains(".");
        if (hasDots) {
            int i = this.fileName.indexOf(".");
            String extension = this.fileName.substring(i).replaceAll("@", "");
            return this.fileId + extension;
        } else {
            return this.fileId;
        }
    }

    public DocInfoType toDocInfoType() {
        DocInfoType docInfoType = new DocInfoType();

        docInfoType.setName(this.fileName);
        docInfoType.setDocTypeName(docTypeMap.getOrDefault(this.docType, "accountOtherDocs"));
        docInfoType.setLink(this.link);

        return docInfoType;
    }
}
