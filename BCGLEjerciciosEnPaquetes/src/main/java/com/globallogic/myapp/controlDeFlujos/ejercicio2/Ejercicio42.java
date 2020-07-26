package com.globallogic.myapp.controlDeFlujos.ejercicio2;

import java.util.Scanner;

public class Ejercicio42 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception{

        char valor;
        
        System.out.println("Ingrese una letra:");
        valor = keyboard.next().charAt(0);

        if (Character.isUpperCase(valor)) {

            System.out.println("Es una letra mayúscula");
            
        } else{

            System.out.println("No es una letra mayúscula");
        }

    }
    
}