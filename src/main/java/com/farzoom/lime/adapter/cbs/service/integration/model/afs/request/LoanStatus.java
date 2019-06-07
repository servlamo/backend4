//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 11:23:44 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.afs.request;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="LoanStatusCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "LoanStatus")
public class LoanStatus {

    @XmlElement(name = "LoanStatusCode", required = true)
    protected Object loanStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected DateTime effDt;
    @XmlElement(name = "StatusModReason")
    protected String statusModReason;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the loanStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLoanStatusCode() {
        return loanStatusCode;
    }

    /**
     * Sets the value of the loanStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLoanStatusCode(Object value) {
        this.loanStatusCode = value;
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
