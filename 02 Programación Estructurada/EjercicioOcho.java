import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioBase, impuesto, descuento, precioFinal;
        
        do {
            System.out.print("Ingrese el precio base del producto: $");
            precioBase = scanner.nextDouble();
            if (precioBase <= 0) System.out.println("ERROR: Precio base inválido.");
        } while (precioBase <= 0);
        
        do {
            System.out.print("Ingrese el impuesto en porcentaje (ej: 10 para 10%): ");
            impuesto = scanner.nextDouble();
            if (impuesto <= 0) System.out.println("ERROR: Impuesto inválido.");
        } while (impuesto <= 0);
        
        do {
            System.out.print("Ingrese el descuento por porcentaje (ej: 5 para 5%): ");
            descuento = scanner.nextDouble();
            if (descuento <= 0) System.out.println("ERROR: Descuento inválido.");
        } while (descuento <= 0);

        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.printf("El precio final del producto es: $%.1f%n", precioFinal);
    }
    
    public static double calcularPrecioFinal(double precioBase, double impu, double desc) {
        double impuesto = impu / 100;
        double descuento = desc / 100;
        
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
}
