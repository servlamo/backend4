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
 * <p>Java class for generalPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalPartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YEAR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CONTRIB_INS_SUM" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="INS_SUM_BEFORE" type="{}moneyValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalPartType", propOrder = {
    "year",
    "contribinssum",
    "inssumbefore"
})
public class GeneralPartType {

    @XmlElement(name = "YEAR")
    protected Integer year;
    @XmlElement(name = "CONTRIB_INS_SUM")
    protected BigDecimal contribinssum;
    @XmlElement(name = "INS_SUM_BEFORE")
    protected BigDecimal inssumbefore;

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
     * Gets the value of the contribinssum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCONTRIBINSSUM() {
        return contribinssum;
    }

    /**
     * Sets the value of the contribinssum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCONTRIBINSSUM(BigDecimal value) {
        this.contribinssum = value;
    }

    /**
     * Gets the value of the inssumbefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINSSUMBEFORE() {
        return inssumbefore;
    }

    /**
     * Sets the value of the inssumbefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINSSUMBEFORE(BigDecimal value) {
        this.inssumbefore = value;
    }

}
