package Ejercicio6;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Cliente cliente1 = new Cliente("Anton Ego", "111222222");
        Mesa mesa1 = new Mesa(8, 1);
        Reserva reserva1 = new Reserva("2025-09-19", "21:00", mesa1);
        reserva1.setCliente(cliente1);
        
        // Resultados
        System.out.println("\nInformación de la reserva:");
        System.out.println("- Cliente: " + reserva1.getCliente().getNombre());
        System.out.println("- Fecha: " + reserva1.getFecha());
        System.out.println("- Hora: " + reserva1.getHora());
        System.out.println("- Numero de Mesa: " + reserva1.getMesa().getNumero());
        System.out.println("- Capacidad de Mesa: " + reserva1.getMesa().getCapacidad() + "\n");
        
    }
    
}
