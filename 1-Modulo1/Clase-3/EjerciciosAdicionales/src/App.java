import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando ejercicios");
        //Ejercicio1();
        Ejercicio2();
    }

    /**
     * Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero
     */
    public static void Ejercicio1(){

        System.out.println("Ingrese un número real");
        Scanner scanner = new Scanner(System.in);
        float numero = scanner.nextFloat();
        scanner.nextLine();

        if(numero < 0){
            System.out.println("El número" + numero + "es negativo");
        } else if(numero > 0){
            System.out.println("El número"+ numero + "es positivo");
        } else{
            System.out.println("El número es cero");
        }

        scanner.close();

    }


    /**
     * Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos
     */
    public static void Ejercicio2(){

        System.out.println("Ingrese el primer número");
        Scanner scanner = new Scanner(System.in);
        float numeroUno = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo número");
        float numeroDos= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el tercer número ");
        float numeroTres = scanner.nextInt();
        scanner.nextLine();

        if (numeroUno > numeroDos){
            System.out.println("El número" + numeroUno + " Es el mayor");
        } else if (numeroDos > numeroUno){
            System.out.println("El número" + numeroDos + " Es el mayor");
        } else {
            System.out.println("El número" + numeroTres + " Es el mayor");
        }

        scanner.close();
    }

    
}

    

    

