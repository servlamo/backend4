//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.30 at 09:38:27 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{}ForExDealStatusCode"/&gt;
 *         &lt;element ref="{}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element name="EffDt" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}StatusModBy" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "ForExDealStatus")
public class ForExDealStatus {

    @XmlElement(name = "ForExDealStatusCode", required = true)
    protected String forExDealStatusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected DateTime effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the forExDealStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExDealStatusCode() {
        return forExDealStatusCode;
    }

    /**
     * Sets the value of the forExDealStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExDealStatusCode(String value) {
        this.forExDealStatusCode = value;
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
