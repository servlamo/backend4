
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
 *       &lt;all>
 *         &lt;element name="BankIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}BankId"/>
 *         &lt;element ref="{}Name" minOccurs="0"/>
 *         &lt;element ref="{}TaxId" minOccurs="0"/>
 *         &lt;element ref="{}TaxRegCode" minOccurs="0"/>
 *         &lt;element ref="{}RUS.CorrAcct" minOccurs="0"/>
 *         &lt;element ref="{}BranchId" minOccurs="0"/>
 *         &lt;element ref="{}BranchName" minOccurs="0"/>
 *         &lt;element ref="{}AgencyId" minOccurs="0"/>
 *         &lt;element ref="{}AgencyName" minOccurs="0"/>
 *         &lt;element name="PostAddr" type="{}Addr_Type" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "BankInfo")
public class BankInfo {

    @XmlElement(name = "BankIdType")
    protected String bankIdType;
    @XmlElement(name = "BankId", required = true)
    protected String bankId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "TaxRegCode")
    protected String taxRegCode;
    @XmlElement(name = "RUS.CorrAcct")
    protected String rusCorrAcct;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "BranchName")
    protected String branchName;
    @XmlElement(name = "AgencyId")
    protected String agencyId;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "PostAddr")
    protected AddrType postAddr;

    /**
     * Gets the value of the bankIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankIdType() {
        return bankIdType;
    }

    /**
     * Sets the value of the bankIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankIdType(String value) {
        this.bankIdType = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankId(String value) {
        this.bankId = value;
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
     * Gets the value of the rusCorrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSCorrAcct() {
        return rusCorrAcct;
    }

    /**
     * Sets the value of the rusCorrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSCorrAcct(String value) {
        this.rusCorrAcct = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
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

}
