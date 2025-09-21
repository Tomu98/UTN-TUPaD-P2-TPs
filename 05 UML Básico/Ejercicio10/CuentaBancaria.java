package Ejercicio10;

public class CuentaBancaria {
    
    // Atributos
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;    // Composición
    private Titular titular;                  // Asociación bidireccional
    
    // Constructor
    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    // Métodos
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);    // Sincronización bidireccional
        }
    }
    
}
