//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.30 at 09:38:27 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о страховой программе
 * 
 * <p>Java class for InsureInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsureInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="InsureType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InsProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsureAmt" type="{}CurrencyAmount" minOccurs="0"/&gt;
 *         &lt;element name="InsureStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsureActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{}Fee" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsureInfo_Type", propOrder = {

})
public class InsureInfoType {

    @XmlElement(name = "InsureType", required = true)
    protected String insureType;
    @XmlElement(name = "InsProgramCode")
    protected String insProgramCode;
    @XmlElement(name = "InsureAmt")
    protected CurrencyAmount insureAmt;
    @XmlElement(name = "InsureStatusCode")
    protected String insureStatusCode;
    @XmlElement(name = "InsureActive")
    protected Boolean insureActive;
    @XmlElement(name = "Fee")
    protected Fee fee;

    /**
     * Gets the value of the insureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureType() {
        return insureType;
    }

    /**
     * Sets the value of the insureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureType(String value) {
        this.insureType = value;
    }

    /**
     * Gets the value of the insProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsProgramCode() {
        return insProgramCode;
    }

    /**
     * Sets the value of the insProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsProgramCode(String value) {
        this.insProgramCode = value;
    }

    /**
     * Gets the value of the insureAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getInsureAmt() {
        return insureAmt;
    }

    /**
     * Sets the value of the insureAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setInsureAmt(CurrencyAmount value) {
        this.insureAmt = value;
    }

    /**
     * Gets the value of the insureStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureStatusCode() {
        return insureStatusCode;
    }

    /**
     * Sets the value of the insureStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureStatusCode(String value) {
        this.insureStatusCode = value;
    }

    /**
     * Gets the value of the insureActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsureActive() {
        return insureActive;
    }

    /**
     * Sets the value of the insureActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsureActive(Boolean value) {
        this.insureActive = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setFee(Fee value) {
        this.fee = value;
    }

}
