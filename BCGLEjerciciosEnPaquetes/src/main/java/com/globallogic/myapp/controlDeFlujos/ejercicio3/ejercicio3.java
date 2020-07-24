package com.globallogic.myapp.controlDeFlujos.ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        double price;

        System.out.println("Insira el total de la compra:");
        price = keyboard.nextDouble();

        if (price == 300) {

            System.out.println("El descuento es de: $60");
            
        } else if (price > 350) {

            price = price * 0.25;

            System.out.println("El descuento es de: $" + price);
            
        } else{
            System.out.println("Sin descuentos, el total es: " + price);
        }
        

    }
    
}