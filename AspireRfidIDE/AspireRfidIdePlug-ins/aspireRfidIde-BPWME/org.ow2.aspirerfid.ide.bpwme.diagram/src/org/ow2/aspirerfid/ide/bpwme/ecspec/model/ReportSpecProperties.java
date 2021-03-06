/*
 * Copyright ? 2008-2010, Aspire
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

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
/**
 * 
 * @author Yongming Luo <yluo@ait.edu.gr>
 *
 */
public class ReportSpecProperties implements IPropertySource{

	ReportSpec reportSpec;
	public ReportSpecProperties(ReportSpec reportSpec) {
		this.reportSpec = reportSpec;
	}

	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		IPropertyDescriptor[] propertyDescriptors = new IPropertyDescriptor[1];
		propertyDescriptors[0] = new TextPropertyDescriptor("Name", "Name");
		return propertyDescriptors;
	}

	@Override
	public Object getPropertyValue(Object id) {
		// TODO Auto-generated method stub
		return reportSpec.getName();
	}

	@Override
	public boolean isPropertySet(Object id) {
		
		return false;
	}

	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		// TODO Auto-generated method stub
		
	}

}
