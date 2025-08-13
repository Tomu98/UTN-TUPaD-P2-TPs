import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioProducto, peso;
        String zona;
        
        do {
            System.out.print("Ingrese el precio del producto: ");
            precioProducto = Double.parseDouble(scanner.nextLine());
            if (precioProducto <= 0) System.out.println("ERROR: Precio inválido.");
        } while (precioProducto <= 0);
        
        do {
            System.out.print("Ingrese el peso del paquete en kg: ");
            peso = Double.parseDouble(scanner.nextLine());
            if (peso <= 0) System.out.println("ERROR: Peso inválido.");
        } while (peso <= 0);
        
        do {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = scanner.nextLine().toUpperCase();
            if (!zona.equals("NACIONAL") && !zona.equals("INTERNACIONAL")) {
                System.out.println("ERROR: Zona inválida.");
            }
        } while (!zona.equals("NACIONAL") && !zona.equals("INTERNACIONAL"));
        
        double costoEnvio = calcularCostoEnvio(peso, zona); 
        System.out.printf("El costo de envío es: %.1f%n", costoEnvio);
        
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.printf("El total a pagar es: %.1f%n", total);
    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        final int ZONA_NACIONAL = 5, ZONA_INTERNACIONAL = 10;
        return zona.equals("NACIONAL") ? peso * ZONA_NACIONAL : peso * ZONA_INTERNACIONAL;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
