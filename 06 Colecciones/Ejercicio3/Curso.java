package Ejercicio3;

public class Curso {
    
    // Atributos
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    // Constructor
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    // Métodos
    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin profesor";
        System.out.println("-> Curso(codigo=" + codigo +
                ", nombre=" + nombre +
                ", profesor=" + nombreProfesor + ")");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        // Mismo profesor ya asignado -> no se hace nada
        if (profesor == this.profesor) {
            return;
        }
        
        // Si el profesor agregado es distinto de null
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignamos al nuevo profesor
        this.profesor = profesor;
        
        // Si el nuevo profesor es distinto de null y no se agregó a este curso, lo agregamos
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }
    
}
