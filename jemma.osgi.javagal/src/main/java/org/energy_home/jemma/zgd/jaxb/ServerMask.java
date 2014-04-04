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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerMask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServerMask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryTrustCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BackupTrustCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrimaryBindingTableCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BackupBindingTableCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrimaryDiscoveryCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BackupDiscoveryCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NetworkManager" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerMask", propOrder = {
    "primaryTrustCenter",
    "backupTrustCenter",
    "primaryBindingTableCache",
    "backupBindingTableCache",
    "primaryDiscoveryCache",
    "backupDiscoveryCache",
    "networkManager"
})
public class ServerMask {

    @XmlElement(name = "PrimaryTrustCenter")
    protected boolean primaryTrustCenter;
    @XmlElement(name = "BackupTrustCenter")
    protected boolean backupTrustCenter;
    @XmlElement(name = "PrimaryBindingTableCache")
    protected boolean primaryBindingTableCache;
    @XmlElement(name = "BackupBindingTableCache")
    protected boolean backupBindingTableCache;
    @XmlElement(name = "PrimaryDiscoveryCache")
    protected boolean primaryDiscoveryCache;
    @XmlElement(name = "BackupDiscoveryCache")
    protected boolean backupDiscoveryCache;
    @XmlElement(name = "NetworkManager")
    protected boolean networkManager;

    /**
     * Gets the value of the primaryTrustCenter property.
     * 
     */
    public boolean isPrimaryTrustCenter() {
        return primaryTrustCenter;
    }

    /**
     * Sets the value of the primaryTrustCenter property.
     * 
     */
    public void setPrimaryTrustCenter(boolean value) {
        this.primaryTrustCenter = value;
    }

    /**
     * Gets the value of the backupTrustCenter property.
     * 
     */
    public boolean isBackupTrustCenter() {
        return backupTrustCenter;
    }

    /**
     * Sets the value of the backupTrustCenter property.
     * 
     */
    public void setBackupTrustCenter(boolean value) {
        this.backupTrustCenter = value;
    }

    /**
     * Gets the value of the primaryBindingTableCache property.
     * 
     */
    public boolean isPrimaryBindingTableCache() {
        return primaryBindingTableCache;
    }

    /**
     * Sets the value of the primaryBindingTableCache property.
     * 
     */
    public void setPrimaryBindingTableCache(boolean value) {
        this.primaryBindingTableCache = value;
    }

    /**
     * Gets the value of the backupBindingTableCache property.
     * 
     */
    public boolean isBackupBindingTableCache() {
        return backupBindingTableCache;
    }

    /**
     * Sets the value of the backupBindingTableCache property.
     * 
     */
    public void setBackupBindingTableCache(boolean value) {
        this.backupBindingTableCache = value;
    }

    /**
     * Gets the value of the primaryDiscoveryCache property.
     * 
     */
    public boolean isPrimaryDiscoveryCache() {
        return primaryDiscoveryCache;
    }

    /**
     * Sets the value of the primaryDiscoveryCache property.
     * 
     */
    public void setPrimaryDiscoveryCache(boolean value) {
        this.primaryDiscoveryCache = value;
    }

    /**
     * Gets the value of the backupDiscoveryCache property.
     * 
     */
    public boolean isBackupDiscoveryCache() {
        return backupDiscoveryCache;
    }

    /**
     * Sets the value of the backupDiscoveryCache property.
     * 
     */
    public void setBackupDiscoveryCache(boolean value) {
        this.backupDiscoveryCache = value;
    }

    /**
     * Gets the value of the networkManager property.
     * 
     */
    public boolean isNetworkManager() {
        return networkManager;
    }

    /**
     * Sets the value of the networkManager property.
     * 
     */
    public void setNetworkManager(boolean value) {
        this.networkManager = value;
    }

}
