/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Fosstrak (www.fosstrak.org).
 *
 * Fosstrak is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Fosstrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Fosstrak; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.fosstrak.ale.server;

import org.fosstrak.ale.exception.ECSpecValidationException;

/**
 * This clas represents a data field of a tag, filter or group pattern.
 * 
 * @author regli
 */
public class PatternDataField {

	/** string representation of this data field */
	private final String stringRepresentation;
	/** indicates if this datafield contains an asterisk */
	private final boolean isAsterisk;
	/** indicates if this datafield conains an X */
	private final boolean isX;
	/** indicates if this data field contains an int */
	private final boolean isFloat;
	/** indicates if this data field contains a range */
	private final boolean isRange;
	
	/** value of this data field if it is an int field */
	private long value;
	/** lower limit of the range of this data field if this data field contains a range */ 
	private long low;
	/** higher limit of the range of this data field if this data field contains a range */
	private long high;

	/**
	 * Constructor parses and validates the string representation of the data field.
	 * 
	 * @param stringRepresentation of the data field
	 * @param usage of the pattern this data field belongs to
	 * @throws ECSpecValidationException if the data field is invalid
	 */
	public PatternDataField(String stringRepresentation, PatternUsage usage) throws ECSpecValidationException {
		
		this.stringRepresentation = stringRepresentation;
		
		// check for asterisk
		if ((usage == PatternUsage.FILTER || usage == PatternUsage.GROUP) && "*".equals(stringRepresentation)) {
			isAsterisk  = true;
			isX = false;
			isFloat = false;
			isRange = false;
			return;
		} else {
			isAsterisk = false;
		}
		
		// check for X if usage is group
		if (usage == PatternUsage.GROUP && "X".equals(stringRepresentation)) {
			isX = true;
			isFloat = false;
			isRange = false;
			return;
		} else {
			isX = false;
		}
		
		// check for int
		try {
			//changed by Rim Driss
			value = Long.parseLong(stringRepresentation);
		} catch(NumberFormatException e) {
			
			if (usage == PatternUsage.TAG) {
				throw new ECSpecValidationException("Invalid data field '" + stringRepresentation + "'. " +
						"Only 'int' is allowed.");
			}
			
			// check for range
			String[] parts = stringRepresentation.split("-");
			if (parts.length != 2 || !parts[0].startsWith("[") || !parts[1].endsWith("]")) {
				throw new ECSpecValidationException("Invalid data field '" + stringRepresentation + "'. " +
						"Only '*', " + (usage == PatternUsage.GROUP ? "'X', " : "") + "'[lo-hi]' or 'int' are allowed.");
			}
			try {
				//changed by Rim Driss
				low = Long.parseLong(parts[0].substring(1));
				high = Long.parseLong(parts[1].substring(0, parts[1].length() - 1));
			} catch (NumberFormatException e1) {
				throw new ECSpecValidationException("Invalid data field '" + stringRepresentation + "'. " +
						"Only '*', " + (usage == PatternUsage.GROUP ? "'X', " : "") + "'[lo-hi]' or 'int' are allowed.");
			}
			
			// check if low is lower than high
			if (low <= high) {
				isRange = true;
			} else {
				throw new ECSpecValidationException("Invalid range '" + stringRepresentation + "'. " + "Range must have the form '[lo-hi]' with lo <= hi.");
			}
			isFloat = false;
			return;
		}

		// check if value is positive
		if (value >= 0) {
			isFloat = true;
		} else {
			throw new ECSpecValidationException("Invalid data field '" + stringRepresentation + "' in pattern '. " +
					"Only positive int is allowed.");
		}
		isRange = false;
		
	}
	
	/**
	 * This method indicates if this data field contains an asterisk.
	 * 
	 * @return true if this data field contains an asterisk and false otherwise
	 */
	public boolean isAsterisk() {
		
		return isAsterisk;
		
	}
	
	/**
	 * This method indicates if this data field contains an X.
	 * 
	 * @return true if this data field contains an X and false otherwise
	 */
	public boolean isX() {
		
		return isX;
		
	}
	
	/**
	 * This method indicates if this data field contains an int.
	 * 
	 * @return true if this data field contains an int and false otherwise
	 */
	public boolean isFloat() {
		
		return isFloat;
	}
	
	/**
	 * This method indicates if this data field contains a range.
	 * 
	 * @return true if this data field contains a range and false otherwise 
	 */
	public boolean isRange() {
		
		return isRange;
		
	}
	
	/**
	 * This method returns the value of this data field if this data field contains an int
	 * and throws an exception otherwise.
	 * 
	 * @return value of data field
	 * @throws ECSpecValidationException if the data field contains not an int
	 */
	public long getValue() throws ECSpecValidationException {

		if (isFloat) {
			return value;
		} else {
			throw new ECSpecValidationException("Data field is not an int.");
		}
		
	}
	
	/**
	 * This method returns the lower limit of the range of this data field if this data field
	 * contains a range and throws an exception otherwise.
	 * 
	 * @return lower limit of the range of this data field
	 * @throws ECSpecValidationException if the data field contains not a range
	 */
	public long getLow() throws ECSpecValidationException {
		
		if (isRange) {
			return low;
		} else {
			throw new ECSpecValidationException("Data field is not a range.");
		}
		
	}
	
	/**
	 * This method returns the higher limit of the range of this data field if this data field
	 * contains a range and throws an exception otherwise.
	 * 
	 * @return higher limit of the range of this data field
	 * @throws ECSpecValidationException if the data field contains not a range
	 */
	public long getHigh() throws ECSpecValidationException {
		
		if (isRange) {
			return high;
		} else {
			throw new ECSpecValidationException("Data field is not a range.");
		}
		
	}
	
	/**
	 * This method indicates if this data field is disjoint to the specified data field.
	 * 
	 * @param field to check disjointness
	 * @return true if the data field are disjoint and false otherwise
	 * @throws ECSpecValidationException if an implementation exception occurs
	 */
	public boolean isDisjoint(PatternDataField field) throws ECSpecValidationException {

		if (isAsterisk || isX || field.isAsterisk() || field.isX()) {
			return false;
		}
		if (isFloat) {
			if (field.isFloat()) {
				if (value == field.getValue()) {
					return false;
				} else {
					return true;
				}
			} else if (field.isRange()) {
				if (field.getLow() <= value && value <= field.getHigh()) {
					return false;
				} else {
					return true;
				}
			}
		} else if (isRange) {
			if (field.isFloat()) {
				if (low <= field.getValue() && field.getValue() <= high) {
					return false;
				} else {
					return true;
				}
			} else if (field.isRange()) {
				if ((field.getLow() <= low && low <= field.getHigh()) || (field.getLow() <= high && high <= field.getHigh())) {
					return false;
				} else {
					return true;
				}
			}
		}
		return false;
		
	}
	
	/**
	 * This method indicates if the specified field value is a member of this data field.
	 * 
	 * @param fieldValue to check for member.
	 * @return true if the specified value is member of this data field
	 */
	public boolean isMember(float fieldValue) {
		
		if (isFloat) {
			
			// if pattern field is an int, the tag field must be the same int
			if (value != fieldValue) {
				return false;
			}
		} else if (isRange) {
			
			// if pattern field is a range, the tag field must be in this range
			if (fieldValue < low || fieldValue > high) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	/**
	 * This method returns a string representation of this data field.
	 * 
	 * @return string representation
	 */
	public String toString() {
		
		return stringRepresentation;
		
	}
	
}