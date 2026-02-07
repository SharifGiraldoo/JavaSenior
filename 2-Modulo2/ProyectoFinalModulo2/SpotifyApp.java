

import modelado.*;
import other.*;

/**
 * Clase principal de la aplicación Mini-Spotify.
 * Implementa el sistema de menús interactivos para gestionar la aplicación.
 */
public class SpotifyApp {
    private static CuentaSpotify cuenta;
    private static BibliotecaMusical biblioteca;
    
    public static void main(String[] args) {
        inicializarSistema();
        menuPrincipal();
    }
    
    /**
     * Inicializa el sistema con datos de prueba
     */
    private static void inicializarSistema() {
        // Crear cuenta de usuario
        cuenta = new CuentaSpotify("enrique", "1234");
        
        // Crear biblioteca musical
        biblioteca = new BibliotecaMusical(100);
        
        // Cargar canciones de prueba
        biblioteca.agregarCancion(new Cancion("Shape of You", "Ed Sheeran", 240));
        biblioteca.agregarCancion(new Cancion("Believer", "Imagine Dragons", 210));
        biblioteca.agregarCancion(new Cancion("Thunderstruck", "AC/DC", 290));
        biblioteca.agregarCancion(new Cancion("Someone Like You", "Adele", 300));
        
        // Asociar biblioteca a la cuenta
        cuenta.setBiblioteca(biblioteca);
    }
    
    /**
     * Menú principal de la aplicación
     */
    private static void menuPrincipal() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n=== MINI-SPOTIFY ===");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Gestionar Biblioteca Musical");
            System.out.println("3. Gestionar Playlists");
            System.out.println("4. Reproducir Canciones");
            System.out.println("5. Cerrar sesión");
            System.out.println("6. Salir del programa");
            
            int opcion = Entrada.leerEntero("Seleccione una opción: ");
            
            switch (opcion) {
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    if (verificarSesion()) {
                        menuBiblioteca();
                    }
                    break;
                case 3:
                    if (verificarSesion()) {
                        menuPlaylists();
                    }
                    break;
                case 4:
                    if (verificarSesion()) {
                        menuReproduccion();
                    }
                    break;
                case 5:
                    cerrarSesion();
                    break;
                case 6:
                    salir = true;
                    System.out.println("\nGracias por usar Mini-Spotify. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
    
    /**
     * Gestiona el inicio de sesión
     */
    private static void iniciarSesion() {
        System.out.println("\n--- INICIAR SESIÓN ---");
        String usuario = Entrada.leerTexto("Usuario: ");
        String password = Entrada.leerTexto("Contraseña: ");
        cuenta.iniciarSesion(usuario, password);
    }
    
    /**
     * Cierra la sesión actual
     */
    private static void cerrarSesion() {
        if (cuenta.isSesionIniciada()) {
            cuenta.cerrarSesion();
        } else {
            System.out.println("No hay ninguna sesión activa.");
        }
    }
    
    /**
     * Verifica si hay una sesión activa
     * @return true si hay sesión activa
     */
    private static boolean verificarSesion() {
        if (!cuenta.isSesionIniciada()) {
            System.out.println("Debe iniciar sesión primero.");
            return false;
        }
        return true;
    }
    
    /**
     * Menú de gestión de biblioteca musical
     */
    private static void menuBiblioteca() {
        boolean volver = false;
        
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE BIBLIOTECA ---");
            System.out.println("1. Listar canciones");
            System.out.println("2. Agregar canción");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Volver");
            
            int opcion = Entrada.leerEntero("Seleccione: ");
            
            switch (opcion) {
                case 1:
                    biblioteca.listarCatalogo();
                    Entrada.pausar();
                    break;
                case 2:
                    agregarCancionBiblioteca();
                    break;
                case 3:
                    buscarCancion();
                    break;
                case 4:
                    volver = true;
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
    
    /**
     * Agrega una nueva canción a la biblioteca
     */
    private static void agregarCancionBiblioteca() {
        System.out.println("\n--- AGREGAR CANCIÓN ---");
        String titulo = Entrada.leerTexto("Título: ");
        String artista = Entrada.leerTexto("Artista: ");
        int duracion = Entrada.leerEntero("Duración en segundos: ");
        
        Cancion nuevaCancion = new Cancion(titulo, artista, duracion);
        if (biblioteca.agregarCancion(nuevaCancion)) {
            System.out.println("Canción agregada exitosamente a la biblioteca.");
        }
        Entrada.pausar();
    }
    
    /**
     * Busca canciones en la biblioteca
     */
    private static void buscarCancion() {
        System.out.println("\n--- BUSCAR CANCIÓN ---");
        String nombre = Entrada.leerTexto("Ingrese nombre o fragmento: ");
        
        Cancion[] resultados = biblioteca.buscarPorNombre(nombre);
        
        if (resultados.length == 0) {
            System.out.println("No se encontraron resultados.");
        } else {
            System.out.println("Resultado" + (resultados.length > 1 ? "s" : "") + " encontrado" + 
                             (resultados.length > 1 ? "s" : "") + ":");
            for (Cancion cancion : resultados) {
                System.out.println(cancion.toString());
            }
        }
        Entrada.pausar();
    }
    
    /**
     * Menú de gestión de playlists
     */
    private static void menuPlaylists() {
        boolean volver = false;
        
        while (!volver) {
            System.out.println("\n--- GESTIÓN DE PLAYLISTS ---");
            System.out.println("1. Crear playlist");
            System.out.println("2. Listar playlists");
            System.out.println("3. Agregar canción a playlist");
            System.out.println("4. Ver canciones de una playlist");
            System.out.println("5. Volver");
            
            int opcion = Entrada.leerEntero("Seleccione: ");
            
            switch (opcion) {
                case 1:
                    crearPlaylist();
                    break;
                case 2:
                    cuenta.listarPlaylists();
                    Entrada.pausar();
                    break;
                case 3:
                    agregarCancionAPlaylist();
                    break;
                case 4:
                    verCancionesPlaylist();
                    break;
                case 5:
                    volver = true;
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
    
    /**
     * Crea una nueva playlist
     */
    private static void crearPlaylist() {
        System.out.println("\n--- CREAR PLAYLIST ---");
        String nombre = Entrada.leerTexto("Ingrese nombre: ");
        
        Playlist nuevaPlaylist = new Playlist(nombre);
        if (cuenta.agregarPlaylist(nuevaPlaylist)) {
            System.out.println("Playlist creada correctamente.");
        }
        Entrada.pausar();
    }
    
    /**
     * Agrega una canción del catálogo a una playlist
     */
    private static void agregarCancionAPlaylist() {
        System.out.println("\n--- AGREGAR CANCIÓN A PLAYLIST ---");
        String nombrePlaylist = Entrada.leerTexto("Nombre de la playlist: ");
        
        Playlist playlist = cuenta.buscarPlaylist(nombrePlaylist);
        if (playlist == null) {
            System.out.println("Playlist no encontrada.");
            Entrada.pausar();
            return;
        }
        
        System.out.println("Seleccione canción del catálogo:");
        System.out.println();
        
        // Mostrar catálogo
        Cancion[] todasLasCanciones = biblioteca.obtenerTodasLasCanciones();
        for (int i = 0; i < todasLasCanciones.length; i++) {
            System.out.println("[" + i + "] " + todasLasCanciones[i].getTitulo() + 
                             " - " + todasLasCanciones[i].getArtista());
        }
        
        int indice = Entrada.leerEntero("\nIngrese índice de canción: ");
        Cancion cancion = biblioteca.getCancion(indice);
        
        if (cancion != null) {
            if (cuenta.agregarCancionAPlaylist(nombrePlaylist, cancion)) {
                System.out.println("Canción agregada correctamente a la playlist.");
            }
        } else {
            System.out.println("Índice inválido.");
        }
        
        Entrada.pausar();
    }
    
    /**
     * Muestra las canciones de una playlist
     */
    private static void verCancionesPlaylist() {
        System.out.println("\n--- VER CANCIONES EN PLAYLIST ---");
        String nombrePlaylist = Entrada.leerTexto("Playlist: ");
        
        Playlist playlist = cuenta.buscarPlaylist(nombrePlaylist);
        if (playlist == null) {
            System.out.println("Playlist no encontrada.");
        } else {
            playlist.listarCanciones();
        }
        
        Entrada.pausar();
    }
    
    /**
     * Menú de reproducción de canciones
     */
    private static void menuReproduccion() {
        boolean volver = false;
        
        while (!volver) {
            System.out.println("\n--- REPRODUCCIÓN ---");
            System.out.println("1. Reproducir canción desde playlist");
            System.out.println("2. Detener reproducción");
            System.out.println("3. Volver");
            
            int opcion = Entrada.leerEntero("Seleccione: ");
            
            switch (opcion) {
                case 1:
                    reproducirCancionDesdePlaylist();
                    break;
                case 2:
                    cuenta.detenerReproduccion();
                    Entrada.pausar();
                    break;
                case 3:
                    volver = true;
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
    
    /**
     * Reproduce una canción desde una playlist
     * Demuestra el uso de polimorfismo con la interfaz Reproducible
     */
    private static void reproducirCancionDesdePlaylist() {
        System.out.println("\n--- REPRODUCIR DESDE PLAYLIST ---");
        String nombrePlaylist = Entrada.leerTexto("Nombre de la playlist: ");
        
        Playlist playlist = cuenta.buscarPlaylist(nombrePlaylist);
        if (playlist == null) {
            System.out.println("Playlist no encontrada.");
            Entrada.pausar();
            return;
        }
        
        if (playlist.estaVacia()) {
            System.out.println("La playlist está vacía.");
            Entrada.pausar();
            return;
        }
        
        System.out.println("Canciones disponibles:");
        for (int i = 0; i < playlist.getContadorCanciones(); i++) {
            Cancion c = playlist.getCancion(i);
            System.out.println("[" + i + "] " + c.getTitulo() + " - " + c.getArtista());
        }
        
        int indice = Entrada.leerEntero("\nIngrese índice de canción: ");
        
        // Uso de polimorfismo: el método reproducir usa la interfaz Reproducible
        cuenta.reproducir(nombrePlaylist, indice);
        
        Entrada.pausar();
    }
}