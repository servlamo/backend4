
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="ParmName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ParmValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "parmName",
    "parmValue"
})
@XmlRootElement(name = "Parm")
public class Parm {

    @XmlElement(name = "ParmName", required = true)
    protected String parmName;
    @XmlElement(name = "ParmValue", required = true)
    protected String parmValue;

    /**
     * Gets the value of the parmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmName() {
        return parmName;
    }

    /**
     * Sets the value of the parmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmName(String value) {
        this.parmName = value;
    }

    /**
     * Gets the value of the parmValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParmValue() {
        return parmValue;
    }

    /**
     * Sets the value of the parmValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParmValue(String value) {
        this.parmValue = value;
    }

}
