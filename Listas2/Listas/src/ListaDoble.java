public class ListaDoble {
    private Nodo primero;
    private Nodo ultimo;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void agregarAlFinal(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    public void agregarAlInicio(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    public void eliminar(Object dato) {
        if (estaVacia()) return;

        Nodo actual = primero;

        while (actual != null) {
            if (actual.getDato().equals(dato)) {

                if (actual == primero) {
                    primero = actual.getSiguiente();
                    if (primero != null) primero.setAnterior(null);
                } else if (actual == ultimo) {
                    ultimo = actual.getAnterior();
                    if (ultimo != null) ultimo.setSiguiente(null);
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                return;
            }
            actual = actual.getSiguiente();
        }
    }

   public void mostrar() {
    if (estaVacia()) {
        System.out.println("Lista vacía");
        return;
    }

    Nodo actual = primero;
    while (actual != null) {
        System.out.print(actual.getDato());
        if (actual.getSiguiente() != null) {
            System.out.print(" <-> ");
        }
        actual = actual.getSiguiente();
    }
    System.out.println(" <-> null");
}

}
