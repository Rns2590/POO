class Alumno extends Persona {
    private String carrera;
    public Materia[] materias;

    public Alumno(String nombre, String carrera) {
        super(nombre); // llama al constructor de Persona
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el alumno " + nombre + " y estudio " + carrera);
    }

   // === Versión recursiva (exactamente como pide la consigna) ===
    public static double calcularPromedioRecursivo(Materia[] materias, int indice) {
        if (materias == null || materias.length == 0) return 0.0;

        // Caso base: última materia → devuelve su nota
        if (indice == materias.length - 1) {
            return materias[indice].getNota();
        }

        // Paso recursivo: suma la nota actual + las notas del resto
        return materias[indice].getNota() + calcularPromedioRecursivo(materias, indice + 1);
    }

    // === Versión iterativa ===
    public double calcularPromedioIterativo() {
        if (materias == null || materias.length == 0) return 0.0;

        double suma = 0.0;
        for (Materia m : materias) {
            suma += m.getNota();
        }
        return suma / materias.length;
    }


  // ===== ORDENAMIENTO BURBUJA =====
    public static void ordenarPorApellidoBurbuja(Alumno[] estudiantes) {
        int n = estudiantes.length;
        boolean huboIntercambio;

        // Recorremos el arreglo varias veces
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (estudiantes[j].getApellido().compareTo(estudiantes[j + 1].getApellido()) > 0) {
                    // Intercambio
                    Alumno temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) break;
        }
    }



}