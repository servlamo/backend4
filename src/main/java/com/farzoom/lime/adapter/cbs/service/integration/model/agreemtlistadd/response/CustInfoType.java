//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.15 at 03:43:33 PM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Данные клиента
 * 
 * <p>Java class for CustInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}CustId"/>
 *         &lt;element ref="{}CustVKI" minOccurs="0"/>
 *         &lt;element ref="{}ExtCustId" minOccurs="0"/>
 *         &lt;element ref="{}LegalStatus" minOccurs="0"/>
 *         &lt;element ref="{}PersonInfo" minOccurs="0"/>
 *         &lt;element ref="{}CustStatus" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustInfo_Type", propOrder = {

})
public class CustInfoType {

    @XmlElement(name = "CustId", required = true)
    protected String custId;
    @XmlElement(name = "CustVKI")
    protected String custVKI;
    @XmlElement(name = "ExtCustId")
    protected String extCustId;
    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "CustStatus")
    protected CustStatus custStatus;

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custVKI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustVKI() {
        return custVKI;
    }

    /**
     * Sets the value of the custVKI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustVKI(String value) {
        this.custVKI = value;
    }

    /**
     * Gets the value of the extCustId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCustId() {
        return extCustId;
    }

    /**
     * Sets the value of the extCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCustId(String value) {
        this.extCustId = value;
    }

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the custStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustStatus }
     *     
     */
    public CustStatus getCustStatus() {
        return custStatus;
    }

    /**
     * Sets the value of the custStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustStatus }
     *     
     */
    public void setCustStatus(CustStatus value) {
        this.custStatus = value;
    }

}
