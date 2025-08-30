package Ejercicio1;

public class Estudiante {
    private String nombre = "Nicolas";
    private String apellido = "Balverdi";
    private String curso = "C5 - 1er Año";
    private int calificacion = 8;
    
    void mostrarInfo(){
        System.out.println("Registro del estudiante");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    void subirCalificacion(int puntos) {
        if(puntos > 0)
            calificacion += puntos;
    }
    
    void bajarCalificacion(int puntos) {
        if(puntos > 0)
            calificacion -= puntos;
    }
}
