package Ejercicio1;

public class Estudiante {
    
    // Atributos privados
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion);
    }
    
    // Método que muestra información del estudiante
    public void mostrarInfo() {
        System.out.println("- Nombre completo: " + apellido + ", " + nombre);
        System.out.println("- Curso: " + curso);
        System.out.println("- Calificación: " + calificacion + "\n");
    }
    
    // Método para subir la calificación
    public void subirCalificacion(double puntos) {
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
            System.out.println("La calificación ha subido a: " + calificacion);
        } else {
            System.out.println("ERROR: La calificación no debe superar el máximo de 10.");
        }
    }
    
    // Método para bajar la calificación
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
            calificacion = Math.round(calificacion * 10.0) / 10.0; // Redondear a 1 decimal
            System.out.println("La calificación ha bajado a: " + calificacion);
        } else {
            System.out.println("ERROR: La calificación no debe ser menos que el mínimo de 0.");
        }
    }

    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    private void setCalificacion(double calificacion) {
        if (calificacion < 0) {
            this.calificacion = 0;  // Si se inserta una calificación negativa, pasa a 0
        } else if (calificacion > 10) {
            this.calificacion = 10; // Si se inserta una calificación arriba del máximo, pasa a 10
        } else {
            this.calificacion = calificacion;
        }
    }
    
}
