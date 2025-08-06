import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        
        System.out.print("Ingresa tu nombre: ");
        name = input.nextLine();
        System.out.print("Ingresa tu edad: ");
        age = Integer.parseInt(input.nextLine());
        
        System.out.println("Tu nombre es " + name);
        System.out.println("Tienes " + age + " años");
    }
}
