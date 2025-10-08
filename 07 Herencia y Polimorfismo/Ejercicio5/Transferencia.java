package Ejercicio5;

public class Transferencia implements Pagable {
    
    // Método sobrescrito
    @Override
    public void pagar() {
        System.out.println("Se realizo el pago con transferencia.");
    }
    
}
