package com.devsenior;

import org.apache.logging.log4j.*;

public class ProcesadorPago {


    private static final Logger logger = LogManager.getLogger(ProcesadorPago.class);



    public void procesar(Pago pago){

        logger.info("Iniciando el procesamiento del pago para el cliente: ",  pago.getCliente().getNombre());


        //debug: información técnica para el desarrollador
        logger.debug("Detalles del pago: Monto = " + pago.getMonto() + ", Saldo Disponible = " + pago.getSaldoDisponible());


        if(pago.getMonto() <= 0){

            //aquí va un mensaje de caso inválido, incluyendo lanzamiento de excepción
            //error: problemas graves que impiden la operación
            logger.error("El monto del pago debe ser mayor que cero. Monto proporcionado: " + pago.getMonto());
            return; // salir del método en caso de erros y retornar el manejo de error y excepciones según sea el caso
        }

        if(pago.getMonto() > pago.getSaldoDisponible()){
            //aquí va un mensaje de caso inválido, incluyendo lanzamiento de excepción
            //error: problemas graves que impiden la operación
            logger.error("El saldo disponible es insuficiente para procesar el pago. Monto del pago: " + pago.getMonto() + ", Saldo Disponible: " + pago.getSaldoDisponible());
            return; // salir del método en caso de errores y retornar el manejo de error y excepciones según sea el caso
        }

        //aquí va la lógica para procesar el pago exitosamente
        //info: seguimiento del flujo normal de la aplicación
        logger.info("Pago procesado exitosamente para el cliente: " + pago.getCliente().getNombre() + ", Monto: " + pago.getMonto());


        logger.debug("Fin del procesamiento del pago para el cliente: " + pago.getCliente().getNombre());

        
        

        logger.info("Finalizando el procesamiento del pago para el cliente: " + pago.getCliente().getNombre());
    }


}
