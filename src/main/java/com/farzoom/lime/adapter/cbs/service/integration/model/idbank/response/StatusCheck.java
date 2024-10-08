//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.05 at 06:36:12 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.idbank.response;

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
 *       &lt;all>
 *         &lt;element name="CheckCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ErrorRec" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ErrorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{}RefId" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SvcStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="SvcStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element ref="{}StatusDesc" minOccurs="0"/>
 *                   &lt;element name="EffDt" type="{}Date"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlRootElement(name = "StatusCheck")
public class StatusCheck {

    @XmlElement(name = "CheckCode", required = true)
    protected String checkCode;
    @XmlElement(name = "CheckDesc")
    protected String checkDesc;
    @XmlElement(name = "ErrorList")
    protected StatusCheck.ErrorList errorList;
    @XmlElement(name = "SvcStatus")
    protected StatusCheck.SvcStatus svcStatus;

    /**
     * Gets the value of the checkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * Sets the value of the checkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckCode(String value) {
        this.checkCode = value;
    }

    /**
     * Gets the value of the checkDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDesc() {
        return checkDesc;
    }

    /**
     * Sets the value of the checkDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDesc(String value) {
        this.checkDesc = value;
    }

    /**
     * Gets the value of the errorList property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCheck.ErrorList }
     *     
     */
    public StatusCheck.ErrorList getErrorList() {
        return errorList;
    }

    /**
     * Sets the value of the errorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCheck.ErrorList }
     *     
     */
    public void setErrorList(StatusCheck.ErrorList value) {
        this.errorList = value;
    }

    /**
     * Gets the value of the svcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCheck.SvcStatus }
     *     
     */
    public StatusCheck.SvcStatus getSvcStatus() {
        return svcStatus;
    }

    /**
     * Sets the value of the svcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCheck.SvcStatus }
     *     
     */
    public void setSvcStatus(StatusCheck.SvcStatus value) {
        this.svcStatus = value;
    }


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
     *         &lt;element name="ErrorRec" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ErrorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{}RefId" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "errorRec"
    })
    public static class ErrorList {

        @XmlElement(name = "ErrorRec", required = true)
        protected List<StatusCheck.ErrorList.ErrorRec> errorRec;

        /**
         * Gets the value of the errorRec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the errorRec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getErrorRec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusCheck.ErrorList.ErrorRec }
         * 
         * 
         */
        public List<StatusCheck.ErrorList.ErrorRec> getErrorRec() {
            if (errorRec == null) {
                errorRec = new ArrayList<StatusCheck.ErrorList.ErrorRec>();
            }
            return this.errorRec;
        }


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
         *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ErrorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{}RefId" minOccurs="0"/>
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
        public static class ErrorRec {

            @XmlElement(name = "ErrorCode", required = true)
            protected String errorCode;
            @XmlElement(name = "ErrorDesc")
            protected String errorDesc;
            @XmlElement(name = "RefId")
            protected String refId;

            /**
             * Gets the value of the errorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorCode() {
                return errorCode;
            }

            /**
             * Sets the value of the errorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorCode(String value) {
                this.errorCode = value;
            }

            /**
             * Gets the value of the errorDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrorDesc() {
                return errorDesc;
            }

            /**
             * Sets the value of the errorDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrorDesc(String value) {
                this.errorDesc = value;
            }

            /**
             * Gets the value of the refId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefId() {
                return refId;
            }

            /**
             * Sets the value of the refId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefId(String value) {
                this.refId = value;
            }

        }

    }


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
     *         &lt;element name="SvcStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element ref="{}StatusDesc" minOccurs="0"/>
     *         &lt;element name="EffDt" type="{}Date"/>
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
    public static class SvcStatus {

        @XmlElement(name = "SvcStatusCode", required = true)
        protected String svcStatusCode;
        @XmlElement(name = "StatusDesc")
        protected String statusDesc;
        @XmlElement(name = "EffDt", required = true)
        protected Date effDt;

        /**
         * Gets the value of the svcStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSvcStatusCode() {
            return svcStatusCode;
        }

        /**
         * Sets the value of the svcStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSvcStatusCode(String value) {
            this.svcStatusCode = value;
        }

        /**
         * Gets the value of the statusDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusDesc() {
            return statusDesc;
        }

        /**
         * Sets the value of the statusDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusDesc(String value) {
            this.statusDesc = value;
        }

        /**
         * Gets the value of the effDt property.
         * 
         * @return
         *     possible object is
         *     {@link Date }
         *     
         */
        public Date getEffDt() {
            return effDt;
        }

        /**
         * Sets the value of the effDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link Date }
         *     
         */
        public void setEffDt(Date value) {
            this.effDt = value;
        }

    }

}
