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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardKind_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardKind_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{}CardKindName"/&gt;
 *         &lt;element ref="{}CardKindCode"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardKind_Type", propOrder = {

})
public class CardKindType {

    @XmlElement(name = "CardKindName", required = true)
    protected String cardKindName;
    @XmlElement(name = "CardKindCode", required = true)
    protected String cardKindCode;

    /**
     * Gets the value of the cardKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardKindName() {
        return cardKindName;
    }

    /**
     * Sets the value of the cardKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardKindName(String value) {
        this.cardKindName = value;
    }

    /**
     * Gets the value of the cardKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardKindCode() {
        return cardKindCode;
    }

    /**
     * Sets the value of the cardKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardKindCode(String value) {
        this.cardKindCode = value;
    }

}
