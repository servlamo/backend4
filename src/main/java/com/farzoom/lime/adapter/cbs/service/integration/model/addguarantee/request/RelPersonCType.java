
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelPerson_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelPerson_CType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="RelType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartDt" type="{}Date" minOccurs="0"/>
 *         &lt;element name="EndDt" type="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}IPDLStatus" minOccurs="0"/>
 *         &lt;element ref="{}PersonInfo"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelPerson_CType", propOrder = {

})
public class RelPersonCType {

    @XmlElement(name = "RelType", required = true)
    protected String relType;
    @XmlElement(name = "StartDt")
    protected Date startDt;
    @XmlElement(name = "EndDt")
    protected Date endDt;
    @XmlElement(name = "IPDLStatus")
    protected String ipdlStatus;
    @XmlElement(name = "PersonInfo", required = true)
    protected PersonInfo personInfo;

    /**
     * Gets the value of the relType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelType() {
        return relType;
    }

    /**
     * Sets the value of the relType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelType(String value) {
        this.relType = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDt(Date value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDt(Date value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the ipdlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPDLStatus() {
        return ipdlStatus;
    }

    /**
     * Sets the value of the ipdlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPDLStatus(String value) {
        this.ipdlStatus = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setPersonInfo(PersonInfo value) {
        this.personInfo = value;
    }

}
