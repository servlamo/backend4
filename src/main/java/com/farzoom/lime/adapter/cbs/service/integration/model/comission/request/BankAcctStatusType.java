
package com.farzoom.lime.adapter.cbs.service.integration.model.comission.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Статус банковского счета
 * 
 * <p>Java class for BankAcctStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAcctStatus_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}BankAcctStatusCode"/>
 *         &lt;element ref="{}StatusDesc" minOccurs="0"/>
 *         &lt;element name="EffDt" type="{}DateTime" minOccurs="0"/>
 *         &lt;element ref="{}StatusModReason" minOccurs="0"/>
 *         &lt;element ref="{}StatusModBy" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAcctStatus_Type", propOrder = {

})
public class BankAcctStatusType {

    @XmlElement(name = "BankAcctStatusCode", required = true)
    protected String bankAcctStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected DateTime effDt;
    @XmlElement(name = "StatusModReason")
    protected String statusModReason;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the bankAcctStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcctStatusCode() {
        return bankAcctStatusCode;
    }

    /**
     * Sets the value of the bankAcctStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcctStatusCode(String value) {
        this.bankAcctStatusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
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
     * Gets the value of the statusModReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModReason() {
        return statusModReason;
    }

    /**
     * Sets the value of the statusModReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModReason(String value) {
        this.statusModReason = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

}
