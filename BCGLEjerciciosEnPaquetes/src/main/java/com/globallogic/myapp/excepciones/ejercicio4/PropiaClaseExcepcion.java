package com.globallogic.myapp.excepciones.ejercicio4;

/* Ejercicio 8.4: Crear su propia clase de excepción (Llamada MiExcepcion) 
extendiendo la clase Exception. Dicha clase deberá almacenar internamente 
una referencia de tipo String. Escriba un método que muestre la cadena 
de caracteres almacenada.

Crear otra clase llamada "PropiaClaseExcepcion" donde capture la excepción 
anterior y utilice el método para mostrar el sting almacenado. */

public class PropiaClaseExcepcion {

    public static void main(String[] args) throws Exception{

        try {

            throw(new MiExcepcion());


            
        } catch (MiExcepcion e) {

            System.out.println(e.getReferenciaAlmacenada());
            
            
        }
        
    }


}