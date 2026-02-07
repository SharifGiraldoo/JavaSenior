package modelado;

/**
 * Clase que representa una playlist de canciones.
 * Demuestra agregación y sobrecarga de métodos.
 */
public class Playlist {
    private String nombre;
    private Cancion[] canciones;
    private int contadorCanciones;
    private int maxCanciones;
    
    /**
     * Constructor de Playlist
     * @param nombre El nombre de la playlist
     * @param maxCanciones Capacidad máxima de canciones
     */
    public Playlist(String nombre, int maxCanciones) {
        this.nombre = nombre;
        this.maxCanciones = maxCanciones;
        this.canciones = new Cancion[maxCanciones];
        this.contadorCanciones = 0;
    }
    
    /**
     * Constructor con capacidad por defecto de 50 canciones
     * @param nombre El nombre de la playlist
     */
    public Playlist(String nombre) {
        this(nombre, 50);
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getContadorCanciones() {
        return contadorCanciones;
    }
    
    /**
     * Agrega una canción a la playlist
     * @param c La canción a agregar
     * @return true si se agregó exitosamente, false si está llena
     */
    public boolean agregarCancion(Cancion c) {
        if (estaLlena()) {
            System.out.println("La playlist está llena. No se puede agregar más canciones.");
            return false;
        }
        canciones[contadorCanciones] = c;
        contadorCanciones++;
        return true;
    }
    
    /**
     * Sobrecarga: Agrega una canción creándola desde sus datos
     * @param titulo El título de la canción
     * @param artista El artista de la canción
     * @param duracion La duración en segundos
     * @return true si se agregó exitosamente, false si está llena
     */
    public boolean agregarCancion(String titulo, String artista, int duracion) {
        if (estaLlena()) {
            System.out.println("La playlist está llena. No se puede agregar más canciones.");
            return false;
        }
        Cancion nuevaCancion = new Cancion(titulo, artista, duracion);
        canciones[contadorCanciones] = nuevaCancion;
        contadorCanciones++;
        return true;
    }
    
    /**
     * Lista todas las canciones de la playlist
     */
    public void listarCanciones() {
        if (contadorCanciones == 0) {
            System.out.println("La playlist está vacía.");
            return;
        }
        
        System.out.println("\n--- CANCIONES EN PLAYLIST: " + nombre + " ---");
        for (int i = 0; i < contadorCanciones; i++) {
            System.out.println("[" + i + "] " + canciones[i].toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("Total: " + contadorCanciones + " canción" + (contadorCanciones != 1 ? "es" : ""));
    }
    
    /**
     * Reproduce una canción específica de la playlist usando polimorfismo
     * @param index El índice de la canción a reproducir
     */
    public void reproducirCancion(int index) {
        if (index < 0 || index >= contadorCanciones) {
            System.out.println("Índice inválido. Seleccione un número entre 0 y " + (contadorCanciones - 1));
            return;
        }
        
        // Uso de polimorfismo: la referencia es de tipo Reproducible
        Reproducible elemento = canciones[index];
        elemento.reproducir();
    }
    
    /**
     * Obtiene una canción por su índice
     * @param index El índice de la canción
     * @return La canción en ese índice o null si no existe
     */
    public Cancion getCancion(int index) {
        if (index >= 0 && index < contadorCanciones) {
            return canciones[index];
        }
        return null;
    }
    
    /**
     * Verifica si la playlist está llena
     * @return true si está llena, false en caso contrario
     */
    public boolean estaLlena() {
        return contadorCanciones >= maxCanciones;
    }
    
    /**
     * Verifica si la playlist está vacía
     * @return true si está vacía, false en caso contrario
     */
    public boolean estaVacia() {
        return contadorCanciones == 0;
    }
}