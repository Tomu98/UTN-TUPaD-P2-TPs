import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(scanner.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
