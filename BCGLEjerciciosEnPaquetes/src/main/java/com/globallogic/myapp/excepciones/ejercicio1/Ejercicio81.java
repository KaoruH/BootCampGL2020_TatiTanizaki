package com.globallogic.myapp.excepciones.ejercicio1;

// Ejercicio 8.1: 
// Crear una clase con un método main() 
// Generar un objeto de la clase Exception dentro de un bloque try. 
// Proporcionar al constructor de Exception un argumento String. 
// Capturar la excepción dentro de una cláusula catch e imprimir el argumento String. 
// Añadir una cláusula finally e imprima el mensaje "Esto se ejecuta sin importar si se presentan errores" para demostrar que pasó por allí.

// Se espera como salida:
// Se produjo una excepción: Esto es una Excepción
// Esto se ejecuta sin importar si se presentan errores

public class Ejercicio81 {

    public static void main(String[] args) throws Exception {

        try {
            
            throw(new Exception("Se produjo una excepción: Esto es una Excepción"));

        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        }
        finally {

            System.out.println("Esto se ejecuta sin importar si se presentan errores");
        }
        
    }
    
}