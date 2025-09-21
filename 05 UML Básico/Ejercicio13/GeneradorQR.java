package Ejercicio13;

public class GeneradorQR {
    
    // Dependencia de creación
    public void generar(String valor, Usuario usuario) {
        System.out.println("\nGenerando código QR...");
        System.out.println("- Solicitud para: " + usuario.getNombre());
        System.out.println("- Email: " + usuario.getEmail());
        
        // Se crea el objeto
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        // Uso del objeto creado
        System.out.println("\nQR Creado...");
        System.out.println("- Valor del QR: " + codigoQR.getValor() + "\n");
    }
    
}
