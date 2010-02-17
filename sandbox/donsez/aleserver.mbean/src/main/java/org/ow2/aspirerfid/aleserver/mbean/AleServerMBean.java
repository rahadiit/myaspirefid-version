/**
 * Copyright (c) 2008-2010, AspireRFID
 *
 * This library is free software; you can redistribute it and/or
 * modify it either under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation
 * (the "LGPL"). If you do not alter this
 * notice, a recipient may use your version of this file under the LGPL.
 *
 * You should have received a copy of the LGPL along with this library
 * in the file COPYING-LGPL-2.1; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTY
 * OF ANY KIND, either express or implied. See the LGPL  for
 * the specific language governing rights and limitations.
 *
 * Contact: AspireRFID mailto:aspirerfid@ow2.org
 */

package org.ow2.aspirerfid.aleserver.mbean;

/**
 * provides a sample implementation of the ALE Server MBean
 * @author Didier Donsez
 */
public interface AleServerMBean {
    /**
     * dummy : get the uptime of the ALE Server
     * @return
     */
    public long getUptime();

    /**
     * dummy : invoke garbage collection
     * @return
     */
    public void gc();
    
    // TODO expose as MBeans some of the information EPC reading and logical reader API already provides (e.g. Reader names, ECSpec Names, ECSpec, LRSpecs ...). Moreover check if it is possible to provide some management/Monitoring regarding the Event cycles and the read cycles.
    public String[] getReaderNames();    
    public String[] getECSpecNames();
    
    public long getEventCycles();
    public long getReadCycles();
}
