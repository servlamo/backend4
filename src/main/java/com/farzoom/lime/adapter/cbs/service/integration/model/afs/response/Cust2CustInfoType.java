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
 * <p>Java class for Cust2CustInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cust2CustInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LinkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LinkTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}PersonInfo" minOccurs="0"/>
 *         &lt;element name="Employment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AttornLetterInfo" type="{}AttornLetterInfo_Type" minOccurs="0"/>
 *         &lt;element ref="{}LivingTogether" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cust2CustInfo_Type", propOrder = {

})
public class Cust2CustInfoType {

    @XmlElement(name = "LinkType", required = true)
    protected String linkType;
    @XmlElement(name = "LinkTypeCode")
    protected String linkTypeCode;
    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "Employment")
    protected Boolean employment;
    @XmlElement(name = "AttornLetterInfo")
    protected AttornLetterInfoType attornLetterInfo;
    @XmlElement(name = "LivingTogether")
    protected Boolean livingTogether;

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the linkTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTypeCode() {
        return linkTypeCode;
    }

    /**
     * Sets the value of the linkTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTypeCode(String value) {
        this.linkTypeCode = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployment(Boolean value) {
        this.employment = value;
    }

    /**
     * Gets the value of the attornLetterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AttornLetterInfoType }
     *     
     */
    public AttornLetterInfoType getAttornLetterInfo() {
        return attornLetterInfo;
    }

    /**
     * Sets the value of the attornLetterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttornLetterInfoType }
     *     
     */
    public void setAttornLetterInfo(AttornLetterInfoType value) {
        this.attornLetterInfo = value;
    }

    /**
     * Gets the value of the livingTogether property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLivingTogether() {
        return livingTogether;
    }

    /**
     * Sets the value of the livingTogether property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLivingTogether(Boolean value) {
        this.livingTogether = value;
    }

}
