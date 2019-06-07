package com.farzoom.lime.adapter.cbs.service.integration.dataadapters;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

@Slf4j
public class XmlGregorianCalendarAdapter extends XmlAdapter<String, XMLGregorianCalendar> {
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public XMLGregorianCalendar unmarshal(String v) throws Exception {
        //2018-07-20T15:15:01
        try {
            LocalDateTime dt = LocalDateTime.parse(v, DTF);
            GregorianCalendar gc = GregorianCalendar.from(dt.atZone(ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    @Override
    public String marshal(XMLGregorianCalendar v) throws Exception {
        try {
            return v.toGregorianCalendar().toZonedDateTime().toLocalDateTime().format(DTF);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }
}
