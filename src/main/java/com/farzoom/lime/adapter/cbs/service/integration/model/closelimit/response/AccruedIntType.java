
package com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип начисленные проценты
 * 
 * <p>Java class for AccruedInt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccruedInt_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctExist" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}AcctId" minOccurs="0"/>
 *         &lt;element ref="{}AcctBal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LiqDay" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccruedInt_Type", propOrder = {
    "acctExist",
    "acctId",
    "acctBal",
    "liqDay"
})
public class AccruedIntType {

    @XmlElement(name = "AcctExist")
    protected Boolean acctExist;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctBal")
    protected List<AcctBal> acctBal;
    @XmlElement(name = "LiqDay")
    protected Long liqDay;

    /**
     * Gets the value of the acctExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctExist() {
        return acctExist;
    }

    /**
     * Sets the value of the acctExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctExist(Boolean value) {
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
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBal }
     * 
     * 
     */
    public List<AcctBal> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBal>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the liqDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLiqDay() {
        return liqDay;
    }

    /**
     * Sets the value of the liqDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLiqDay(Long value) {
        this.liqDay = value;
    }

}
