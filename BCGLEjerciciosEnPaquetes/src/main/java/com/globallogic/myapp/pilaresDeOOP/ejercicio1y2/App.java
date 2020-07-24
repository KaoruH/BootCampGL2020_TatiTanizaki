package com.globallogic.myapp.pilaresDeOOP.ejercicio1y2;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<Electrodomestico> listaElectodomesticos = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        inicializar();

        for (Electrodomestico electrodomestico : listaElectodomesticos) {

            imprimirTodo(electrodomestico);

        }

        // No iba a hacer este otro for, pero como pide especificamente el la consigna:

        for (Electrodomestico electrodomestico : listaElectodomesticos) {

            escender(electrodomestico);
            
        }

    }

    // Los voy a dejar por acá mismo:

    public static void inicializar() {

        Electrodomestico electrodomestico = new Electrodomestico("Electrodoméstico", "Electrolux", "negro");
        electrodomestico.setPeso(60.5);
        electrodomestico.setConsumo('A');

        listaElectodomesticos.add(electrodomestico);

        Heladera heladera = new Heladera("Heladera", "Dacu", "rosa", 80.5);
        heladera.setPeso(100.2);
        heladera.setConsumo('B');
        heladera.setTieneFreezer(true);
        heladera.setCapacidadFreezer(20.2);

        listaElectodomesticos.add(heladera);

        Cafetera cafetera = new Cafetera("Cafetera", "Brastemp", "blanco", 3.4);
        cafetera.setPeso(2.5);
        cafetera.setConsumo('C');

        listaElectodomesticos.add(cafetera);

        Televisor televisor = new Televisor("Televisor", "TopHouse", "Amarillo", 46);
        televisor.setPeso(10);
        televisor.setConsumo('A');
        televisor.setResolucion("4D");

        listaElectodomesticos.add(televisor);

    }

    public static void imprimirTodo(Electrodomestico electrodomestico) {

        System.out.println(electrodomestico.getNombre() + ":");
        System.out.println("Marca: " + electrodomestico.getMarca());
        System.out.println("Color: " + electrodomestico.getColor());
        System.out.println("Peso: " + electrodomestico.getPeso());
        System.out.println("Consumo: " + electrodomestico.getConsumo());

        if (electrodomestico instanceof Heladera) {

            Heladera heladera = (Heladera) electrodomestico;

            imprimirHeladera(heladera);

        } else if (electrodomestico instanceof Cafetera) {

            Cafetera cafetera = (Cafetera) electrodomestico;

            imprimirCafetera(cafetera);
        } else if (electrodomestico instanceof Televisor) {

            Televisor televisor = (Televisor) electrodomestico;

            imprimirTelevisor(televisor);

        } else {
            electrodomestico.escender();
            electrodomestico.apagar();
        }

    }

    public static void imprimirHeladera(Heladera heladera) {

        boolean bl = heladera.getTieneFreezer();

        String siONo = convertirTrueEnSiYFalseEnNo(bl);

        System.out.println("Capacidad: " + heladera.getCapacidad());
        System.out.println("Freezer: " + siONo);

        if (bl) {
            System.out.println("Capacidad del Freezer: " + heladera.getCapacidadFreezer());
        }

        heladera.guardarElemento("banana");
        heladera.extraerElemento("manzana");
        heladera.escender();
        heladera.apagar();
    }

    public static String convertirTrueEnSiYFalseEnNo(boolean boleano) {

        if (boleano) {
            return "Si";

        } else {
            return "No";
        }
    }

    public static void imprimirCafetera(Cafetera cafetera){

        System.out.println("Litros: " + cafetera.getLitros());
        cafetera.eligirSabor("Dulce de Leche");
        cafetera.escender();
        cafetera.apagar();
    }

    public static void imprimirTelevisor(Televisor televisor){

        System.out.println("Pulgadas: " + televisor.getPulgadas());
        System.out.println("Resolución: " + televisor.getResolucion());
        televisor.cambiarCanal(29);
        televisor.escender();
        televisor.apagar();
    }

    public static void escender(Electrodomestico electrodomestico) {

        if (electrodomestico instanceof Heladera) {

            Heladera heladera = (Heladera) electrodomestico;

            heladera.escender();

        } else if (electrodomestico instanceof Cafetera) {

            Cafetera cafetera = (Cafetera) electrodomestico;

            cafetera.escender();

        } else if (electrodomestico instanceof Televisor) {

            Televisor televisor = (Televisor) electrodomestico;

            televisor.escender();

        } else {
            electrodomestico.escender();
            
        }

    }

}