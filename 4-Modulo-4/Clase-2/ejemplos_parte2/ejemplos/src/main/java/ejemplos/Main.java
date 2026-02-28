package ejemplos;

import java.util.List;

import ejemplos2.Empleado;

public class Main {
    public static void main(String[] args) {
        ejercicio1();

    }

    public static void ejercicio1() {
        /**
         * Dada una lista de objetos de tipo Empleado, cada uno con
         * los atributos nombre y salario, filtras los empleados que 
         * tienen un salario mayor a 50000 y cuenta cuántos empleados cumplen con
         * esta condición. Imprime el numero de empleados que tienen un salario mayor a 50000.
         */

        var empleados = List.of(
            new Empleado("Juan", 60000),
            new Empleado("Maria", 45000),
            new Empleado("Pedro", 55000),
            new Empleado("Ana", 40000)
        );
        

        long cantidad = empleados.stream()
                .filter(empleado -> empleado.getSalario() > 50000)
                .count();
        
        System.out.println("Cantidad de empleados con salario mayor a 50000: " + cantidad);

        
    }
}
