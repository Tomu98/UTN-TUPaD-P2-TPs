package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    
    // Atributos
    private String nombre;
    private List<Curso> cursos;
    private List<Profesor> profesores;
    
    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }
    
    // Métodos
    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }
    
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = this.buscarProfesorPorId(idProfesor);
        Curso curso = this.buscarCursoPorCodigo(codigoCurso);
        
        if (profesor != null && curso != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("ERROR: Docente o curso no existen.");
        }
    }
    
    public void listarProfesor() {
        System.out.println("Cantidad de profesores en la universidad " + nombre + ": " + profesores.size());
        
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    public void listarCursos() {
        System.out.println("Cantidad de cursos en la universidad " + nombre + ": " + cursos.size());
        
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        if (id != null) {
            for (Profesor profesor : profesores) {
                if (profesor.getId().equals(id)) {
                    return profesor;
                }
            }
        }
        
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo != null) {
            for (Curso curso : cursos) {
                if (curso.getCodigo().equals(codigo)) {
                    return curso;
                }
            }
        }
        
        return null;
    }
    
    public void eliminarProfesor(Profesor profesor) {
        if (profesor != null && profesores.contains(profesor)) {
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            
            profesores.remove(profesor);
            System.out.println("Profesor '" + profesor.getNombre() + "' eliminado correctamente.\n");
        } else {
            System.out.println("NO se encontró el profesor a eliminar.\n");
        }
    }
    
    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            curso.setProfesor(null);
            cursos.remove(curso);
            System.out.println("Curso '" + curso.getNombre() + "' eliminado correctamente.\n");
        }
    }

    public String getNombre() {
        return nombre;
    }
    
}
