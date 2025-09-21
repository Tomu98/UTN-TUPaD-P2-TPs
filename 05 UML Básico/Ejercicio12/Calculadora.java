package Ejercicio12;

public class Calculadora {
    
    // Dependencia de uso
    public void calcular(Impuesto impuesto) {
        System.out.println("\nCalculando pago con impuesto...");
        System.out.println("- Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("- CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("- Monto Base: " + impuesto.getMonto());
        
        // Ejemplo de cálculo
        double recargo = impuesto.getMonto() * 0.21; // 21% IVA
        double montoFinal = impuesto.getMonto() + recargo;
        
        System.out.println("- Recargo aplicado (21%): $" + recargo);
        System.out.println("- Monto final a pagar: $" + montoFinal + "\n");
    }
    
}
