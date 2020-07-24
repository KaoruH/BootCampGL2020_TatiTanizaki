package com.globallogic.myapp.clasesyobjetos;

public class Empleado extends Persona{

    public Empleado(int dni) {
        super(dni);
    }

    private int id;

    private double sueldoBase;

    private int horasExtras;

    private double tipoIRPF;

    private static double importeHoraExtra;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public double complementoPorHorasExtras(){

        return this.horasExtras * Empleado.importeHoraExtra;

    }

    public double sueldoBruto(){

        return complementoPorHorasExtras() + this.sueldoBase;
    }

    public double retencionesIRPF(){

        double iRPFFinal = this.tipoIRPF;

        if (this.getCasado() == 'S') {

            iRPFFinal -= 2;
            
        } 

        if (this.getNumeroDeHijos() != 0) {

            iRPFFinal -= this.getNumeroDeHijos();
            
        }

        return sueldoBruto() * (iRPFFinal/100);

    }

    public String toString(){

        return id + " " + getNombre() + "\nSueldo Base: " + sueldoBase + "/nHoras Extras: " + horasExtras + "\ntipo IRPF: " + tipoIRPF + "\nCasado: " + getCasado() + "\nNúmero de Hijos: " + getNumeroDeHijos();

    }

    public static double getImporteHoraExtra() {
        return importeHoraExtra;
    }

    public static void setImporteHoraExtra(double importeHoraExtra) {
        Empleado.importeHoraExtra = importeHoraExtra;
    }
    
}