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
 * <p>Java class for AfsIdentityCard_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AfsIdentityCard_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}Id" minOccurs="0"/>
 *         &lt;element ref="{}FraudCode" minOccurs="0"/>
 *         &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTypeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedByCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="ExpDt" type="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}Primary" minOccurs="0"/>
 *         &lt;element ref="{}Active" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AfsIdentityCard_Type", propOrder = {

})
public class AfsIdentityCardType {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "FraudCode")
    protected String fraudCode;
    @XmlElement(name = "IdType")
    protected String idType;
    @XmlElement(name = "IdTypeDetail")
    protected String idTypeDetail;
    @XmlElement(name = "IdSeries")
    protected String idSeries;
    @XmlElement(name = "IdNum")
    protected String idNum;
    @XmlElement(name = "IssuedBy")
    protected String issuedBy;
    @XmlElement(name = "IssuedByCode")
    protected String issuedByCode;
    @XmlElement(name = "IssueDt")
    protected Date issueDt;
    @XmlElement(name = "ExpDt")
    protected Date expDt;
    @XmlElement(name = "Primary")
    protected Boolean primary;
    @XmlElement(name = "Active")
    protected Boolean active;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the fraudCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudCode() {
        return fraudCode;
    }

    /**
     * Sets the value of the fraudCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudCode(String value) {
        this.fraudCode = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idTypeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypeDetail() {
        return idTypeDetail;
    }

    /**
     * Sets the value of the idTypeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypeDetail(String value) {
        this.idTypeDetail = value;
    }

    /**
     * Gets the value of the idSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSeries() {
        return idSeries;
    }

    /**
     * Sets the value of the idSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSeries(String value) {
        this.idSeries = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNum(String value) {
        this.idNum = value;
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

    /**
     * Gets the value of the issuedByCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedByCode() {
        return issuedByCode;
    }

    /**
     * Sets the value of the issuedByCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedByCode(String value) {
        this.issuedByCode = value;
    }

    /**
     * Gets the value of the issueDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getIssueDt() {
        return issueDt;
    }

    /**
     * Sets the value of the issueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setIssueDt(Date value) {
        this.issueDt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpDt(Date value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

}
