package com.globallogic.myapp.estructurasBasicas.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

    public static void main(String[] args) throws Exception {

        List<String> letters = new ArrayList<>();

        letters.add("A");

        letters.add("B");

        letters.add("C");

        System.out.println("Los elementos de la lista son: " + letters);
        
        System.out.println("La cantidad de elementos de la lista es: " + letters.size());

        letters.add(0, "X");

        System.out.println("La lista actualizada es: " + letters);

    }
    
}