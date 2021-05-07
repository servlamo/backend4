package com.farzoom.lime.adapter.cbs.utils;

import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import lombok.experimental.UtilityClass;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class AgreemtListSplitter {

    public List<AgreemtListAddRequest> split(AgreemtListAddRequest request) {
        long documentsSize = request.getBankSvcRq()
                .getAgreemtList()
                .getAgreemtRec()
                .stream()
                .flatMap(r -> r.getDocList().getDocRec().stream())
                .filter(d -> d.getData() != null)
                .mapToInt(d -> d.getData().length)
                .sum();

        if (documentsSize < 15000000) {
            return Collections.singletonList(request);
        }

        return request.getBankSvcRq()
                .getAgreemtList()
                .getAgreemtRec()
                .stream()
                .flatMap(r -> r.getDocList().getDocRec().stream())
                .filter(d -> d.getData() != null)
                .map(d -> {
                    AgreemtListAddRequest o = new AgreemtListAddRequest();
                    o.setServerInfo(request.getServerInfo());

                    AgreemtListAddRequest.BankSvcRq bankSvcRq = new AgreemtListAddRequest.BankSvcRq();
                    bankSvcRq.setOrgInfo(request.getBankSvcRq().getOrgInfo());

                    AgreemtListAddRequest.BankSvcRq.AgreemtList agreemtList = new AgreemtListAddRequest.BankSvcRq.AgreemtList();
                    AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec agreemtRec = new AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec();

                    AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec.DocList docList = new AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec.DocList();
                    docList.getDocRec().add(d);

                    AgreemtListAddRequest.BankSvcRq.AgreemtList.AgreemtRec oldRec = request.getBankSvcRq().getAgreemtList().getAgreemtRec().get(0);
                    agreemtRec.setAgreemtId(oldRec.getAgreemtId());
                    agreemtRec.setAgreemtType(oldRec.getAgreemtType());
                    agreemtList.getAgreemtRec().add(agreemtRec);

                    agreemtRec.setDocList(docList);
                    bankSvcRq.setAgreemtList(agreemtList);
                    o.setBankSvcRq(bankSvcRq);

                    return o;
                })
                .collect(Collectors.toList());
    }

}
