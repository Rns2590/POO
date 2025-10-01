class Alumno extends Persona {
    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre); // llama al constructor de Persona
        this.carrera = carrera;
    }

    public void presentarse() {
        System.out.println("Hola, soy el alumno " + nombre + " y estudio " + carrera);
    }
}