package Ejercicio5;

public class Propietario {
    
    // Atributos
    private String nombre;
    private String dni;
    private Computadora pc;    // Asociación bidireccional
    
    // Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getPc() {
        return pc;
    }

    public void setPc(Computadora pc) {
        this.pc = pc;
        if (pc != null && pc.getPropietario() != this) {
            pc.setPropietario(this);    // Sincronización bidireccional
        }
    }
    
}
