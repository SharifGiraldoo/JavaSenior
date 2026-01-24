package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {


    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
       
        logger.info(" === Sistema de pedidos iniciado === ");

        Cliente cliente1 = new Cliente("Pedro Sanchez", true);
        Cliente cliente2 = new Cliente("Luisa Moreno", false);

        Producto producto1 = new Producto("Laptop",20, 1200.0);
        Producto producto2 = new Producto("Smartphone", 40, 800.0);
        Producto producto3 = new Producto("Tablet", 15, 600.0);


        Pedido pedidoValido = new Pedido(cliente1, producto1, 2);
        Pedido pedidoClienteInactivo = new Pedido(cliente2, producto2, 1);
        Pedido pedidoCantidadCero = new Pedido(cliente1, producto3, 0);
        Pedido pedidoStockInsuficiente = new Pedido(cliente1, producto1, 25);
        ProcesadorPedido procesador = new ProcesadorPedido();
        procesador.procesar(pedidoValido);
        procesador.procesar(pedidoClienteInactivo);
        procesador.procesar(pedidoCantidadCero);
        procesador.procesar(pedidoStockInsuficiente);
        logger.info(" === Sistema de pedidos finalizado === ");
        
    }
}