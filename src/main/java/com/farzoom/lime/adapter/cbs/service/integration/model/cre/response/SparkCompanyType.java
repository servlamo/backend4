//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.11 at 07:50:00 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.cre.response;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * Компания
 * 
 * <p>Java class for sparkCompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sparkCompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SparkID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SPARKID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RNN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OKPO" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OKOPFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagerInn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OKATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressOrComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharePart" type="{}sparkDecimal" minOccurs="0"/>
 *         &lt;element name="SharePartRUR" type="{}sparkDecimal" minOccurs="0"/>
 *         &lt;element name="InputDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CoownerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TermDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sparkCompanyType", propOrder = {

})
@XmlSeeAlso({
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.AffiliatedCompaniesEGRUL.AffiliatedCompanyEGRUL.class,
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.AffiliatedCompaniesFCSM.AffiliatedCompanyFCSM.class,
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.AffiliatedCompaniesRosstat.AffiliatedCompanyRosstat.class,
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.Branches.Branch.class,
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.CoownersEGRUL.CoownerEGRUL.class,
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.CoownersFCSM.CoownerFCSM.class,
    com.farzoom.lime.adapter.cbs.service.integration.model.cre.response.SparkResponseType.Data.Report.CoownersRosstat.CoownerRosstat.class
})
public class SparkCompanyType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SparkID")
    protected BigInteger sparkID;
    @XmlElement(name = "SPARKID")
    protected BigInteger sparkid;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "INN")
    protected BigInteger inn;
    @XmlElement(name = "RNN")
    protected String rnn;
    @XmlElement(name = "EDRPU")
    protected String edrpu;
    @XmlElement(name = "OGRN")
    protected BigInteger ogrn;
    @XmlElement(name = "OKPO")
    protected BigInteger okpo;
    @XmlElement(name = "OKOPFName")
    protected String okopfName;
    @XmlElement(name = "Manager")
    protected String manager;
    @XmlElement(name = "ManagerInn")
    protected BigInteger managerInn;
    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "OKATO")
    protected String okato;
    @XmlElement(name = "AddressOrComment")
    protected String addressOrComment;
    @XmlElement(name = "TypeHolder")
    protected String typeHolder;
    @XmlElement(name = "IsCompany")
    protected String isCompany;
    @XmlElement(name = "SharePart")
    protected String sharePart;
    @XmlElement(name = "SharePartRUR")
    protected String sharePartRUR;
    @XmlElement(name = "InputDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inputDate;
    @XmlElement(name = "CoownerType")
    protected String coownerType;
    @XmlElement(name = "ActualDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualDate;
    @XmlElement(name = "OpenDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDate;
    @XmlElement(name = "TermDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termDate;
    @XmlElement(name = "RegDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDate;

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
     * Gets the value of the sparkID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSparkID() {
        return sparkID;
    }

    /**
     * Sets the value of the sparkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSparkID(BigInteger value) {
        this.sparkID = value;
    }

    /**
     * Gets the value of the sparkid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSPARKID() {
        return sparkid;
    }

    /**
     * Sets the value of the sparkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSPARKID(BigInteger value) {
        this.sparkid = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setINN(BigInteger value) {
        this.inn = value;
    }

    /**
     * Gets the value of the rnn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNN() {
        return rnn;
    }

    /**
     * Sets the value of the rnn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNN(String value) {
        this.rnn = value;
    }

    /**
     * Gets the value of the edrpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDRPU() {
        return edrpu;
    }

    /**
     * Sets the value of the edrpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDRPU(String value) {
        this.edrpu = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOGRN(BigInteger value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the okpo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOKPO() {
        return okpo;
    }

    /**
     * Sets the value of the okpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOKPO(BigInteger value) {
        this.okpo = value;
    }

    /**
     * Gets the value of the okopfName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKOPFName() {
        return okopfName;
    }

    /**
     * Sets the value of the okopfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKOPFName(String value) {
        this.okopfName = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the managerInn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagerInn() {
        return managerInn;
    }

    /**
     * Sets the value of the managerInn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagerInn(BigInteger value) {
        this.managerInn = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the okato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKATO() {
        return okato;
    }

    /**
     * Sets the value of the okato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKATO(String value) {
        this.okato = value;
    }

    /**
     * Gets the value of the addressOrComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOrComment() {
        return addressOrComment;
    }

    /**
     * Sets the value of the addressOrComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOrComment(String value) {
        this.addressOrComment = value;
    }

    /**
     * Gets the value of the typeHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeHolder() {
        return typeHolder;
    }

    /**
     * Sets the value of the typeHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeHolder(String value) {
        this.typeHolder = value;
    }

    /**
     * Gets the value of the isCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCompany() {
        return isCompany;
    }

    /**
     * Sets the value of the isCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCompany(String value) {
        this.isCompany = value;
    }

    /**
     * Gets the value of the sharePart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePart() {
        return sharePart;
    }

    /**
     * Sets the value of the sharePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePart(String value) {
        this.sharePart = value;
    }

    /**
     * Gets the value of the sharePartRUR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePartRUR() {
        return sharePartRUR;
    }

    /**
     * Sets the value of the sharePartRUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePartRUR(String value) {
        this.sharePartRUR = value;
    }

    /**
     * Gets the value of the inputDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputDate() {
        return inputDate;
    }

    /**
     * Sets the value of the inputDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInputDate(XMLGregorianCalendar value) {
        this.inputDate = value;
    }

    /**
     * Gets the value of the coownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoownerType() {
        return coownerType;
    }

    /**
     * Sets the value of the coownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoownerType(String value) {
        this.coownerType = value;
    }

    /**
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDate(XMLGregorianCalendar value) {
        this.actualDate = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermDate(XMLGregorianCalendar value) {
        this.termDate = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

}
