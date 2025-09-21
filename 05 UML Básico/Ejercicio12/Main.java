package Ejercicio12;

public class Main {
   
    public static void main(String[] args) {
        
        // Instancias
        Contribuyente contribuyente1 = new Contribuyente("Abel Tomás", "20-12345678-9");
        Impuesto impuesto1 = new Impuesto(50000.0);
        impuesto1.setContribuyente(contribuyente1);
        Calculadora calculadora1 = new Calculadora();
        
        // Resultados
        calculadora1.calcular(impuesto1);
        
    }
    
}
