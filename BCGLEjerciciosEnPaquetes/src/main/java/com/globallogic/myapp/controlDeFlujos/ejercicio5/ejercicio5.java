package com.globallogic.myapp.controlDeFlujos.ejercicio5;

public class ejercicio5 {

    public static void main(String[] args) {
        
        int contador = 0;

        for (int i = 0; i < 10000; i++) {

            if (i % 20 == 0) {
                
                contador++;
            }
            
        }

        System.out.println(contador);
    }
    
}