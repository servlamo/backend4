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


/**
 * <p>Java class for periodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="periodType">
 *   &lt;complexContent>
 *     &lt;extension base="{}addSpecificType">
 *       &lt;sequence>
 *         &lt;element name="START_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="END_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="ADD_SPECIFICS" type="{}addSpecificTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "periodType", propOrder = {
    "startdate",
    "enddate",
    "addspecifics"
})
public class PeriodType
    extends AddSpecificType
{

    @XmlElement(name = "START_DATE")
    protected String startdate;
    @XmlElement(name = "END_DATE")
    protected String enddate;
    @XmlElement(name = "ADD_SPECIFICS")
    protected AddSpecificTypes addspecifics;

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTDATE(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDDATE(String value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the addspecifics property.
     * 
     * @return
     *     possible object is
     *     {@link AddSpecificTypes }
     *     
     */
    public AddSpecificTypes getADDSPECIFICS() {
        return addspecifics;
    }

    /**
     * Sets the value of the addspecifics property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddSpecificTypes }
     *     
     */
    public void setADDSPECIFICS(AddSpecificTypes value) {
        this.addspecifics = value;
    }

}
