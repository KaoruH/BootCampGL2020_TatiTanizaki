package com.globallogic.myapp.interfaces;

public class Perro implements Animal {

    @Override
    public void dormir() {

        System.out.println("Zzz");

    }

    @Override
    public void sonidoAnimal() {

        System.out.println("El perro hace guau guau");

    }

    public void Come(String s) {

        Animal.super.Come(s);

    }

    public void Camina(String s) {

        Animal.Camina(s);
    }

}