package Ejercicio2;

public class Circulo extends Figura {
    
    // Atributo
    private double radio;
    
    // Constructor
    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    // Método sobrescrito
    @Override 
    public double calcularArea() {
        return Math.PI * (radio * radio); 
    }
    
    // Métodos setter y getter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio <= 0) {
            System.out.println("ERROR: El radio debe ser positivo.");
        }
        this.radio = radio;
    }
    
}
