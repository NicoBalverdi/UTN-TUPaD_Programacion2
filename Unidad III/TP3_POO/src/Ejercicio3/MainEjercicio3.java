package Ejercicio3;

public class MainEjercicio3 {
    
    public static void main(String[] args) {
        Libro novela = new Libro();
        
        System.out.println("Título: " + novela.getTitulo());
        System.out.println("Autor: " + novela.getAutor());
        System.out.println("Año de publicación: " + novela.getAnioPublicacion() + "\n");
        
        novela.setAnioPublicacion(-1240);
        System.out.println("Año de publicación: " + novela.getAnioPublicacion() + "\n");
        
        novela.setAnioPublicacion(2011);
        System.out.println("Año de publicación: " + novela.getAnioPublicacion() + "\n");
    }
    
}
