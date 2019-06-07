
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
 *         &lt;element name="ClassifierType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClassifierCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "ClassifierId")
public class ClassifierId {

    @XmlElement(name = "ClassifierType", required = true)
    protected String classifierType;
    @XmlElement(name = "ClassifierCode", required = true)
    protected String classifierCode;

    /**
     * Gets the value of the classifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifierType() {
        return classifierType;
    }

    /**
     * Sets the value of the classifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifierType(String value) {
        this.classifierType = value;
    }

    /**
     * Gets the value of the classifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifierCode() {
        return classifierCode;
    }

    /**
     * Sets the value of the classifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifierCode(String value) {
        this.classifierCode = value;
    }

}
