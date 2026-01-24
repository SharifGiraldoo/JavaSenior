package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {


    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info(" === Sistema de pagos iniciado === ");

        ProcesadorPago procesador = new ProcesadorPago();

        Pago pagoValido = new Pago(new Cliente("Carlos Lopez", 101), 150.0, 200.0);
        Pago pagoInvalidoMonto = new Pago(new Cliente("Maria Ruiz", 102), -50.0, 200.0);
        Pago pagoInvalidoSaldo = new Pago(new Cliente("Luis Fernandez", 103), 300.0, 200.0);
        Pago pagoCero = new Pago(new Cliente("Ana Martinez", 104), 0.0, 200.0);


        procesador.procesar(pagoValido);
        procesador.procesar(pagoInvalidoMonto);
        procesador.procesar(pagoInvalidoSaldo);
        procesador.procesar(pagoCero);

        logger.info(" === Sistema de pagos finalizado === ");

    }
}