/*
   Copyright 2005-2008, OW2 Aspire RFID project 
   
   This library is free software; you can redistribute it and/or modify it 
   under the terms of the GNU Lesser General Public License as published by 
   the Free Software Foundation (the "LGPL"); either version 2.1 of the 
   License, or (at your option) any later version. If you do not alter this 
   notice, a recipient may use your version of this file under either the 
   LGPL version 2.1, or (at his option) any later version.
   
   You should have received a copy of the GNU Lesser General Public License 
   along with this library; if not, write to the Free Software Foundation, 
   Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
   
   This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY 
   KIND, either express or implied. See the GNU Lesser General Public 
   License for the specific language governing rights and limitations.

   Contact: OW2 Aspire RFID project <X AT Y DOT org> (with X=aspirerfid and Y=ow2)

   LGPL version 2.1 full text http://www.gnu.org/licenses/lgpl-2.1.txt    
*/
package org.ow2.aspirerfid.nfc.util;

/**
 * This class provides utility methods to print hexadecimal strings
 * @author Didier Donsez
 */
public class HexUtility {

	public static char[] hexSymbols={ '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
	
	public static String toHexString(byte[] byteArray){
		return toHexString(byteArray, "");
	}
	
	public static String toHexString(byte[] byteArray, String sep){
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			if(i!=0) sb.append(sep);
			byte b=byteArray[i];
			sb.append(hexSymbols[(b&0xF0)>>4]).append(hexSymbols[b&0x0F]);
		}
		return sb.toString(); 
	}
}
