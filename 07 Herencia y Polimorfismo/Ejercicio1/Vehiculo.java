package Ejercicio1;

public class Vehiculo {
    
    // Atributos
    protected String marca;
    protected String modelo;
    
    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Método
    public void mostrarInfo() {
        System.out.println("Información del vehículo:");
        System.out.println("- Marca: " + marca);
        System.out.println("- Modelo: " + modelo);
    }
    
}
