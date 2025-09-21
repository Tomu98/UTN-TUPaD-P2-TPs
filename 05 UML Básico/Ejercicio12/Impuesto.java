package Ejercicio12;

public class Impuesto {
    
    // Atributos
    private double monto;
    private Contribuyente contribuyente;    // Asociación unidireccional
    
    // Constructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
    // Métodos
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
}
