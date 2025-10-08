package Ejercicio2;

public class Rectangulo extends Figura {
    
    // Atributos
    private double base;
    private double altura;
    
    // Constructor
    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    // Método sobrescrito
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    // Métodos setter y getter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("ERROR: La base debe ser positiva.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("ERROR: La altura debe ser positiva.");
        }
        this.altura = altura;
    }
    
}
