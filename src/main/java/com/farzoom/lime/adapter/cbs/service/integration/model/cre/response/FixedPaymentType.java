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
import java.math.BigDecimal;


/**
 * <p>Java class for fixedPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fixedPaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YEAR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PAY_INS_SUM" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAY_ACC_SUM" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAY_ADD_SUM" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="COMPANY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMPANY_INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixedPaymentType", propOrder = {
    "year",
    "payinssum",
    "payaccsum",
    "payaddsum",
    "companyname",
    "companyinn"
})
public class FixedPaymentType {

    @XmlElement(name = "YEAR")
    protected Integer year;
    @XmlElement(name = "PAY_INS_SUM")
    protected BigDecimal payinssum;
    @XmlElement(name = "PAY_ACC_SUM")
    protected BigDecimal payaccsum;
    @XmlElement(name = "PAY_ADD_SUM")
    protected BigDecimal payaddsum;
    @XmlElement(name = "COMPANY_NAME")
    protected String companyname;
    @XmlElement(name = "COMPANY_INN")
    protected String companyinn;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYEAR() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYEAR(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the payinssum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYINSSUM() {
        return payinssum;
    }

    /**
     * Sets the value of the payinssum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYINSSUM(BigDecimal value) {
        this.payinssum = value;
    }

    /**
     * Gets the value of the payaccsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYACCSUM() {
        return payaccsum;
    }

    /**
     * Sets the value of the payaccsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYACCSUM(BigDecimal value) {
        this.payaccsum = value;
    }

    /**
     * Gets the value of the payaddsum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYADDSUM() {
        return payaddsum;
    }

    /**
     * Sets the value of the payaddsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYADDSUM(BigDecimal value) {
        this.payaddsum = value;
    }

    /**
     * Gets the value of the companyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYNAME() {
        return companyname;
    }

    /**
     * Sets the value of the companyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYNAME(String value) {
        this.companyname = value;
    }

    /**
     * Gets the value of the companyinn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPANYINN() {
        return companyinn;
    }

    /**
     * Sets the value of the companyinn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPANYINN(String value) {
        this.companyinn = value;
    }

}
