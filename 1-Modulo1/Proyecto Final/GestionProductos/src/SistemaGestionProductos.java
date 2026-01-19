import java.util.Scanner;

public class SistemaGestionProductos {
    
    // Variables estáticas para almacenar la información del producto
    private static String nombreProducto = "N/A";
    private static double precioUnitario = 0.0;
    private static int cantidadInventario = 0;
    
    // Constantes para validación de stock
    private static final int STOCK_BAJO_LIMITE = 5;
    private static final int STOCK_ALTO_LIMITE = 20;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        
        System.out.println("=".repeat(50));
        System.out.println("   BIENVENIDO AL SISTEMA DE GESTION DE PRODUCTOS");
        System.out.println("=".repeat(50));
        
        // Bucle principal del programa
        while (opcion != 0) {
            mostrarMenuPrincipal();
            
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                // Estructura de control para manejar las opciones
                switch (opcion) {
                    case 1:
                        registrarProducto(scanner);
                        break;
                    case 2:
                        mostrarInformacionProducto();
                        break;
                    case 3:
                        calcularValorTotalInventario();
                        break;
                    case 4:
                        mostrarResumenCompleto();
                        break;
                    case 5:
                        limpiarDatosProducto();
                        break;
                    case 0:
                        System.out.println("\n¡Gracias por usar el Sistema de Gestión de Productos!");
                        System.out.println("¡Hasta pronto!\n");
                        break;
                    default:
                        System.out.println("\n[ERROR] Opción inválida. Por favor ingrese un número del 0 al 5.\n");
                }
                
                // Pausa para que el usuario pueda leer el resultado
                if (opcion != 0) {
                    System.out.println("\nPresione ENTER para continuar...");
                    scanner.nextLine();
                }
                
            } catch (Exception e) {
                System.out.println("\n[ERROR] Entrada inválida. Por favor ingrese solo números.\n");
                scanner.nextLine(); // Limpiar buffer en caso de error
                System.out.println("Presione ENTER para continuar...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
    
    /**
     * Muestra el menú principal del sistema
     */
    public static void mostrarMenuPrincipal() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("--- Sistema de Gestión de Productos ---");
        System.out.println("=".repeat(50));
        System.out.println("1. Registrar nuevo producto");
        System.out.println("2. Mostrar información del producto actual");
        System.out.println("3. Calcular valor total del inventario");
        System.out.println("4. Mostrar resumen completo del producto");
        System.out.println("5. Limpiar datos del producto actual");
        System.out.println("0. Salir");
        System.out.println("=".repeat(50));
        System.out.print("Ingrese su opción: ");
    }
    
    /**
     * Registra un nuevo producto en el sistema
     * @param scanner Objeto Scanner para leer datos del usuario
     */
    public static void registrarProducto(Scanner scanner) {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("        REGISTRO DE NUEVO PRODUCTO");
        System.out.println("-".repeat(50));
        
        // Verificar si ya existe un producto registrado
        if (!nombreProducto.equals("N/A")) {
            System.out.println("\n[ADVERTENCIA] Ya existe un producto registrado:");
            System.out.println("Producto actual: " + nombreProducto);
            System.out.print("¿Desea sobrescribir los datos? (s/n): ");
            
            String respuesta = scanner.nextLine().toLowerCase().trim();
            
            if (!respuesta.equals("s")) {
                System.out.println("\n[INFO] Registro cancelado. Los datos actuales se mantienen.");
                return;
            }
        }
        
        // Solicitar y validar nombre del producto
        String nombre = "";
        boolean nombreValido = false;
        
        while (!nombreValido) {
            System.out.print("\nIngrese el nombre del producto: ");
            nombre = scanner.nextLine().trim();
            
            if (validarNombreProducto(nombre)) {
                nombreValido = true;
            } else {
                System.out.println("[ERROR] El nombre no puede estar vacío ni contener solo espacios.");
            }
        }
        
        // Solicitar y validar precio unitario
        double precio = 0.0;
        boolean precioValido = false;
        
        while (!precioValido) {
            try {
                System.out.print("Ingrese el precio unitario: $");
                precio = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer
                
                if (validarPrecio(precio)) {
                    precioValido = true;
                } else {
                    System.out.println("[ERROR] El precio debe ser mayor que 0.");
                }
            } catch (Exception e) {
                System.out.println("[ERROR] Debe ingresar un número válido para el precio.");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        
        // Solicitar y validar cantidad en inventario
        int cantidad = 0;
        boolean cantidadValida = false;
        
        while (!cantidadValida) {
            try {
                System.out.print("Ingrese la cantidad en inventario: ");
                cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                if (validarCantidad(cantidad)) {
                    cantidadValida = true;
                } else {
                    System.out.println("[ERROR] La cantidad debe ser un número entero no negativo.");
                }
            } catch (Exception e) {
                System.out.println("[ERROR] Debe ingresar un número entero válido para la cantidad.");
                scanner.nextLine(); // Limpiar buffer
            }
        }
        
        // Guardar datos en variables estáticas
        nombreProducto = nombre;
        precioUnitario = precio;
        cantidadInventario = cantidad;
        
        System.out.println("\n" + "✓".repeat(50));
        System.out.println("[ÉXITO] Producto registrado exitosamente.");
        System.out.println("✓".repeat(50));
    }
    
    /**
     * Muestra la información del producto actual
     */
    public static void mostrarInformacionProducto() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("     INFORMACIÓN DEL PRODUCTO ACTUAL");
        System.out.println("-".repeat(50));
        
        if (nombreProducto.equals("N/A")) {
            System.out.println("\n[INFO] No hay datos de producto registrados actualmente.");
        } else {
            System.out.println("\nNombre del Producto: " + nombreProducto);
            System.out.printf("Precio Unitario: $%,.2f%n", precioUnitario);
            System.out.println("Cantidad en Inventario: " + cantidadInventario + " unidades");
        }
        
        System.out.println("-".repeat(50));
    }
    
    /**
     * Calcula y muestra el valor total del inventario
     * @return Valor total del inventario
     */
    public static double calcularValorTotalInventario() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("     CÁLCULO DE VALOR TOTAL DEL INVENTARIO");
        System.out.println("-".repeat(50));
        
        if (nombreProducto.equals("N/A")) {
            System.out.println("\n[ADVERTENCIA] No hay datos de producto registrados.");
            System.out.println("Por favor, registre un producto primero.");
            return 0.0;
        }
        
        double valorTotal = precioUnitario * cantidadInventario;
        
        System.out.println("\nProducto: " + nombreProducto);
        System.out.printf("Precio Unitario: $%,.2f%n", precioUnitario);
        System.out.println("Cantidad: " + cantidadInventario + " unidades");
        System.out.println("-".repeat(50));
        System.out.printf("VALOR TOTAL DEL INVENTARIO: $%,.2f%n", valorTotal);
        System.out.println("-".repeat(50));
        
        return valorTotal;
    }
    
    /**
     * Muestra un resumen completo del producto incluyendo estado del stock
     */
    public static void mostrarResumenCompleto() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("--- Resumen del Producto ---");
        System.out.println("=".repeat(50));
        
        if (nombreProducto.equals("N/A")) {
            System.out.println("\n[INFO] No hay datos de producto registrados actualmente.");
            System.out.println("=".repeat(50));
            return;
        }
        
        double valorTotal = precioUnitario * cantidadInventario;
        String estadoStock = determinarEstadoStock();
        
        System.out.println("\nNombre: " + nombreProducto);
        System.out.printf("Precio Unitario: $%,.2f%n", precioUnitario);
        System.out.println("Cantidad en Inventario: " + cantidadInventario + " unidades");
        System.out.printf("Valor Total en Inventario: $%,.2f%n", valorTotal);
        System.out.println("Estado del Stock: " + estadoStock);
        System.out.println("=".repeat(50));
    }
    
    /**
     * Determina el estado del stock basado en la cantidad
     * @return String con el estado del stock
     */
    private static String determinarEstadoStock() {
        if (cantidadInventario < STOCK_BAJO_LIMITE) {
            return "Stock bajo ⚠️";
        } else if (cantidadInventario <= STOCK_ALTO_LIMITE) {
            return "Stock suficiente ✓";
        } else {
            return "Stock alto 📦";
        }
    }
    
    /**
     * Limpia todos los datos del producto actual
     */
    public static void limpiarDatosProducto() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("        LIMPIAR DATOS DEL PRODUCTO");
        System.out.println("-".repeat(50));
        
        if (nombreProducto.equals("N/A")) {
            System.out.println("\n[INFO] No hay datos para borrar.");
        } else {
            nombreProducto = "N/A";
            precioUnitario = 0.0;
            cantidadInventario = 0;
            
            System.out.println("\n[ÉXITO] Los datos del producto actual han sido borrados exitosamente.");
        }
        
        System.out.println("-".repeat(50));
    }
    
    /**
     * Valida que el precio sea mayor que 0
     * @param precio Precio a validar
     * @return true si es válido, false en caso contrario
     */
    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }
    
    /**
     * Valida que la cantidad sea mayor o igual a 0
     * @param cantidad Cantidad a validar
     * @return true si es válida, false en caso contrario
     */
    public static boolean validarCantidad(int cantidad) {
        return cantidad >= 0;
    }
    
    /**
     * Valida que el nombre del producto no esté vacío ni contenga solo espacios
     * @param nombre Nombre a validar
     * @return true si es válido, false en caso contrario
     */
    public static boolean validarNombreProducto(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}