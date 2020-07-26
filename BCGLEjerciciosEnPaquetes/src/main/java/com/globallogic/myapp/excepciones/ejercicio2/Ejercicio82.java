package com.globallogic.myapp.excepciones.ejercicio2;

public class Ejercicio82 {

    public static void main(String[] args) throws Exception{

        try {
            
            String thisIsANullObject = null;

            thisIsANullObject.toLowerCase();

        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepcion. " + e.getMessage());
        } 
        
    }
    
}