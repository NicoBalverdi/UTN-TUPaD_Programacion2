package Ejer11_Dep_Uso;

public class Cancion {
    
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        if(titulo != null)
            this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        if(artista != null)
            this.artista = artista;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", por: " + artista;
    }
    
}
