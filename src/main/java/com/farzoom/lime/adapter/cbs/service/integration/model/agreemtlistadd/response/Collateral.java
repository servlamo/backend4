//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.15 at 03:43:33 PM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.agreemtlistadd.response;

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
 *       &lt;sequence>
 *         &lt;element name="CollateralId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}PersonInfo" minOccurs="0"/>
 *           &lt;element ref="{}OrgInfo" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CollateralDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
 *         &lt;element name="EstimateAmt" type="{}CurrencyAmount" minOccurs="0"/>
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
    "collateralId",
    "collateralType",
    "personInfo",
    "orgInfo",
    "collateralDesc",
    "curAmt",
    "estimateAmt"
})
@XmlRootElement(name = "Collateral")
public class Collateral {

    @XmlElement(name = "CollateralId")
    protected String collateralId;
    @XmlElement(name = "CollateralType")
    protected String collateralType;
    @XmlElement(name = "PersonInfo")
    protected PersonInfo personInfo;
    @XmlElement(name = "OrgInfo")
    protected OrgInfoType orgInfo;
    @XmlElement(name = "CollateralDesc")
    protected String collateralDesc;
    @XmlElement(name = "CurAmt", required = true)
    protected CurrencyAmount curAmt;
    @XmlElement(name = "EstimateAmt")
    protected CurrencyAmount estimateAmt;

    /**
     * Gets the value of the collateralId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralId() {
        return collateralId;
    }

    /**
     * Sets the value of the collateralId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralId(String value) {
        this.collateralId = value;
    }

    /**
     * Gets the value of the collateralType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralType(String value) {
        this.collateralType = value;
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
     * Gets the value of the orgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoType }
     *     
     */
    public OrgInfoType getOrgInfo() {
        return orgInfo;
    }

    /**
     * Sets the value of the orgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoType }
     *     
     */
    public void setOrgInfo(OrgInfoType value) {
        this.orgInfo = value;
    }

    /**
     * Gets the value of the collateralDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralDesc() {
        return collateralDesc;
    }

    /**
     * Sets the value of the collateralDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralDesc(String value) {
        this.collateralDesc = value;
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
     * Gets the value of the estimateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getEstimateAmt() {
        return estimateAmt;
    }

    /**
     * Sets the value of the estimateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setEstimateAmt(CurrencyAmount value) {
        this.estimateAmt = value;
    }

}
