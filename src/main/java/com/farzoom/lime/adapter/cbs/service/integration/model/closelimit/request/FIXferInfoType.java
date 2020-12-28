
package com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о межбанковском переводе
 * 
 * <p>Java class for FIXferInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIXferInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Sender" type="{}FIXferAcct_Type"/>
 *         &lt;element name="Receiver" type="{}FIXferAcct_Type"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
 *         &lt;element name="ValueDt" type="{}DateTime" minOccurs="0"/>
 *         &lt;element name="OrigDt" type="{}DateTime"/>
 *         &lt;element ref="{}PmtId"/>
 *         &lt;element name="EffDt" type="{}DateTime" minOccurs="0"/>
 *         &lt;element ref="{}Purpose" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element ref="{}FIXferStatus" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIXferInfo_Type", propOrder = {

})
public class FIXferInfoType {

    @XmlElement(name = "Sender", required = true)
    protected FIXferAcctType sender;
    @XmlElement(name = "Receiver", required = true)
    protected FIXferAcctType receiver;
    @XmlElement(name = "CurAmt", required = true)
    protected CurrencyAmount curAmt;
    @XmlElement(name = "ValueDt")
    protected DateTime valueDt;
    @XmlElement(name = "OrigDt", required = true)
    protected DateTime origDt;
    @XmlElement(name = "PmtId", required = true)
    protected String pmtId;
    @XmlElement(name = "EffDt")
    protected DateTime effDt;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger count;
    @XmlElement(name = "FIXferStatus")
    protected FIXferStatusType fiXferStatus;

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link FIXferAcctType }
     *     
     */
    public FIXferAcctType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXferAcctType }
     *     
     */
    public void setSender(FIXferAcctType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link FIXferAcctType }
     *     
     */
    public FIXferAcctType getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXferAcctType }
     *     
     */
    public void setReceiver(FIXferAcctType value) {
        this.receiver = value;
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
     * Gets the value of the valueDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getValueDt() {
        return valueDt;
    }

    /**
     * Sets the value of the valueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setValueDt(DateTime value) {
        this.valueDt = value;
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
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEffDt(DateTime value) {
        this.effDt = value;
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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the fiXferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FIXferStatusType }
     *     
     */
    public FIXferStatusType getFIXferStatus() {
        return fiXferStatus;
    }

    /**
     * Sets the value of the fiXferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXferStatusType }
     *     
     */
    public void setFIXferStatus(FIXferStatusType value) {
        this.fiXferStatus = value;
    }

}
