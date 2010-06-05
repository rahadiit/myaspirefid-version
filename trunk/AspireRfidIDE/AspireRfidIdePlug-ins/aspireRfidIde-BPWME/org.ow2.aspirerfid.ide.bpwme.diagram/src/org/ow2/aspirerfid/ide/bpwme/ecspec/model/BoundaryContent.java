/*
 * Copyright � 2008-2010, Aspire
 * 
 * Aspire is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License version 2.1 as published by
 * the Free Software Foundation (the "LGPL").
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library in the file COPYING-LGPL-2.1; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
 * KIND, either express or implied. See the GNU Lesser General Public License
 * for the specific language governing rights and limitations.
 */

package org.ow2.aspirerfid.ide.bpwme.ecspec.model;

import org.ow2.aspirerfid.ide.bpwme.ecspec.utils.ECSpecBuilder;

/**
 * 
 * @author Yongming Luo <yluo@ait.edu.gr>
 *
 */
public class BoundaryContent{
	String name;
	long value;
	ECSpecBuilder ecsb;
	public BoundaryContent(ECSpecBuilder ecsb, String name, long value) {
		this.name = name;
		this.value = value;
		this.ecsb = ecsb;
	}
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return Long.toString(value);
	}
	public void setValue(String value) {
		if(name.equals("Repeat Period")) {
			//System.out.println("set repeat");
			ecsb.setRepeatPeriod(Long.parseLong(value));
		} else if(name.equals("Duration")) {
			ecsb.setDuration(Long.parseLong(value));
		} else if(name.equals("Stable Set Interval")) {
			ecsb.setStableSetInterval(Long.parseLong(value));
		}
	}
}