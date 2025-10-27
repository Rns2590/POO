class Profesor extends Persona implements MiembroUniversidad{
    private String materia;
    private Materia[] materias;
    private int numeroDeMaterias;
    private int codMateria;

    public Profesor(String nombre,String apellido) {
        super(nombre,apellido);
        //this.materia = materia;
    }
    public Profesor(String nombre, String apellido, String materia) {
        super(nombre,apellido);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + " y enseño " + materia);
    }
    
     @Override
    public String obtenerRol() {
        return "Profesor";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return "Nombre: " + nombre + " " + apellido +
               ", Materia: " + materia;
    }

}