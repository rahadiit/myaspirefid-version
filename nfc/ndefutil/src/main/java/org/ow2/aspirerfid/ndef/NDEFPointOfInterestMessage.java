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
package org.ow2.aspirerfid.ndef;


/**
 * This class represents a NDEF message containing a point of interest (POI)
 * @link http://www.nfc-forum.org/specs
 * @link http://en.wikipedia.org/wiki/Point_of_interest
 * @author Didier Donsez
 */
public class NDEFPointOfInterestMessage extends NDEFSmartPosterMessage {

	/**
	 * Constructor of a NDEF Message containing a point of interest
	 */
	public NDEFPointOfInterestMessage(String urlstr, /*icon,recommendedAction,*/ String[] langs, String[] texts,
			float latitude, float longitude) {
			super(urlstr, /*icon,recommendedAction,*/langs,texts);
    	    this.appendRecord(new NDEFLocationRecord(latitude,longitude));
	}	

	/**
	 * Constructor of a NDEF Message containing a point of interest
	 */
	public NDEFPointOfInterestMessage(String urlstr, /*icon,recommendedAction,*/ String[] langs, String[] texts,
			float latitude, float longitude, float altitude) {
			super(urlstr, /*icon,recommendedAction,*/langs,texts);
    	    this.appendRecord(new NDEFLocationRecord(latitude,longitude,altitude));
	}	

	/**
	 * Constructor of a NDEF Message containing a point of interest
	 */
	public NDEFPointOfInterestMessage(String urlstr, /*icon,recommendedAction,*/ String[] langs, String[] texts,
			float latitude, float longitude, float altitude, float bearing) {
			super(urlstr, /*icon,recommendedAction,*/langs,texts);
    	    this.appendRecord(new NDEFLocationRecord(latitude,longitude,altitude,bearing));
	}	
}
