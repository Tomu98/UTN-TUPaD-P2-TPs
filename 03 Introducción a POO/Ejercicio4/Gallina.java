package Ejercicio4;

public class Gallina {
    
    // Atributos
    private static int contadorId = 1; // Contador para el autoincremento del id
    private final int idGallina;
    private int edad;
    private int huevosPuestos = 0; // Empieza con cero huevos puestos
    
    // Constructor
    public Gallina(int edad) {
        this.idGallina = contadorId++;
        setEdad(edad);
    }
    
    // Método que hace poner un huevo a la gallina
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo.");
    }
    
    // Método que hace envejecer a la gallina
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido un año.");
    }
    
    // Método para mostrar el estado de la gallina
    public void mostrarEstado() {
        System.out.println("- ID Gallina: " + idGallina);
        System.out.println("- Edad: " + edad + " años");
        System.out.println("- Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------");
    }
    
    // Setter para la edad
    private void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("ADVERTENCIA: Edad inválida (" + edad + ") corregida a 1 año.");
            this.edad = 1;
        } else {
            this.edad = edad;
        }
    }
    
}
