import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws Exception {
        ejemploClasico();
        ejemploStreams();
       
    }


    public static void ejemploClasico() {

         /*
        Dada una lista de enteros, queremos:
        1. Quedarnos con los nros pares
        2. Multiplicar cada nro por 2
        3. Imprimir cada nro resultante
        
        */

        List<Integer> resultado = new ArrayList<> ();
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 1. recorrer la lista
        ///2. quedarnos con los nros pares comparando en una condición
        /// 3. multiplicar cada nro por 2
        /// 4. agregar el nro resultante a la lista resultado
        

        for(Integer numero: numeros){
            if(numero % 2 == 0){
                resultado.add(numero * 2);
            }
        }

        System.out.println("El resultado es: " + resultado);
        
    }


    public static void ejemploStreams() {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream() // 1. convertir la lista en un stream
                .filter(numero -> numero % 2 == 0) // 2. quedarnos con los nros pares comparando en una condición
                .map(numero -> numero * 2) // 3. multiplicar cada nro por 2
                .forEach(numero -> System.out.println("El resultado es: " + numero)); // 4. imprimir cada nro resultante
        
    }
    /**
     * Esto es lo que conocemos como programación funcional,
     *  donde cada operación se encadena a la siguiente,
     *  y el resultado de una operación se pasa a la siguiente 
     * sin necesidad de almacenar el resultado intermedio en una 
     * variable. Esto hace que el código sea más legible y fácil de mantener.
     */

    public static void ejemploFunction() {
        Function<String, Integer> longitud = s -> s.length();
        System.out.println("La longitud de la cadena es: " + longitud.apply("Hola Mundo"));
    }

    public static void ejemploSupplier(){

        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println("El número aleatorio es: " + aleatorio.get());
    }

    public static void ejemploConsumer(){

        Consumer<String> imprimir = s -> System.out.println(s);
        imprimir.accept("Hola Mundo");
    }
}
