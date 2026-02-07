package other;

import java.util.Scanner;

/**
 * Clase utilitaria para manejar la entrada de datos del usuario.
 * Proporciona métodos para leer diferentes tipos de datos de forma segura.
 */
public class Entrada {
    private static Scanner scanner = new Scanner(System.in);
    
    /**
     * Lee una línea de texto del usuario
     * @param mensaje Mensaje a mostrar al usuario
     * @return El texto ingresado
     */
    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    
    /**
     * Lee un número entero del usuario con validación
     * @param mensaje Mensaje a mostrar al usuario
     * @return El número entero ingresado
     */
    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        }
    }
    
    /**
     * Pausa la ejecución hasta que el usuario presione ENTER
     */
    public static void pausar() {
        System.out.print("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
    
    /**
     * Limpia la pantalla (simula limpiar la consola)
     */
    public static void limpiarPantalla() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
}