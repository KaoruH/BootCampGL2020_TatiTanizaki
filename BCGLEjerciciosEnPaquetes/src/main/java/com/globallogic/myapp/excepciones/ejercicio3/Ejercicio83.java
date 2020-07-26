package com.globallogic.myapp.excepciones.ejercicio3;

/* Ejercicio 8.3: Escriba código para generar y capturar la excepción 
ArrayIndexOutOfBoundsException (Índice de matriz fuera de límites) mostrando en la consola 
"Excepción: índice de array fuera de límites"*/

public class Ejercicio83 {

    public static void main(String[] args) throws Exception{

        try {

            String[] thisIsAStringArray = new String[3];

            thisIsAStringArray[5] = "Abracadabra";
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción: índice de array fuera de límites");
        }

    }

}