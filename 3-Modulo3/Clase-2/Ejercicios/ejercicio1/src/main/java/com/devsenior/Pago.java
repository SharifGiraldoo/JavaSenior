package com.devsenior;

public class Pago {

    private Cliente cliente;
    private double monto;
    private double saldoDisponible;


    public Pago(Cliente cliente, double monto, double saldoDisponible) {
        this.cliente = cliente;
        this.monto = monto;
        this.saldoDisponible = saldoDisponible;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public double getMonto() {
        return monto;
    }


    public double getSaldoDisponible() {
        return saldoDisponible;
    
    
    
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void setMonto(double monto) {
        this.monto = monto;
    }


    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }


    @Override
    public String toString() {
        return "Pago [cliente=" + cliente + ", monto=" + monto + ", saldoDisponible=" + saldoDisponible + "]";
    }

    
    


    


}
