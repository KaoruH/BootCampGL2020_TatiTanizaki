package com.globallogic.myapp.pilaresDeOOP.ejercicio1y2;

public class Heladera extends Electrodomestico{

    public Heladera(String nombre, String marca, String color, double capacidad) {
        super(nombre, marca, color);
        this.capacidad = capacidad;
    }

    private double capacidad;

    private boolean tieneFreezer;

    private double capacidadFreezer;

    public void guardarElemento(String elemento){

        System.out.println(elemento + " fue guardado.");

    }

    public void extraerElemento(String elemento){

        System.out.println(elemento + " fue extraido.");


    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean getTieneFreezer() {
        return tieneFreezer;
    }

    public void setTieneFreezer(boolean tieneFreezer) {
        this.tieneFreezer = tieneFreezer;
    }

    public double getCapacidadFreezer() {
        return capacidadFreezer;
    }

    public void setCapacidadFreezer(double capacidadFreezer) {
        this.capacidadFreezer = capacidadFreezer;
    }

    @Override
    public void escender(){

        System.out.println("Encendiendo Heladera");

    }

    @Override
    public void apagar(){

        System.out.println("Apagando Heladera");

    }



    
}