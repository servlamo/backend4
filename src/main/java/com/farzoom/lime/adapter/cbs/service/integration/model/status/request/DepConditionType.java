
package com.farzoom.lime.adapter.cbs.service.integration.model.status.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Условия по депозиту
 * 
 * <p>Java class for DepCondition_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepCondition_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Permit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}Condition"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepCondition_Type", propOrder = {

})
public class DepConditionType {

    @XmlElement(name = "Permit")
    protected boolean permit;
    @XmlElement(name = "Condition", required = true)
    protected String condition;

    /**
     * Gets the value of the permit property.
     * 
     */
    public boolean isPermit() {
        return permit;
    }

    /**
     * Sets the value of the permit property.
     * 
     */
    public void setPermit(boolean value) {
        this.permit = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

}
