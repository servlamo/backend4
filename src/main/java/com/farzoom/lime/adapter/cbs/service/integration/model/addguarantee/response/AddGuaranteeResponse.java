
package com.farzoom.lime.adapter.cbs.service.integration.model.addguarantee.response;

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
 *         &lt;element name="BankSvcRs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}RequestId" minOccurs="0"/>
 *                   &lt;element ref="{}AgreemtNum" minOccurs="0"/>
 *                   &lt;element ref="{}AgreemtId" minOccurs="0"/>
 *                   &lt;element ref="{}Status"/>
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
public class AddGuaranteeResponse {

    @XmlElement(name = "ServerInfo", required = true)
    protected ServerInfoType serverInfo;
    @XmlElement(name = "BankSvcRs", required = true)
    protected AddGuaranteeResponse.BankSvcRs bankSvcRs;

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
     *     {@link AddGuaranteeResponse.BankSvcRs }
     *     
     */
    public AddGuaranteeResponse.BankSvcRs getBankSvcRs() {
        return bankSvcRs;
    }

    /**
     * Sets the value of the bankSvcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddGuaranteeResponse.BankSvcRs }
     *     
     */
    public void setBankSvcRs(AddGuaranteeResponse.BankSvcRs value) {
        this.bankSvcRs = value;
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
     *         &lt;element ref="{}RequestId" minOccurs="0"/>
     *         &lt;element ref="{}AgreemtNum" minOccurs="0"/>
     *         &lt;element ref="{}AgreemtId" minOccurs="0"/>
     *         &lt;element ref="{}Status"/>
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
    public static class BankSvcRs {

        @XmlElement(name = "RequestId")
        protected String requestId;
        @XmlElement(name = "AgreemtNum")
        protected String agreemtNum;
        @XmlElement(name = "AgreemtId")
        protected String agreemtId;
        @XmlElement(name = "Status", required = true)
        protected Status status;

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
         * Gets the value of the agreemtId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreemtId() {
            return agreemtId;
        }

        /**
         * Sets the value of the agreemtId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreemtId(String value) {
            this.agreemtId = value;
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

    }

}
