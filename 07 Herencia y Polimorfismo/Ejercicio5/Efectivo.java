package Ejercicio5;

public class Efectivo implements Pagable {
    
    // Método sobrescrito
    @Override
    public void pagar() {
        System.out.println("Se realizo el pago con efectivo.");
    }
    
}
