package Ejercicio13;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Usuario usuario1 = new Usuario("Jeremias", "jere@mail.com");
        GeneradorQR generadorQR1 = new GeneradorQR();
        
        // Resultados
        generadorQR1.generar("www.url.com", usuario1);
        
    }
    
}
