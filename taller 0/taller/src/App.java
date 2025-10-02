public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Probando encapsulamiento y resguardo de id");

        Materia algebra = new Materia();
        algebra.setNombre("Algebra");
        algebra.setCodigo("MAT101");
        algebra.setCreditos(4);
        algebra.setProfesor("Juan Perez");

        System.out.println(algebra.toString());


        Materia calculo = new Materia();
        calculo.setNombre("Calculo");
        calculo.setCodigo("MAT201");
        calculo.setCreditos(5);
        calculo.setProfesor("Maria Gomez");

        System.out.println(calculo.toString());

        Universidad uni = new Universidad();
        uni.nombre = "Universidad Nacional";
        uni.direccion = "Calle Falsa 123";  
        uni.telefono = "555-1234";
        uni.rector = "Dr. Carlos Ruiz";
        uni.materias = new Materia[10];
        uni.numeroMaterias = 0;
        uni.materias[uni.numeroMaterias++] = algebra;
        uni.materias[uni.numeroMaterias++] = calculo;
        System.out.println("La universidad " + uni.nombre + " tiene " + uni.numeroMaterias + " materias.");
        
        Persona[] personas = new Persona[3];

        personas[0] = new Persona("Juan");
        personas[1] = new Alumno("Carla", "Ingeniería");
        personas[2] = new Profesor("Pedro", "Matemáticas");

        for (Persona p : personas) {
            p.presentarse(); // llama al método adecuado según el tipo real
        }

        Persona p1 = new Persona("Luis");
        Persona p2 = new Profesor("Luis");
        
        // seran iguales ??
        System.out.println(p1.equals(p2) ? "Iguales" : "Diferentes");

    }

}