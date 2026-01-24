package com.devsenior;

public class Gerente extends Empleado{

    
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }



    public String getDepartamento() {
        return departamento;
    }



    public void aumentarSalario(double porcentaje) {
        double salarioActual = getSalario();
        double aumento = salarioActual * porcentaje / 100;
        setSalario(salarioActual + aumento);
    }



    @Override
    public String toString() {
        return "Gerente [departamento=" + departamento + "]";
    }

    
    




}
