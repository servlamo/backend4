
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
 *         &lt;element name="AcctExist" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}AcctId" minOccurs="0"/>
 *         &lt;element ref="{}AcctBals" minOccurs="0"/>
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
@XmlRootElement(name = "AccruedInt")
public class AccruedInt {

    @XmlElement(name = "AcctExist")
    protected Object acctExist;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctBals")
    protected AcctBals acctBals;

    /**
     * Gets the value of the acctExist property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAcctExist() {
        return acctExist;
    }

    /**
     * Sets the value of the acctExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAcctExist(Object value) {
        this.acctExist = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctBals property.
     * 
     * @return
     *     possible object is
     *     {@link AcctBals }
     *     
     */
    public AcctBals getAcctBals() {
        return acctBals;
    }

    /**
     * Sets the value of the acctBals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctBals }
     *     
     */
    public void setAcctBals(AcctBals value) {
        this.acctBals = value;
    }

}
