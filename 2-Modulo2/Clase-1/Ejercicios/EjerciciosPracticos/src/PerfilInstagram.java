public class PerfilInstagram {

    private String userename;
    private int seguidores;
    private String descripcion;
    
    
    public PerfilInstagram(String username, int seguidores, String descripcion){
        this.userename = username; 
        this.seguidores = seguidores;
        this.descripcion = descripcion;
    }


    public String getUserename() {
        return userename;
    }


    public void setUserename(String userename) {
        this.userename = userename;
    }


    public int getSeguidores() {
        return seguidores;
    }


    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void aumentarSeguidores(){
        this.seguidores++;
    }

}
