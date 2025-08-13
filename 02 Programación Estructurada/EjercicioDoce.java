public class EjercicioDoce {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
        
        System.out.println("Precios originales:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < precios.length; j++) {
                System.out.println("Precio: $" + precios[j]);
            }
            precios[2] = 129.99;
            if (i == 0) System.out.println("Precios modificados:");
        }
    }
}
