package Ejercicio6_Rel1a1;

public class Cliente {
    
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        if(nombre != null && telefono != null){
            this.nombre = nombre;
            this.telefono = telefono;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
