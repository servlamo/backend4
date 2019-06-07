
package com.farzoom.lime.adapter.cbs.service.integration.model.stopfactor.request;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}OrgRec" maxOccurs="unbounded"/>
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
    "orgRec"
})
@XmlRootElement(name = "OrgList")
public class OrgList {

    @XmlElement(name = "OrgRec", required = true)
    protected List<OrgInfoType> orgRec;

    /**
     * Gets the value of the orgRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgInfoType }
     * 
     * 
     */
    public List<OrgInfoType> getOrgRec() {
        if (orgRec == null) {
            orgRec = new ArrayList<OrgInfoType>();
        }
        return this.orgRec;
    }

}
