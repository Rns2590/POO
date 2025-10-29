package solucion_recuperatorio;

import solucion_recuperatorio.Sol.Biblioteca;
import solucion_recuperatorio.Sol.IGestionPrestamos;
import solucion_recuperatorio.Sol.Libro;
import solucion_recuperatorio.Sol.Publicacion;
import solucion_recuperatorio.Sol.Revista;
import solucion_recuperatorio.Sol.Usuario;

public class App {
       public static void main(String[] args) {
        Biblioteca miBiblio = new Biblioteca("Mi Biblioteca", 5);

        // Agregar publicaciones
        miBiblio.agregarPublicacion(new Libro("Java Básico", 2021, "Juan Pérez"));
        miBiblio.agregarPublicacion(new Revista("Revista Tech", 2023, 12));
        miBiblio.agregarPublicacion(new Libro("POO Avanzada", 2022, "Ana Gómez"));

        // Mostrar catálogo
        System.out.println("Catálogo inicial:");
        miBiblio.mostrarCatalogo();

        // Ordenar por año descendente
        miBiblio.ordenarPorAnioDesc();
        System.out.println("\nCatálogo ordenado por año (desc):");
        miBiblio.mostrarCatalogo();

        // Buscar por título
        Publicacion buscada = miBiblio.buscarPorTitulo("Java Básico");
        if (buscada != null) {
            System.out.println("\nSe encontró la publicación:");
            System.out.println(buscada.mostrarDatos());
        } else {
            System.out.println("\nNo se encontró la publicación.");
        }

        // Crear usuario y registrar préstamos
        IGestionPrestamos usuario = new Usuario("Ana Torres");
        usuario.agregarPrestamo(new Libro("Java Básico", 2021, "Juan Pérez"));
        usuario.agregarPrestamo(new Revista("Revista Tech", 2023, 12));

        // Mostrar préstamos
        System.out.println("\nPréstamos del usuario:");
        usuario.mostrarPrestamos();
    }
}
