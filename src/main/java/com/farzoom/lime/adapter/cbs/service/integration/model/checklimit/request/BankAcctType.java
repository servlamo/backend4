
package com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.request;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип счет
 * 
 * <p>Java class for BankAcct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcct_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AcctType"/>
 *         &lt;element ref="{}AcctId"/>
 *         &lt;element ref="{}AcctCur"/>
 *         &lt;element ref="{}AgreemtNum" minOccurs="0"/>
 *         &lt;element ref="{}ProdType" minOccurs="0"/>
 *         &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="ClosingDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="ExpiryDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="CapitalizationDt" type="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}IntRate"/>
 *         &lt;element name="AcctOpen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcctLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BlockadeInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
 *                   &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
 *                   &lt;element name="BlockadeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="BlockadeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element ref="{}Desc" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}AcctBal" maxOccurs="unbounded"/>
 *         &lt;element ref="{}BankInfo" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcct_Type", propOrder = {
    "acctType",
    "acctId",
    "acctCur",
    "agreemtNum",
    "prodType",
    "startDt",
    "closingDt",
    "expiryDt",
    "capitalizationDt",
    "intRate",
    "acctOpen",
    "acctLock",
    "blockadeInfo",
    "acctBal",
    "bankInfo",
    "id"
})
public class BankAcctType {

    @XmlElement(name = "AcctType", required = true)
    protected String acctType;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctCur", required = true)
    protected String acctCur;
    @XmlElement(name = "AgreemtNum")
    protected String agreemtNum;
    @XmlElement(name = "ProdType")
    protected String prodType;
    @XmlElement(name = "StartDt")
    protected Date startDt;
    @XmlElement(name = "ClosingDt")
    protected Date closingDt;
    @XmlElement(name = "ExpiryDt")
    protected Date expiryDt;
    @XmlElement(name = "CapitalizationDt")
    protected Date capitalizationDt;
    @XmlElement(name = "IntRate", required = true)
    protected IntRate intRate;
    @XmlElement(name = "AcctOpen")
    protected Boolean acctOpen;
    @XmlElement(name = "AcctLock")
    protected Boolean acctLock;
    @XmlElement(name = "BlockadeInfo")
    protected List<BankAcctType.BlockadeInfo> blockadeInfo;
    @XmlElement(name = "AcctBal", required = true)
    protected List<AcctBal> acctBal;
    @XmlElement(name = "BankInfo")
    protected BankInfo bankInfo;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
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
     * Gets the value of the agreemtNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreemtNum() {
        return agreemtNum;
    }

    /**
     * Sets the value of the agreemtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreemtNum(String value) {
        this.agreemtNum = value;
    }

    /**
     * Gets the value of the prodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdType() {
        return prodType;
    }

    /**
     * Sets the value of the prodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdType(String value) {
        this.prodType = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDt(Date value) {
        this.startDt = value;
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
     * Gets the value of the expiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpiryDt() {
        return expiryDt;
    }

    /**
     * Sets the value of the expiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpiryDt(Date value) {
        this.expiryDt = value;
    }

    /**
     * Gets the value of the capitalizationDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCapitalizationDt() {
        return capitalizationDt;
    }

    /**
     * Sets the value of the capitalizationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCapitalizationDt(Date value) {
        this.capitalizationDt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRate }
     *     
     */
    public IntRate getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRate }
     *     
     */
    public void setIntRate(IntRate value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the acctOpen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctOpen() {
        return acctOpen;
    }

    /**
     * Sets the value of the acctOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctOpen(Boolean value) {
        this.acctOpen = value;
    }

    /**
     * Gets the value of the acctLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctLock() {
        return acctLock;
    }

    /**
     * Sets the value of the acctLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctLock(Boolean value) {
        this.acctLock = value;
    }

    /**
     * Gets the value of the blockadeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockadeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockadeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAcctType.BlockadeInfo }
     * 
     * 
     */
    public List<BankAcctType.BlockadeInfo> getBlockadeInfo() {
        if (blockadeInfo == null) {
            blockadeInfo = new ArrayList<BankAcctType.BlockadeInfo>();
        }
        return this.blockadeInfo;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBal }
     * 
     * 
     */
    public List<AcctBal> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBal>();
        }
        return this.acctBal;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
     *         &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
     *         &lt;element name="BlockadeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="BlockadeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element ref="{}Desc" minOccurs="0"/>
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
    public static class BlockadeInfo {

        @XmlElement(name = "StartDt")
        protected Date startDt;
        @XmlElement(name = "EndDt")
        protected Date endDt;
        @XmlElement(name = "BlockadeType", required = true)
        protected String blockadeType;
        @XmlElement(name = "BlockadeCode")
        protected String blockadeCode;
        @XmlElement(name = "Amt", required = true)
        protected BigDecimal amt;
        @XmlElement(name = "Desc")
        protected String desc;

        /**
         * Gets the value of the startDt property.
         * 
         * @return
         *     possible object is
         *     {@link Date }
         *     
         */
        public Date getStartDt() {
            return startDt;
        }

        /**
         * Sets the value of the startDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Date }
         *     
         */
        public void setStartDt(Date value) {
            this.startDt = value;
        }

        /**
         * Gets the value of the endDt property.
         * 
         * @return
         *     possible object is
         *     {@link Date }
         *     
         */
        public Date getEndDt() {
            return endDt;
        }

        /**
         * Sets the value of the endDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Date }
         *     
         */
        public void setEndDt(Date value) {
            this.endDt = value;
        }

        /**
         * Gets the value of the blockadeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlockadeType() {
            return blockadeType;
        }

        /**
         * Sets the value of the blockadeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlockadeType(String value) {
            this.blockadeType = value;
        }

        /**
         * Gets the value of the blockadeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlockadeCode() {
            return blockadeCode;
        }

        /**
         * Sets the value of the blockadeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlockadeCode(String value) {
            this.blockadeCode = value;
        }

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmt() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmt(BigDecimal value) {
            this.amt = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesc() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesc(String value) {
            this.desc = value;
        }

    }

}
