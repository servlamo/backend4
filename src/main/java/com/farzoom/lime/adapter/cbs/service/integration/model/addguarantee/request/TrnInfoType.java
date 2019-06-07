
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Информация по транзакции
 * 
 * <p>Java class for TrnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}HashPAN" minOccurs="0"/>
 *         &lt;element ref="{}CardId" minOccurs="0"/>
 *         &lt;element ref="{}RBOTrnId" minOccurs="0"/>
 *         &lt;element ref="{}TrnId" minOccurs="0"/>
 *         &lt;element ref="{}RRN" minOccurs="0"/>
 *         &lt;element ref="{}OperCategory" minOccurs="0"/>
 *         &lt;element ref="{}OperCode" minOccurs="0"/>
 *         &lt;element ref="{}OperDesc" minOccurs="0"/>
 *         &lt;element ref="{}MCC" minOccurs="0"/>
 *         &lt;element name="OrigDt" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="PostedDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="OrigCurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="ConsAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="ConsAmtDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnInfo_Type", propOrder = {

})
public class TrnInfoType {

    @XmlElement(name = "HashPAN")
    protected String hashPAN;
    @XmlElement(name = "CardId")
    protected String cardId;
    @XmlElement(name = "RBOTrnId")
    protected String rboTrnId;
    @XmlElement(name = "TrnId")
    protected String trnId;
    @XmlElement(name = "RRN")
    protected String rrn;
    @XmlElement(name = "OperCategory")
    protected String operCategory;
    @XmlElement(name = "OperCode")
    protected String operCode;
    @XmlElement(name = "OperDesc")
    protected String operDesc;
    @XmlElement(name = "MCC")
    protected String mcc;
    @XmlElement(name = "OrigDt")
    protected DateTime origDt;
    @XmlElement(name = "PostedDt")
    protected Date postedDt;
    @XmlElement(name = "CurAmt")
    protected CurrencyAmount curAmt;
    @XmlElement(name = "OrigCurAmt")
    protected CurrencyAmount origCurAmt;
    @XmlElement(name = "ConsAmt")
    protected CurrencyAmount consAmt;
    @XmlElement(name = "ConsAmtDesc")
    protected String consAmtDesc;
    @XmlElement(name = "Scored")
    protected Boolean scored;

    /**
     * Gets the value of the hashPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashPAN() {
        return hashPAN;
    }

    /**
     * Sets the value of the hashPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashPAN(String value) {
        this.hashPAN = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the rboTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBOTrnId() {
        return rboTrnId;
    }

    /**
     * Sets the value of the rboTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBOTrnId(String value) {
        this.rboTrnId = value;
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
     * Gets the value of the operCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperCategory() {
        return operCategory;
    }

    /**
     * Sets the value of the operCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperCategory(String value) {
        this.operCategory = value;
    }

    /**
     * Gets the value of the operCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * Sets the value of the operCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperCode(String value) {
        this.operCode = value;
    }

    /**
     * Gets the value of the operDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperDesc() {
        return operDesc;
    }

    /**
     * Sets the value of the operDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperDesc(String value) {
        this.operDesc = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
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
     * Gets the value of the postedDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getPostedDt() {
        return postedDt;
    }

    /**
     * Sets the value of the postedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setPostedDt(Date value) {
        this.postedDt = value;
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
     * Gets the value of the origCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getOrigCurAmt() {
        return origCurAmt;
    }

    /**
     * Sets the value of the origCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setOrigCurAmt(CurrencyAmount value) {
        this.origCurAmt = value;
    }

    /**
     * Gets the value of the consAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getConsAmt() {
        return consAmt;
    }

    /**
     * Sets the value of the consAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setConsAmt(CurrencyAmount value) {
        this.consAmt = value;
    }

    /**
     * Gets the value of the consAmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsAmtDesc() {
        return consAmtDesc;
    }

    /**
     * Sets the value of the consAmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsAmtDesc(String value) {
        this.consAmtDesc = value;
    }

    /**
     * Gets the value of the scored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScored() {
        return scored;
    }

    /**
     * Sets the value of the scored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScored(Boolean value) {
        this.scored = value;
    }

}
