
package com.farzoom.lime.adapter.cbs.service.integration.model.closelimit.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Документ
 * 
 * <p>Java class for DocInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}OrigName" minOccurs="0"/>
 *         &lt;element ref="{}DocTypeName" minOccurs="0"/>
 *         &lt;element ref="{}DocTypeCode" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Data"/>
 *           &lt;element ref="{}Link"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocInfo_Type", propOrder = {
    "name",
    "origName",
    "docTypeName",
    "docTypeCode",
    "data",
    "link"
})
public class DocInfoType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "OrigName")
    protected String origName;
    @XmlElement(name = "DocTypeName")
    protected String docTypeName;
    @XmlElement(name = "DocTypeCode")
    protected String docTypeCode;
    @XmlElement(name = "Data")
    protected byte[] data;
    @XmlElement(name = "Link")
    protected String link;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the origName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigName() {
        return origName;
    }

    /**
     * Sets the value of the origName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigName(String value) {
        this.origName = value;
    }

    /**
     * Gets the value of the docTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeName() {
        return docTypeName;
    }

    /**
     * Sets the value of the docTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeName(String value) {
        this.docTypeName = value;
    }

    /**
     * Gets the value of the docTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTypeCode() {
        return docTypeCode;
    }

    /**
     * Sets the value of the docTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTypeCode(String value) {
        this.docTypeCode = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
