package Ejercicio14;

public class EditorVideo {
    
    // Dependencia de creación
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("\nIniciando exportación...");
        System.out.println("- Proyecto: " + proyecto.getNombre());
        System.out.println("- Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("- Formato: " + formato);
        
        // Se crea el objeto
        Render render = new Render(formato, proyecto);
        
        // Uso del objeto creado
        int tiempoEstimado = render.getProyecto().getDuracionMin() * 2;  // Simulando tiempo estimado de render
        System.out.println("\nProcesando render...");
        System.out.println("- Tiempo estimado: " + tiempoEstimado + " minutos");
        System.out.println("\nVideo exportado exitosamente.\n");
    }
    
}
