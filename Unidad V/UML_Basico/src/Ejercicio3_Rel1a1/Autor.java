package Ejercicio3_Rel1a1;

public class Autor {
    
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        if(nombre != null && nacionalidad != null){
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    
    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
