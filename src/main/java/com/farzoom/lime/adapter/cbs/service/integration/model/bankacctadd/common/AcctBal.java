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
 *         &lt;element name="BalType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/&gt;
 *         &lt;element name="EffDt" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}Desc" minOccurs="0"/&gt;
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
@XmlRootElement(name = "AcctBal")
public class AcctBal {

    @XmlElement(name = "BalType", required = true)
    protected String balType;
    @XmlElement(name = "CurAmt", required = true)
    protected CurrencyAmount curAmt;
    @XmlElement(name = "EffDt")
    protected DateTime effDt;
    @XmlElement(name = "ExpDt")
    protected DateTime expDt;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the balType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalType() {
        return balType;
    }

    /**
     * Sets the value of the balType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalType(String value) {
        this.balType = value;
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
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExpDt(DateTime value) {
        this.expDt = value;
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
