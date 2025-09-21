package Ejercicio9;

public class Main {
    
    public static void main(String[] args) {
        
        // Instancias
        Paciente paciente1 = new Paciente("Johan Liebert", "Düsseldorfer Krankenkasse");
        Profesional profesional1 = new Profesional("Dr. Kenzo Tenma", "Neurocirujano");
        CitaMedica cita1 = new CitaMedica("1986-10-03", "22:45");
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        
        // Resultados
        System.out.println("\nRegistro de la cita medica de urgencia:");
        System.out.println("- Fecha: " + cita1.getFecha());
        System.out.println("- Hora: " + cita1.getHora());
        System.out.println("- Paciente: " + cita1.getPaciente().getNombre());
        System.out.println("- Obra Social: " + cita1.getPaciente().getObraSocial());
        System.out.println("- Profesional: " + cita1.getProfesional().getNombre());
        System.out.println("- Especialidad: " + cita1.getProfesional().getEspecialidad());
        System.out.println("- Resultado: CIRUGÍA EXITOSA\n");
        
    }
    
}
