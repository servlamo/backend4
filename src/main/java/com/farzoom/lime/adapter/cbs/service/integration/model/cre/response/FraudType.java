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
 * <p>Java class for fraudType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraudType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VECTOR" type="{}fraudVector" minOccurs="0"/>
 *         &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraudType", propOrder = {
    "vector",
    "error",
    "errorcode",
    "infosources",
    "extension"
})
public class FraudType {

    @XmlElement(name = "VECTOR")
    protected FraudVector vector;
    @XmlElement(name = "ERROR")
    protected String error;
    @XmlElement(name = "ERROR_CODE")
    protected String errorcode;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;

    /**
     * Gets the value of the vector property.
     * 
     * @return
     *     possible object is
     *     {@link FraudVector }
     *     
     */
    public FraudVector getVECTOR() {
        return vector;
    }

    /**
     * Sets the value of the vector property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudVector }
     *     
     */
    public void setVECTOR(FraudVector value) {
        this.vector = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERROR() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERROR(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORCODE(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the infosources property.
     * 
     * @return
     *     possible object is
     *     {@link InfoSourcesType }
     *     
     */
    public InfoSourcesType getINFOSOURCES() {
        return infosources;
    }

    /**
     * Sets the value of the infosources property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSourcesType }
     *     
     */
    public void setINFOSOURCES(InfoSourcesType value) {
        this.infosources = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEXTENSION(ExtensionType value) {
        this.extension = value;
    }

}
