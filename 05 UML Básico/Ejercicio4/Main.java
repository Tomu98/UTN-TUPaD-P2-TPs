package Ejercicio4;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Cliente cliente1 = new Cliente("Abel Tomás", "12123123");
        Banco banco1 = new Banco("UTN-Bank", "30-12345678-9");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9012-3456", "30/09", banco1);
        cliente1.setTarjeta(tarjeta1);
        
        // Resultados
        System.out.println("\nInformación de la tarjeta:");
        System.out.println("- Titular: " + cliente1.getNombre() + "    DNI: " + cliente1.getDni());
        System.out.println("- NUM: " + cliente1.getTarjeta().getNumero() + "    VTO: " + cliente1.getTarjeta().getFechaVencimiento());
        System.out.println("- Banco: " + cliente1.getTarjeta().getBanco().getNombre() + "\n");
        
    }
    
}
