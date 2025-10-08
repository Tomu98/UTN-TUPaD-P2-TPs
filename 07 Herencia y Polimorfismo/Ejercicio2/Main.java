package Ejercicio2;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Creamos un Array de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        
        // Creamos figuras para el array
        Circulo c1 = new Circulo(3.0, "Circulo 1");
        Circulo c2 = new Circulo(8.2, "Circulo 2");
        Circulo c3 = new Circulo(12.3, "Circulo 3");
        Rectangulo r1 = new Rectangulo(5.6, 2.4, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(1.7, 5.1, "Rectangulo 2");
        Rectangulo r3 = new Rectangulo(3.4, 10.9, "Rectangulo 3");
        
        // Añadimos las figuras al array
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(c3);
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(r3);
        
        // Recorremos el array y mostramos el área de cada figura
        System.out.println("================================================");
        for (Figura f : figuras) {
            System.out.printf("El area del %s es: %.2f%n", f.getNombre(), f.calcularArea());
        }
        System.out.println("================================================");
        
    }
    
}
