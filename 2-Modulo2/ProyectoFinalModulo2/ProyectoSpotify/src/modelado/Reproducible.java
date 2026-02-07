package modelado;

/**
 * Interfaz que representa cualquier elemento capaz de ser reproducido.
 * Permite polimorfismo para diferentes tipos de contenido multimedia.
 */
public interface Reproducible {
    /**
     * Inicia la reproducción del elemento
     */
    void reproducir();
    
    /**
     * Detiene la reproducción del elemento
     */
    void detener();
}