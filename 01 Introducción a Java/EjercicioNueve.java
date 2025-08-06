import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String name = input.nextLine(); // CORREGIDO
        System.out.println("Hola, " + name);
    }
}
