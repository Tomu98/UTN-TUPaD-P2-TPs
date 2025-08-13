import java.util.Scanner;

public class EjercicioOnce {
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        
        do {
            System.out.print("Ingrese el precio del producto: ");
            precio = Double.parseDouble(scanner.nextLine());
            if (precio <= 0) System.out.println("ERROR: Precio inválido.");
        } while (precio <= 0);

        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
