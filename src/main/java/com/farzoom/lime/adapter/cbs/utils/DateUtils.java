package com.farzoom.lime.adapter.cbs.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

@Slf4j
@UtilityClass
public class DateUtils {
    public static XMLGregorianCalendar getNow() {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new java.util.Date());
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            log.error("Cannot generate now date in xml gregorian calendar");
            return null;
        }
    }
}
