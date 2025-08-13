import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums, cantPositivos = 0, cantNegativos = 0, cantCeros = 0;
        
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            nums = Integer.parseInt(scanner.nextLine());
            
            if (nums > 0) {
                cantPositivos += 1;
            } else if (nums < 0) {
                cantNegativos += 1;
            } else {
                cantCeros += 1;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + cantPositivos);
        System.out.println("Negativos: " + cantNegativos);
        System.out.println("Ceros: " + cantCeros);
    }
}
