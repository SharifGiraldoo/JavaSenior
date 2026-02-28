public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MiClase miClase = new MiClase();
        ejecutarAccion(miClase);

        /**
         * Una expresión lambda es una forma concisa de representar una función anónima, es decir, una función sin un nombre específico. En Java, las expresiones lambda se utilizan principalmente para implementar interfaces funcionales, que son interfaces que tienen un solo método abstracto.
         * Reemplaza implementaciones de interfaces funcionales con una sintaxis más compacta y legible. En lugar de crear una clase concreta que implemente la interfaz, puedes usar una expresión lambda para proporcionar la implementación directamente en el lugar donde se necesita.
         * Esto hace que el código sea más limpio y fácil de entender, especialmente cuando la implementación es simple y no requiere una clase completa. En el ejemplo, la expresión lambda () -> System.out.println("Ejecutando la acción desde una expresión lambda") proporciona una implementación directa del método accion() 
         * de la interfaz InterfazFuncional, sin necesidad de crear una clase concreta para ello.
         */
        ejecutarAccion(() -> System.out.println("Ejecutando la acción desde una expresión lambda"));


        /**
         * Java entiende que una expresión lambda es una implementación de la interfaz funcional, 
         * por lo que no es necesario crear una clase concreta para implementarla. 
         * En el ejemplo, la expresión lambda () -> { ... } se interpreta como una implementación del 
         * método accion() de la interfaz InterfazFuncional, lo que permite ejecutar múltiples acciones
         *  dentro de la misma expresión lambda.
         */
        ejecutarAccion(()->{
            System.out.println("Ejecutando accion 1");
            System.out.println("Ejecutando accion 2");
            System.out.println("Ejecutando accion 3");
        });



        ejecutarAccion(miClase);

        MiOtraClase miOtraClase = new MiOtraClase();
        ejecutarAccion(miOtraClase);

        //ejecutarAccion() se comporta de acuerdo a la implementación que le pasemos, ya sea una clase concreta o una expresión lambda, lo que nos permite tener un código más flexible y reutilizable.
        //Tenemos la capacidad de una interfaz funcional y un método que recibe objetos, este responde de acuerdo a los objetos que se le pasen
        //Esto le da versatilidad a nuestro método

        metodoVersatil(5, 6, (a,b)->{
            System.out.println("La suma es: " + (a+b));

        });

        metodoVersatil(20, 5, (a,b)->{
            System.out.println("La division es: " + (a/b));
        });

    }



    public static void ejecutarAccion(InterfazFuncional accion){
        accion.accion();
    }


    public static void metodoVersatil(int a, int b, InterfazOperacion operacion){
        operacion.ejecutarOperacion(a, b);
        
    }
}
