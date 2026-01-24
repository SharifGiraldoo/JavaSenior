public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- Bienvenido a la App de Ejercicios de Práctica -----");
        System.out.println();


        PerfilInstagram perfil1 = new PerfilInstagram("itsssharif", 0, "Estudiando Java");

        PerfilInstagram perfil2 = new PerfilInstagram("JavaDev", 300, "Java professional developer");
    
         perfil1.aumentarSeguidores();
         perfil2.aumentarSeguidores();

         System.out.println("Seguidores del perfil 1: " + perfil1.getSeguidores());
         System.out.println("Seguidores del perfil 2: " + perfil2.getSeguidores());
    }


    

}
