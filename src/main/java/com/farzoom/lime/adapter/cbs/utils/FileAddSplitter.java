package com.farzoom.lime.adapter.cbs.utils;

import com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.request.FileAddRequest;
import lombok.experimental.UtilityClass;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class FileAddSplitter {

    public List<FileAddRequest> split(FileAddRequest request) {
        long documentsSize = request.getBankSvcRq()
                .getFileList()
                .getFileRec()
                .stream()
                .filter(d -> d.getData() != null)
                .filter(d -> d.getData().getValue() != null)
                .mapToInt(d -> d.getData().getValue().length)
                .sum();

        if (documentsSize < 15000000) {
            return Collections.singletonList(request);
        }

        return request.getBankSvcRq()
                .getFileList()
                .getFileRec()
                .stream()
                .filter(f -> f.getData() != null)
                .map(f -> {
                    FileAddRequest r = new FileAddRequest();
                    r.setServerInfo(request.getServerInfo());

                    FileAddRequest.BankSvcRq bankSvcRq = new FileAddRequest.BankSvcRq();

                    FileAddRequest.BankSvcRq.FileList fileList = new FileAddRequest.BankSvcRq.FileList();
                    fileList.getFileRec().add(f);
                    bankSvcRq.setFileList(fileList);

                    r.setBankSvcRq(bankSvcRq);

                    return r;
                })
                .collect(Collectors.toList());
    }

}
