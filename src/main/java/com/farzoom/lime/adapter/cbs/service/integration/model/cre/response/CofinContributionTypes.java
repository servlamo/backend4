//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.11 at 07:50:00 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.cre.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for cofinContributionTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cofinContributionTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COFIN_CONTRIBUTION" type="{}cofinContributionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cofinContributionTypes", propOrder = {
    "cofincontribution"
})
public class CofinContributionTypes {

    @XmlElement(name = "COFIN_CONTRIBUTION", required = true)
    protected List<CofinContributionType> cofincontribution;

    /**
     * Gets the value of the cofincontribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cofincontribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOFINCONTRIBUTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CofinContributionType }
     * 
     * 
     */
    public List<CofinContributionType> getCOFINCONTRIBUTION() {
        if (cofincontribution == null) {
            cofincontribution = new ArrayList<CofinContributionType>();
        }
        return this.cofincontribution;
    }

}
