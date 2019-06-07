@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(type = XMLGregorianCalendar.class, value = XmlGregorianCalendarAdapter.class),
})
/**
 * Created by vladimir on 03.09.2018.
 */
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import com.farzoom.lime.adapter.cbs.service.integration.dataadapters.XmlGregorianCalendarAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import javax.xml.datatype.XMLGregorianCalendar;