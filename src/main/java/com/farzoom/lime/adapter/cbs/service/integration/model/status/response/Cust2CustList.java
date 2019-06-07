
package com.farzoom.lime.adapter.cbs.service.integration.model.status.response;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Cust2CustRec" maxOccurs="unbounded"/>
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
    "cust2CustRec"
})
@XmlRootElement(name = "Cust2CustList")
public class Cust2CustList {

    @XmlElement(name = "Cust2CustRec", required = true)
    protected List<Cust2CustInfoType> cust2CustRec;

    /**
     * Gets the value of the cust2CustRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cust2CustRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCust2CustRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cust2CustInfoType }
     * 
     * 
     */
    public List<Cust2CustInfoType> getCust2CustRec() {
        if (cust2CustRec == null) {
            cust2CustRec = new ArrayList<Cust2CustInfoType>();
        }
        return this.cust2CustRec;
    }

}
