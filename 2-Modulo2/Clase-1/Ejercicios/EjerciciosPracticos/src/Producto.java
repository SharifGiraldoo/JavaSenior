public class Producto {

    private String nombre;
    private String referencia;
    private float precio;


    public Producto(String nombre, String referencia, float precio){
        this.nombre = nombre; 
        this.referencia = referencia;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getReferencia() {
        return referencia;
    }


    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public float getPrecio() {
        return precio;
    }


    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void agregarCarrito(){
        System.out.println("Producto agregado al carrito");
    }


    

}
