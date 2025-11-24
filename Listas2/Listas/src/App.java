public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("=== LISTA DOBLEMENTE ENLAZADA ===");

        ListaDoble lista = new ListaDoble();

        lista.agregarAlInicio("A");
        lista.agregarAlFinal("B");
        lista.agregarAlFinal("C");

        // Mostrar
        lista.mostrar();

        // Eliminar
        lista.eliminar("B");
        lista.mostrar();

        System.out.println("\n=== PILA ===");
        Pila pila = new Pila();

        pila.apilar("1");
        pila.apilar("2");
        pila.apilar("3");

        // Mostrar
        pila.mostrar();

        // Desapilar
        System.out.println("Desapilado: " + pila.desapilar());

        pila.mostrar();

        System.out.println("Tope: " + pila.verTope());


        System.out.println("=== COLA ===");

        Cola cola = new Cola();

        cola.encolar("A");
        cola.encolar("B");
        cola.encolar("C");

        // Mostrar
        cola.mostrar();

        // Desencolar
        System.out.println("Desencolado: " + cola.desencolar());

        cola.mostrar();

        System.out.println("Frente: " + cola.verFrente());


    }
}
