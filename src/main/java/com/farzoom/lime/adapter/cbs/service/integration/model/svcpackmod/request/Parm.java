//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 07:26:12 PM EET 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.request;

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
 *       &lt;sequence>
 *         &lt;element name="ParmName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParmValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "parmName",
    "parmValue"
})
@XmlRootElement(name = "Parm")
public class Parm {

    @XmlElement(name = "ParmName", required = true)
    protected String parmName;
    @XmlElement(name = "ParmValue", required = true)
    protected String parmValue;

    /**
     * Gets the value of the parmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmName() {
        return parmName;
    }

    /**
     * Sets the value of the parmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmName(String value) {
        this.parmName = value;
    }

    /**
     * Gets the value of the parmValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmValue() {
        return parmValue;
    }

    /**
     * Sets the value of the parmValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmValue(String value) {
        this.parmValue = value;
    }

}
