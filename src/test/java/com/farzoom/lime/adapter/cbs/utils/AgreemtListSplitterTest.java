package com.farzoom.lime.adapter.cbs.utils;

import com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.request.AgreemtListAddRequest;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.camunda.spin.Spin.JSON;

public class AgreemtListSplitterTest {

    @Test
    public void split_xml() throws IOException {
        String filePath = "src/test/resources/test-data/agreemt-list-01.xml";
        String xml = readFile(filePath);
        System.out.println(xml.length());

        AgreemtListAddRequest request = unmarshallResponse(xml, AgreemtListAddRequest.class);

        List<AgreemtListAddRequest> requests = AgreemtListSplitter.split(request);

        System.out.println(requests.size());
    }

    @Test
    public void split_json() throws IOException {
        String filePath = "src/test/resources/test-data/json/agreemt-list-01.json";
        String json = readFile(filePath);
        System.out.println(json.length());

        AgreemtListAddRequest request = JSON(json).mapTo(AgreemtListAddRequest.class);

        List<AgreemtListAddRequest> requests = AgreemtListSplitter.split(request);

        System.out.println(requests.size());
    }

    private static String readFile(String filePath) throws IOException {
        return String.join("\n", Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8));
    }

    public <T> T unmarshallResponse(String xml, Class<T> clazz) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8))) {
            JAXBContext jc = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            return (T) unmarshaller.unmarshal(bais);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to unmarshal request from XML", ex);
        }
    }

}