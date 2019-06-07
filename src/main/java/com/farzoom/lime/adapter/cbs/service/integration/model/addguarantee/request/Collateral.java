
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

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
 *         &lt;element name="CollateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}PersonInfo" minOccurs="0"/>
 *           &lt;element ref="{}OrgInfo" minOccurs="0"/>
 *           &lt;element name="CollateralDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
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
    "collateralType",
    "personInfo",
    "orgInfo",
    "collateralDesc",
    "curAmt"
})
@XmlRootElement(name = "Collateral")
public class Collateral {

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

}
