
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        ejercicio2();
    }

    public static void ejercicio2(){

        /**
         * Dada una lista de palabras, agruparlas según la longitud de cada palabra. 
         * imprime las palabras agregadas por su longitud, mostrando la
         * longitud y la lista de palabras que tienen esa longitud.
         */

        var palabras = List.of("Hola", "Mundo", "Java", "Streams", "Programación", "Funcional", "Ejemplo", "Agrupación  de palabras", "Lambdas"); 
        
        var agrupadas = palabras.stream()
                .collect(Collectors.groupingBy(palabra -> palabra.length()));


    }
}
