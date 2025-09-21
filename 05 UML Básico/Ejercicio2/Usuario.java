package Ejercicio2;

public class Usuario {
    
    // Atributos
    private String nombre;
    private String dni;
    private Celular celular;    // Asociación bidireccional
    
    // Constructor
    public Usuario(String nombre, String dni) {
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

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);    // Sincronización bidireccional
        }
    }
    
}
