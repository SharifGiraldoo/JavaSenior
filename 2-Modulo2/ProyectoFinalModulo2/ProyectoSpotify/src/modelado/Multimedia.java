package modelado;

/**
 * Clase abstracta que representa un elemento multimedia genérico.
 * Sirve como superclase para diferentes tipos de contenido de audio.
 */
public abstract class Multimedia {
    protected String titulo;
    protected int duracionSegundos;
    
    /**
     * Constructor por defecto
     */
    public Multimedia() {
        this.titulo = "Sin título";
        this.duracionSegundos = 0;
    }
    
    /**
     * Constructor con título (Sobrecarga)
     * @param titulo El título del elemento multimedia
     */
    public Multimedia(String titulo) {
        this.titulo = titulo;
        this.duracionSegundos = 0;
    }
    
    /**
     * Constructor completo (Sobrecarga)
     * @param titulo El título del elemento multimedia
     * @param duracionSegundos La duración en segundos
     */
    public Multimedia(String titulo, int duracionSegundos) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getDuracionSegundos() {
        return duracionSegundos;
    }
    
    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }
    
    /**
     * Método abstracto que debe ser implementado por las subclases
     * @return Información detallada del elemento multimedia
     */
    public abstract String getInfo();
}