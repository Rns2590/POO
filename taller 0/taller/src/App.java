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


    }

}