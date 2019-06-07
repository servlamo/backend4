
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ���������� �� �����������
 * 
 * <p>Java class for DCInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DCId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DepAcctIdFrom" type="{}DepAcctId_Type" minOccurs="0"/>
 *         &lt;element name="DepAcctIdTo" type="{}DepAcctId_Type" minOccurs="0"/>
 *         &lt;element name="BankAcctIdFrom" type="{}BankAcctId_Type" minOccurs="0"/>
 *         &lt;element name="BankAcctIdTo" type="{}BankAcctId_Type" minOccurs="0"/>
 *         &lt;element name="NameFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxIdFrom" type="{}TaxId_Type" minOccurs="0"/>
 *         &lt;element name="TaxIdTo" type="{}TaxId_Type" minOccurs="0"/>
 *         &lt;element name="TaxRegCodeFrom" type="{}TaxRegCode_Type" minOccurs="0"/>
 *         &lt;element name="TaxRegCodeTo" type="{}TaxRegCode_Type" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount"/>
 *         &lt;element name="PrivilegeOfCan" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Revocable"/>
 *               &lt;enumeration value="IrrevocableConfirmed"/>
 *               &lt;enumeration value="IrrevocableUnconfirmed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Transferable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PmtForm" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Paid"/>
 *               &lt;enumeration value="Guaranteed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PmtCond" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Without"/>
 *               &lt;enumeration value="Confirm"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AgreemtInfo" minOccurs="0"/>
 *         &lt;element name="ShipmentDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="Consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalCond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="ExpDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="AdvNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}CustResponsibleInfo" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCInfo_Type", propOrder = {

})
public class DCInfoType {

    @XmlElement(name = "DCId", required = true)
    protected String dcId;
    @XmlElement(name = "DepAcctIdFrom")
    protected DepAcctIdType depAcctIdFrom;
    @XmlElement(name = "DepAcctIdTo")
    protected DepAcctIdType depAcctIdTo;
    @XmlElement(name = "BankAcctIdFrom")
    protected BankAcctIdType bankAcctIdFrom;
    @XmlElement(name = "BankAcctIdTo")
    protected BankAcctIdType bankAcctIdTo;
    @XmlElement(name = "NameFrom")
    protected String nameFrom;
    @XmlElement(name = "NameTo")
    protected String nameTo;
    @XmlElement(name = "TaxIdFrom")
    protected String taxIdFrom;
    @XmlElement(name = "TaxIdTo")
    protected String taxIdTo;
    @XmlElement(name = "TaxRegCodeFrom")
    protected String taxRegCodeFrom;
    @XmlElement(name = "TaxRegCodeTo")
    protected String taxRegCodeTo;
    @XmlElement(name = "CurAmt", required = true)
    protected CurrencyAmount curAmt;
    @XmlElement(name = "PrivilegeOfCan", defaultValue = "Revocable")
    protected String privilegeOfCan;
    @XmlElement(name = "Transferable")
    protected Boolean transferable;
    @XmlElement(name = "PmtForm")
    protected String pmtForm;
    @XmlElement(name = "PmtCond", defaultValue = "Without")
    protected String pmtCond;
    @XmlElement(name = "AgreemtInfo")
    protected AgreemtInfo agreemtInfo;
    @XmlElement(name = "ShipmentDt")
    protected Date shipmentDt;
    @XmlElement(name = "Consignee")
    protected String consignee;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "AdditionalCond")
    protected String additionalCond;
    @XmlElement(name = "OrigDt")
    protected Date origDt;
    @XmlElement(name = "ExpDt")
    protected Date expDt;
    @XmlElement(name = "AdvNum")
    protected String advNum;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "CustResponsibleInfo")
    protected CustResponsibleInfo custResponsibleInfo;

    /**
     * Gets the value of the dcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCId() {
        return dcId;
    }

    /**
     * Sets the value of the dcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCId(String value) {
        this.dcId = value;
    }

    /**
     * Gets the value of the depAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctIdFrom() {
        return depAcctIdFrom;
    }

    /**
     * Sets the value of the depAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctIdFrom(DepAcctIdType value) {
        this.depAcctIdFrom = value;
    }

    /**
     * Gets the value of the depAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctIdType }
     *     
     */
    public DepAcctIdType getDepAcctIdTo() {
        return depAcctIdTo;
    }

    /**
     * Sets the value of the depAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctIdType }
     *     
     */
    public void setDepAcctIdTo(DepAcctIdType value) {
        this.depAcctIdTo = value;
    }

    /**
     * Gets the value of the bankAcctIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctIdType }
     *     
     */
    public BankAcctIdType getBankAcctIdFrom() {
        return bankAcctIdFrom;
    }

    /**
     * Sets the value of the bankAcctIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctIdType }
     *     
     */
    public void setBankAcctIdFrom(BankAcctIdType value) {
        this.bankAcctIdFrom = value;
    }

    /**
     * Gets the value of the bankAcctIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctIdType }
     *     
     */
    public BankAcctIdType getBankAcctIdTo() {
        return bankAcctIdTo;
    }

    /**
     * Sets the value of the bankAcctIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctIdType }
     *     
     */
    public void setBankAcctIdTo(BankAcctIdType value) {
        this.bankAcctIdTo = value;
    }

    /**
     * Gets the value of the nameFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFrom() {
        return nameFrom;
    }

    /**
     * Sets the value of the nameFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFrom(String value) {
        this.nameFrom = value;
    }

    /**
     * Gets the value of the nameTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTo() {
        return nameTo;
    }

    /**
     * Sets the value of the nameTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTo(String value) {
        this.nameTo = value;
    }

    /**
     * Gets the value of the taxIdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdFrom() {
        return taxIdFrom;
    }

    /**
     * Sets the value of the taxIdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdFrom(String value) {
        this.taxIdFrom = value;
    }

    /**
     * Gets the value of the taxIdTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdTo() {
        return taxIdTo;
    }

    /**
     * Sets the value of the taxIdTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdTo(String value) {
        this.taxIdTo = value;
    }

    /**
     * Gets the value of the taxRegCodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegCodeFrom() {
        return taxRegCodeFrom;
    }

    /**
     * Sets the value of the taxRegCodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegCodeFrom(String value) {
        this.taxRegCodeFrom = value;
    }

    /**
     * Gets the value of the taxRegCodeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegCodeTo() {
        return taxRegCodeTo;
    }

    /**
     * Sets the value of the taxRegCodeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegCodeTo(String value) {
        this.taxRegCodeTo = value;
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
     * Gets the value of the privilegeOfCan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegeOfCan() {
        return privilegeOfCan;
    }

    /**
     * Sets the value of the privilegeOfCan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegeOfCan(String value) {
        this.privilegeOfCan = value;
    }

    /**
     * Gets the value of the transferable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferable() {
        return transferable;
    }

    /**
     * Sets the value of the transferable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferable(Boolean value) {
        this.transferable = value;
    }

    /**
     * Gets the value of the pmtForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtForm() {
        return pmtForm;
    }

    /**
     * Sets the value of the pmtForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtForm(String value) {
        this.pmtForm = value;
    }

    /**
     * Gets the value of the pmtCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCond() {
        return pmtCond;
    }

    /**
     * Sets the value of the pmtCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCond(String value) {
        this.pmtCond = value;
    }

    /**
     * Gets the value of the agreemtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgreemtInfo }
     *     
     */
    public AgreemtInfo getAgreemtInfo() {
        return agreemtInfo;
    }

    /**
     * Sets the value of the agreemtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreemtInfo }
     *     
     */
    public void setAgreemtInfo(AgreemtInfo value) {
        this.agreemtInfo = value;
    }

    /**
     * Gets the value of the shipmentDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getShipmentDt() {
        return shipmentDt;
    }

    /**
     * Sets the value of the shipmentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setShipmentDt(Date value) {
        this.shipmentDt = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignee(String value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the additionalCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCond() {
        return additionalCond;
    }

    /**
     * Sets the value of the additionalCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCond(String value) {
        this.additionalCond = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setOrigDt(Date value) {
        this.origDt = value;
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
     * Gets the value of the advNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvNum() {
        return advNum;
    }

    /**
     * Sets the value of the advNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvNum(String value) {
        this.advNum = value;
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
     * Gets the value of the custResponsibleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustResponsibleInfo }
     *     
     */
    public CustResponsibleInfo getCustResponsibleInfo() {
        return custResponsibleInfo;
    }

    /**
     * Sets the value of the custResponsibleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustResponsibleInfo }
     *     
     */
    public void setCustResponsibleInfo(CustResponsibleInfo value) {
        this.custResponsibleInfo = value;
    }

}
