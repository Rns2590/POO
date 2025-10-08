public class Materia {
    
    // Variable estática para el ID incremental
    private static int contadorId = 1;

    // Atributos
    private Integer id;
    private String nombre;
    private String codigo;
    private int creditos;
    private String profesor;
    private double nota;

    // Constructor
    public Materia() {
        this.id = contadorId++;
    }

    public Integer getId() {
        return id;
    }

    // id solo lectura
    // public void setId(Integer id) {
    //     this.id = id;
    // }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }       

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }   

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getProfesor() {
        return profesor;
    }   

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }    
    
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // metodo toString para mostrar la información de la materia
    public String toString() {
        return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", creditos=" + creditos
                + ", profesor=" + profesor + "]";
    }
}

