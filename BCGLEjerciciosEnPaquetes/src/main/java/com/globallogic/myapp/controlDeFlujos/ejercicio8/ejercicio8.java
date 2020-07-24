package com.globallogic.myapp.controlDeFlujos.ejercicio8;

public class ejercicio8 {

    public static void main(String[] args) {
        
        int iterador = 1;

        while (iterador <= 50) {

            if (iterador % 2 == 0) {

                System.out.println("Valor iterado " + iterador + " par");
                
            } else {

                System.out.println("Valor iterado " + iterador + " impar");
            }

            iterador++;

        }
    }
    
}