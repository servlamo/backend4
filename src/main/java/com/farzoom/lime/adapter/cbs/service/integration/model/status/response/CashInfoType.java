
package com.farzoom.lime.adapter.cbs.service.integration.model.status.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}TillNum"/>
 *         &lt;element name="AcctList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcctRec" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element ref="{}AcctId"/>
 *                             &lt;element ref="{}AcctCur"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Category"/>
 *         &lt;element name="ClosingDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="CashStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}StatusCode"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}BankInfo"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashInfo_Type", propOrder = {

})
public class CashInfoType {

    @XmlElement(name = "TillNum", required = true)
    protected String tillNum;
    @XmlElement(name = "AcctList", required = true)
    protected CashInfoType.AcctList acctList;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "ClosingDt")
    protected Date closingDt;
    @XmlElement(name = "CashStatus")
    protected CashInfoType.CashStatus cashStatus;
    @XmlElement(name = "BankInfo", required = true)
    protected BankInfo bankInfo;

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
     * Gets the value of the acctList property.
     * 
     * @return
     *     possible object is
     *     {@link CashInfoType.AcctList }
     *     
     */
    public CashInfoType.AcctList getAcctList() {
        return acctList;
    }

    /**
     * Sets the value of the acctList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashInfoType.AcctList }
     *     
     */
    public void setAcctList(CashInfoType.AcctList value) {
        this.acctList = value;
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

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the closingDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getClosingDt() {
        return closingDt;
    }

    /**
     * Sets the value of the closingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setClosingDt(Date value) {
        this.closingDt = value;
    }

    /**
     * Gets the value of the cashStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CashInfoType.CashStatus }
     *     
     */
    public CashInfoType.CashStatus getCashStatus() {
        return cashStatus;
    }

    /**
     * Sets the value of the cashStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashInfoType.CashStatus }
     *     
     */
    public void setCashStatus(CashInfoType.CashStatus value) {
        this.cashStatus = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AcctRec" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element ref="{}AcctId"/>
     *                   &lt;element ref="{}AcctCur"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "acctRec"
    })
    public static class AcctList {

        @XmlElement(name = "AcctRec", required = true)
        protected List<CashInfoType.AcctList.AcctRec> acctRec;

        /**
         * Gets the value of the acctRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcctRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CashInfoType.AcctList.AcctRec }
         * 
         * 
         */
        public List<CashInfoType.AcctList.AcctRec> getAcctRec() {
            if (acctRec == null) {
                acctRec = new ArrayList<CashInfoType.AcctList.AcctRec>();
            }
            return this.acctRec;
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
         *         &lt;element ref="{}AcctId"/>
         *         &lt;element ref="{}AcctCur"/>
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
        public static class AcctRec {

            @XmlElement(name = "AcctId", required = true)
            protected String acctId;
            @XmlElement(name = "AcctCur", required = true)
            protected String acctCur;

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
     *         &lt;element ref="{}StatusCode"/>
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
        "statusCode"
    })
    public static class CashStatus {

        @XmlElement(name = "StatusCode", required = true, defaultValue = "0")
        protected String statusCode;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

    }

}
