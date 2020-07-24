package com.globallogic.myapp.pilaresDeOOP.ejercicio1y2;

public class Cafetera extends Electrodomestico {

    public Cafetera(String nombre, String marca, String color, double litros) {
        super(nombre, marca, color);
        this.litros = litros;
    }

    private double litros;

    public void eligirSabor(String sabor){

        System.out.println("Eligiste el sabor " + sabor);

        
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    @Override
    public void escender(){

        System.out.println("Encendiendo Cafetera");

    }

    @Override
    public void apagar(){

        System.out.println("Apagando Cafetera");

    }
}