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
 * <p>Java class for informingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OUTPUT_SIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUTPUT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUTPUT_WAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUTPUT_DATE" type="{}dateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informingType", propOrder = {
    "outputsign",
    "outputtype",
    "outputway",
    "outputdate"
})
public class InformingType {

    @XmlElement(name = "OUTPUT_SIGN")
    protected String outputsign;
    @XmlElement(name = "OUTPUT_TYPE")
    protected String outputtype;
    @XmlElement(name = "OUTPUT_WAY")
    protected String outputway;
    @XmlElement(name = "OUTPUT_DATE")
    protected String outputdate;

    /**
     * Gets the value of the outputsign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTSIGN() {
        return outputsign;
    }

    /**
     * Sets the value of the outputsign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTSIGN(String value) {
        this.outputsign = value;
    }

    /**
     * Gets the value of the outputtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTTYPE() {
        return outputtype;
    }

    /**
     * Sets the value of the outputtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTTYPE(String value) {
        this.outputtype = value;
    }

    /**
     * Gets the value of the outputway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTWAY() {
        return outputway;
    }

    /**
     * Sets the value of the outputway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTWAY(String value) {
        this.outputway = value;
    }

    /**
     * Gets the value of the outputdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTDATE() {
        return outputdate;
    }

    /**
     * Sets the value of the outputdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTDATE(String value) {
        this.outputdate = value;
    }

}
