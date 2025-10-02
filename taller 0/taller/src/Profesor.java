class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre) {
        super(nombre);
        //this.materia = materia;
    }
    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " y enseño " + materia);
    }
}