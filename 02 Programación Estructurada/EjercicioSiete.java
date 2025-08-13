import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(scanner.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("ERROR: Nota inválida.");
            } else {
                System.out.println("Nota guardada correctamente.");
            }
        } while (nota < 0 || nota > 10);
    }
}
