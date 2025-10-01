class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " y enseño " + materia);
    }
}