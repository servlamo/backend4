//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.11 at 07:20:57 AM MSK
//


package com.farzoom.lime.adapter.cbs.service.integration.model.cre.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о направлении аккредитации
 * 
 * <p>Java class for AccrdtnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccrdtnInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}AccrdtnCode"/>
 *         &lt;element ref="{}AccrdtnName"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccrdtnInfo_Type", propOrder = {

})
public class AccrdtnInfoType {

    @XmlElement(name = "AccrdtnCode", required = true)
    protected String accrdtnCode;
    @XmlElement(name = "AccrdtnName", required = true)
    protected String accrdtnName;

    /**
     * Gets the value of the accrdtnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrdtnCode() {
        return accrdtnCode;
    }

    /**
     * Sets the value of the accrdtnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrdtnCode(String value) {
        this.accrdtnCode = value;
    }

    /**
     * Gets the value of the accrdtnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrdtnName() {
        return accrdtnName;
    }

    /**
     * Sets the value of the accrdtnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrdtnName(String value) {
        this.accrdtnName = value;
    }

}
