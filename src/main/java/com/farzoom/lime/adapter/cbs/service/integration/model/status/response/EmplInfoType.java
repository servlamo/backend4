
package com.farzoom.lime.adapter.cbs.service.integration.model.status.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип сотрудник
 * 
 * <p>Java class for EmplInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}EmplId" minOccurs="0"/>
 *         &lt;element name="RCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}JobTitle" minOccurs="0"/>
 *         &lt;element ref="{}BankInfo" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmplInfo_Type", propOrder = {

})
public class EmplInfoType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "EmplId")
    protected String emplId;
    @XmlElement(name = "RCId")
    protected String rcId;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "BankInfo")
    protected BankInfo bankInfo;

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
     * Gets the value of the rcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCId() {
        return rcId;
    }

    /**
     * Sets the value of the rcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCId(String value) {
        this.rcId = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
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

}
