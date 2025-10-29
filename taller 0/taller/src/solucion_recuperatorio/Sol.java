package solucion_recuperatorio;
public class Sol {


// ==========================================
// Publicacion.java
// ==========================================
public class Publicacion {
    private String titulo;
    private int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    // Mostrar datos
    public String mostrarDatos() {
        return "Publicación: " + titulo + " – Año: " + anioPublicacion;
    }
}

// ==========================================
// Libro.java
// ==========================================
public class Libro extends Publicacion {
    private String autor;

    public Libro(String titulo, int anioPublicacion, String autor) {
        super(titulo, anioPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String mostrarDatos() {
        return "Libro: " + getTitulo() + " – Autor: " + autor + " – Año: " + getAnioPublicacion();
    }

    public String tipoPrestamo() {
        return "Préstamo por 15 días";
    }
}

// ==========================================
// Revista.java
// ==========================================
public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion, int numeroEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public String mostrarDatos() {
        return "Revista: " + getTitulo() + " – Edición N° " + numeroEdicion + " – Año: " + getAnioPublicacion();
    }

    public String tipoPrestamo() {
        return "Préstamo por 7 días";
    }
}

// ==========================================
// Biblioteca.java
// ==========================================
public class Biblioteca {
    private String nombre;
    private Publicacion[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre, int tamanio) {
        this.nombre = nombre;
        catalogo = new Publicacion[tamanio];
        cantidad = 0;
    }

    public void agregarPublicacion(Publicacion p) {
        // 1
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = p;
            cantidad++;
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(catalogo[i].mostrarDatos());
        }
    }

    public void ordenarPorAnioDesc() {
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                //2
                if (catalogo[j].getAnioPublicacion() > catalogo[j + 1].getAnioPublicacion()) {
                    Publicacion aux = catalogo[j];
                    catalogo[j] = catalogo[j + 1];
                    catalogo[j + 1] = aux;
                }
            }
        }
    }

    public Publicacion buscarPorTitulo(String titulo) {
        // ❌ ERROR intencional: getNombre() no existe, debe ser getTitulo()
        for (int i = 0; i < cantidad; i++) {
            //3
            if (catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {
                return catalogo[i];
            }
        }
        return null;
    }
}

// ==========================================
// IGestionPrestamos.java
// ==========================================
public interface IGestionPrestamos {
    void agregarPrestamo(Publicacion p);
    void mostrarPrestamos();
}

// ==========================================
// Usuario.java
// ==========================================
public class Usuario implements IGestionPrestamos {
    private String nombre;
    private Publicacion[] prestamos;
    private int cantidadPrestamos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.prestamos = new Publicacion[5]; // tamaño fijo
        this.cantidadPrestamos = 0;
    }

    @Override
    public void agregarPrestamo(Publicacion p) {
        if (cantidadPrestamos < prestamos.length) {
            prestamos[cantidadPrestamos] = p;
            cantidadPrestamos++;
        } else {
            System.out.println("No se pueden agregar más préstamos");
        }
    }

    @Override
    public void mostrarPrestamos() {
        System.out.println("Préstamos de " + nombre + ":");
        for (int i = 0; i < cantidadPrestamos; i++) {
            Publicacion p = prestamos[i];
            String tipo = "";
            if (p instanceof Libro) {
                tipo = ((Libro)p).tipoPrestamo();
            } else if (p instanceof Revista) {
                tipo = ((Revista)p).tipoPrestamo();
            }
            System.out.println(p.mostrarDatos() + " → " + tipo);
        }
    }
}


}