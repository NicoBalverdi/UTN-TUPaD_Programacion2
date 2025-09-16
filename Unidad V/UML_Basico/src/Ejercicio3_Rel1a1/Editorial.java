package Ejercicio3_Rel1a1;

public class Editorial {
    
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        if(nombre != null && direccion != null){
            this.nombre = nombre;
            this.direccion = direccion;
        }
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}
