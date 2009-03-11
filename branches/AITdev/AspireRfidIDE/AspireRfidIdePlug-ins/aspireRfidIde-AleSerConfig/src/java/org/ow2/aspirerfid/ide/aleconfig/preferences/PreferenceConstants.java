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

package org.ow2.aspirerfid.ide.aleconfig.preferences;

/**
 * Constant definitions for plug-in preferences

 * @author Vasso Koletti e-mail: vkol@ait.edu.gr
 * @author Nikos Kefalakis (nkef) e-mail: nkef@ait.edu.gr
 *
 */



public class PreferenceConstants {

	public static final String P_ECSpecsPATH = System.getProperty("user.home")+ "\\AspireRFID\\IDE\\ECSpecs\\";//"C:\\ASPIRE_APPLICATION_FILES\\ECSpecs\\";
	
	public static final String P_HAL_LRSpecsPATH = System.getProperty("user.home")+ "\\AspireRFID\\IDE\\LRSpecs\\HAL\\"; //"C:\\ASPIRE_APPLICATION_FILES\\LRSpecs\\HAL\\";
	public static final String P_RP_LRSpecsPATH = System.getProperty("user.home")+ "\\AspireRFID\\IDE\\LRSpecs\\RP\\"; //"C:\\ASPIRE_APPLICATION_FILES\\LRSpecs\\RP\\";
	public static final String P_LLRP_LRSpecsPATH = System.getProperty("user.home")+ "\\AspireRFID\\IDE\\LRSpecs\\LLRP\\"; //"C:\\ASPIRE_APPLICATION_FILES\\LRSpecs\\LLRP\\";
	public static final String P_Composite_LRSpecsPATH = System.getProperty("user.home")+ "\\AspireRFID\\IDE\\LRSpecs\\Composite\\"; //"C:\\ASPIRE_APPLICATION_FILES\\LRSpecs\\Composite\\";

	public static final String P_ALEClientEndPointSTRING = "http://localhost:8080/aspireALE0.3.1m/services/ALEService";

	public static final String P_ALELRClientEndPointSTRING = "http://localhost:8080/aspireALE0.3.1m/services/ALELRService";

	public static final String P_NotificationURI = "http://localhost:8080,http://localhost:7070,http://localhost:6060";

	public static final String P_ReaderNames = "AccadaSimulatorWithRPProxy,SmartLabIntermecLogicalReader";

	public static final String P_ConnectionPoints = "http://localhost:8080,http://localhost:7070,http://localhost:6060";
	public static final String P_NotificationPoints = "http://localhost:8080,http://localhost:7070,http://localhost:6060";
	public static final String P_ECSpecNames = "ECSpec_additions,ECSpec_current,ECSpec_deletions";
}
