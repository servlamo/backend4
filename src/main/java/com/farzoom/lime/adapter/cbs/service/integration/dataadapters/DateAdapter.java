package com.farzoom.lime.adapter.cbs.service.integration.dataadapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter extends XmlAdapter<String, Date> {
    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date unmarshal(String v) throws Exception {
        return DATE_FORMAT.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        return DATE_FORMAT.format(v);
    }
}
