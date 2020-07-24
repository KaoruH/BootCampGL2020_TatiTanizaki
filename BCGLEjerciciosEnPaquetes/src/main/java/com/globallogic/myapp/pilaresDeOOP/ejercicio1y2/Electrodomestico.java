package com.globallogic.myapp.pilaresDeOOP.ejercicio1y2;

public class Electrodomestico {

    public Electrodomestico(String nombre, String marca, String color){
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
    }

    private String nombre;

    private String marca;

    private double peso;

    private char consumo;

    private String color;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void escender(){

        System.out.println("Encendiendo electrodoméstico");

    }

    public void apagar(){

        System.out.println("Apagando electrodoméstico");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}