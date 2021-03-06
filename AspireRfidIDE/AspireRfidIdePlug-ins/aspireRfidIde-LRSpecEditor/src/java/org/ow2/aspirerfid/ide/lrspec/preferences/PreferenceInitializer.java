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

package org.ow2.aspirerfid.ide.lrspec.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.ow2.aspirerfid.ide.lrspec.preferences.PreferenceConstants;
import org.ow2.aspirerfid.ide.lrspec.Activator;

/**
 * Class used to initialize default preference values.
 */
/**
 * @author Vasso Koletti e-mail: vkol@ait.edu.gr
 * @author Nikos Kefalakis (nkef) e-mail: nkef@ait.edu.gr
 * 
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	private String fileSeparator = System.getProperty("file.separator");
	private String userHome = System.getProperty("user.home");
	
	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_HAL_LRSpecsPATH, userHome +fileSeparator+ "AspireRFID"+fileSeparator+"IDE"+fileSeparator+"LRSpecs"+fileSeparator+"HAL"+fileSeparator);
		store.setDefault(PreferenceConstants.P_RP_LRSpecsPATH, userHome +fileSeparator+ "AspireRFID"+fileSeparator+"IDE"+fileSeparator+"LRSpecs"+fileSeparator+"RP"+fileSeparator);
		store.setDefault(PreferenceConstants.P_LLRP_LRSpecsPATH, userHome +fileSeparator+ "AspireRFID"+fileSeparator+"IDE"+fileSeparator+"LRSpecs"+fileSeparator+"LLRP"+fileSeparator);
		store.setDefault(PreferenceConstants.P_Composite_LRSpecsPATH, userHome + fileSeparator+"AspireRFID"+fileSeparator+"IDE"+fileSeparator+"LRSpecs"+fileSeparator+"Composite"+fileSeparator);
		store.setDefault(PreferenceConstants.P_ConnectionPoints, "http://localhost:8080,http://localhost:7070,http://localhost:6060");
		store.setDefault(PreferenceConstants.P_NotificationPoints, "http://localhost:8080,http://localhost:7070,http://localhost:6060");
		store.setDefault(PreferenceConstants.P_DynamicReaders, "DynamicImpinjLlrpReader,DynamicAccadaSimulatorRpReader,DynamicIntermecRpReader");
	}

}
