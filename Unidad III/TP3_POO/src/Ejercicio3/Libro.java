package Ejercicio3;

public class Libro {
    private String titulo = "Wool";
    private String autor = "Hugh Howey";
    private int anioPublicacion = 2012;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0)
            this.anioPublicacion = anioPublicacion;
    }
    
}
