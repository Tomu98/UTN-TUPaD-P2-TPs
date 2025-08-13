import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        
        do {
            System.out.print("Ingrese su edad: ");
            age = Integer.parseInt(scanner.nextLine());
            if (age <= 0) System.out.println("ERROR: La edad debe ser mayor a cero."); 
        } while (age <= 0);
        
        if (age < 12) {
            System.out.println("Eres un Niño.");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
}
