package modelado;

/**
 * Clase que representa una cuenta de usuario en el sistema Mini-Spotify.
 * Gestiona playlists, biblioteca musical y sesión del usuario.
 */
public class CuentaSpotify {
    private String usuario;
    private String password;
    private Playlist[] playlists;
    private int contadorPlaylists;
    private int maxPlaylists;
    private BibliotecaMusical biblioteca;
    private boolean sesionIniciada;
    private Cancion cancionReproduciendo;
    
    /**
     * Constructor de CuentaSpotify
     * @param usuario Nombre de usuario
     * @param password Contraseña
     * @param maxPlaylists Número máximo de playlists
     */
    public CuentaSpotify(String usuario, String password, int maxPlaylists) {
        this.usuario = usuario;
        this.password = password;
        this.maxPlaylists = maxPlaylists;
        this.playlists = new Playlist[maxPlaylists];
        this.contadorPlaylists = 0;
        this.sesionIniciada = false;
        this.cancionReproduciendo = null;
    }
    
    /**
     * Constructor con capacidad por defecto de 20 playlists
     * @param usuario Nombre de usuario
     * @param password Contraseña
     */
    public CuentaSpotify(String usuario, String password) {
        this(usuario, password, 20);
    }
    
    /**
     * Inicia sesión validando credenciales
     * @param u Nombre de usuario
     * @param p Contraseña
     * @return true si el inicio de sesión fue exitoso
     */
    public boolean iniciarSesion(String u, String p) {
        if (u.equals(usuario) && p.equals(password)) {
            sesionIniciada = true;
            System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuario + ".");
            return true;
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
            return false;
        }
    }
    
    /**
     * Cierra la sesión actual
     */
    public void cerrarSesion() {
        sesionIniciada = false;
        cancionReproduciendo = null;
        System.out.println("\nSesión cerrada.");
    }
    
    /**
     * Verifica si hay una sesión activa
     * @return true si la sesión está iniciada
     */
    public boolean isSesionIniciada() {
        return sesionIniciada;
    }
    
    /**
     * Asigna la biblioteca musical a la cuenta
     * @param biblioteca La biblioteca musical
     */
    public void setBiblioteca(BibliotecaMusical biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    /**
     * Obtiene la biblioteca musical
     * @return La biblioteca musical
     */
    public BibliotecaMusical getBiblioteca() {
        return biblioteca;
    }
    
    /**
     * Agrega una nueva playlist a la cuenta
     * @param p La playlist a agregar
     * @return true si se agregó exitosamente
     */
    public boolean agregarPlaylist(Playlist p) {
        if (contadorPlaylists >= maxPlaylists) {
            System.out.println("No se pueden agregar más playlists. Límite alcanzado.");
            return false;
        }
        playlists[contadorPlaylists] = p;
        contadorPlaylists++;
        return true;
    }
    
    /**
     * Busca una playlist por nombre
     * @param nombrePlaylist El nombre de la playlist
     * @return La playlist si existe, null en caso contrario
     */
    public Playlist buscarPlaylist(String nombrePlaylist) {
        for (int i = 0; i < contadorPlaylists; i++) {
            if (playlists[i].getNombre().equalsIgnoreCase(nombrePlaylist)) {
                return playlists[i];
            }
        }
        return null;
    }
    
    /**
     * Lista todas las playlists de la cuenta
     */
    public void listarPlaylists() {
        if (contadorPlaylists == 0) {
            System.out.println("No tienes playlists creadas.");
            return;
        }
        
        System.out.println("\n--- TUS PLAYLISTS ---");
        for (int i = 0; i < contadorPlaylists; i++) {
            System.out.println("[" + i + "] " + playlists[i].getNombre() + 
                             " (" + playlists[i].getContadorCanciones() + " canciones)");
        }
        System.out.println("----------------------");
    }
    
    /**
     * Agrega una canción a una playlist específica
     * @param nombrePlaylist Nombre de la playlist
     * @param c La canción a agregar
     * @return true si se agregó exitosamente
     */
    public boolean agregarCancionAPlaylist(String nombrePlaylist, Cancion c) {
        Playlist playlist = buscarPlaylist(nombrePlaylist);
        if (playlist == null) {
            System.out.println("Playlist no encontrada.");
            return false;
        }
        return playlist.agregarCancion(c);
    }
    
    /**
     * Reproduce una canción de una playlist específica
     * Demuestra uso de polimorfismo con la interfaz Reproducible
     * @param nombrePlaylist Nombre de la playlist
     * @param indexCancion Índice de la canción
     */
    public void reproducir(String nombrePlaylist, int indexCancion) {
        if (!sesionIniciada) {
            System.out.println("Debe iniciar sesión primero.");
            return;
        }
        
        Playlist playlist = buscarPlaylist(nombrePlaylist);
        if (playlist == null) {
            System.out.println("Playlist no encontrada.");
            return;
        }
        
        Cancion cancion = playlist.getCancion(indexCancion);
        if (cancion == null) {
            System.out.println("Índice de canción inválido.");
            return;
        }
        
        // Uso de polimorfismo: tratamos la canción como Reproducible
        cancionReproduciendo = cancion;
        Reproducible elemento = cancion;
        elemento.reproducir();
    }
    
    /**
     * Detiene la reproducción actual
     */
    public void detenerReproduccion() {
        if (cancionReproduciendo != null) {
            Reproducible elemento = cancionReproduciendo;
            elemento.detener();
            cancionReproduciendo = null;
        } else {
            System.out.println("No hay ninguna canción reproduciéndose.");
        }
    }
    
    /**
     * Obtiene el nombre de usuario
     * @return El nombre de usuario
     */
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Obtiene el número de playlists
     * @return El contador de playlists
     */
    public int getContadorPlaylists() {
        return contadorPlaylists;
    }
}