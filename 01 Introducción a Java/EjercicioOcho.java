import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingresa el primer número entero: ");
        num1 = input.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        num2 = input.nextInt();
        
        int resultadoInt = num1 / num2;
        System.out.println("Resultado (int): " + num1 + " / " + num2 + " = " + resultadoInt);
        double resultadoDouble = (double) num1 / num2;
        System.out.println("Resultado (double): " + num1 + " / " + num2 + " = " + resultadoDouble);
    }
}
