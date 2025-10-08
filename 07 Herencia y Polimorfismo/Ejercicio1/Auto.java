package Ejercicio1;

public class Auto extends Vehiculo {
    
    // Atributo
    private int cantidadPuertas;
    
    // Constructor
    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    // Método sobrescrito
    @Override
    public void mostrarInfo() {
        System.out.println("Información del Auto:");
        System.out.println("- Marca: " + marca);
        System.out.println("- Modelo: " + modelo);
        System.out.println("- Cantidad de Puertas: " + cantidadPuertas);
    }
    
}
