
package com.farzoom.lime.adapter.cbs.service.integration.model.leadlistadd.notify;

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
 *       &lt;sequence>
 *         &lt;element ref="{}CryptType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}Pswd"/>
 *           &lt;element ref="{}CryptPswd"/>
 *         &lt;/choice>
 *         &lt;element name="ExpDt" type="{}DateTime" minOccurs="0"/>
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
    "cryptType",
    "pswd",
    "cryptPswd",
    "expDt"
})
@XmlRootElement(name = "CustPswd")
public class CustPswd {

    @XmlElement(name = "CryptType")
    protected String cryptType;
    @XmlElement(name = "Pswd")
    protected String pswd;
    @XmlElement(name = "CryptPswd")
    protected String cryptPswd;
    @XmlElement(name = "ExpDt")
    protected DateTime expDt;

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the cryptPswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptPswd() {
        return cryptPswd;
    }

    /**
     * Sets the value of the cryptPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptPswd(String value) {
        this.cryptPswd = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExpDt(DateTime value) {
        this.expDt = value;
    }

}
