package Ejercicio2;

public class Autor {
    
    // Atributos
    private String id;
    private String nombre;
    private String nacionalidad;
    
    // Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    // Métodos
    public String mostrarInfo() {
        return "-> Autor(id=" + id +
                ", nombre=" + nombre +
                ", nacionalidad=" +
                nacionalidad + ")";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
