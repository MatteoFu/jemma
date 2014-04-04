/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.03 at 05:23:14 PM CEST 
//


package org.energy_home.jemma.zgd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NodeServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.zigbee.org/GWGSchema}Address"/>
 *         &lt;element name="ActiveEndpoints" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EndPoint" type="{http://www.zigbee.org/GWGSchema}Endpoint"/>
 *                   &lt;element name="SimpleDescriptor" type="{http://www.zigbee.org/GWGSchema}SimpleDescriptor" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "NodeServices", propOrder = {
    "address",
    "activeEndpoints"
})
public class NodeServices {

    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "ActiveEndpoints")
    protected List<NodeServices.ActiveEndpoints> activeEndpoints;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the activeEndpoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeEndpoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveEndpoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeServices.ActiveEndpoints }
     * 
     * 
     */
    public List<NodeServices.ActiveEndpoints> getActiveEndpoints() {
        if (activeEndpoints == null) {
            activeEndpoints = new ArrayList<NodeServices.ActiveEndpoints>();
        }
        return this.activeEndpoints;
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
     *         &lt;element name="EndPoint" type="{http://www.zigbee.org/GWGSchema}Endpoint"/>
     *         &lt;element name="SimpleDescriptor" type="{http://www.zigbee.org/GWGSchema}SimpleDescriptor" minOccurs="0"/>
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
        "endPoint",
        "simpleDescriptor"
    })
    public static class ActiveEndpoints {

        @XmlElement(name = "EndPoint")
        protected short endPoint;
        @XmlElement(name = "SimpleDescriptor")
        protected SimpleDescriptor simpleDescriptor;

        /**
         * Gets the value of the endPoint property.
         * 
         */
        public short getEndPoint() {
            return endPoint;
        }

        /**
         * Sets the value of the endPoint property.
         * 
         */
        public void setEndPoint(short value) {
            this.endPoint = value;
        }

        /**
         * Gets the value of the simpleDescriptor property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleDescriptor }
         *     
         */
        public SimpleDescriptor getSimpleDescriptor() {
            return simpleDescriptor;
        }

        /**
         * Sets the value of the simpleDescriptor property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleDescriptor }
         *     
         */
        public void setSimpleDescriptor(SimpleDescriptor value) {
            this.simpleDescriptor = value;
        }

    }

}
