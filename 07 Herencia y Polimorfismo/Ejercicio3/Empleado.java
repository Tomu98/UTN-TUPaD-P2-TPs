package Ejercicio3;

public abstract class Empleado {

    // Atributo
    private String nombre;
    
    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    // Método
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 2000;
        }
        
        if (e instanceof EmpleadoTemporal) {
            return 900;
        }
        
        return 0;
    }
    
    // Getter
    public String getNombre() {
        return nombre;
    }
    
}
