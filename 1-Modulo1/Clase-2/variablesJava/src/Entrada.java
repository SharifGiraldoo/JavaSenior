import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //Esta asignación es obligatoria para poder leer desde consola
        System.out.println("Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine(); //Lee una línea completa desde la consola
        System.out.println("Hola, " + nombre + "!")
        ;
    }

}
