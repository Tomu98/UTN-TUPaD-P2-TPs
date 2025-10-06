package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    
    // Atributos
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    // Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Métodos
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            cursos.remove(curso);
            
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    
    public void listarCursos() {
        System.out.println("Los cursos del profesor " + nombre + " son: ");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public void mostrarInfo() {
        System.out.println("-> Profesor(ID=" + id +
                ", nombre=" + nombre +
                ", especialidad=" + especialidad +
                ", cursos=" + cursos.size() + ")");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}
