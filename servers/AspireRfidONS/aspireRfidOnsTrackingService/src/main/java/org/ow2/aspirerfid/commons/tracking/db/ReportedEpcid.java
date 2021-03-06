/*
 * Copyright (C) 2008-2010, Aspire
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

package org.ow2.aspirerfid.commons.tracking.db;
// default package
// Generated 13 ??? 2010 8:25:25 ?? by Hibernate Tools 3.3.0.GA

/**
 * ReportedEpcid generated by hbm2java
 */
public class ReportedEpcid implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2028233414410719290L;
	private int id;
	private String tagId;
	private String latitude;
	private String longtitude;

	public ReportedEpcid() {
	}

	public ReportedEpcid(String tagId) {
		this.tagId = tagId;
	}

	public ReportedEpcid(String tagId, String latitude, String longtitude) {
		this.tagId = tagId;
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

}
