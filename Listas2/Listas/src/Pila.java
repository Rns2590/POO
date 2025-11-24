public class Pila {
    private Nodo tope;

    public Pila() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void apilar(Object dato) { // push
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(tope);
        if (tope != null) tope.setAnterior(nuevo);
        tope = nuevo;
    }

    public Object desapilar() { // pop
        if (estaVacia()) return null;

        Object dato = tope.getDato();
        tope = tope.getSiguiente();
        if (tope != null) tope.setAnterior(null);

        return dato;
    }

    public Object verTope() { // peek
        return estaVacia() ? null : tope.getDato();
    }

    public void mostrar() {
    if (estaVacia()) {
        System.out.println("Pila vacía");
        return;
    }

    Nodo actual = tope;
    while (actual != null) {
        System.out.print(actual.getDato());
        if (actual.getSiguiente() != null) {
            System.out.print("\n|\n");
        }
        actual = actual.getSiguiente();
    }
    System.out.println("\nnull");
}

}
