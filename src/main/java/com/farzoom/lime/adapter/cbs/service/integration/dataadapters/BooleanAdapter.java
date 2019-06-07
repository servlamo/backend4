package com.farzoom.lime.adapter.cbs.service.integration.dataadapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BooleanAdapter extends XmlAdapter<String, Boolean> {
    @Override
    public Boolean unmarshal( String s ) {
        return s == null ? null : s.equals("1");
    }

    @Override
    public String marshal( Boolean c ) {
        return c == null ? null : c ? "1" : "0";
    }
}
