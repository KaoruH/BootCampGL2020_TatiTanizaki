package com.globallogic.myapp.clasesyobjetos;

public class Persona {

    public Persona(int dni){
        this.dni = dni;
    }

    private String nombre;

    private int dni;

    private char casado;

    private int numeroDeHijos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getCasado() {
        return casado;
    }

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public int getNumeroDeHijos() {
        return numeroDeHijos;
    }

    public void setNumeroDeHijos(int numeroDeHijos) {
        this.numeroDeHijos = numeroDeHijos;
    }
    
}