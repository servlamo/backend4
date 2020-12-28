//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.30 at 09:38:27 AM MSK 
//


package com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.rs;

import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.ServerInfoType;
import com.farzoom.lime.adapter.cbs.service.integration.model.bankacctadd.common.Status;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{}ServerInfo"/&gt;
 *         &lt;element name="BankSvcRs"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="RequestInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element ref="{}RequestId"/&gt;
 *                             &lt;element name="RequestStatus"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="RequestStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element ref="{}StatusDesc" minOccurs="0"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{}Status"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "FDX")
public class BankAcctAddRs {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRs", required = true)
    protected BankSvcRs bankSvcRs;

    /**
     * Gets the value of the serverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServerInfoType }
     *     
     */
    public ServerInfoType getServerInfo() {
        return serverInfo;
    }

    /**
     * Sets the value of the serverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerInfoType }
     *     
     */
    public void setServerInfo(ServerInfoType value) {
        this.serverInfo = value;
    }

    /**
     * Gets the value of the bankSvcRs property.
     * 
     * @return
     *     possible object is
     *     {@link BankSvcRs }
     *     
     */
    public BankSvcRs getBankSvcRs() {
        return bankSvcRs;
    }

    /**
     * Sets the value of the bankSvcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankSvcRs }
     *     
     */
    public void setBankSvcRs(BankSvcRs value) {
        this.bankSvcRs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="RequestInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element ref="{}RequestId"/&gt;
     *                   &lt;element name="RequestStatus"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="RequestStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element ref="{}StatusDesc" minOccurs="0"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{}Status"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class BankSvcRs {

        @XmlElement(name = "RequestInfo")
        protected RequestInfo requestInfo;
        @XmlElement(name = "Status", required = true)
        protected Status status;

        /**
         * Gets the value of the requestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link RequestInfo }
         *     
         */
        public RequestInfo getRequestInfo() {
            return requestInfo;
        }

        /**
         * Sets the value of the requestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestInfo }
         *     
         */
        public void setRequestInfo(RequestInfo value) {
            this.requestInfo = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Status }
         *     
         */
        public Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Status }
         *     
         */
        public void setStatus(Status value) {
            this.status = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element ref="{}RequestId"/&gt;
         *         &lt;element name="RequestStatus"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="RequestStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element ref="{}StatusDesc" minOccurs="0"/&gt;
         *                 &lt;/all&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class RequestInfo {

            @XmlElement(name = "RequestId", required = true)
            protected String requestId;
            @XmlElement(name = "RequestStatus", required = true)
            protected RequestStatus requestStatus;

            /**
             * Gets the value of the requestId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestId() {
                return requestId;
            }

            /**
             * Sets the value of the requestId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestId(String value) {
                this.requestId = value;
            }

            /**
             * Gets the value of the requestStatus property.
             * 
             * @return
             *     possible object is
             *     {@link RequestStatus }
             *     
             */
            public RequestStatus getRequestStatus() {
                return requestStatus;
            }

            /**
             * Sets the value of the requestStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link RequestStatus }
             *     
             */
            public void setRequestStatus(RequestStatus value) {
                this.requestStatus = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="RequestStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element ref="{}StatusDesc" minOccurs="0"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class RequestStatus {

                @XmlElement(name = "RequestStatusCode", required = true)
                protected String requestStatusCode;
                @XmlElement(name = "StatusDesc")
                protected String statusDesc;

                /**
                 * Gets the value of the requestStatusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestStatusCode() {
                    return requestStatusCode;
                }

                /**
                 * Sets the value of the requestStatusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestStatusCode(String value) {
                    this.requestStatusCode = value;
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

            }

        }

    }

}
