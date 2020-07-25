package com.globallogic.myapp.interfaces;

public interface Animal {

    void dormir();

    void sonidoAnimal();

    default void Come(String s) {

        System.out.println("El " + s + " se alimenta");

    }

    static void Camina(String s) {

        System.out.println("El " + s + " camina");

    }

}