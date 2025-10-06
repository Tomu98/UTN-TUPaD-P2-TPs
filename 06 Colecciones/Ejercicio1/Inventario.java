package Ejercicio1;

import java.util.ArrayList;

public class Inventario {
    
    // Atributo
    private ArrayList<Producto> productos;
    
    // Constructor
    public Inventario() {
        this.productos = new ArrayList();
    }
    
    // Métodos
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        int i = 0;
        
        while (i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        
        if (i < this.productos.size()) {
            productoEncontrado = this.productos.get(i);
        }
        
        return productoEncontrado;
    }
    
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        
        if (p == null) {
            System.out.println("ID no encontrado.");
        } else {
            this.productos.remove(p);
            System.out.println("Producto con ID " + id + " eliminado.");
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        
        if (p == null) {
            System.out.println("ID no encontrado.");
        } else if (nuevaCantidad < 0) {
            System.out.println("ERROR: Cantidad inválida. Debe ingresar una cantidad positiva.");
        } else {
            int cantidadAnterior = p.getCantidad();
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado correctamente.");
            System.out.println("- Stock anterior: " + cantidadAnterior);
            System.out.println("- Stock nuevo: " + p.getCantidad());
        }
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList();
        
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                productosFiltrados.add(p);
            }
        }
        
        return productosFiltrados;
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto p : productos) {
            totalStock += p.getCantidad();
        }
        
        return totalStock;
    }
    
    public Producto productoConMayorStock() {
        int maxStock = -1;
        
        Producto productoConMayorStock = null;
        for (Producto p : productos) {
            if (p.getCantidad() >= maxStock) {
                maxStock = p.getCantidad();
                productoConMayorStock = p;
            }
        }
        
        return productoConMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList();
        
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productosFiltrados.add(p);
            }
        }
        
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorias disponbles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("-> '" + c + "': " + c.getDescripcion());
        }
    }
    
}
