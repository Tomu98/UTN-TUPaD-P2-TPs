import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums, sumaPares = 0;
        boolean seguir = true;
        
        while (seguir) {            
            System.out.print("Ingrese un número (0 para terminar): ");
            nums = Integer.parseInt(scanner.nextLine());
            
            if (nums == 0) {
                seguir = false;
            } else if (nums % 2 == 0) {
                sumaPares += nums;
            }
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
