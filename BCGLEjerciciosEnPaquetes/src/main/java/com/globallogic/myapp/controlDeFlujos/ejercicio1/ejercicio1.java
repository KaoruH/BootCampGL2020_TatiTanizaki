package com.globallogic.myapp.controlDeFlujos.ejercicio1;

// import java.util.Scanner;

public class ejercicio1 {

    // public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception{

        // int firstNumber, number;

        // System.out.println("Ingrese el primer número:");
        // firstNumber = keyboard.nextInt();

        // System.out.println("Ingrese el segundo número:");
        // number = keyboard.nextInt();

        int firstNumber = 3;
        int number = 10;

        number += firstNumber;

        number += firstNumber;

        if(number > 10){

            System.out.println("La suma de los dos números es mayor a 10");

        } else {

            System.out.println("La suma de los números es: " + number);
        }
        
    }
    
}