package com.globallogic.myapp.estructurasBasicas.ejercicio6;

public class EmpleadoDemo {
 
    public static void main(String[] args) throws Exception{

        Empleado.setSalario(1000);

        System.out.println(Empleado.getNombre() + " tiene un salario promedio de " + Empleado.getSalario());
        
    }
}