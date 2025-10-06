package Ejercicio3;

public class Main {
    
    public static void main(String[] args) {
        
        // 1. Crea al menos 3 profesores y 5 cursos.
        // Creamos la Universidad
        Universidad uni1 = new Universidad("UTN");
        // Creamos los profesores
        Profesor profe1 = new Profesor("01", "Juancito", "Programacion");
        Profesor profe2 = new Profesor("02", "Mengana", "Ingles");
        Profesor profe3 = new Profesor("03", "Fulano", "AySO");
        // Creamos los cursos
        Curso ingles1 = new Curso("01", "Ingles 1");
        Curso ayso = new Curso("02", "AySO");
        Curso programacion1 = new Curso("03", "Programacion 1");
        Curso bdd = new Curso("04", "Bases de Datos 1");
        Curso programacion2 = new Curso("05", "Programacion 2");
        
        
        // 2. Agregar profesores y cursos a la universidad.
        // Agregamos los profesores
        uni1.agregarProfesor(profe1);
        uni1.agregarProfesor(profe2);
        uni1.agregarProfesor(profe3);
        // Agregamos los cursos
        uni1.agregarCurso(ingles1);
        uni1.agregarCurso(ayso);
        uni1.agregarCurso(programacion1);
        uni1.agregarCurso(bdd);
        uni1.agregarCurso(programacion2);
        

        // 3. Asignar profesores a cursos usando `asignarProfesorACurso(...)`.
        uni1.asignarProfesorACurso("03", "01");    // Juancito
        uni1.asignarProfesorACurso("05", "01");    // Juancito
        uni1.asignarProfesorACurso("01", "02");    // Mengana
        uni1.asignarProfesorACurso("02", "03");    // Fulano
        uni1.asignarProfesorACurso("04", "03");    // Fulano
        

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n==============================================================");
        System.out.println("4. Listamos cursos y profesores:");
        System.out.println("==============================================================");
        uni1.listarProfesor();
        System.out.println();
        uni1.listarCursos();
        
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n==============================================================");
        System.out.println("5. Cambiamos el profesor del curso 'Bases de Datos 1' a Mengana:");
        System.out.println("==============================================================");
        uni1.asignarProfesorACurso("04", "02");
        uni1.listarProfesor();
        System.out.println();
        uni1.listarCursos();
        

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n==============================================================");
        System.out.println("6. Removemos el curso 'Bases de Datos 1' y verificamos los cambios:");
        System.out.println("==============================================================");
        uni1.eliminarCurso(bdd);
        uni1.listarProfesor();
        System.out.println();
        uni1.listarCursos();
        
                
        // 7. Remover un profesor y dejar profesor = null.
        System.out.println("\n==============================================================");
        System.out.println("7. Removemos al profesor Fulano y dejamos sus cursos sin profesor:");
        System.out.println("==============================================================");
        uni1.eliminarProfesor(profe3);
        uni1.listarProfesor();
        System.out.println();
        uni1.listarCursos();
        

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n==============================================================");
        System.out.println("8. Mostramos un reporte: cantidad de cursos por profesor:");
        System.out.println("==============================================================");
        uni1.listarCursos();
        
    }
    
}
