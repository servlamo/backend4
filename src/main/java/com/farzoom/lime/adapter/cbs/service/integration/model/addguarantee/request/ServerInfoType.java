
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServerInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{}MsgUID"/>
 *         &lt;element ref="{}RqUID"/>
 *         &lt;element ref="{}SPName"/>
 *         &lt;element ref="{}MsgReceiver" minOccurs="0"/>
 *         &lt;element ref="{}ServerDt"/>
 *         &lt;element ref="{}MsgType"/>
 *         &lt;element ref="{}ExtMsgType" minOccurs="0"/>
 *         &lt;element ref="{}BpId" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerInfo_Type", propOrder = {

})
public class ServerInfoType {

    @XmlElement(name = "MsgUID", required = true)
    protected String msgUID;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "SPName", required = true)
    protected String spName;
    @XmlElement(name = "MsgReceiver")
    protected String msgReceiver;
    @XmlElement(name = "ServerDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serverDt;
    @XmlElement(name = "MsgType", required = true)
    protected String msgType;
    @XmlElement(name = "ExtMsgType")
    protected String extMsgType;
    @XmlElement(name = "BpId", defaultValue = "BP_ID")
    protected String bpId;

    /**
     * Gets the value of the msgUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgUID() {
        return msgUID;
    }

    /**
     * Sets the value of the msgUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgUID(String value) {
        this.msgUID = value;
    }

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the msgReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgReceiver() {
        return msgReceiver;
    }

    /**
     * Sets the value of the msgReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgReceiver(String value) {
        this.msgReceiver = value;
    }

    /**
     * Gets the value of the serverDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServerDt() {
        return serverDt;
    }

    /**
     * Sets the value of the serverDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServerDt(XMLGregorianCalendar value) {
        this.serverDt = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the extMsgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtMsgType() {
        return extMsgType;
    }

    /**
     * Sets the value of the extMsgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtMsgType(String value) {
        this.extMsgType = value;
    }

    /**
     * Gets the value of the bpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpId() {
        return bpId;
    }

    /**
     * Sets the value of the bpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpId(String value) {
        this.bpId = value;
    }

}
