//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.26 at 09:27:34 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.fileadd.response;

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
 *         &lt;element name="GLBalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
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
@XmlRootElement(name = "GLBal")
public class GLBal {

    @XmlElement(name = "GLBalType")
    protected String glBalType;
    @XmlElement(name = "CurAmt", required = true)
    protected CurrencyAmount curAmt;

    /**
     * Gets the value of the glBalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLBalType() {
        return glBalType;
    }

    /**
     * Sets the value of the glBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLBalType(String value) {
        this.glBalType = value;
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

}
