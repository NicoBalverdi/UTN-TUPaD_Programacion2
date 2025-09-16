package Ejercicio3_Rel1a1;

public class Main_Ejercicio3 {
    
    public static void main(String[] args) {
        // Instanciamos los objetos
        Editorial e = new Editorial("El Mundo", "Av. Falsa 333");
        Libro l = new Libro("Espejismo", "123039249487", e);
        Autor a = new Autor("Hugh Howey", "Estado Unidense");
        
        System.out.println("Se muestran los objetos creados");
        System.out.println(e);
        System.out.println(l);
        System.out.println(a);
        System.out.println("");
        
        // Realizamos la asociación unidireccional de libro con autor
        l.setAutor(a);
        
        System.out.println("Enseñamos el autor del libro");
        l.mostrarAutor();
    }
    
}
