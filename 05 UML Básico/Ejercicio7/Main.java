package Ejercicio7;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Conductor conductor1 = new Conductor("Abel Tomás", "2X8X95X3");
        Motor motor1 = new Motor("Diesel", "XX111111");
        Vehiculo vehiculo1 = new Vehiculo("AR123NA", "Mercedes Benz", motor1);
        conductor1.setVehiculo(vehiculo1);
        
        // Resultados
        System.out.println("\nInformación del vehiculo:");
        System.out.println("- Conductor: " + conductor1.getNombre());
        System.out.println("- Licencia: " + conductor1.getLicencia());
        System.out.println("- Vehiculo: " + conductor1.getVehiculo().getModelo());
        System.out.println("- Motor: " + conductor1.getVehiculo().getMotor().getTipo());
        System.out.println("- NUM. Serie: " + conductor1.getVehiculo().getMotor().getNumeroSerie() + "\n");
        
    }
    
}
