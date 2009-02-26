/*
 * Copyright (c) 2008-2010, Aspire
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

package org.ow2.aspirerfid.tdt;

import java.util.*;
import java.lang.*;
import java.io.*;

import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.MarshalException;

import org.fosstrak.tdt.*;
import org.fosstrak.tdt.types.*;

/**
 *
 *	<p>This class provides methods for translating some codes (such as an electronic
 *	product code (EPC) or all GS1 codes) between various levels of representation
 *	including BINARY, TAG_ENCODING, PURE_IDENTITY, LEGACY and GS1_AI_ENCODING
 *	formats.  An additional output level ONS_HOSTNAME may be
 *	defined for some coding schemes. When the class AspireTDTEngine is
 *	constructed, the path to a local directory must be specified,
 *	by passing it as a single string parameter to the constructor
 *	method (without any trailing slash or file separator).  e.g.
 *      <pre><code>AspireTDTEngine engine = new AspireTDTEngine("/opt/TDT");</code></pre></p>
 *      
 *      <p>The specified directory must contain two subdirectories named
 *      auxiliary and schemes.  The Tag Data Translation definition files
 *      for the various coding schemes should be located inside the
 *      subdirectory called <code>schemes</code>. The Bar Code 
 *      information files for translation should be located inside the 
 *      subdirectory <code>schemes/barcode</code>. Any auxiliary lookup files
 *      (such as <code>ManagerTranslation.xml</code>) should be located inside the
 *      subdirectory called <code>auxiliary</code>.</p>
 *
 * @version Revision: 0.1 Date: 2008/09/22
 */

public class AspireTDTEngine {

    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

	// FossTrack Engine and Output Level Type
	private TDTEngine EpcTdt;
	private HashMap<String, LevelTypeList> EPCLevelTypeList = new HashMap<String, LevelTypeList>();

	// For GS1 Standards
	private GS1TDTEngine Gs1Tdt;
	private LinkedList<String> GS1TypeList = new LinkedList<String>();

	// For other than GS1
	//private ISOEngine IsoTdt;

	
    //---------------/
    //- Constructor -/
    //---------------/

    /**
     *	AspireTDTEngine - constructor for a new Tag Data Translation engine
     *	 
     *	@param path the string value of the path to a
     *	configuration directory consisting of two
     *	subdirectories, <code>schemes</code> and <code>auxiliary</code>.
     *
     *  <p>When the class TDTEngine is constructed, the path to a
     *  local directory must be specified, by passing it as a
     *  single string parameter to the constructor method
     *  (without any trailing slash or file separator).  e.g.
     *  <code><pre>AspireTDTEngine engine = new AspireTDTEngine("/opt/TDT");</pre></code></p>
     *  <p>The
     *  specified directory must contain two subdirectories named
     *  auxiliary and schemes.  The Tag Data Translation definition
     *  files for the various EPC coding schemes should be located
     *  inside the subdirectory called <code>schemes</code>. The Bar Code 
     *  information files for translation should be located inside the 
     *  subdirectory <code>schemes/barcode</code>. Any auxiliary
     *  lookup files (such as <code>ManagerTranslation.xml</code>) should be
     *  located inside the subdirectory called <code>auxiliary</code>.
     */
	public AspireTDTEngine(String path)
		throws FileNotFoundException, 
	      	       ValidationException,
	      	       MarshalException,
		       TDTException,
		       javax.xml.parsers.ParserConfigurationException,
		       org.xml.sax.SAXException,
		       IOException
	{
		// init fosstrack tdt engine
		this.EpcTdt= new TDTEngine(path);
		this.EPCLevelTypeList.put("BINARY",LevelTypeList.BINARY);
		this.EPCLevelTypeList.put("TAG_ENCODING",LevelTypeList.TAG_ENCODING);
		this.EPCLevelTypeList.put("PURE_IDENTITY",LevelTypeList.PURE_IDENTITY);
		this.EPCLevelTypeList.put("LEGACY",LevelTypeList.LEGACY);

		// init the gs1 tdt engine
		this.Gs1Tdt= new GS1TDTEngine(path);
		this.GS1TypeList.add("GS1_AI_ENCODING");
		this.GS1TypeList.add("LEGACY");

		// init the other tdt engine
		//this.ISOEngine= new ISOEngine(path);
	}


	
    //-----------/
    //- Methods -/
    //-----------/

    /** 
     *	Translates the input string of a specified input format to a
     *	specified output representation of the same coding scheme.  For
     *	example, the input string value may be a tag-encoding URI and
     *	the outbound level specified in the inputParameters by string outboundlevel
     *	may be BINARY, in which case the return value is a binary
     *	representation expressed as a string.
     * 
     *
     *  @param input input tag or bar code coding
     *  @param inputParameters a map with any additional properties.
     *  @return output tag or bar code coding
     */	public String convert(String input, Map<String,String> inputParameters) throws TDTException {

		if (!inputParameters.containsKey("dataType")) throw new TDTException("No data type in parameters");
		if (!inputParameters.containsKey("outputFormat")) throw new TDTException("No output format in parameters");

		String inputData=input;
		String outputData=new String();
		String dataType=inputParameters.get("dataType");
		String outputFormat=inputParameters.get("outputFormat");

		if (dataType.equalsIgnoreCase("GS1")) {
			// if input starts with "]", so its format is GS1_AI_ENCODING
			boolean inputIsGs1AIEncoding=(input.indexOf("]")==0);
			boolean inputIsLegacy=(input.indexOf("gtin=")!=-1);

			// if output format type is LEGACY
			if(outputFormat.equalsIgnoreCase("LEGACY")) {
				if(inputIsLegacy) outputData=inputData;
				else if (inputIsGs1AIEncoding) outputData=this.Gs1Tdt.convert(inputData, inputParameters);
				else outputData=this.EpcTdt.convert(inputData, inputParameters,LevelTypeList.LEGACY);
			// else if output format is GS1_AI_ENCODING
			} else if (outputFormat.equalsIgnoreCase("GS1_AI_ENCODING")) {
				if (!inputParameters.containsKey("gs1symbol")) throw new TDTException("No GS1 Bar Code Types symbol in parameters");
				if (((inputParameters.get("gs1symbol").compareTo("]E0")==0) || (inputParameters.get("gs1symbol").compareTo("]E4")==0)) && !inputParameters.containsKey("codelength")) throw new TDTException("No GTIN length in parameters");
				if (inputIsGs1AIEncoding) outputData=this.Gs1Tdt.convert(inputData, inputParameters);
				else {
					if(!inputIsLegacy) inputData=this.EpcTdt.convert(inputData, inputParameters,LevelTypeList.LEGACY);
					outputData=this.Gs1Tdt.convert(inputData, inputParameters);
				}
			// else if output format is EPC TDT format
			} else if (this.EPCLevelTypeList.containsKey(outputFormat.toUpperCase())) {
				if(inputIsGs1AIEncoding) {
					HashMap<String,String> extraparams = new HashMap<String, String>();
					extraparams.put("dataType",dataType);
					extraparams.put("outputFormat","LEGACY");
					extraparams.put("gs1symbol",inputParameters.get("gs1symbol"));
					inputData=this.Gs1Tdt.convert(inputData, extraparams);
				}
				outputData=this.EpcTdt.convert(inputData, inputParameters,EPCLevelTypeList.get(outputFormat));
			}
		// uCode or ISO case (NYI)
		} else {
			// error : no data type specified
			throw new TDTException("Invalid data type in parameters");
		}
		return outputData;


	}
}
