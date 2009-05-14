/*
 * SensorSampler.java
 *
 * Copyright (c) 2008 Sun Microsystems, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */


package org.sunspotworld.demo;

import com.sun.spot.sensorboard.EDemoBoard;
import com.sun.spot.sensorboard.io.IScalarInput;
import com.sun.spot.io.j2me.radiogram.*;
import com.sun.spot.sensorboard.peripheral.ITemperatureInput;
import com.sun.spot.sensorboard.peripheral.ITriColorLED;
import com.sun.spot.util.BootloaderListener;
import com.sun.spot.util.Utils;
import javax.microedition.io.*;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/**
 * This application is the 'on SPOT' portion of the SendDataDemo. It
 * periodically samples a sensor value on the SPOT and transmits it to
 * a desktop application (the 'on Desktop' portion of the SendDataDemo)
 * where the values are displayed.
 *
 * @author: Vipul Gupta
 * modified: Ron Goldman
 */
public class SensorSampler extends MIDlet {

    private static final int HOST_PORT = 67;
    private static final int SAMPLE_PERIOD = 10 * 1000;  // in milliseconds
    
    protected void startApp() throws MIDletStateChangeException {
        
        new BootloaderListener().start();   // monitor the USB (if connected) and recognize commands from host
        
        RadiogramConnection rCon = null;
        Datagram dg = null;
        String ourAddress = System.getProperty("IEEE_ADDRESS");
        long now = 0L;
        
        IScalarInput lightSensor =  EDemoBoard.getInstance().getLightSensor();
        ITemperatureInput tempSensor = EDemoBoard.getInstance().getADCTemperature();  
        
        int readingLightValue = 0;
        double readingTemperatureValue = 0;
        
        ITriColorLED[] leds = EDemoBoard.getInstance().getLEDs();
        
        System.out.println("Starting sensor sampler application on " +
                ourAddress + " ...");
        try {
            // Open up a broadcast connection to the host port
            // where the 'on Desktop' portion of this application is listening
            rCon = (RadiogramConnection) Connector.open("radiogram://broadcast:" + HOST_PORT);
            dg = rCon.newDatagram(50);  // only sending 12 bytes of data
        } catch (Exception e) {
            System.err.println("Caught " + e + " in connection initialization.");
            System.exit(1);
        }
        
        boolean tempUpdated = false;
                
        while (true) {
            try {
                // Get the current time and sensor reading
                now = System.currentTimeMillis();
                readingLightValue = lightSensor.getValue();
                // update the temperature value only every two periods
                if (!tempUpdated){
                    readingTemperatureValue = tempSensor.getCelsius();
                    tempUpdated = true;
                } else
                    tempUpdated = false;
                
                
                // Flash an LED to indicate a sampling event
                leds[7].setRGB(255, 255, 255);
                leds[7].setOn();

                // Package the time and sensor reading into a radio datagram and send it.
                dg.reset();
                dg.writeLong(now);
                dg.writeInt(readingLightValue);
                dg.writeDouble(readingTemperatureValue);
                rCon.send(dg);

                System.out.println("Light value = " + readingLightValue);
                System.out.println("Temperature value = " + readingTemperatureValue);
                
                leds[7].setOff();
                
                // Go to sleep to conserve battery
                Utils.sleep(SAMPLE_PERIOD - (System.currentTimeMillis() - now));
            } catch (Exception e) {
                System.err.println("Caught " + e + " while collecting/sending sensor sample.");
            }
        }
    }
    
    protected void pauseApp() {
        // This will never be called by the Squawk VM
    }
    
    protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
        // Only called if startApp throws any exception other than MIDletStateChangeException
    }
}