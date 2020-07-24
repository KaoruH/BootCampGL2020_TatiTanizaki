package com.globallogic.myapp.pilaresDeOOP.ejercicio3;

public class App {

    public static void main(String[] args) {
        
        Gato gato = new Gato();

        gato.setNombre("Neko-chan");
        gato.setPatas(3);

        System.out.println("El gato se llama " + gato.getNombre() + " y tiene " + gato.getPatas() + " patas.");


    }
    
}