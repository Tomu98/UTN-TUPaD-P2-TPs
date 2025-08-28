package Ejercicio2;

public class Mascota {
    
    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    
    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        setEdad(edad);
    }
    
    // Método que muestra la información
    public void mostrarInfo() {
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Especie: " + especie);
        System.out.println("- Edad: " + edad + " años\n");
    }
    
    // Método que permite cumplir años
    public void cumplirAnios(int anios) {
        if (anios >= 1) {
            edad += anios;
            System.out.println("\nSimulando paso del tiempo de " + anios + " años.");
            System.out.println("Ahora " + nombre + " ha cumplido " + edad + " años.");
        } else {
            System.out.println("ERROR: Los años a cumplir debe ser mayor o igual a 1.");
        }
    }
    
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getEdad() {
        return edad;
    }
    
    private void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("ADVERTENCIA: Edad negativa o igual a cero (" + edad + ") corregida a 1 año.\n");
            this.edad = 1;
        } else {
            this.edad = edad;
        }
    }
    
}
