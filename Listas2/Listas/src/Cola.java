public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Object dato) { // enqueue
        Nodo nuevo = new Nodo(dato);

        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    public Object desencolar() { // dequeue
        if (estaVacia()) return null;

        Object dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente != null) frente.setAnterior(null);
        else fin = null; // si quedó vacía

        return dato;
    }

    public Object verFrente() {
        return estaVacia() ? null : frente.getDato();
    }

    public void mostrar() {
    if (estaVacia()) {
        System.out.println("Cola vacía");
        return;
    }

    Nodo actual = frente;
    while (actual != null) {
        System.out.print(actual.getDato() + " --> ");
        actual = actual.getSiguiente();
    }
    System.out.println("null");
}


}
