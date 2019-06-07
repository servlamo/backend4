
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for OrgInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgInfo_CType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}OrgId" minOccurs="0"/>
 *         &lt;element ref="{}Name" minOccurs="0"/>
 *         &lt;element ref="{}LegalName" minOccurs="0"/>
 *         &lt;element ref="{}NameEn" minOccurs="0"/>
 *         &lt;element ref="{}LegalNameEn" minOccurs="0"/>
 *         &lt;element ref="{}Citizenship" minOccurs="0"/>
 *         &lt;element ref="{}Resident" minOccurs="0"/>
 *         &lt;element name="CurResident" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FATCA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClassifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}ClassifierId" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}StateRegNum" minOccurs="0"/>
 *         &lt;element ref="{}TaxId" minOccurs="0"/>
 *         &lt;element ref="{}TaxRegCode" minOccurs="0"/>
 *         &lt;element name="TaxRegAddInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}TaxRegCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}StateRegPrimeNum" minOccurs="0"/>
 *         &lt;element ref="{}StateRegDt" minOccurs="0"/>
 *         &lt;element ref="{}StateRegPlace" minOccurs="0"/>
 *         &lt;element ref="{}StateRegBodyCode" minOccurs="0"/>
 *         &lt;element name="StateRegNumPrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateRegPrevDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="StateRegPlaceAddr" type="{}Addr_Type" minOccurs="0"/>
 *         &lt;element ref="{}TaxOfficeCode" minOccurs="0"/>
 *         &lt;element name="TaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateRegPlacePrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovernmentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}AuthCapCurAmt" minOccurs="0"/>
 *         &lt;element name="AuthCapPayCurAmt" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element ref="{}ContactList" minOccurs="0"/>
 *         &lt;element name="LicenseList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LicenseRec" type="{}LicenseInfo_Type" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StateList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StateRec" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
 *                             &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
 *                             &lt;element name="StateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{}Desc" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}IdentityCards" minOccurs="0"/>
 *         &lt;element ref="{}BankInfo" minOccurs="0"/>
 *         &lt;element name="EmplCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyForm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrgType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="OrgTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CheckList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CheckRec" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="CheckType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CheckCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="CheckDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IndustId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="IndustCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IndustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RegRec" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RegCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegDt" type="{}Date" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}RequestId" minOccurs="0"/>
 *                   &lt;element name="CashCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CashCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="CertNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{}Channel" minOccurs="0"/>
 *                   &lt;element name="Tender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{}Login" minOccurs="0"/>
 *                   &lt;element name="Goodwill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessRelations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RelDt" type="{}Date" minOccurs="0"/>
 *                   &lt;element name="SourceCash" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="FinancialSituation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrgStrat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AuthCapNonResInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ManagementDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmplList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EmplRec" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element ref="{}EmplId"/>
 *                                       &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelPersons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelPerson" type="{}RelPerson_CType" maxOccurs="unbounded"/>
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
@XmlType(name = "OrgInfo_CType", propOrder = {

})
public class OrgInfoCType {

    @XmlElement(name = "OrgId")
    protected String orgId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "NameEn")
    protected String nameEn;
    @XmlElement(name = "LegalNameEn")
    protected String legalNameEn;
    @XmlElement(name = "Citizenship")
    protected Citizenship citizenship;
    @XmlElement(name = "Resident", defaultValue = "true")
    protected Boolean resident;
    @XmlElement(name = "CurResident")
    protected Boolean curResident;
    @XmlElement(name = "FATCA")
    protected Boolean fatca;
    @XmlElement(name = "ClassifierList")
    protected OrgInfoCType.ClassifierList classifierList;
    @XmlElement(name = "StateRegNum")
    protected String stateRegNum;
    @XmlElement(name = "TaxId")
    protected String taxId;
    @XmlElement(name = "TaxRegCode")
    protected String taxRegCode;
    @XmlElement(name = "TaxRegAddInfo")
    protected OrgInfoCType.TaxRegAddInfo taxRegAddInfo;
    @XmlElement(name = "StateRegPrimeNum")
    protected String stateRegPrimeNum;
    @XmlElement(name = "StateRegDt")
    protected Date stateRegDt;
    @XmlElement(name = "StateRegPlace")
    protected String stateRegPlace;
    @XmlElement(name = "StateRegBodyCode")
    protected String stateRegBodyCode;
    @XmlElement(name = "StateRegNumPrev")
    protected String stateRegNumPrev;
    @XmlElement(name = "StateRegPrevDt")
    protected Date stateRegPrevDt;
    @XmlElement(name = "StateRegPlaceAddr")
    protected AddrType stateRegPlaceAddr;
    @XmlElement(name = "TaxOfficeCode")
    protected String taxOfficeCode;
    @XmlElement(name = "TaxOfficeName")
    protected String taxOfficeName;
    @XmlElement(name = "StateRegPlacePrev")
    protected String stateRegPlacePrev;
    @XmlElement(name = "GovernmentDesc")
    protected String governmentDesc;
    @XmlElement(name = "AuthCapCurAmt")
    protected CurrencyAmount authCapCurAmt;
    @XmlElement(name = "AuthCapPayCurAmt")
    protected CurrencyAmount authCapPayCurAmt;
    @XmlElement(name = "ContactList")
    protected ContactList contactList;
    @XmlElement(name = "LicenseList")
    protected OrgInfoCType.LicenseList licenseList;
    @XmlElement(name = "StateList")
    protected OrgInfoCType.StateList stateList;
    @XmlElement(name = "IdentityCards")
    protected IdentityCards identityCards;
    @XmlElement(name = "BankInfo")
    protected BankInfo bankInfo;
    @XmlElement(name = "EmplCount")
    protected String emplCount;
    @XmlElement(name = "PropertyForm")
    protected OrgInfoCType.PropertyForm propertyForm;
    @XmlElement(name = "OrgType")
    protected OrgInfoCType.OrgType orgType;
    @XmlElement(name = "CheckList")
    protected OrgInfoCType.CheckList checkList;
    @XmlElement(name = "IndustId")
    protected OrgInfoCType.IndustId industId;
    @XmlElement(name = "RegList")
    protected OrgInfoCType.RegList regList;
    @XmlElement(name = "AddInfo")
    protected OrgInfoCType.AddInfo addInfo;
    @XmlElement(name = "RelPersons")
    protected OrgInfoCType.RelPersons relPersons;

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
     * Gets the value of the nameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the value of the nameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
    }

    /**
     * Gets the value of the legalNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalNameEn() {
        return legalNameEn;
    }

    /**
     * Sets the value of the legalNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalNameEn(String value) {
        this.legalNameEn = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link Citizenship }
     *     
     */
    public Citizenship getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citizenship }
     *     
     */
    public void setCitizenship(Citizenship value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the resident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResident(Boolean value) {
        this.resident = value;
    }

    /**
     * Gets the value of the curResident property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurResident() {
        return curResident;
    }

    /**
     * Sets the value of the curResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurResident(Boolean value) {
        this.curResident = value;
    }

    /**
     * Gets the value of the fatca property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFATCA() {
        return fatca;
    }

    /**
     * Sets the value of the fatca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFATCA(Boolean value) {
        this.fatca = value;
    }

    /**
     * Gets the value of the classifierList property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.ClassifierList }
     *     
     */
    public OrgInfoCType.ClassifierList getClassifierList() {
        return classifierList;
    }

    /**
     * Sets the value of the classifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.ClassifierList }
     *     
     */
    public void setClassifierList(OrgInfoCType.ClassifierList value) {
        this.classifierList = value;
    }

    /**
     * Gets the value of the stateRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegNum() {
        return stateRegNum;
    }

    /**
     * Sets the value of the stateRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegNum(String value) {
        this.stateRegNum = value;
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
     * Gets the value of the taxRegAddInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.TaxRegAddInfo }
     *     
     */
    public OrgInfoCType.TaxRegAddInfo getTaxRegAddInfo() {
        return taxRegAddInfo;
    }

    /**
     * Sets the value of the taxRegAddInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.TaxRegAddInfo }
     *     
     */
    public void setTaxRegAddInfo(OrgInfoCType.TaxRegAddInfo value) {
        this.taxRegAddInfo = value;
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
     * Gets the value of the stateRegDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStateRegDt() {
        return stateRegDt;
    }

    /**
     * Sets the value of the stateRegDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStateRegDt(Date value) {
        this.stateRegDt = value;
    }

    /**
     * Gets the value of the stateRegPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegPlace() {
        return stateRegPlace;
    }

    /**
     * Sets the value of the stateRegPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegPlace(String value) {
        this.stateRegPlace = value;
    }

    /**
     * Gets the value of the stateRegBodyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegBodyCode() {
        return stateRegBodyCode;
    }

    /**
     * Sets the value of the stateRegBodyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegBodyCode(String value) {
        this.stateRegBodyCode = value;
    }

    /**
     * Gets the value of the stateRegNumPrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegNumPrev() {
        return stateRegNumPrev;
    }

    /**
     * Sets the value of the stateRegNumPrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegNumPrev(String value) {
        this.stateRegNumPrev = value;
    }

    /**
     * Gets the value of the stateRegPrevDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStateRegPrevDt() {
        return stateRegPrevDt;
    }

    /**
     * Sets the value of the stateRegPrevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStateRegPrevDt(Date value) {
        this.stateRegPrevDt = value;
    }

    /**
     * Gets the value of the stateRegPlaceAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrType }
     *     
     */
    public AddrType getStateRegPlaceAddr() {
        return stateRegPlaceAddr;
    }

    /**
     * Sets the value of the stateRegPlaceAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrType }
     *     
     */
    public void setStateRegPlaceAddr(AddrType value) {
        this.stateRegPlaceAddr = value;
    }

    /**
     * Gets the value of the taxOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOfficeCode() {
        return taxOfficeCode;
    }

    /**
     * Sets the value of the taxOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOfficeCode(String value) {
        this.taxOfficeCode = value;
    }

    /**
     * Gets the value of the taxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOfficeName() {
        return taxOfficeName;
    }

    /**
     * Sets the value of the taxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOfficeName(String value) {
        this.taxOfficeName = value;
    }

    /**
     * Gets the value of the stateRegPlacePrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegPlacePrev() {
        return stateRegPlacePrev;
    }

    /**
     * Sets the value of the stateRegPlacePrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegPlacePrev(String value) {
        this.stateRegPlacePrev = value;
    }

    /**
     * Gets the value of the governmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentDesc() {
        return governmentDesc;
    }

    /**
     * Sets the value of the governmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentDesc(String value) {
        this.governmentDesc = value;
    }

    /**
     * Gets the value of the authCapCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getAuthCapCurAmt() {
        return authCapCurAmt;
    }

    /**
     * Sets the value of the authCapCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setAuthCapCurAmt(CurrencyAmount value) {
        this.authCapCurAmt = value;
    }

    /**
     * Gets the value of the authCapPayCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getAuthCapPayCurAmt() {
        return authCapPayCurAmt;
    }

    /**
     * Sets the value of the authCapPayCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setAuthCapPayCurAmt(CurrencyAmount value) {
        this.authCapPayCurAmt = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactList }
     *     
     */
    public ContactList getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactList }
     *     
     */
    public void setContactList(ContactList value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the licenseList property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.LicenseList }
     *     
     */
    public OrgInfoCType.LicenseList getLicenseList() {
        return licenseList;
    }

    /**
     * Sets the value of the licenseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.LicenseList }
     *     
     */
    public void setLicenseList(OrgInfoCType.LicenseList value) {
        this.licenseList = value;
    }

    /**
     * Gets the value of the stateList property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.StateList }
     *     
     */
    public OrgInfoCType.StateList getStateList() {
        return stateList;
    }

    /**
     * Sets the value of the stateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.StateList }
     *     
     */
    public void setStateList(OrgInfoCType.StateList value) {
        this.stateList = value;
    }

    /**
     * Gets the value of the identityCards property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityCards }
     *     
     */
    public IdentityCards getIdentityCards() {
        return identityCards;
    }

    /**
     * Sets the value of the identityCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityCards }
     *     
     */
    public void setIdentityCards(IdentityCards value) {
        this.identityCards = value;
    }

    /**
     * Gets the value of the bankInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BankInfo }
     *     
     */
    public BankInfo getBankInfo() {
        return bankInfo;
    }

    /**
     * Sets the value of the bankInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInfo }
     *     
     */
    public void setBankInfo(BankInfo value) {
        this.bankInfo = value;
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
     * Gets the value of the propertyForm property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.PropertyForm }
     *     
     */
    public OrgInfoCType.PropertyForm getPropertyForm() {
        return propertyForm;
    }

    /**
     * Sets the value of the propertyForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.PropertyForm }
     *     
     */
    public void setPropertyForm(OrgInfoCType.PropertyForm value) {
        this.propertyForm = value;
    }

    /**
     * Gets the value of the orgType property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.OrgType }
     *     
     */
    public OrgInfoCType.OrgType getOrgType() {
        return orgType;
    }

    /**
     * Sets the value of the orgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.OrgType }
     *     
     */
    public void setOrgType(OrgInfoCType.OrgType value) {
        this.orgType = value;
    }

    /**
     * Gets the value of the checkList property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.CheckList }
     *     
     */
    public OrgInfoCType.CheckList getCheckList() {
        return checkList;
    }

    /**
     * Sets the value of the checkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.CheckList }
     *     
     */
    public void setCheckList(OrgInfoCType.CheckList value) {
        this.checkList = value;
    }

    /**
     * Gets the value of the industId property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.IndustId }
     *     
     */
    public OrgInfoCType.IndustId getIndustId() {
        return industId;
    }

    /**
     * Sets the value of the industId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.IndustId }
     *     
     */
    public void setIndustId(OrgInfoCType.IndustId value) {
        this.industId = value;
    }

    /**
     * Gets the value of the regList property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.RegList }
     *     
     */
    public OrgInfoCType.RegList getRegList() {
        return regList;
    }

    /**
     * Sets the value of the regList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.RegList }
     *     
     */
    public void setRegList(OrgInfoCType.RegList value) {
        this.regList = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.AddInfo }
     *     
     */
    public OrgInfoCType.AddInfo getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.AddInfo }
     *     
     */
    public void setAddInfo(OrgInfoCType.AddInfo value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the relPersons property.
     * 
     * @return
     *     possible object is
     *     {@link OrgInfoCType.RelPersons }
     *     
     */
    public OrgInfoCType.RelPersons getRelPersons() {
        return relPersons;
    }

    /**
     * Sets the value of the relPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgInfoCType.RelPersons }
     *     
     */
    public void setRelPersons(OrgInfoCType.RelPersons value) {
        this.relPersons = value;
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
     *       &lt;all>
     *         &lt;element ref="{}RequestId" minOccurs="0"/>
     *         &lt;element name="CashCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CashCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="CertNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{}Channel" minOccurs="0"/>
     *         &lt;element name="Tender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{}Login" minOccurs="0"/>
     *         &lt;element name="Goodwill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessRelations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RelDt" type="{}Date" minOccurs="0"/>
     *         &lt;element name="SourceCash" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="FinancialSituation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgStrat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AuthCapNonResInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ManagementDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmplList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EmplRec" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element ref="{}EmplId"/>
     *                             &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {

    })
    public static class AddInfo {

        @XmlElement(name = "RequestId")
        protected String requestId;
        @XmlElement(name = "CashCode")
        protected String cashCode;
        @XmlElement(name = "CashCount")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger cashCount;
        @XmlElement(name = "CertNum")
        protected String certNum;
        @XmlElement(name = "Channel")
        protected String channel;
        @XmlElement(name = "Tender")
        protected Boolean tender;
        @XmlElement(name = "Login")
        protected String login;
        @XmlElement(name = "Goodwill")
        protected String goodwill;
        @XmlElement(name = "BusinessRelations")
        protected String businessRelations;
        @XmlElement(name = "RelDt")
        protected Date relDt;
        @XmlElement(name = "SourceCash")
        protected Object sourceCash;
        @XmlElement(name = "FinancialSituation")
        protected String financialSituation;
        @XmlElement(name = "OrgStrat")
        protected Boolean orgStrat;
        @XmlElement(name = "Purpose")
        protected String purpose;
        @XmlElement(name = "AuthCapNonResInt")
        protected String authCapNonResInt;
        @XmlElement(name = "ManagementDesc")
        protected String managementDesc;
        @XmlElement(name = "EmplList")
        protected OrgInfoCType.AddInfo.EmplList emplList;

        /**
         * Gets the value of the requestId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestId() {
            return requestId;
        }

        /**
         * Sets the value of the requestId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestId(String value) {
            this.requestId = value;
        }

        /**
         * Gets the value of the cashCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCashCode() {
            return cashCode;
        }

        /**
         * Sets the value of the cashCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCashCode(String value) {
            this.cashCode = value;
        }

        /**
         * Gets the value of the cashCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCashCount() {
            return cashCount;
        }

        /**
         * Sets the value of the cashCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCashCount(BigInteger value) {
            this.cashCount = value;
        }

        /**
         * Gets the value of the certNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertNum() {
            return certNum;
        }

        /**
         * Sets the value of the certNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertNum(String value) {
            this.certNum = value;
        }

        /**
         * Gets the value of the channel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChannel() {
            return channel;
        }

        /**
         * Sets the value of the channel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChannel(String value) {
            this.channel = value;
        }

        /**
         * Gets the value of the tender property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTender() {
            return tender;
        }

        /**
         * Sets the value of the tender property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTender(Boolean value) {
            this.tender = value;
        }

        /**
         * Gets the value of the login property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogin() {
            return login;
        }

        /**
         * Sets the value of the login property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogin(String value) {
            this.login = value;
        }

        /**
         * Gets the value of the goodwill property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGoodwill() {
            return goodwill;
        }

        /**
         * Sets the value of the goodwill property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGoodwill(String value) {
            this.goodwill = value;
        }

        /**
         * Gets the value of the businessRelations property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessRelations() {
            return businessRelations;
        }

        /**
         * Sets the value of the businessRelations property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessRelations(String value) {
            this.businessRelations = value;
        }

        /**
         * Gets the value of the relDt property.
         * 
         * @return
         *     possible object is
         *     {@link Date }
         *     
         */
        public Date getRelDt() {
            return relDt;
        }

        /**
         * Sets the value of the relDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Date }
         *     
         */
        public void setRelDt(Date value) {
            this.relDt = value;
        }

        /**
         * Gets the value of the sourceCash property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSourceCash() {
            return sourceCash;
        }

        /**
         * Sets the value of the sourceCash property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSourceCash(Object value) {
            this.sourceCash = value;
        }

        /**
         * Gets the value of the financialSituation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialSituation() {
            return financialSituation;
        }

        /**
         * Sets the value of the financialSituation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialSituation(String value) {
            this.financialSituation = value;
        }

        /**
         * Gets the value of the orgStrat property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOrgStrat() {
            return orgStrat;
        }

        /**
         * Sets the value of the orgStrat property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOrgStrat(Boolean value) {
            this.orgStrat = value;
        }

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurpose(String value) {
            this.purpose = value;
        }

        /**
         * Gets the value of the authCapNonResInt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthCapNonResInt() {
            return authCapNonResInt;
        }

        /**
         * Sets the value of the authCapNonResInt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthCapNonResInt(String value) {
            this.authCapNonResInt = value;
        }

        /**
         * Gets the value of the managementDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getManagementDesc() {
            return managementDesc;
        }

        /**
         * Sets the value of the managementDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setManagementDesc(String value) {
            this.managementDesc = value;
        }

        /**
         * Gets the value of the emplList property.
         * 
         * @return
         *     possible object is
         *     {@link OrgInfoCType.AddInfo.EmplList }
         *     
         */
        public OrgInfoCType.AddInfo.EmplList getEmplList() {
            return emplList;
        }

        /**
         * Sets the value of the emplList property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgInfoCType.AddInfo.EmplList }
         *     
         */
        public void setEmplList(OrgInfoCType.AddInfo.EmplList value) {
            this.emplList = value;
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
         *         &lt;element name="EmplRec" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element ref="{}EmplId"/>
         *                   &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "emplRec"
        })
        public static class EmplList {

            @XmlElement(name = "EmplRec", required = true)
            protected List<OrgInfoCType.AddInfo.EmplList.EmplRec> emplRec;

            /**
             * Gets the value of the emplRec property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the emplRec property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmplRec().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrgInfoCType.AddInfo.EmplList.EmplRec }
             * 
             * 
             */
            public List<OrgInfoCType.AddInfo.EmplList.EmplRec> getEmplRec() {
                if (emplRec == null) {
                    emplRec = new ArrayList<OrgInfoCType.AddInfo.EmplList.EmplRec>();
                }
                return this.emplRec;
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
             *       &lt;all>
             *         &lt;element ref="{}EmplId"/>
             *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            public static class EmplRec {

                @XmlElement(name = "EmplId", required = true)
                protected String emplId;
                @XmlElement(name = "Role")
                protected String role;

                /**
                 * Gets the value of the emplId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmplId() {
                    return emplId;
                }

                /**
                 * Sets the value of the emplId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmplId(String value) {
                    this.emplId = value;
                }

                /**
                 * Gets the value of the role property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRole() {
                    return role;
                }

                /**
                 * Sets the value of the role property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRole(String value) {
                    this.role = value;
                }

            }

        }

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
     *         &lt;element name="CheckRec" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="CheckType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CheckCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="CheckDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "checkRec"
    })
    public static class CheckList {

        @XmlElement(name = "CheckRec", required = true)
        protected List<OrgInfoCType.CheckList.CheckRec> checkRec;

        /**
         * Gets the value of the checkRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the checkRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCheckRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrgInfoCType.CheckList.CheckRec }
         * 
         * 
         */
        public List<OrgInfoCType.CheckList.CheckRec> getCheckRec() {
            if (checkRec == null) {
                checkRec = new ArrayList<OrgInfoCType.CheckList.CheckRec>();
            }
            return this.checkRec;
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
         *       &lt;all>
         *         &lt;element name="CheckType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CheckCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="CheckDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class CheckRec {

            @XmlElement(name = "CheckType", required = true)
            protected String checkType;
            @XmlElement(name = "CheckCode", required = true)
            protected String checkCode;
            @XmlElement(name = "CheckDesc")
            protected String checkDesc;

            /**
             * Gets the value of the checkType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckType() {
                return checkType;
            }

            /**
             * Sets the value of the checkType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckType(String value) {
                this.checkType = value;
            }

            /**
             * Gets the value of the checkCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckCode() {
                return checkCode;
            }

            /**
             * Sets the value of the checkCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckCode(String value) {
                this.checkCode = value;
            }

            /**
             * Gets the value of the checkDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckDesc() {
                return checkDesc;
            }

            /**
             * Sets the value of the checkDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckDesc(String value) {
                this.checkDesc = value;
            }

        }

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
     *         &lt;element ref="{}ClassifierId" maxOccurs="unbounded"/>
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
        "classifierId"
    })
    public static class ClassifierList {

        @XmlElement(name = "ClassifierId", required = true)
        protected List<ClassifierId> classifierId;

        /**
         * Gets the value of the classifierId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classifierId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassifierId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClassifierId }
         * 
         * 
         */
        public List<ClassifierId> getClassifierId() {
            if (classifierId == null) {
                classifierId = new ArrayList<ClassifierId>();
            }
            return this.classifierId;
        }

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
     *       &lt;all>
     *         &lt;element name="IndustCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IndustName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class IndustId {

        @XmlElement(name = "IndustCode", required = true)
        protected String industCode;
        @XmlElement(name = "IndustName")
        protected String industName;

        /**
         * Gets the value of the industCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndustCode() {
            return industCode;
        }

        /**
         * Sets the value of the industCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndustCode(String value) {
            this.industCode = value;
        }

        /**
         * Gets the value of the industName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndustName() {
            return industName;
        }

        /**
         * Sets the value of the industName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndustName(String value) {
            this.industName = value;
        }

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
     *         &lt;element name="LicenseRec" type="{}LicenseInfo_Type" maxOccurs="unbounded"/>
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
        "licenseRec"
    })
    public static class LicenseList {

        @XmlElement(name = "LicenseRec", required = true)
        protected List<LicenseInfoType> licenseRec;

        /**
         * Gets the value of the licenseRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the licenseRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLicenseRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LicenseInfoType }
         * 
         * 
         */
        public List<LicenseInfoType> getLicenseRec() {
            if (licenseRec == null) {
                licenseRec = new ArrayList<LicenseInfoType>();
            }
            return this.licenseRec;
        }

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
     *       &lt;all>
     *         &lt;element name="OrgTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrgTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class OrgType {

        @XmlElement(name = "OrgTypeCode")
        protected String orgTypeCode;
        @XmlElement(name = "OrgTypeName")
        protected String orgTypeName;

        /**
         * Gets the value of the orgTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgTypeCode() {
            return orgTypeCode;
        }

        /**
         * Sets the value of the orgTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgTypeCode(String value) {
            this.orgTypeCode = value;
        }

        /**
         * Gets the value of the orgTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgTypeName() {
            return orgTypeName;
        }

        /**
         * Sets the value of the orgTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgTypeName(String value) {
            this.orgTypeName = value;
        }

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
     *       &lt;all>
     *         &lt;element name="PropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class PropertyForm {

        @XmlElement(name = "PropertyCode")
        protected String propertyCode;
        @XmlElement(name = "PropertyName")
        protected String propertyName;

        /**
         * Gets the value of the propertyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyCode() {
            return propertyCode;
        }

        /**
         * Sets the value of the propertyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyCode(String value) {
            this.propertyCode = value;
        }

        /**
         * Gets the value of the propertyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertyName() {
            return propertyName;
        }

        /**
         * Sets the value of the propertyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertyName(String value) {
            this.propertyName = value;
        }

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
     *         &lt;element name="RegRec" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RegCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegDt" type="{}Date" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "regRec"
    })
    public static class RegList {

        @XmlElement(name = "RegRec", required = true)
        protected List<OrgInfoCType.RegList.RegRec> regRec;

        /**
         * Gets the value of the regRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrgInfoCType.RegList.RegRec }
         * 
         * 
         */
        public List<OrgInfoCType.RegList.RegRec> getRegRec() {
            if (regRec == null) {
                regRec = new ArrayList<OrgInfoCType.RegList.RegRec>();
            }
            return this.regRec;
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
         *       &lt;all>
         *         &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RegCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegDt" type="{}Date" minOccurs="0"/>
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
        public static class RegRec {

            @XmlElement(name = "RegType", required = true)
            protected String regType;
            @XmlElement(name = "RegCode")
            protected String regCode;
            @XmlElement(name = "RegName")
            protected String regName;
            @XmlElement(name = "RegSeries")
            protected String regSeries;
            @XmlElement(name = "RegNum")
            protected String regNum;
            @XmlElement(name = "RegDt")
            protected Date regDt;

            /**
             * Gets the value of the regType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegType() {
                return regType;
            }

            /**
             * Sets the value of the regType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegType(String value) {
                this.regType = value;
            }

            /**
             * Gets the value of the regCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegCode() {
                return regCode;
            }

            /**
             * Sets the value of the regCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegCode(String value) {
                this.regCode = value;
            }

            /**
             * Gets the value of the regName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegName() {
                return regName;
            }

            /**
             * Sets the value of the regName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegName(String value) {
                this.regName = value;
            }

            /**
             * Gets the value of the regSeries property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegSeries() {
                return regSeries;
            }

            /**
             * Sets the value of the regSeries property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegSeries(String value) {
                this.regSeries = value;
            }

            /**
             * Gets the value of the regNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegNum() {
                return regNum;
            }

            /**
             * Sets the value of the regNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegNum(String value) {
                this.regNum = value;
            }

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

        }

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
     *         &lt;element name="RelPerson" type="{}RelPerson_CType" maxOccurs="unbounded"/>
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
        "relPerson"
    })
    public static class RelPersons {

        @XmlElement(name = "RelPerson", required = true)
        protected List<RelPersonCType> relPerson;

        /**
         * Gets the value of the relPerson property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relPerson property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelPersonCType }
         * 
         * 
         */
        public List<RelPersonCType> getRelPerson() {
            if (relPerson == null) {
                relPerson = new ArrayList<RelPersonCType>();
            }
            return this.relPerson;
        }

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
     *         &lt;element name="StateRec" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
     *                   &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
     *                   &lt;element name="StateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{}Desc" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "stateRec"
    })
    public static class StateList {

        @XmlElement(name = "StateRec", required = true)
        protected List<OrgInfoCType.StateList.StateRec> stateRec;

        /**
         * Gets the value of the stateRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stateRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStateRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrgInfoCType.StateList.StateRec }
         * 
         * 
         */
        public List<OrgInfoCType.StateList.StateRec> getStateRec() {
            if (stateRec == null) {
                stateRec = new ArrayList<OrgInfoCType.StateList.StateRec>();
            }
            return this.stateRec;
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
         *       &lt;all>
         *         &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
         *         &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
         *         &lt;element name="StateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{}Desc" minOccurs="0"/>
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
        public static class StateRec {

            @XmlElement(name = "StartDt")
            protected Date startDt;
            @XmlElement(name = "EndDt")
            protected Date endDt;
            @XmlElement(name = "StateType")
            protected String stateType;
            @XmlElement(name = "StateCode")
            protected String stateCode;
            @XmlElement(name = "Desc")
            protected String desc;

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
             * Gets the value of the stateType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateType() {
                return stateType;
            }

            /**
             * Sets the value of the stateType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateType(String value) {
                this.stateType = value;
            }

            /**
             * Gets the value of the stateCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateCode() {
                return stateCode;
            }

            /**
             * Sets the value of the stateCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateCode(String value) {
                this.stateCode = value;
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

        }

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
     *         &lt;element ref="{}TaxRegCode" maxOccurs="unbounded"/>
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
        "taxRegCode"
    })
    public static class TaxRegAddInfo {

        @XmlElement(name = "TaxRegCode", required = true)
        protected List<String> taxRegCode;

        /**
         * Gets the value of the taxRegCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxRegCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxRegCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTaxRegCode() {
            if (taxRegCode == null) {
                taxRegCode = new ArrayList<String>();
            }
            return this.taxRegCode;
        }

    }

}
