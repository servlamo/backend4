//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.26 at 09:27:34 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.response;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * Тип Перевод
 * 
 * <p>Java class for XferInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BankAcctIdFrom" type="{}BankAcctId_Type" minOccurs="0"/>
 *         &lt;element name="CardAcctIdFrom" type="{}CardAcctId_Type" minOccurs="0"/>
 *         &lt;element name="BankAcctIdTo" type="{}BankAcctId_Type" minOccurs="0"/>
 *         &lt;element name="CardAcctIdTo" type="{}CardAcctId_Type" minOccurs="0"/>
 *         &lt;element ref="{}CustIdFrom" minOccurs="0"/>
 *         &lt;element ref="{}CustIdTo" minOccurs="0"/>
 *         &lt;element ref="{}NameFrom" minOccurs="0"/>
 *         &lt;element ref="{}NameTo" minOccurs="0"/>
 *         &lt;element ref="{}TaxIdFrom" minOccurs="0"/>
 *         &lt;element ref="{}TaxIdTo" minOccurs="0"/>
 *         &lt;element ref="{}TaxRegCodeFrom" minOccurs="0"/>
 *         &lt;element ref="{}TaxRegCodeTo" minOccurs="0"/>
 *         &lt;element name="PostAddrFrom" type="{}Addr_Type" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element ref="{}ExpCur" minOccurs="0"/>
 *         &lt;element name="OrigDt" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="DueDt" type="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}Purpose" minOccurs="0"/>
 *         &lt;element name="XferCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="FeeChargeAlloc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChargeRegulation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BudgetaryPmtInfo" type="{}BudgetaryPmtInfo_Type" minOccurs="0"/>
 *         &lt;element name="SPDefFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}SPDefField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}PmtId" minOccurs="0"/>
 *         &lt;element name="ExtPmtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}ExtTrnId" minOccurs="0"/>
 *         &lt;element ref="{}TrnId" minOccurs="0"/>
 *         &lt;element ref="{}UIP" minOccurs="0"/>
 *         &lt;element ref="{}MerchId" minOccurs="0"/>
 *         &lt;element name="XferStatus" type="{}XferStatus_Type" minOccurs="0"/>
 *         &lt;element ref="{}TerminalId" minOccurs="0"/>
 *         &lt;element ref="{}RRN" minOccurs="0"/>
 *         &lt;element name="ExtAcctId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferInfo_Type", propOrder = {

})
public class XferInfoType {

    @XmlElement(name = "BankAcctIdFrom")
    protected BankAcctIdType bankAcctIdFrom;
    @XmlElement(name = "CardAcctIdFrom")
    protected CardAcctIdType cardAcctIdFrom;
    @XmlElement(name = "BankAcctIdTo")
    protected BankAcctIdType bankAcctIdTo;
    @XmlElement(name = "CardAcctIdTo")
    protected CardAcctIdType cardAcctIdTo;
    @XmlElement(name = "CustIdFrom")
    protected String custIdFrom;
    @XmlElement(name = "CustIdTo")
    protected String custIdTo;
    @XmlElement(name = "NameFrom")
    protected String nameFrom;
    @XmlElement(name = "NameTo")
    protected String nameTo;
    @XmlElement(name = "TaxIdFrom")
    protected String taxIdFrom;
    @XmlElement(name = "TaxIdTo")
    protected String taxIdTo;
    @XmlElement(name = "TaxRegCodeFrom")
    protected String taxRegCodeFrom;
    @XmlElement(name = "TaxRegCodeTo")
    protected String taxRegCodeTo;
    @XmlElement(name = "PostAddrFrom")
    protected AddrType postAddrFrom;
    @XmlElement(name = "CurAmt")
    protected CurrencyAmount curAmt;
    @XmlElement(name = "ExpCur")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger expCur;
    @XmlElement(name = "OrigDt")
    protected DateTime origDt;
    @XmlElement(name = "DueDt")
    protected Date dueDt;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "XferCode")
    protected Object xferCode;
    @XmlElement(name = "FeeChargeAlloc")
    protected XferInfoType.FeeChargeAlloc feeChargeAlloc;
    @XmlElement(name = "BudgetaryPmtInfo")
    protected BudgetaryPmtInfoType budgetaryPmtInfo;
    @XmlElement(name = "SPDefFields")
    protected XferInfoType.SPDefFields spDefFields;
    @XmlElement(name = "PmtId")
    protected String pmtId;
    @XmlElement(name = "ExtPmtId")
    protected String extPmtId;
    @XmlElement(name = "ExtTrnId")
    protected String extTrnId;
    @XmlElement(name = "TrnId")
    protected String trnId;
    @XmlElement(name = "UIP")
    protected String uip;
    @XmlElement(name = "MerchId")
    protected String merchId;
    @XmlElement(name = "XferStatus")
    protected XferStatusType xferStatus;
    @XmlElement(name = "TerminalId")
    protected String terminalId;
    @XmlElement(name = "RRN")
    protected String rrn;
    @XmlElement(name = "ExtAcctId")
    protected String extAcctId;

    /**
     * Gets the value of the bankAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctIdType }
     *     
     */
    public BankAcctIdType getBankAcctIdFrom() {
        return bankAcctIdFrom;
    }

    /**
     * Sets the value of the bankAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctIdType }
     *     
     */
    public void setBankAcctIdFrom(BankAcctIdType value) {
        this.bankAcctIdFrom = value;
    }

    /**
     * Gets the value of the cardAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdType }
     *     
     */
    public CardAcctIdType getCardAcctIdFrom() {
        return cardAcctIdFrom;
    }

    /**
     * Sets the value of the cardAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdType }
     *     
     */
    public void setCardAcctIdFrom(CardAcctIdType value) {
        this.cardAcctIdFrom = value;
    }

    /**
     * Gets the value of the bankAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctIdType }
     *     
     */
    public BankAcctIdType getBankAcctIdTo() {
        return bankAcctIdTo;
    }

    /**
     * Sets the value of the bankAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctIdType }
     *     
     */
    public void setBankAcctIdTo(BankAcctIdType value) {
        this.bankAcctIdTo = value;
    }

    /**
     * Gets the value of the cardAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcctIdType }
     *     
     */
    public CardAcctIdType getCardAcctIdTo() {
        return cardAcctIdTo;
    }

    /**
     * Sets the value of the cardAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcctIdType }
     *     
     */
    public void setCardAcctIdTo(CardAcctIdType value) {
        this.cardAcctIdTo = value;
    }

    /**
     * Gets the value of the custIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIdFrom() {
        return custIdFrom;
    }

    /**
     * Sets the value of the custIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIdFrom(String value) {
        this.custIdFrom = value;
    }

    /**
     * Gets the value of the custIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIdTo() {
        return custIdTo;
    }

    /**
     * Sets the value of the custIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIdTo(String value) {
        this.custIdTo = value;
    }

    /**
     * Gets the value of the nameFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFrom() {
        return nameFrom;
    }

    /**
     * Sets the value of the nameFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFrom(String value) {
        this.nameFrom = value;
    }

    /**
     * Gets the value of the nameTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTo() {
        return nameTo;
    }

    /**
     * Sets the value of the nameTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTo(String value) {
        this.nameTo = value;
    }

    /**
     * Gets the value of the taxIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdFrom() {
        return taxIdFrom;
    }

    /**
     * Sets the value of the taxIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdFrom(String value) {
        this.taxIdFrom = value;
    }

    /**
     * Gets the value of the taxIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdTo() {
        return taxIdTo;
    }

    /**
     * Sets the value of the taxIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdTo(String value) {
        this.taxIdTo = value;
    }

    /**
     * Gets the value of the taxRegCodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegCodeFrom() {
        return taxRegCodeFrom;
    }

    /**
     * Sets the value of the taxRegCodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegCodeFrom(String value) {
        this.taxRegCodeFrom = value;
    }

    /**
     * Gets the value of the taxRegCodeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegCodeTo() {
        return taxRegCodeTo;
    }

    /**
     * Sets the value of the taxRegCodeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegCodeTo(String value) {
        this.taxRegCodeTo = value;
    }

    /**
     * Gets the value of the postAddrFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getPostAddrFrom() {
        return postAddrFrom;
    }

    /**
     * Sets the value of the postAddrFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setPostAddrFrom(AddrType value) {
        this.postAddrFrom = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setCurAmt(CurrencyAmount value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the expCur property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpCur() {
        return expCur;
    }

    /**
     * Sets the value of the expCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpCur(BigInteger value) {
        this.expCur = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setOrigDt(DateTime value) {
        this.origDt = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDueDt(Date value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the xferCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXferCode() {
        return xferCode;
    }

    /**
     * Sets the value of the xferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXferCode(Object value) {
        this.xferCode = value;
    }

    /**
     * Gets the value of the feeChargeAlloc property.
     * 
     * @return
     *     possible object is
     *     {@link XferInfoType.FeeChargeAlloc }
     *     
     */
    public XferInfoType.FeeChargeAlloc getFeeChargeAlloc() {
        return feeChargeAlloc;
    }

    /**
     * Sets the value of the feeChargeAlloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferInfoType.FeeChargeAlloc }
     *     
     */
    public void setFeeChargeAlloc(XferInfoType.FeeChargeAlloc value) {
        this.feeChargeAlloc = value;
    }

    /**
     * Gets the value of the budgetaryPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetaryPmtInfoType }
     *     
     */
    public BudgetaryPmtInfoType getBudgetaryPmtInfo() {
        return budgetaryPmtInfo;
    }

    /**
     * Sets the value of the budgetaryPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetaryPmtInfoType }
     *     
     */
    public void setBudgetaryPmtInfo(BudgetaryPmtInfoType value) {
        this.budgetaryPmtInfo = value;
    }

    /**
     * Gets the value of the spDefFields property.
     * 
     * @return
     *     possible object is
     *     {@link XferInfoType.SPDefFields }
     *     
     */
    public XferInfoType.SPDefFields getSPDefFields() {
        return spDefFields;
    }

    /**
     * Sets the value of the spDefFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferInfoType.SPDefFields }
     *     
     */
    public void setSPDefFields(XferInfoType.SPDefFields value) {
        this.spDefFields = value;
    }

    /**
     * Gets the value of the pmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtId() {
        return pmtId;
    }

    /**
     * Sets the value of the pmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtId(String value) {
        this.pmtId = value;
    }

    /**
     * Gets the value of the extPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtPmtId() {
        return extPmtId;
    }

    /**
     * Sets the value of the extPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtPmtId(String value) {
        this.extPmtId = value;
    }

    /**
     * Gets the value of the extTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTrnId() {
        return extTrnId;
    }

    /**
     * Sets the value of the extTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTrnId(String value) {
        this.extTrnId = value;
    }

    /**
     * Gets the value of the trnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnId() {
        return trnId;
    }

    /**
     * Sets the value of the trnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnId(String value) {
        this.trnId = value;
    }

    /**
     * Gets the value of the uip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIP() {
        return uip;
    }

    /**
     * Sets the value of the uip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIP(String value) {
        this.uip = value;
    }

    /**
     * Gets the value of the merchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchId() {
        return merchId;
    }

    /**
     * Sets the value of the merchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchId(String value) {
        this.merchId = value;
    }

    /**
     * Gets the value of the xferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XferStatusType }
     *     
     */
    public XferStatusType getXferStatus() {
        return xferStatus;
    }

    /**
     * Sets the value of the xferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferStatusType }
     *     
     */
    public void setXferStatus(XferStatusType value) {
        this.xferStatus = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRN() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRN(String value) {
        this.rrn = value;
    }

    /**
     * Gets the value of the extAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtAcctId() {
        return extAcctId;
    }

    /**
     * Sets the value of the extAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtAcctId(String value) {
        this.extAcctId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ChargeRegulation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{}Fee" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "chargeRegulation",
        "fee"
    })
    public static class FeeChargeAlloc {

        @XmlElement(name = "ChargeRegulation")
        protected String chargeRegulation;
        @XmlElement(name = "Fee")
        protected List<Fee> fee;

        /**
         * Gets the value of the chargeRegulation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargeRegulation() {
            return chargeRegulation;
        }

        /**
         * Sets the value of the chargeRegulation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargeRegulation(String value) {
            this.chargeRegulation = value;
        }

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Fee }
         * 
         * 
         */
        public List<Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<Fee>();
            }
            return this.fee;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}SPDefField" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "spDefField"
    })
    public static class SPDefFields {

        @XmlElement(name = "SPDefField")
        protected List<SPDefField> spDefField;

        /**
         * Gets the value of the spDefField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the spDefField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSPDefField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SPDefField }
         * 
         * 
         */
        public List<SPDefField> getSPDefField() {
            if (spDefField == null) {
                spDefField = new ArrayList<SPDefField>();
            }
            return this.spDefField;
        }

    }

}
