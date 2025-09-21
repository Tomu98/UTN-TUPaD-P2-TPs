package Ejercicio13;

public class CodigoQR {
    
    // Atributos
    private String valor;
    private Usuario usuario;    // Asociación unidireccional
    
    // Constructor
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    // Métodos
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
