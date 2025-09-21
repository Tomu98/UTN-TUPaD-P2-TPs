package Ejercicio2;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Usuario usuario1 = new Usuario("Abel Tomás", "12123123");
        Bateria bateria1 = new Bateria("EB-BT926ABY", 5000);
        Celular celular1 = new Celular("1234567890", "Samsung", "S25", bateria1);
        usuario1.setCelular(celular1);
        
        // Resultados
        System.out.println("\nInformación del usuario:");
        System.out.println("- Nombre: " + celular1.getUsuario().getNombre());
        System.out.println("- DNI: " + celular1.getUsuario().getDni());
        System.out.println("\nInformación del celular: ");
        System.out.println("- Marca: " + celular1.getMarca());
        System.out.println("- Modelo: " + celular1.getModelo());
        System.out.println("- Bateria: " + celular1.getBateria().getModelo() + " de " + bateria1.getCapacidad() + "mAh\n");
        
    }
    
}
