//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.05 at 06:35:48 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.idbank.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о платеже в бюджет
 * 
 * <p>Java class for BudgetaryPmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetaryPmtInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RUS.DrawerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUS.PmtBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUS.TaxPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUS.TaxDocNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUS.TaxDocDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="RUS.TaxPmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUS.OKATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RUS.BC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetaryPmtInfo_Type", propOrder = {

})
public class BudgetaryPmtInfoType {

    @XmlElement(name = "RUS.DrawerStatus")
    protected String rusDrawerStatus;
    @XmlElement(name = "RUS.PmtBasisCode")
    protected String rusPmtBasisCode;
    @XmlElement(name = "RUS.TaxPeriod")
    protected String rusTaxPeriod;
    @XmlElement(name = "RUS.TaxDocNum")
    protected String rusTaxDocNum;
    @XmlElement(name = "RUS.TaxDocDt")
    protected Date rusTaxDocDt;
    @XmlElement(name = "RUS.TaxPmtType")
    protected String rusTaxPmtType;
    @XmlElement(name = "RUS.OKATO")
    protected String rusokato;
    @XmlElement(name = "RUS.BC")
    protected String rusbc;

    /**
     * Gets the value of the rusDrawerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSDrawerStatus() {
        return rusDrawerStatus;
    }

    /**
     * Sets the value of the rusDrawerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSDrawerStatus(String value) {
        this.rusDrawerStatus = value;
    }

    /**
     * Gets the value of the rusPmtBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSPmtBasisCode() {
        return rusPmtBasisCode;
    }

    /**
     * Sets the value of the rusPmtBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSPmtBasisCode(String value) {
        this.rusPmtBasisCode = value;
    }

    /**
     * Gets the value of the rusTaxPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxPeriod() {
        return rusTaxPeriod;
    }

    /**
     * Sets the value of the rusTaxPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxPeriod(String value) {
        this.rusTaxPeriod = value;
    }

    /**
     * Gets the value of the rusTaxDocNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxDocNum() {
        return rusTaxDocNum;
    }

    /**
     * Sets the value of the rusTaxDocNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxDocNum(String value) {
        this.rusTaxDocNum = value;
    }

    /**
     * Gets the value of the rusTaxDocDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRUSTaxDocDt() {
        return rusTaxDocDt;
    }

    /**
     * Sets the value of the rusTaxDocDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRUSTaxDocDt(Date value) {
        this.rusTaxDocDt = value;
    }

    /**
     * Gets the value of the rusTaxPmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSTaxPmtType() {
        return rusTaxPmtType;
    }

    /**
     * Sets the value of the rusTaxPmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSTaxPmtType(String value) {
        this.rusTaxPmtType = value;
    }

    /**
     * Gets the value of the rusokato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSOKATO() {
        return rusokato;
    }

    /**
     * Sets the value of the rusokato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSOKATO(String value) {
        this.rusokato = value;
    }

    /**
     * Gets the value of the rusbc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUSBC() {
        return rusbc;
    }

    /**
     * Sets the value of the rusbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUSBC(String value) {
        this.rusbc = value;
    }

}
