package Ejer14_Dep_Creacion;

public class Proyecto {
    
    private String nombre;
    private String duracion;

    public Proyecto(String nombre, String duracion) {
        if(nombre != null && duracion != null){
            this.nombre = nombre;
            this.duracion = duracion;
        }
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracion=" + duracion + '}';
    }
    
}
