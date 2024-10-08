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
 * Информация об абоненте от скоринговой системы CyberPlat
 * 
 * <p>Java class for CyberPlatData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CyberPlatData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number_is_exists" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="pay_data_is_exists" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="die_period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="life_period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region_percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_moneytransfers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pay_bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAXPAYREGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYCOUNT6MONTH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FIRSTPAYDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAXGAPDAYS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LASTPAYDATE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAXPAY" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAYSUM6MONTH" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAYCOUNT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MAXPAY3MONTH" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="MAXPAY1MONTH" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAYSUM3MONTH" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAYCOUNT3MONTH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FIRSTPAYREGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAXPAY6MONTH" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAYSUM" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="PAYSUM1MONTH" type="{}moneyValueType" minOccurs="0"/>
 *         &lt;element name="LASTPAYREGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYCOUNT1MONTH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="data" type="{}CyberPlatDataStats" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CyberPlatData", propOrder = {

})
public class CyberPlatData {

    @XmlElement(required = true)
    protected String number;
    @XmlElement(name = "number_is_exists", defaultValue = "1")
    protected Byte numberIsExists;
    @XmlElement(name = "pay_data_is_exists", defaultValue = "1")
    protected Byte payDataIsExists;
    @XmlElement(name = "die_period")
    protected String diePeriod;
    @XmlElement(name = "life_period")
    protected String lifePeriod;
    @XmlElement(name = "region_percent")
    protected String regionPercent;
    @XmlElement(name = "pay_time")
    protected String payTime;
    @XmlElement(name = "pay_terminal")
    protected String payTerminal;
    @XmlElement(name = "pay_moneytransfers")
    protected String payMoneytransfers;
    @XmlElement(name = "pay_bank")
    protected String payBank;
    @XmlElement(name = "MAXPAYREGION")
    protected String maxpayregion;
    @XmlElement(name = "PAYCOUNT6MONTH")
    protected Integer paycount6MONTH;
    @XmlElement(name = "FIRSTPAYDATE")
    protected String firstpaydate;
    @XmlElement(name = "MAXGAPDAYS")
    protected Integer maxgapdays;
    @XmlElement(name = "LASTPAYDATE")
    protected String lastpaydate;
    @XmlElement(name = "MAXPAY")
    protected BigDecimal maxpay;
    @XmlElement(name = "PAYSUM6MONTH")
    protected BigDecimal paysum6MONTH;
    @XmlElement(name = "PAYCOUNT")
    protected Integer paycount;
    @XmlElement(name = "MAXPAY3MONTH")
    protected BigDecimal maxpay3MONTH;
    @XmlElement(name = "MAXPAY1MONTH")
    protected BigDecimal maxpay1MONTH;
    @XmlElement(name = "PAYSUM3MONTH")
    protected BigDecimal paysum3MONTH;
    @XmlElement(name = "PAYCOUNT3MONTH")
    protected Integer paycount3MONTH;
    @XmlElement(name = "FIRSTPAYREGION")
    protected String firstpayregion;
    @XmlElement(name = "MAXPAY6MONTH")
    protected BigDecimal maxpay6MONTH;
    @XmlElement(name = "PAYSUM")
    protected BigDecimal paysum;
    @XmlElement(name = "PAYSUM1MONTH")
    protected BigDecimal paysum1MONTH;
    @XmlElement(name = "LASTPAYREGION")
    protected String lastpayregion;
    @XmlElement(name = "PAYCOUNT1MONTH")
    protected Integer paycount1MONTH;
    protected CyberPlatDataStats data;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the numberIsExists property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getNumberIsExists() {
        return numberIsExists;
    }

    /**
     * Sets the value of the numberIsExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setNumberIsExists(Byte value) {
        this.numberIsExists = value;
    }

    /**
     * Gets the value of the payDataIsExists property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPayDataIsExists() {
        return payDataIsExists;
    }

    /**
     * Sets the value of the payDataIsExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPayDataIsExists(Byte value) {
        this.payDataIsExists = value;
    }

    /**
     * Gets the value of the diePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiePeriod() {
        return diePeriod;
    }

    /**
     * Sets the value of the diePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiePeriod(String value) {
        this.diePeriod = value;
    }

    /**
     * Gets the value of the lifePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifePeriod() {
        return lifePeriod;
    }

    /**
     * Sets the value of the lifePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifePeriod(String value) {
        this.lifePeriod = value;
    }

    /**
     * Gets the value of the regionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionPercent() {
        return regionPercent;
    }

    /**
     * Sets the value of the regionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionPercent(String value) {
        this.regionPercent = value;
    }

    /**
     * Gets the value of the payTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * Sets the value of the payTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTime(String value) {
        this.payTime = value;
    }

    /**
     * Gets the value of the payTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTerminal() {
        return payTerminal;
    }

    /**
     * Sets the value of the payTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTerminal(String value) {
        this.payTerminal = value;
    }

    /**
     * Gets the value of the payMoneytransfers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMoneytransfers() {
        return payMoneytransfers;
    }

    /**
     * Sets the value of the payMoneytransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMoneytransfers(String value) {
        this.payMoneytransfers = value;
    }

    /**
     * Gets the value of the payBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBank() {
        return payBank;
    }

    /**
     * Sets the value of the payBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBank(String value) {
        this.payBank = value;
    }

    /**
     * Gets the value of the maxpayregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXPAYREGION() {
        return maxpayregion;
    }

    /**
     * Sets the value of the maxpayregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXPAYREGION(String value) {
        this.maxpayregion = value;
    }

    /**
     * Gets the value of the paycount6MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAYCOUNT6MONTH() {
        return paycount6MONTH;
    }

    /**
     * Sets the value of the paycount6MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAYCOUNT6MONTH(Integer value) {
        this.paycount6MONTH = value;
    }

    /**
     * Gets the value of the firstpaydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTPAYDATE() {
        return firstpaydate;
    }

    /**
     * Sets the value of the firstpaydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTPAYDATE(String value) {
        this.firstpaydate = value;
    }

    /**
     * Gets the value of the maxgapdays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAXGAPDAYS() {
        return maxgapdays;
    }

    /**
     * Sets the value of the maxgapdays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAXGAPDAYS(Integer value) {
        this.maxgapdays = value;
    }

    /**
     * Gets the value of the lastpaydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTPAYDATE() {
        return lastpaydate;
    }

    /**
     * Sets the value of the lastpaydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTPAYDATE(String value) {
        this.lastpaydate = value;
    }

    /**
     * Gets the value of the maxpay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXPAY() {
        return maxpay;
    }

    /**
     * Sets the value of the maxpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXPAY(BigDecimal value) {
        this.maxpay = value;
    }

    /**
     * Gets the value of the paysum6MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYSUM6MONTH() {
        return paysum6MONTH;
    }

    /**
     * Sets the value of the paysum6MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYSUM6MONTH(BigDecimal value) {
        this.paysum6MONTH = value;
    }

    /**
     * Gets the value of the paycount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAYCOUNT() {
        return paycount;
    }

    /**
     * Sets the value of the paycount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAYCOUNT(Integer value) {
        this.paycount = value;
    }

    /**
     * Gets the value of the maxpay3MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXPAY3MONTH() {
        return maxpay3MONTH;
    }

    /**
     * Sets the value of the maxpay3MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXPAY3MONTH(BigDecimal value) {
        this.maxpay3MONTH = value;
    }

    /**
     * Gets the value of the maxpay1MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXPAY1MONTH() {
        return maxpay1MONTH;
    }

    /**
     * Sets the value of the maxpay1MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXPAY1MONTH(BigDecimal value) {
        this.maxpay1MONTH = value;
    }

    /**
     * Gets the value of the paysum3MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYSUM3MONTH() {
        return paysum3MONTH;
    }

    /**
     * Sets the value of the paysum3MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYSUM3MONTH(BigDecimal value) {
        this.paysum3MONTH = value;
    }

    /**
     * Gets the value of the paycount3MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAYCOUNT3MONTH() {
        return paycount3MONTH;
    }

    /**
     * Sets the value of the paycount3MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAYCOUNT3MONTH(Integer value) {
        this.paycount3MONTH = value;
    }

    /**
     * Gets the value of the firstpayregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTPAYREGION() {
        return firstpayregion;
    }

    /**
     * Sets the value of the firstpayregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTPAYREGION(String value) {
        this.firstpayregion = value;
    }

    /**
     * Gets the value of the maxpay6MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAXPAY6MONTH() {
        return maxpay6MONTH;
    }

    /**
     * Sets the value of the maxpay6MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAXPAY6MONTH(BigDecimal value) {
        this.maxpay6MONTH = value;
    }

    /**
     * Gets the value of the paysum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYSUM() {
        return paysum;
    }

    /**
     * Sets the value of the paysum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYSUM(BigDecimal value) {
        this.paysum = value;
    }

    /**
     * Gets the value of the paysum1MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYSUM1MONTH() {
        return paysum1MONTH;
    }

    /**
     * Sets the value of the paysum1MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYSUM1MONTH(BigDecimal value) {
        this.paysum1MONTH = value;
    }

    /**
     * Gets the value of the lastpayregion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTPAYREGION() {
        return lastpayregion;
    }

    /**
     * Sets the value of the lastpayregion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTPAYREGION(String value) {
        this.lastpayregion = value;
    }

    /**
     * Gets the value of the paycount1MONTH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPAYCOUNT1MONTH() {
        return paycount1MONTH;
    }

    /**
     * Sets the value of the paycount1MONTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPAYCOUNT1MONTH(Integer value) {
        this.paycount1MONTH = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link CyberPlatDataStats }
     *     
     */
    public CyberPlatDataStats getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CyberPlatDataStats }
     *     
     */
    public void setData(CyberPlatDataStats value) {
        this.data = value;
    }

}
