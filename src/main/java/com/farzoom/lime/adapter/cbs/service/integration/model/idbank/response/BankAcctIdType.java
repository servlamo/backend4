//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.05 at 06:36:12 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Идентификатор банковского счета
 * 
 * <p>Java class for BankAcctId_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcctId_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}AcctId"/>
 *         &lt;element ref="{}AcctCur" minOccurs="0"/>
 *         &lt;element ref="{}BankInfo" minOccurs="0"/>
 *         &lt;element ref="{}SPDefField" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctId_Type", propOrder = {

})
public class BankAcctIdType {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctCur")
    protected String acctCur;
    @XmlElement(name = "BankInfo")
    protected BankInfo bankInfo;
    @XmlElement(name = "SPDefField")
    protected SPDefField spDefField;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCur() {
        return acctCur;
    }

    /**
     * Sets the value of the acctCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCur(String value) {
        this.acctCur = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfo }
     *     
     */
    public BankInfo getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfo }
     *     
     */
    public void setBankInfo(BankInfo value) {
        this.bankInfo = value;
    }

    /**
     * Gets the value of the spDefField property.
     * 
     * @return
     *     possible object is
     *     {@link SPDefField }
     *     
     */
    public SPDefField getSPDefField() {
        return spDefField;
    }

    /**
     * Sets the value of the spDefField property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPDefField }
     *     
     */
    public void setSPDefField(SPDefField value) {
        this.spDefField = value;
    }

}
