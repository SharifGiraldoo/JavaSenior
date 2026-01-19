public class App {
    public static void main(String[] args) throws Exception {

        /* 
        System.out.println("Registrando datos del usuario en el sistema");
        System.out.println("Registrando datos del usuario nuevamente");
        System.out.println("Registrando datos del usuario nuevamente");
        System.out.println("Registrando datos del usuario nuevamente");

        Como podemos evidenciar, esta práctica a medida que crece se puede volver tediosa y compleja de entender
        por lo que debemos encontrar maneras de siimplificar el proceso
        */

        registrarUsuario("Carlos");
    }


    static void registrarUsuario(String nombre){

        System.out.println("Registrando datos de " + nombre + " en el sistema");

    }
}
