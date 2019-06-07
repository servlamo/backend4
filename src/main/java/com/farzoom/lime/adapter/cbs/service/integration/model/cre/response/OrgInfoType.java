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
import java.util.ArrayList;
import java.util.List;


/**
 * Тип информация об организации
 * 
 * <p>Java class for OrgInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}Primary" minOccurs="0"/>
 *         &lt;element ref="{}OrgId" minOccurs="0"/>
 *         &lt;element ref="{}OrgCode" minOccurs="0"/>
 *         &lt;element ref="{}Name" minOccurs="0"/>
 *         &lt;element ref="{}LegalName" minOccurs="0"/>
 *         &lt;element name="PostAddr" type="{}Addr_Type" minOccurs="0"/>
 *         &lt;element ref="{}ClassifierId" minOccurs="0"/>
 *         &lt;element ref="{}IndustId" minOccurs="0"/>
 *         &lt;element name="EmplCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}TaxId" minOccurs="0"/>
 *         &lt;element ref="{}StateRegPrimeNum" minOccurs="0"/>
 *         &lt;element ref="{}TaxRegCode" minOccurs="0"/>
 *         &lt;element name="PropertyForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelWithSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneNums" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}PhoneNum" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgInfo_Type", propOrder = {

})
public class OrgInfoType {

    @XmlElement(name = "Primary")
    protected Boolean primary;
    @XmlElement(name = "OrgId")
    protected String orgId;
    @XmlElement(name = "OrgCode")
    protected String orgCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "PostAddr")
    protected AddrType postAddr;
    @XmlElement(name = "ClassifierId")
    protected ClassifierId classifierId;
    @XmlElement(name = "IndustId")
    protected IndustId industId;
    @XmlElement(name = "EmplCount")
    protected String emplCount;
    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "StateRegPrimeNum")
    protected String stateRegPrimeNum;
    @XmlElement(name = "TaxRegCode")
    protected String taxRegCode;
    @XmlElement(name = "PropertyForm")
    protected String propertyForm;
    @XmlElement(name = "OwnCountry")
    protected String ownCountry;
    @XmlElement(name = "RelType")
    protected String relType;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "RelWithSP")
    protected String relWithSP;
    @XmlElement(name = "PhoneNums")
    protected OrgInfoType.PhoneNums phoneNums;

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
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setPostAddr(AddrType value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the classifierId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifierId }
     *     
     */
    public ClassifierId getClassifierId() {
        return classifierId;
    }

    /**
     * Sets the value of the classifierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifierId }
     *     
     */
    public void setClassifierId(ClassifierId value) {
        this.classifierId = value;
    }

    /**
     * Код отрасли/
     * Направление деятельности предприятия
     * 
     * @return
     *     possible object is
     *     {@link IndustId }
     *     
     */
    public IndustId getIndustId() {
        return industId;
    }

    /**
     * Sets the value of the industId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustId }
     *     
     */
    public void setIndustId(IndustId value) {
        this.industId = value;
    }

    /**
     * Gets the value of the emplCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplCount() {
        return emplCount;
    }

    /**
     * Sets the value of the emplCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplCount(String value) {
        this.emplCount = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the stateRegPrimeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegPrimeNum() {
        return stateRegPrimeNum;
    }

    /**
     * Sets the value of the stateRegPrimeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegPrimeNum(String value) {
        this.stateRegPrimeNum = value;
    }

    /**
     * Gets the value of the taxRegCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegCode() {
        return taxRegCode;
    }

    /**
     * Sets the value of the taxRegCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegCode(String value) {
        this.taxRegCode = value;
    }

    /**
     * Gets the value of the propertyForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyForm() {
        return propertyForm;
    }

    /**
     * Sets the value of the propertyForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyForm(String value) {
        this.propertyForm = value;
    }

    /**
     * Gets the value of the ownCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnCountry() {
        return ownCountry;
    }

    /**
     * Sets the value of the ownCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnCountry(String value) {
        this.ownCountry = value;
    }

    /**
     * Gets the value of the relType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelType() {
        return relType;
    }

    /**
     * Sets the value of the relType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelType(String value) {
        this.relType = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the relWithSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelWithSP() {
        return relWithSP;
    }

    /**
     * Sets the value of the relWithSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelWithSP(String value) {
        this.relWithSP = value;
    }

    /**
     * Gets the value of the phoneNums property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoType.PhoneNums }
     *     
     */
    public OrgInfoType.PhoneNums getPhoneNums() {
        return phoneNums;
    }

    /**
     * Sets the value of the phoneNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoType.PhoneNums }
     *     
     */
    public void setPhoneNums(OrgInfoType.PhoneNums value) {
        this.phoneNums = value;
    }


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
     *         &lt;element ref="{}PhoneNum" maxOccurs="unbounded"/>
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
        "phoneNum"
    })
    public static class PhoneNums {

        @XmlElement(name = "PhoneNum", required = true)
        protected List<PhoneNum> phoneNum;

        /**
         * Gets the value of the phoneNum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNum }
         * 
         * 
         */
        public List<PhoneNum> getPhoneNum() {
            if (phoneNum == null) {
                phoneNum = new ArrayList<PhoneNum>();
            }
            return this.phoneNum;
        }

    }

}
