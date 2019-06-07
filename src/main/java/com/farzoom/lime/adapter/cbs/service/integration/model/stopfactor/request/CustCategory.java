
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
 *       &lt;all>
 *         &lt;element ref="{}CustCategoryCode"/>
 *         &lt;element ref="{}CustCategoryName" minOccurs="0"/>
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
@XmlRootElement(name = "CustCategory")
public class CustCategory {

    @XmlElement(name = "CustCategoryCode", required = true)
    protected String custCategoryCode;
    @XmlElement(name = "CustCategoryName")
    protected String custCategoryName;

    /**
     * Gets the value of the custCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCategoryCode() {
        return custCategoryCode;
    }

    /**
     * Sets the value of the custCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCategoryCode(String value) {
        this.custCategoryCode = value;
    }

    /**
     * Gets the value of the custCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustCategoryName() {
        return custCategoryName;
    }

    /**
     * Sets the value of the custCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustCategoryName(String value) {
        this.custCategoryName = value;
    }

}
