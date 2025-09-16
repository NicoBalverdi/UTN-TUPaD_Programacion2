package Ejercicio9_Rel1a1;

public class Profesional {
    
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        if(nombre != null && especialidad != null){
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }

    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
    
}
