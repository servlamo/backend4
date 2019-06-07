
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankOperInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankOperInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BankOperType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankOperKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}CustId"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cust2CustInfo" type="{}Cust2CustInfo_Type" minOccurs="0"/>
 *         &lt;element name="DepAcctIdTo" type="{}DepAcctId_Type" minOccurs="0"/>
 *         &lt;element name="DepAcctIdFrom" type="{}DepAcctId_Type" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
 *         &lt;element name="OperNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}TillNum" minOccurs="0"/>
 *                   &lt;element ref="{}AcctId"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CashPlanInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CashPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CashPlanCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element ref="{}Name" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankOperInfo_Type", propOrder = {

})
public class BankOperInfoType {

    @XmlElement(name = "BankOperType", required = true)
    protected String bankOperType;
    @XmlElement(name = "BankOperKind", required = true)
    protected String bankOperKind;
    @XmlElement(name = "CustInfo")
    protected BankOperInfoType.CustInfo custInfo;
    @XmlElement(name = "Cust2CustInfo")
    protected Cust2CustInfoType cust2CustInfo;
    @XmlElement(name = "DepAcctIdTo")
    protected DepAcctIdType depAcctIdTo;
    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdType depAcctIdFrom;
    @XmlElement(name = "CurAmt", required = true)
    protected CurrencyAmount curAmt;
    @XmlElement(name = "OperNum", required = true)
    protected String operNum;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "CashInfo")
    protected BankOperInfoType.CashInfo cashInfo;
    @XmlElement(name = "CashPlanInfo", required = true)
    protected BankOperInfoType.CashPlanInfo cashPlanInfo;

    /**
     * Gets the value of the bankOperType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankOperType() {
        return bankOperType;
    }

    /**
     * Sets the value of the bankOperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankOperType(String value) {
        this.bankOperType = value;
    }

    /**
     * Gets the value of the bankOperKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankOperKind() {
        return bankOperKind;
    }

    /**
     * Sets the value of the bankOperKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankOperKind(String value) {
        this.bankOperKind = value;
    }

    /**
     * Gets the value of the custInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankOperInfoType.CustInfo }
     *     
     */
    public BankOperInfoType.CustInfo getCustInfo() {
        return custInfo;
    }

    /**
     * Sets the value of the custInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankOperInfoType.CustInfo }
     *     
     */
    public void setCustInfo(BankOperInfoType.CustInfo value) {
        this.custInfo = value;
    }

    /**
     * Gets the value of the cust2CustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Cust2CustInfoType }
     *     
     */
    public Cust2CustInfoType getCust2CustInfo() {
        return cust2CustInfo;
    }

    /**
     * Sets the value of the cust2CustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cust2CustInfoType }
     *     
     */
    public void setCust2CustInfo(Cust2CustInfoType value) {
        this.cust2CustInfo = value;
    }

    /**
     * Gets the value of the depAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctIdTo() {
        return depAcctIdTo;
    }

    /**
     * Sets the value of the depAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctIdTo(DepAcctIdType value) {
        this.depAcctIdTo = value;
    }

    /**
     * Gets the value of the depAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctIdFrom() {
        return depAcctIdFrom;
    }

    /**
     * Sets the value of the depAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctIdFrom(DepAcctIdType value) {
        this.depAcctIdFrom = value;
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
     * Gets the value of the operNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperNum() {
        return operNum;
    }

    /**
     * Sets the value of the operNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperNum(String value) {
        this.operNum = value;
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
     * Gets the value of the cashInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankOperInfoType.CashInfo }
     *     
     */
    public BankOperInfoType.CashInfo getCashInfo() {
        return cashInfo;
    }

    /**
     * Sets the value of the cashInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankOperInfoType.CashInfo }
     *     
     */
    public void setCashInfo(BankOperInfoType.CashInfo value) {
        this.cashInfo = value;
    }

    /**
     * Gets the value of the cashPlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankOperInfoType.CashPlanInfo }
     *     
     */
    public BankOperInfoType.CashPlanInfo getCashPlanInfo() {
        return cashPlanInfo;
    }

    /**
     * Sets the value of the cashPlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankOperInfoType.CashPlanInfo }
     *     
     */
    public void setCashPlanInfo(BankOperInfoType.CashPlanInfo value) {
        this.cashPlanInfo = value;
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
     *       &lt;all>
     *         &lt;element ref="{}TillNum" minOccurs="0"/>
     *         &lt;element ref="{}AcctId"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CashInfo {

        @XmlElement(name = "TillNum")
        protected String tillNum;
        @XmlElement(name = "AcctId", required = true)
        protected String acctId;

        /**
         * Gets the value of the tillNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTillNum() {
            return tillNum;
        }

        /**
         * Sets the value of the tillNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTillNum(String value) {
            this.tillNum = value;
        }

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
     *       &lt;all>
     *         &lt;element name="CashPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CashPlanCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element ref="{}Name" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CashPlanInfo {

        @XmlElement(name = "CashPlanType")
        protected String cashPlanType;
        @XmlElement(name = "CashPlanCode", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger cashPlanCode;
        @XmlElement(name = "Name")
        protected String name;

        /**
         * Gets the value of the cashPlanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCashPlanType() {
            return cashPlanType;
        }

        /**
         * Sets the value of the cashPlanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCashPlanType(String value) {
            this.cashPlanType = value;
        }

        /**
         * Gets the value of the cashPlanCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCashPlanCode() {
            return cashPlanCode;
        }

        /**
         * Sets the value of the cashPlanCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCashPlanCode(BigInteger value) {
            this.cashPlanCode = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;all>
     *         &lt;element ref="{}CustId"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CustInfo {

        @XmlElement(name = "CustId", required = true)
        protected String custId;

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

    }

}
