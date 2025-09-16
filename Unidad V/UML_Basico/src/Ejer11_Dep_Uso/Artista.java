package Ejer11_Dep_Uso;

public class Artista {
    
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        if(nombre != null && genero != null){
            this.nombre = nombre;
            this.genero = genero;
        }
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
}
