@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(type = XMLGregorianCalendar.class, value = XmlGregorianCalendarAdapter.class),
})

package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response;

import com.farzoom.lime.adapter.cbs.service.integration.dataadapters.XmlGregorianCalendarAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import javax.xml.datatype.XMLGregorianCalendar;