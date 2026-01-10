public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SentenciaIf();
    }

    public static void Ejercicio1() {

        System.out.println("Ejercicio 1");
        System.out.println("Hola mundo");

    }

    public static void SentenciaIf() {
        int numero = 10;

        if (numero > 0) {
            // Este código se ejecuta SOLO si 'numero' es mayor que 0
            System.out.println("El número es positivo.");
        }
        // Si numero fuera -5, la línea anterior no se ejecutaría, y el programa
        // continuaría aquí.
    }

    public static void SentenciaifElse() {
        int numero = 7;

        if (numero % 2 == 0) { // Si el residuo de la división por 2 es 0, es par
            System.out.println("El número es par.");
        } else { // Si la condición del if es false...
            System.out.println("El número es impar.");
        }
    }

    public static void SentenciaIfElseElse() {
        int calificacion = 85;

        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 80) { // Se evalúa SOLO si la primera condición (calificacion >= 90) fue false
            System.out.println("Muy Bien");
        } else if (calificacion >= 70) { // Se evalúa SOLO si las condiciones anteriores fueron false
            System.out.println("Bien");
        } else { // Se ejecuta si ninguna de las condiciones anteriores fue true
            System.out.println("Necesita mejorar");
        }
    }

    public static void SentenciaSwitchCase() {
        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.
        String nombreDia;

        switch (diaSemana) { // La variable a evaluar
            case 1: // Si diaSemana es 1...
                nombreDia = "Lunes";
                break; // Importante: sale del switch después de ejecutar el código del case
            case 2: // Si diaSemana es 2...
                nombreDia = "Martes";
                break;
            case 3: // Si diaSemana es 3...
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6: // Múltiples casos pueden compartir el mismo bloque de código
            case 7:
                nombreDia = "Fin de semana";
                break;
            default: // Opcional: se ejecuta si el valor de diaSemana no coincide con ningún 'case'
                nombreDia = "Día inválido";
                break; // Es buena práctica poner break incluso en el default
        }
        System.out.println("El día es: " + nombreDia); // Salida: El día es: Miércoles
    }
}
