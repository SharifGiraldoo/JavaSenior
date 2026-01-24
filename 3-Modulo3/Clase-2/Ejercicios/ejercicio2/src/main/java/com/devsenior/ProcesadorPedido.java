package com.devsenior;


import org.apache.logging.log4j.*;

public class ProcesadorPedido {

    public static final Logger logger = LogManager.getLogger(ProcesadorPedido.class);


    public void procesar(Pedido pedido){

        logger.info("Procesando pedido para el cliente: ", pedido.getCliente().getNombre());

        //Detalles técnicos del pedido

        logger.debug("Detalles del pedido: Producto = " + pedido.getProducto().getNombre() + ", Cantidad = " + pedido.getCantidad(), "Stock Disponible = " + pedido.getProducto().getStock());

        //Regla 1: El cliente debe estar activo

        if(!pedido.getCliente().isActivo()){

            logger.error("El cliente " + pedido.getCliente().getNombre() + " no está activo. No se puede procesar el pedido.");

            return;

        }


        //Regla 2: El pedido debe contener al menos una unidad del producto

        if(pedido.getCantidad() <= 0){

            logger.error("La cantidad del pedido debe ser mayor que cero para el producto: " + pedido.getProducto().getNombre(), "Cantidad proporcionada: " + pedido.getCantidad());

            return;

        }

        //Regla 3: Debe haber suficiente stock del producto

        if(pedido.getCantidad() > pedido.getProducto().getStock()){

            logger.error("Stock insuficiente para el producto: " + pedido.getProducto().getNombre(), "Cantidad solicitada: " + pedido.getCantidad() + ", Stock Disponible: " + pedido.getProducto().getStock());

            return;

        }


        //Lógica para procesar el pedido exitosamente
        pedido.getProducto().reducirStock(pedido.getCantidad());
        logger.info("Pedido procesado exitosamente para el cliente: " + pedido.getCliente().getNombre() + ", Producto: " + pedido.getProducto().getNombre() + ", Cantidad: " + pedido.getCantidad());
        logger.debug("Nuevo stock del producto " + pedido.getProducto().getNombre() + ": " + pedido.getProducto().getStock());




    }

}
