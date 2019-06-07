
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.response;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="ForExType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurAmtFrom" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="CurAmtTo" type="{}CurrencyAmount" minOccurs="0"/>
 *         &lt;element name="CurRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FeeChargeAlloc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}Fee"/>
 *                 &lt;/all>
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
@XmlRootElement(name = "ForExInfo")
public class ForExInfo {

    @XmlElement(name = "ForExType")
    protected String forExType;
    @XmlElement(name = "CurAmtFrom")
    protected CurrencyAmount curAmtFrom;
    @XmlElement(name = "CurAmtTo")
    protected CurrencyAmount curAmtTo;
    @XmlElement(name = "CurRate")
    protected BigDecimal curRate;
    @XmlElement(name = "FeeChargeAlloc")
    protected ForExInfo.FeeChargeAlloc feeChargeAlloc;

    /**
     * Gets the value of the forExType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExType() {
        return forExType;
    }

    /**
     * Sets the value of the forExType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExType(String value) {
        this.forExType = value;
    }

    /**
     * Gets the value of the curAmtFrom property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getCurAmtFrom() {
        return curAmtFrom;
    }

    /**
     * Sets the value of the curAmtFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setCurAmtFrom(CurrencyAmount value) {
        this.curAmtFrom = value;
    }

    /**
     * Gets the value of the curAmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmount }
     *     
     */
    public CurrencyAmount getCurAmtTo() {
        return curAmtTo;
    }

    /**
     * Sets the value of the curAmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmount }
     *     
     */
    public void setCurAmtTo(CurrencyAmount value) {
        this.curAmtTo = value;
    }

    /**
     * Gets the value of the curRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurRate() {
        return curRate;
    }

    /**
     * Sets the value of the curRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurRate(BigDecimal value) {
        this.curRate = value;
    }

    /**
     * Gets the value of the feeChargeAlloc property.
     * 
     * @return
     *     possible object is
     *     {@link ForExInfo.FeeChargeAlloc }
     *     
     */
    public ForExInfo.FeeChargeAlloc getFeeChargeAlloc() {
        return feeChargeAlloc;
    }

    /**
     * Sets the value of the feeChargeAlloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExInfo.FeeChargeAlloc }
     *     
     */
    public void setFeeChargeAlloc(ForExInfo.FeeChargeAlloc value) {
        this.feeChargeAlloc = value;
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
     *         &lt;element ref="{}Fee"/>
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
    public static class FeeChargeAlloc {

        @XmlElement(name = "Fee", required = true)
        protected Fee fee;

        /**
         * Gets the value of the fee property.
         * 
         * @return
         *     possible object is
         *     {@link Fee }
         *     
         */
        public Fee getFee() {
            return fee;
        }

        /**
         * Sets the value of the fee property.
         * 
         * @param value
         *     allowed object is
         *     {@link Fee }
         *     
         */
        public void setFee(Fee value) {
            this.fee = value;
        }

    }

}
