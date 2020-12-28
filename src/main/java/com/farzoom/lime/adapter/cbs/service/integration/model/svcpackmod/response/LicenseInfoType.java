//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.05 at 07:25:36 PM EET 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.svcpackmod.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}LicenseType" minOccurs="0"/>
 *         &lt;element ref="{}LicenseNum" minOccurs="0"/>
 *         &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}Desc" minOccurs="0"/>
 *         &lt;element name="ActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseInfo_Type", propOrder = {

})
public class LicenseInfoType {

    @XmlElement(name = "LicenseType")
    protected String licenseType;
    @XmlElement(name = "LicenseNum")
    protected String licenseNum;
    @XmlElement(name = "StartDt")
    protected Date startDt;
    @XmlElement(name = "EndDt")
    protected Date endDt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "ActivityType")
    protected String activityType;
    @XmlElement(name = "ActivityTypeCode")
    protected String activityTypeCode;
    @XmlElement(name = "IssuedBy")
    protected String issuedBy;

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseType(String value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the licenseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNum() {
        return licenseNum;
    }

    /**
     * Sets the value of the licenseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNum(String value) {
        this.licenseNum = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDt(Date value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDt(Date value) {
        this.endDt = value;
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

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the activityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityTypeCode() {
        return activityTypeCode;
    }

    /**
     * Sets the value of the activityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityTypeCode(String value) {
        this.activityTypeCode = value;
    }

    /**
     * Gets the value of the issuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * Sets the value of the issuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedBy(String value) {
        this.issuedBy = value;
    }

}
