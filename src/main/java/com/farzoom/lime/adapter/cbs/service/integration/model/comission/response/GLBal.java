
package com.farzoom.lime.adapter.cbs.service.integration.model.comission.response;

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
