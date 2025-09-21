package Ejercicio5;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Propietario propietario1 = new Propietario("Abel Tomás", "12123123");
        Computadora pc1 = new Computadora("Lenovo", "XX123456789", "ASUS TUF", "X123");
        propietario1.setPc(pc1);
        
        // Resultados
        System.out.println("\nInformación de la computadora: ");
        System.out.println("- Propietario: " + pc1.getPropietario().getNombre());
        System.out.println("- DNI: " + pc1.getPropietario().getDni());
        System.out.println("- Marca: " + pc1.getMarca());
        System.out.println("- Placa Madre: " + pc1.getPlacaMadre().getModelo() + "\n");
        
    }
    
}
