package Ejercicio9_Rel1a1;

public class Main_Ejercicio9 {
    
    public static void main(String[] args) {
        // Se generan los objetos
        Paciente paciente = new Paciente("Don Pepe", "Pami");
        Profesional doctor = new Profesional("Daniel", "Diabetologo");
        CitaMedica cita = new CitaMedica("20-09-2025", "9 am");
        
        System.out.println("Se muestran los objetos instanciados");
        System.out.println(paciente);
        System.out.println(doctor);
        System.out.println(cita);
        System.out.println("");
        
        // Realizamos la asociación unidireccional de cita medica con paciente y profesional
        cita.setPaciente(paciente);
        cita.setProfesional(doctor);
        
        System.out.println("Mostramos los objetos asociados");
        System.out.println(paciente);
        System.out.println(doctor);
        System.out.println(cita);
        System.out.println("");
        
        // Eliminamos la referencia actual de cita
        cita = null;
        
        System.out.println("Mostramos los objetos ahora que cita apunta a null");
        System.out.println(paciente);
        System.out.println(doctor);
        System.out.println(cita);
    }
    
}
