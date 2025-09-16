package Ejercicio4_Rel1a1;

public class Banco {
    
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        if(nombre != null && cuit != null){
            this.nombre = nombre;
            this.cuit = cuit;
        }
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    
}
