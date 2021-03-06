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
package org.energy_home.jemma.ah.hac;

/**
 * Situations related to an invalid appliance state 
 */
public class ApplianceValidationException extends ApplianceException {
	private static final long serialVersionUID = 7255877234372829641L;
	
	/**
	 * Creates an {@code ApplianceValidationException} 
	 */
	public ApplianceValidationException() {
		super("ApplianceValidationException");
	}
	
	/**
	 * Creates an {@code ApplianceValidationException} on the specified error
	 * description
	 * 
	 * @param errorDescription
	 *            describes the type of error
	 */
	public ApplianceValidationException(String errorDescription) {
		super(errorDescription);
	}
}