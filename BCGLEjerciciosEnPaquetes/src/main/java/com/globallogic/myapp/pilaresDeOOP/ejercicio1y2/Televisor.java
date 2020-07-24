package com.globallogic.myapp.pilaresDeOOP.ejercicio1y2;

public class Televisor extends Electrodomestico{

    public Televisor(String nombre, String marca, String color, double pulgadas) {
        super(nombre, marca, color);
        this.pulgadas = pulgadas;

    }

    private double pulgadas;

    private String resolucion;

    public void cambiarCanal(int canal){

        System.out.println("Cambiaste al canal " + canal);
        
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void escender(){

        System.out.println("Encendiendo Televisor");

    }

    @Override
    public void apagar(){

        System.out.println("Apagando Televisor");

    }
    
}