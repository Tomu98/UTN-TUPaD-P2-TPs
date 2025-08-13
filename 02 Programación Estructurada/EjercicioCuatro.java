import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, precioFinal = 0;
        char categoria;
        
        do {
            System.out.print("Ingrese el precio del producto: ");
            precio = Double.parseDouble(scanner.nextLine());
            if (precio <= 0) {
                System.out.println("ERROR: EL precio debe ser mayor a cero.");
            }
        } while (precio <= 0);
        
        do {
            System.out.print("Ingrese la categoría del producto (A, B o C): ");
            categoria = Character.toUpperCase(scanner.nextLine().charAt(0));
            if (categoria != 'A' && categoria != 'B' && categoria != 'C') {
                System.out.println("ERROR: Categoría inválida.");
            }
        } while (categoria != 'A' && categoria != 'B' && categoria != 'C');
        
        switch (categoria) {
            case 'A' -> {
                System.out.println("Descuento aplicado: 10%");
                precioFinal = precio * 0.90;
            }
            case 'B' -> {
                System.out.println("Descuento aplicado: 15%");
                precioFinal = precio * 0.85;
            }
            case 'C' -> {
                System.out.println("Descuento aplicado: 20%");
                precioFinal = precio * 0.80;
            }
        }
        System.out.println("Precio final: $" + precioFinal);
    }
}
