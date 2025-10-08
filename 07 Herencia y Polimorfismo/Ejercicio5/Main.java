package Ejercicio5;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Creamos un array de formas de pago
        ArrayList<Pagable> formasDePago = new ArrayList<>();
        
        // Creamos formas de pago para el array
        TarjetaCredito tarjeta1 = new TarjetaCredito();
        Transferencia transferencia1 = new Transferencia();
        Efectivo efectivo1 = new Efectivo();
        
        // Añadimos las formas de pago al array
        formasDePago.add(tarjeta1);
        formasDePago.add(transferencia1);
        formasDePago.add(efectivo1);
        
        // Recorremos el array y mostramos el proceso de pago
        System.out.println("================================================");
        for (Pagable p : formasDePago) {
            procesarPago(p);
        }
        System.out.println("================================================");
        
    }
    
    public static void procesarPago(Pagable medio) {
        medio.pagar();
    }
    
}
