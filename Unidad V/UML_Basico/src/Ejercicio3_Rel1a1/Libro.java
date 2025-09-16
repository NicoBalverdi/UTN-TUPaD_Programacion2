package Ejercicio3_Rel1a1;

public class Libro {
    
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        if(titulo != null && isbn != null && editorial != null){
            this.titulo = titulo;
            this.isbn = isbn;
            this.editorial = editorial;
        }
    }

    public void mostrarAutor() {
        if(autor != null)
            System.out.println("El libro " + titulo + " pertenece a " + autor.getNombre() + " de nacionalidad " + autor.getNacionalidad());
        else
            System.out.println("El libro " + titulo + " no tiene autor");
    }

    public void setAutor(Autor autor) {
        if(autor != null)
            this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
    
}
