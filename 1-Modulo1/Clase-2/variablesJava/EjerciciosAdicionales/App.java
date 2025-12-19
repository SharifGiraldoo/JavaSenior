import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        OperacionMatematica();
        calcularPrecio();
        CalcularPecesAcuario();
        CalcularGastos();
        CalcularCostoOrdenador();
        CalcularPrecioOriginal();
        Calculadora();
        ConversionTemperatura();

    }

    public static void OperacionMatematica(){

        int operacionMatematica = 6/2*(1+2);
        System.out.println("El resultado de la operacion matematica es: " + operacionMatematica);

    }

    public static void calcularPrecio(){

        float precioCienGramos = 5.95f;
        float precioPorKilo = precioCienGramos *10;
        float precioVendedor = 29.75f;
        boolean comparacionPrecios = precioPorKilo == precioVendedor;


        System.out.println("El precio por kilo es: " + precioPorKilo + "\n Y el resultado al comparar precio es: " + comparacionPrecios + " ,por lo tanto el precio que anuncia el vendedor es incorrecto \n" );
    }

    public static void CalcularPecesAcuario(){

        int pecesRojos = 284;
        int pecesAzules = 163;
        int pecesTotales = pecesRojos + pecesAzules;

        System.out.println("El acuario tiene un total de: " + pecesTotales + " peces." );

    }

    public static void CalcularGastos(){

        int dineroInicial = 23;
        float dineroRestante = 12.75f;
        float dineroGastado = dineroInicial - dineroRestante;
        System.out.println("El dinero gastado es: " + dineroGastado);
    }

    public static void CalcularCostoOrdenador(){

        int precioOrdenador = 660;
        float descuentoPorProntoPago = 0.10f;
        float precioFinal = precioOrdenador - (precioOrdenador * descuentoPorProntoPago);
        System.out.println("El precio final del ordenador con el descuento aplicado es: " + precioFinal);
    }


    public static void CalcularPrecioOriginal(){

        int precio = 34;
        float descuento = 0.15f;
        float precioOriginal = precio / descuento;
        System.out.println("El precio original del producto es: " + precioOriginal);
    }

    public static void Calculadora(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        float division = (float) numero1 / numero2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);    
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);


    }


    public static void CalculadoraAreaPerimetro(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo: ");
        float ancho = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Ingrese el alto del rectangulo: ");
        float alto = scanner.nextFloat();
        scanner.nextLine();
        scanner.close();
        float area = ancho * alto;
        float perimetro = 2 * (ancho + alto);
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }


    @SuppressWarnings("ConvertToTryWithResources")
    public static void ConversionTemperatura(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celcius °C: ");
        float tempCelcius = scanner.nextFloat();
        scanner.nextLine();
        scanner.close();

        float tempFahrenheit = tempCelcius * 9/5 + 32;
        float tempKelvin = (float) (tempCelcius + 273.15); 

        System.out.println("La temperatura ingresada en °C es: " + tempCelcius + "," + "Su valor en °F es: " + tempFahrenheit + "Y su valor en °K es: " + tempKelvin);

     
    }


    public static void CalcularMediaAritmetica(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        float mediaAritmetica =(numero1 + numero2 + numero3)/3;

        System.out.println("La media aritmética es: " + mediaAritmetica);

    }


}
