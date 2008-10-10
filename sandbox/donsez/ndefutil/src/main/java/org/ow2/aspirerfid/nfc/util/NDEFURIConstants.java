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
 * This class provides constants and methods for NDEF URI records
 * @author Didier Donsez
 */
public class NDEFURIConstants {

	public static final String[] NDEF_URI_IDENTIFIER_CODE={
		"",
		"http://www.",
		"https://www.",
		"http://",
		"https://",
		"tel:",
		"mailto:",
		"ftp://anonymous:anonymous@",
		"ftp://ftp.",
		"ftps://",
		"sftp://",
		"smb://",
		"nfs://",
		"ftp://",
		"dav://",
		"news:",
		"telnet://",
		"imap:",
		"rtsp://",
		"urn:",
		"pop:",
		"sip:",
		"sips:",
		"tftp:",
		"btspp://",
		"btl2cap://",
		"btgoep://",
		"tcpobex://",
		"irdaobex://",
		"file://",
		"urn:epc:id:",
		"urn:epc:tag:",
		"urn:epc:pat:",
		"urn:epc:raw:",
		"urn:epc:",
		"urn:nfc:"
	};

	public static int getURLPrefixCode(String url){		
		for (int i = 1; i < NDEF_URI_IDENTIFIER_CODE.length; i++) {
			if(url.startsWith(NDEF_URI_IDENTIFIER_CODE[i])) return i;
		}
		return 0;
	}
	
	public static String getURLSuffix(String url){
		for (int i = 1; i < NDEF_URI_IDENTIFIER_CODE.length; i++) {
			if(url.startsWith(NDEF_URI_IDENTIFIER_CODE[i])) {
				return url.substring(NDEF_URI_IDENTIFIER_CODE[i].length());
			}
		}
		return url;
	}	
}
