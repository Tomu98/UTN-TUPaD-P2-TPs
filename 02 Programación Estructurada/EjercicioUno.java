import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        
        do {
            System.out.print("Ingrese un año: ");
            year = Integer.parseInt(scanner.nextLine());
            if (year <= 0) System.out.println("ERROR: Año ingresado inválido.");
        } while (year <= 0);

        boolean esBisiesto = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        System.out.println("El año " + year + (esBisiesto ? " es" : " NO es") + " bisiesto."); 
    }
}
