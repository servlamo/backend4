//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.19 at 11:25:25 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.afs.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о браке
 * 
 * <p>Java class for WeddingInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeddingInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RegDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="MarriageContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DivisionProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Childs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeddingInfo_Type", propOrder = {

})
public class WeddingInfoType {

    @XmlElement(name = "RegDt")
    protected Date regDt;
    @XmlElement(name = "MarriageContract")
    protected Boolean marriageContract;
    @XmlElement(name = "DivisionProperty")
    protected String divisionProperty;
    @XmlElement(name = "Childs")
    protected Boolean childs;

    /**
     * Gets the value of the regDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRegDt() {
        return regDt;
    }

    /**
     * Sets the value of the regDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRegDt(Date value) {
        this.regDt = value;
    }

    /**
     * Gets the value of the marriageContract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarriageContract() {
        return marriageContract;
    }

    /**
     * Sets the value of the marriageContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarriageContract(Boolean value) {
        this.marriageContract = value;
    }

    /**
     * Gets the value of the divisionProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionProperty() {
        return divisionProperty;
    }

    /**
     * Sets the value of the divisionProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionProperty(String value) {
        this.divisionProperty = value;
    }

    /**
     * Gets the value of the childs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChilds() {
        return childs;
    }

    /**
     * Sets the value of the childs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChilds(Boolean value) {
        this.childs = value;
    }

}
