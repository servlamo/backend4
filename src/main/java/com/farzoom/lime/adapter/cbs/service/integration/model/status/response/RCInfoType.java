
package com.farzoom.lime.adapter.cbs.service.integration.model.status.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип структурное подразделение
 * 
 * <p>Java class for RCInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}RCId"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}BankInfo"/>
 *         &lt;element name="UpDt" type="{}DateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RCInfo_Type", propOrder = {

})
public class RCInfoType {

    @XmlElement(name = "RCId", required = true)
    protected String rcId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BankInfo", required = true)
    protected BankInfo bankInfo;
    @XmlElement(name = "UpDt", required = true)
    protected DateTime upDt;

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
     * Gets the value of the upDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getUpDt() {
        return upDt;
    }

    /**
     * Sets the value of the upDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setUpDt(DateTime value) {
        this.upDt = value;
    }

}
