package Ejercicio10;

public class Main {

    public static void main(String[] args) {
        
        // Instancias
        Titular titular1 = new Titular("Abel Tomás", "12123123");
        CuentaBancaria cuenta1 = new CuentaBancaria("1234567890", 145000, "abel123", "2025-09-19");
        titular1.setCuentaBancaria(cuenta1);
        
        // Resultados
        System.out.println("\nInformación de la Cuenta Bancaria:");
        System.out.println("- Titular: " + cuenta1.getTitular().getNombre());
        System.out.println("- DNI: " + cuenta1.getTitular().getDni());
        System.out.println("- Saldo: " + cuenta1.getSaldo());
        System.out.println("- CBU: " + cuenta1.getCbu() + "\n");
        
    }
    
}
