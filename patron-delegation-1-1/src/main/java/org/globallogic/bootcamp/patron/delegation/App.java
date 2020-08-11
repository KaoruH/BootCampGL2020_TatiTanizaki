package org.globallogic.bootcamp.patron.delegation;

import org.globallogic.bootcamp.patron.delegation.clases.ElectricalOven;

public class App 
{
    public static void main( String[] args ) {

        ElectricalOven electricalOven = new ElectricalOven();
       
        System.out.println("Energia inicial: " + electricalOven.getPower());
        
        electricalOven.turnOn();
        
        System.out.println("Energia despues de prender: " + electricalOven.getPower());
        
        electricalOven.turnLed();
        
        System.out.println("Energia final despues de prender el led: " + electricalOven.getPower());
        
    }
}
