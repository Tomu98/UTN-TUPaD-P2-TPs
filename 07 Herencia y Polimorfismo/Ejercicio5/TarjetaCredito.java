package Ejercicio5;

public class TarjetaCredito implements Pagable {
    
    // Método sobrescrito
    @Override
    public void pagar() {
        System.out.println("Se realizo el pago con tarjeta de credito.");
    }
    
}
