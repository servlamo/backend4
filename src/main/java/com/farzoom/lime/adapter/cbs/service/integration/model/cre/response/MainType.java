//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.11 at 07:50:00 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.cre.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mainType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INFO_SOURCES" type="{}infoSourcesType"/>
 *         &lt;element name="CREATE_DATETIME" type="{}dateTimeType"/>
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLICATION_UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLICANT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUP_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONNECTOR_DATA_DETAILS" type="{}connectorDataDetailsType" minOccurs="0"/>
 *         &lt;element name="EXTENSION" type="{}extensionType" minOccurs="0"/>
 *         &lt;element name="REPORT_DATETIME" type="{}dateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mainType", propOrder = {
    "infosources",
    "createdatetime",
    "uid",
    "applicationuid",
    "applicantid",
    "groupid",
    "connectordatadetails",
    "extension",
    "reportdatetime"
})
public class MainType {

    @XmlElement(name = "INFO_SOURCES", required = true)
    protected InfoSourcesType infosources;
    @XmlElement(name = "CREATE_DATETIME", required = true)
    protected String createdatetime;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "APPLICATION_UID")
    protected String applicationuid;
    @XmlElement(name = "APPLICANT_ID")
    protected String applicantid;
    @XmlElement(name = "GROUP_ID")
    protected String groupid;
    @XmlElement(name = "CONNECTOR_DATA_DETAILS")
    protected ConnectorDataDetailsType connectordatadetails;
    @XmlElement(name = "EXTENSION")
    protected ExtensionType extension;
    @XmlElement(name = "REPORT_DATETIME")
    protected String reportdatetime;

    /**
     * Gets the value of the infosources property.
     * 
     * @return
     *     possible object is
     *     {@link InfoSourcesType }
     *     
     */
    public InfoSourcesType getINFOSOURCES() {
        return infosources;
    }

    /**
     * Sets the value of the infosources property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoSourcesType }
     *     
     */
    public void setINFOSOURCES(InfoSourcesType value) {
        this.infosources = value;
    }

    /**
     * Gets the value of the createdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATEDATETIME() {
        return createdatetime;
    }

    /**
     * Sets the value of the createdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATEDATETIME(String value) {
        this.createdatetime = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the applicationuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICATIONUID() {
        return applicationuid;
    }

    /**
     * Sets the value of the applicationuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICATIONUID(String value) {
        this.applicationuid = value;
    }

    /**
     * Gets the value of the applicantid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLICANTID() {
        return applicantid;
    }

    /**
     * Sets the value of the applicantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLICANTID(String value) {
        this.applicantid = value;
    }

    /**
     * Gets the value of the groupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPID() {
        return groupid;
    }

    /**
     * Sets the value of the groupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPID(String value) {
        this.groupid = value;
    }

    /**
     * Gets the value of the connectordatadetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectorDataDetailsType }
     *     
     */
    public ConnectorDataDetailsType getCONNECTORDATADETAILS() {
        return connectordatadetails;
    }

    /**
     * Sets the value of the connectordatadetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectorDataDetailsType }
     *     
     */
    public void setCONNECTORDATADETAILS(ConnectorDataDetailsType value) {
        this.connectordatadetails = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEXTENSION() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEXTENSION(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the reportdatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTDATETIME() {
        return reportdatetime;
    }

    /**
     * Sets the value of the reportdatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTDATETIME(String value) {
        this.reportdatetime = value;
    }

}
