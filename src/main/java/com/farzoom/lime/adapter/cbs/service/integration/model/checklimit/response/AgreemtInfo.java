
package com.farzoom.lime.adapter.cbs.service.integration.model.checklimit.response;

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
 *         &lt;element ref="{}AgreemtNum"/>
 *         &lt;element name="AgreemtDt" type="{}Date"/>
 *         &lt;element ref="{}AgreemtId" minOccurs="0"/>
 *         &lt;element name="CurAmt" type="{}CurrencyAmount" minOccurs="0"/>
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
@XmlRootElement(name = "AgreemtInfo")
public class AgreemtInfo {

    @XmlElement(name = "AgreemtNum", required = true)
    protected String agreemtNum;
    @XmlElement(name = "AgreemtDt", required = true)
    protected Date agreemtDt;
    @XmlElement(name = "AgreemtId")
    protected String agreemtId;
    @XmlElement(name = "CurAmt")
    protected CurrencyAmount curAmt;

    /**
     * Gets the value of the agreemtNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreemtNum() {
        return agreemtNum;
    }

    /**
     * Sets the value of the agreemtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreemtNum(String value) {
        this.agreemtNum = value;
    }

    /**
     * Gets the value of the agreemtDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAgreemtDt() {
        return agreemtDt;
    }

    /**
     * Sets the value of the agreemtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAgreemtDt(Date value) {
        this.agreemtDt = value;
    }

    /**
     * Gets the value of the agreemtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreemtId() {
        return agreemtId;
    }

    /**
     * Sets the value of the agreemtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreemtId(String value) {
        this.agreemtId = value;
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

}
