//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 11:25:25 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.afs.response;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}InsureRec" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insureRec"
})
@XmlRootElement(name = "InsureList")
public class InsureList {

    @XmlElement(name = "InsureRec", required = true)
    protected List<InsureInfoType> insureRec;

    /**
     * Gets the value of the insureRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insureRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsureRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsureInfoType }
     * 
     * 
     */
    public List<InsureInfoType> getInsureRec() {
        if (insureRec == null) {
            insureRec = new ArrayList<InsureInfoType>();
        }
        return this.insureRec;
    }

}
