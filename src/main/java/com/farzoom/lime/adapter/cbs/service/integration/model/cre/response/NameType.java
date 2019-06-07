//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.11 at 07:50:00 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.cre.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SECOND_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIRTH_DATE" type="{}dateType" minOccurs="0"/>
 *         &lt;element name="CITIZENSHIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIRTH_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREV_LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREV_FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *         &lt;element name="MARITAL_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEATH_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPENDENTS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameType", propOrder = {
    "lastname",
    "firstname",
    "secondname",
    "gender",
    "birthdate",
    "citizenship",
    "birthplace",
    "prevlastname",
    "prevfirstname",
    "infosources",
    "extension",
    "maritalstatus",
    "deathflag",
    "dependents"
})
public class NameType {

    @XmlElement(name = "LAST_NAME")
    protected String lastname;
    @XmlElement(name = "FIRST_NAME")
    protected String firstname;
    @XmlElement(name = "SECOND_NAME")
    protected String secondname;
    @XmlElement(name = "GENDER")
    protected String gender;
    @XmlElement(name = "BIRTH_DATE")
    protected String birthdate;
    @XmlElement(name = "CITIZENSHIP")
    protected String citizenship;
    @XmlElement(name = "BIRTH_PLACE")
    protected String birthplace;
    @XmlElement(name = "PREV_LAST_NAME")
    protected String prevlastname;
    @XmlElement(name = "PREV_FIRST_NAME")
    protected String prevfirstname;
    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;
    @XmlElement(name = "MARITAL_STATUS")
    protected String maritalstatus;
    @XmlElement(name = "DEATH_FLAG")
    protected String deathflag;
    @XmlElement(name = "DEPENDENTS")
    protected Integer dependents;

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the secondname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECONDNAME() {
        return secondname;
    }

    /**
     * Sets the value of the secondname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECONDNAME(String value) {
        this.secondname = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENDER() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENDER(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHDATE() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHDATE(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITIZENSHIP() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITIZENSHIP(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the birthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHPLACE() {
        return birthplace;
    }

    /**
     * Sets the value of the birthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHPLACE(String value) {
        this.birthplace = value;
    }

    /**
     * Gets the value of the prevlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVLASTNAME() {
        return prevlastname;
    }

    /**
     * Sets the value of the prevlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVLASTNAME(String value) {
        this.prevlastname = value;
    }

    /**
     * Gets the value of the prevfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREVFIRSTNAME() {
        return prevfirstname;
    }

    /**
     * Sets the value of the prevfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREVFIRSTNAME(String value) {
        this.prevfirstname = value;
    }

    /**
     * Gets the value of the infosources property.
     * 
     * @return
     *     possible object is
     *     {@link InfoSourcesType }
     *     
     */
    public InfoSourcesType getINFOSOURCES() {
        return infosources;
    }

    /**
     * Sets the value of the infosources property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSourcesType }
     *     
     */
    public void setINFOSOURCES(InfoSourcesType value) {
        this.infosources = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEXTENSION(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the maritalstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARITALSTATUS() {
        return maritalstatus;
    }

    /**
     * Sets the value of the maritalstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARITALSTATUS(String value) {
        this.maritalstatus = value;
    }

    /**
     * Gets the value of the deathflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEATHFLAG() {
        return deathflag;
    }

    /**
     * Sets the value of the deathflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEATHFLAG(String value) {
        this.deathflag = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDEPENDENTS() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDEPENDENTS(Integer value) {
        this.dependents = value;
    }

}
