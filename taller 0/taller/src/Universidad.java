public class Universidad {
    
    String nombre;
    String direccion;
    String telefono;
    String rector;
    Materia[] materias;
    Alumno[] alumnos;
    int numeroMaterias;

    public Alumno[] getAlumnos() {
        return alumnos;
    }


    // === Ordenamiento burbuja por nombre (o apellido si existiera) ===
    public static void ordenarPorNombreBurbuja(Alumno[] alumnos) {
        int n = alumnos.length;
        boolean huboIntercambio;

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (alumnos[j].getNombre().compareToIgnoreCase(alumnos[j + 1].getNombre()) > 0) {
                    Alumno temp = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            if (!huboIntercambio) break;
        }
    }

    // === Búsqueda binaria por nombre ===
    public static int busquedaBinariaAlumnos(Alumno[] alumnos, String nombre) {
        int izquierda = 0;
        int derecha = alumnos.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = alumnos[medio].getNombre().compareToIgnoreCase(nombre);

            if (comparacion == 0) return medio;
            else if (comparacion < 0) izquierda = medio + 1;
            else derecha = medio - 1;
        }

        return -1;
    }

}

