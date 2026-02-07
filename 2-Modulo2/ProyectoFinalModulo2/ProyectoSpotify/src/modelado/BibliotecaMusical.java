package modelado;

/**
 * Clase que representa una biblioteca musical con un catálogo de canciones.
 * Permite agregar, buscar y listar canciones.
 */
public class BibliotecaMusical {
    private Cancion[] catalogo;
    private int contadorCatalogo;
    private int maxCatalogo;
    
    /**
     * Constructor de BibliotecaMusical
     * @param maxCatalogo Capacidad máxima del catálogo
     */
    public BibliotecaMusical(int maxCatalogo) {
        this.maxCatalogo = maxCatalogo;
        this.catalogo = new Cancion[maxCatalogo];
        this.contadorCatalogo = 0;
    }
    
    /**
     * Constructor con capacidad por defecto de 100 canciones
     */
    public BibliotecaMusical() {
        this(100);
    }
    
    /**
     * Agrega una canción al catálogo
     * @param c La canción a agregar
     * @return true si se agregó exitosamente, false si el catálogo está lleno
     */
    public boolean agregarCancion(Cancion c) {
        if (contadorCatalogo >= maxCatalogo) {
            System.out.println("El catálogo está lleno. No se pueden agregar más canciones.");
            return false;
        }
        catalogo[contadorCatalogo] = c;
        contadorCatalogo++;
        return true;
    }
    
    /**
     * Busca canciones por nombre (búsqueda parcial, case-insensitive)
     * @param nombre El nombre o fragmento a buscar
     * @return Array con las canciones encontradas
     */
    public Cancion[] buscarPorNombre(String nombre) {
        // Primero contamos cuántas coincidencias hay
        int coincidencias = 0;
        for (int i = 0; i < contadorCatalogo; i++) {
            if (catalogo[i].getTitulo().toLowerCase().contains(nombre.toLowerCase())) {
                coincidencias++;
            }
        }
        
        // Si no hay coincidencias, retornamos array vacío
        if (coincidencias == 0) {
            return new Cancion[0];
        }
        
        // Creamos array del tamaño exacto de coincidencias
        Cancion[] resultados = new Cancion[coincidencias];
        int indiceResultado = 0;
        
        // Llenamos el array de resultados
        for (int i = 0; i < contadorCatalogo; i++) {
            if (catalogo[i].getTitulo().toLowerCase().contains(nombre.toLowerCase())) {
                resultados[indiceResultado] = catalogo[i];
                indiceResultado++;
            }
        }
        
        return resultados;
    }
    
    /**
     * Lista todas las canciones del catálogo
     */
    public void listarCatalogo() {
        if (contadorCatalogo == 0) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        
        System.out.println("\n--- LISTA DE CANCIONES EN BIBLIOTECA ---");
        for (int i = 0; i < contadorCatalogo; i++) {
            System.out.println("[" + i + "] " + catalogo[i].toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("Total: " + contadorCatalogo + " canción" + (contadorCatalogo != 1 ? "es" : ""));
    }
    
    /**
     * Obtiene una canción por su índice
     * @param index El índice de la canción
     * @return La canción en ese índice o null si no existe
     */
    public Cancion getCancion(int index) {
        if (index >= 0 && index < contadorCatalogo) {
            return catalogo[index];
        }
        return null;
    }
    
    /**
     * Obtiene el número total de canciones en el catálogo
     * @return El contador de canciones
     */
    public int getContadorCatalogo() {
        return contadorCatalogo;
    }
    
    /**
     * Obtiene todas las canciones del catálogo
     * @return Array con todas las canciones
     */
    public Cancion[] obtenerTodasLasCanciones() {
        Cancion[] todasLasCanciones = new Cancion[contadorCatalogo];
        for (int i = 0; i < contadorCatalogo; i++) {
            todasLasCanciones[i] = catalogo[i];
        }
        return todasLasCanciones;
    }
}