package com.globallogic.myapp.estructurasBasicas.ejercicio5;

public class PointDemo {

    public static void main(String[] args) throws Exception {
        
        VariableInstancia vI = new VariableInstancia();

        vI.setEngPoints(50);

        vI.setMathsPoints(80);

        System.out.println("Eng Points: " + vI.getEngPoints() + " | Maths Points: " + vI.getMathsPoints());
    }
    
}