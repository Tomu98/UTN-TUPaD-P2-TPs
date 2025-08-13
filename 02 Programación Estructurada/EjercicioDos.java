import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el tercer número: ");
        int num3 = Integer.parseInt(scanner.nextLine());
        
        int max = mayor(num1, num2, num3);
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales.");
        } else {
            System.out.println("El mayor es: " + max);
        }
    }

    public static int mayor(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        return c;
    }
}
