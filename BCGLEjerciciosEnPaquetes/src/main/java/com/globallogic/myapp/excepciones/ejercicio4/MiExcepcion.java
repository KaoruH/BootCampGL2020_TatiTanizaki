package com.globallogic.myapp.excepciones.ejercicio4;

public class MiExcepcion extends Exception{

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    private String referenciaAlmacenada = "Cadena de Caracteres de Mi Excepcion";

    public String getReferenciaAlmacenada() {
        return referenciaAlmacenada;
    }

    public void setReferenciaAlmacenada(String referenciaAlmacenada) {
        this.referenciaAlmacenada = referenciaAlmacenada;
    }
    
}