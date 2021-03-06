Fosstrak Filtering and Collection Project
=======================================

This directory contains the modules of the Fosstrak Filtering and Collection project. The objective of the
project is to implement the Application Level Event (ALE) specification and to develop the appropriate
tools that facilitate communication with the filtering and collection instance.

This version of the Fosstrak Filtering and Collection implements the EPCglobal ALE Specification 1.0 and
provides a Java Swing-based and a Web-based test client.

The Fosstrak Filtering and Collection is part of the Fosstrak Open Source RFID prototyping platform that 
implements the EPC Network specifications. At www.fosstrak.org, there is also software available that 
implements the ALE, TDT, and EPCIS specification of EPCglobal.

For more information,  please see the README.txt in the subdirectories of the modules and the information at http://www.fosstrak.org/fc/


Note regarding the license
==========================
This module is updated according to LLRP v1.1 EPCGlobal standard. For this update, some modifications are 
done on the LLRP toolkit source code in order to generate the updated library "ltkjava-1.0.0.7-SNAPSHOT".
This component (the updated library) is under Apache 2.0 license.


Development using Eclipse
=========================

In order to work on the Fosstrak Filtering and Collection (fc) module
using Eclipse, please follow these instructions:


1. Eclipse needs to know the path to the local maven repository. Execute
   the following command to automatically set up the corresponding
   classpath variable (M2_REPO) accordingly:

      mvn -Declipse.workspace=<path-to-eclipse-workspace> eclipse:add-maven-repo


2. In the "fc" directory, run the following command:

      mvn -Dwtpversion=1.0 eclipse:eclipse

   Please indicate the version of the Web Tools Project (WTP) you use in your
   Eclipse installation. Please note that maven does not currently support
   wtpversion=1.5. However, wtpversion=1.0 will work fine with WTP 1.5.x.


3. Import the four modules fc-commons, fc-server, fc-client, fc-webclient in
   Eclipse (from the menu bar, select File > Import > Existing Projects into Workspace).
