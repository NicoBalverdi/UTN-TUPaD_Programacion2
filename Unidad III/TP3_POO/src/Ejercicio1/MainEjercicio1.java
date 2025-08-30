package Ejercicio1;

public class MainEjercicio1 {
    
    public static void main(String[] args) {
        Estudiante alumno = new Estudiante();
        
        alumno.mostrarInfo();
        System.out.println("\n");
        
        alumno.subirCalificacion(2);
        alumno.mostrarInfo();
        System.out.println("\n");
        
        alumno.bajarCalificacion(4);
        alumno.mostrarInfo();
    }
    
}
