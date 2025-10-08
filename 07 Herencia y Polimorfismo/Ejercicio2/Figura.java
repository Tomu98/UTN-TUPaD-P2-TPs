package Ejercicio2;

public abstract class Figura {

    // Atributo
    protected String nombre;
    
    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto
    public abstract double calcularArea();
    
    // Getter
    public String getNombre() {
        return nombre;
    }
    
}
