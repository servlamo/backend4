
package com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}Primary"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}LegalName"/>
 *         &lt;element name="PostAddr" type="{}Addr_Type"/>
 *         &lt;element ref="{}ClassifierId"/>
 *         &lt;element ref="{}IndustId" minOccurs="0"/>
 *         &lt;element name="EmplCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}StateRegPrimeNum" minOccurs="0"/>
 *         &lt;element ref="{}TaxRegCode" minOccurs="0"/>
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
    protected boolean primary;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "LegalName", required = true)
    protected String legalName;
    @XmlElement(name = "PostAddr", required = true)
    protected AddrType postAddr;
    @XmlElement(name = "ClassifierId", required = true)
    protected ClassifierId classifierId;
    @XmlElement(name = "IndustId")
    protected IndustId industId;
    @XmlElement(name = "EmplCount")
    protected String emplCount;
    @XmlElement(name = "StateRegPrimeNum")
    protected String stateRegPrimeNum;
    @XmlElement(name = "TaxRegCode")
    protected String taxRegCode;

    /**
     * Gets the value of the primary property.
     * 
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(boolean value) {
        this.primary = value;
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
     * Gets the value of the industId property.
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

}
