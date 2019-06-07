
package com.farzoom.lime.adapter.cbs.service.integration.model.status.request;

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
 *         &lt;element ref="{}ServerInfo"/>
 *         &lt;element name="BankSvcRq">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}RequestId"/>
 *                   &lt;element ref="{}AgreemtNum"/>
 *                   &lt;element name="GuarantyStatus">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="GuarantyStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element ref="{}StatusDesc" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlRootElement(name = "FDX")
public class StatusRequest {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRq", required = true)
    protected StatusRequest.BankSvcRq bankSvcRq;

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
     * Gets the value of the bankSvcRq property.
     * 
     * @return
     *     possible object is
     *     {@link StatusRequest.BankSvcRq }
     *     
     */
    public StatusRequest.BankSvcRq getBankSvcRq() {
        return bankSvcRq;
    }

    /**
     * Sets the value of the bankSvcRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusRequest.BankSvcRq }
     *     
     */
    public void setBankSvcRq(StatusRequest.BankSvcRq value) {
        this.bankSvcRq = value;
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
     *         &lt;element ref="{}RequestId"/>
     *         &lt;element ref="{}AgreemtNum"/>
     *         &lt;element name="GuarantyStatus">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="GuarantyStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element ref="{}StatusDesc" minOccurs="0"/>
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
    public static class BankSvcRq {

        @XmlElement(name = "RequestId", required = true)
        protected String requestId;
        @XmlElement(name = "AgreemtNum", required = true)
        protected String agreemtNum;
        @XmlElement(name = "GuarantyStatus", required = true)
        protected StatusRequest.BankSvcRq.GuarantyStatus guarantyStatus;

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
         * Gets the value of the agreemtNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreemtNum() {
            return agreemtNum;
        }

        /**
         * Sets the value of the agreemtNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreemtNum(String value) {
            this.agreemtNum = value;
        }

        /**
         * Gets the value of the guarantyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link StatusRequest.BankSvcRq.GuarantyStatus }
         *     
         */
        public StatusRequest.BankSvcRq.GuarantyStatus getGuarantyStatus() {
            return guarantyStatus;
        }

        /**
         * Sets the value of the guarantyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusRequest.BankSvcRq.GuarantyStatus }
         *     
         */
        public void setGuarantyStatus(StatusRequest.BankSvcRq.GuarantyStatus value) {
            this.guarantyStatus = value;
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
         *         &lt;element name="GuarantyStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element ref="{}StatusDesc" minOccurs="0"/>
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
        public static class GuarantyStatus {

            @XmlElement(name = "GuarantyStatusCode", required = true)
            protected String guarantyStatusCode;
            @XmlElement(name = "StatusDesc")
            protected String statusDesc;

            /**
             * Gets the value of the guarantyStatusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuarantyStatusCode() {
                return guarantyStatusCode;
            }

            /**
             * Sets the value of the guarantyStatusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuarantyStatusCode(String value) {
                this.guarantyStatusCode = value;
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
