package com.globallogic.myapp.interfaces;

// Ejercicio 7.3 : Metodo default y múltiples interfaces 
// Pasos:
// Crear una interfaz Persona.
// Crear dos métodos hablar, dormir y un método por default come.
// Crear una clase Hombre que implemente la clase Animal y Persona.
// Implementar los métodos creados en ambas interfaces.
// En cada método mostrar un mensaje de salida.
// En la misma clase agregar un método main().
// Crear un objeto de tipo Hombre e invocar a los métodos implementados anteriormente.
// Validar la salida.

// Se espera como salida: 
// El hombre duerme muchas horas
// Las personas hablan mucho
// El hombre no hace sonidos de animal
// Se ejecuta método de la clase Hombre 

public class Hombre implements Animal, Persona {

    @Override
    public void hablar() {

        System.out.println("Las personas hablan mucho");
    }

    @Override
    public void dormir() {

        System.out.println("El hombre duerme muchas horas");
    }

    @Override
    public void sonidoAnimal() {

        System.err.println("El hombre no hace sonidos de animal");
    }

    public static void main(String[] args) {

        Hombre hombre = new Hombre();

        hombre.dormir();
        hombre.hablar();
        hombre.sonidoAnimal();
        metodoClaseHombre();
    }

    // El punto "Se ejecuta método de la clase Hombre" es confuso, verificar
    public static void metodoClaseHombre() {

        System.out.println("Se ejecuta método de la clase Hombre ");
    }

}
