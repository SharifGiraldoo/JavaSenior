package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    public static void main(String[] args) {


        logger.info("Inicio del programa");
        
        Empleado empleado = new Empleado("Juan Perez", 30, 50000);

        Gerente gerente = new Gerente("Ana Gomez", 40, 80000, "Ventas");


        logger.info("Creando empleado: " + empleado);
        logger.info("Creando gerente: " + gerente);


        empleado.aumentarSalario(10);
        logger.info("Salario del empleado después del aumento: " + empleado.getSalario());

        gerente.aumentarSalario(20);
        logger.info("Salario del gerente después del aumento: " + gerente.getSalario());


        logger.info("Fin del programa");

        logger.trace("Esto es un mensaje de traza");
        logger.debug("Esto es un mensaje de depuración");
        logger.info("Esto es un mensaje informativo");
        logger.warn("Esto es un mensaje de advertencia");
        logger.error("Esto es un mensaje de error");
        logger.fatal("Esto es un mensaje fatal");
        


        

    }
}