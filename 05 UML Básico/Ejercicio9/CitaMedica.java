package Ejercicio9;

public class CitaMedica {
    
    // Atributos
    private String fecha;
    private String hora;
    private Paciente paciente;          // Asociación unidireccional
    private Profesional profesional;    // Asociación unidireccional
    
    // Constructor
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Métodos
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
}
