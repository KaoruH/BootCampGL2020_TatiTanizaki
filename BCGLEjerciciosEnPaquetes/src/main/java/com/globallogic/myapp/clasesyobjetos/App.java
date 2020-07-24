package com.globallogic.myapp.clasesyobjetos;

import java.util.Scanner;

public class App {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int nroEmpleados;

        System.out.println("Insira el número total de empleados:");
        nroEmpleados = keyboard.nextInt();

        Empleado listaEmpleados[] = new Empleado[nroEmpleados];

        System.out.println("Ingrese el importe correspondiente al pago por hora extra:");
        Empleado.setImporteHoraExtra(keyboard.nextDouble());

        
        
    }


    
}