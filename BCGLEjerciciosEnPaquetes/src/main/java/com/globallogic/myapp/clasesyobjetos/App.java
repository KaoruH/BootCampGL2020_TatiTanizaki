package com.globallogic.myapp.clasesyobjetos;

import java.lang.reflect.Array;
import java.util.*;

public class App {

    public static Scanner keyboard = new Scanner(System.in);

    public static List<Empleado> listaACargar = new ArrayList<>();

    public static void main(String[] args) {

        int nroEmpleados;

        System.out.println("Insira el número total de empleados:");
        nroEmpleados = keyboard.nextInt();

        Empleado listaEmpleados[] = new Empleado[nroEmpleados];

        inicializarEmpleadosTeste();

        for (int i = 0; i < nroEmpleados; i++) {

            listaEmpleados[i] = listaACargar.get(i);

        }

        System.out.println("Ingrese el importe correspondiente al pago por hora extra:");
        Empleado.setImporteHoraExtra(keyboard.nextDouble());

        maxYMinSueldo(listaEmpleados);

        cobraMaxYMinPorHorasExtras(listaEmpleados);

        imprimirSortBySalario(listaEmpleados);

    }

    public static void maxYMinSueldo(Empleado[] lista) {

        Empleado empleadoMaxSueldo = (Empleado) Array.get(lista, 0);
        Empleado empleadoMinSueldo = (Empleado) Array.get(lista, 0);

        for (Empleado empleado : lista) {

            if (empleado.sueldoBruto() > empleadoMaxSueldo.sueldoBruto()) {
                empleadoMaxSueldo = empleado;

            }
            if (empleado.sueldoBruto() < empleadoMinSueldo.sueldoBruto()) {
                empleadoMinSueldo = empleado;

            }

        }

        System.out.println("_________________________________________");
        System.out.println(" ");
        System.out.println("El empleado que más cobra es:");
        System.out.println(empleadoMaxSueldo.toString());
        System.out.println("_________________________________________");
        System.out.println(" ");

        System.out.println("El empleado que menos cobra es:");
        System.out.println(empleadoMinSueldo.toString());
    
    }

    public static void cobraMaxYMinPorHorasExtras(Empleado[] lista) {

        Empleado empleadoMaxPorHorasExtras = (Empleado) Array.get(lista, 0);
        Empleado empleadoMinPorHorasExtras = (Empleado) Array.get(lista, 0);

        for (Empleado empleado : lista) {

            if (empleado.sueldoBruto() > empleadoMaxPorHorasExtras.sueldoBruto()) {
                empleadoMaxPorHorasExtras = empleado;

            }
            if (empleado.sueldoBruto() < empleadoMinPorHorasExtras.sueldoBruto()) {
                empleadoMinPorHorasExtras = empleado;

            }

        }
        
        System.out.println("_________________________________________");
        System.out.println(" ");
        System.out.println("El empleado que más cobra por Horas Extras:");
        System.out.println(empleadoMaxPorHorasExtras.toString());

        System.out.println("_________________________________________");
        System.out.println(" ");

        System.out.println("El empleado que menos cobra por Horas Extras es:");
        System.out.println(empleadoMinPorHorasExtras.toString());
    
    }

    public static void imprimirSortBySalario(Empleado[] lista) {

        Arrays.sort(lista);

        System.out.println("_________________________________________");
        System.out.println(" ");
        System.out.println("Lista ordenada por salario (min to max)");
        System.out.println("_________________________________________");
        System.out.println(" ");

        for (Empleado empleado : lista) {
            System.out.println(empleado.toString());
            System.out.println("_________________________________________");
        System.out.println(" ");

        }
    }

    public static void inicializarEmpleadosTeste() {

        Empleado empleado = new Empleado();
        empleado.setNombre("Ava");
        empleado.setDni(00000000);
        empleado.setCasado('S');
        empleado.setNumeroDeHijos(2);
        empleado.setId(123456);
        empleado.setSueldoBase(100);
        empleado.setHorasExtras(20);
        empleado.setTipoIRPF(12);

        listaACargar.add(empleado);

        empleado = new Empleado();

        empleado.setNombre("Ethan");
        empleado.setDni(00000001);
        empleado.setCasado('S');
        empleado.setNumeroDeHijos(0);
        empleado.setId(654321);
        empleado.setSueldoBase(200);
        empleado.setHorasExtras(5);
        empleado.setTipoIRPF(10);

        listaACargar.add(empleado);

        empleado = new Empleado();

        empleado.setNombre("Melanie");
        empleado.setDni(00000002);
        empleado.setCasado('N');
        empleado.setNumeroDeHijos(0);
        empleado.setId(162534);
        empleado.setSueldoBase(300);
        empleado.setHorasExtras(15);
        empleado.setTipoIRPF(15);

        listaACargar.add(empleado);

        empleado = new Empleado();

        empleado.setNombre("Dalila");
        empleado.setDni(00000003);
        empleado.setCasado('S');
        empleado.setNumeroDeHijos(1);
        empleado.setId(615243);
        empleado.setSueldoBase(400);
        empleado.setHorasExtras(20);
        empleado.setTipoIRPF(5);

        listaACargar.add(empleado);

        empleado = new Empleado();

        empleado.setNombre("Laticia");
        empleado.setDni(00000004);
        empleado.setCasado('N');
        empleado.setNumeroDeHijos(2);
        empleado.setId(973584);
        empleado.setSueldoBase(500);
        empleado.setHorasExtras(2);
        empleado.setTipoIRPF(10);

        listaACargar.add(empleado);

        empleado = new Empleado();

        empleado.setNombre("Alicia");
        empleado.setDni(00000005);
        empleado.setCasado('S');
        empleado.setNumeroDeHijos(0);
        empleado.setId(192837);
        empleado.setSueldoBase(100);
        empleado.setHorasExtras(30);
        empleado.setTipoIRPF(5);

        listaACargar.add(empleado);

    }

}