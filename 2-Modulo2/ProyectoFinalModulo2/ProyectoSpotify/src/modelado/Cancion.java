package modelado;

/**
 * Clase que representa una canción.
 * Hereda de Multimedia e implementa Reproducible para permitir polimorfismo.
 */
public class Cancion extends Multimedia implements Reproducible {
    private String artista;
    
    /**
     * Constructor por defecto
     */
    public Cancion() {
        super();
        this.artista = "Artista desconocido";
    }
    
    /**
     * Constructor con título y artista
     * @param titulo El título de la canción
     * @param artista El artista de la canción
     */
    public Cancion(String titulo, String artista) {
        super(titulo);
        this.artista = artista;
    }
    
    /**
     * Constructor completo
     * @param titulo El título de la canción
     * @param artista El artista de la canción
     * @param duracionSegundos La duración en segundos
     */
    public Cancion(String titulo, String artista, int duracionSegundos) {
        super(titulo, duracionSegundos);
        this.artista = artista;
    }
    
    // Getter y Setter
    public String getArtista() {
        return artista;
    }
    
    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    /**
     * Implementación del método abstracto de Multimedia
     * @return Información completa de la canción
     */
    @Override
    public String getInfo() {
        return titulo + " - " + artista + " (" + duracionSegundos + "s)";
    }
    
    /**
     * Implementación polimórfica de reproducir (interfaz Reproducible)
     */
    @Override
    public void reproducir() {
        System.out.println("\nReproduciendo...");
        System.out.println("♪ " + titulo + " - " + artista + " (duración: " + duracionSegundos + "s)");
    }
    
    /**
     * Implementación polimórfica de detener (interfaz Reproducible)
     */
    @Override
    public void detener() {
        System.out.println("⏹ Reproducción detenida: " + titulo);
    }
    
    /**
     * Sobrescritura de toString para representación textual
     * @return Representación de la canción como String
     */
    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + duracionSegundos + "s)";
    }
}