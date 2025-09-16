package Ejer11_Dep_Uso;

public class Main_Ejercicio11 {
    
    public static void main(String[] args) {
        // Se instancian los objetos
        Reproductor r = new Reproductor();
        Cancion c = new Cancion("Summer");
        Artista a = new Artista("Calvin Harris", "EDM");
        
        System.out.println("Se muestran los objetos creados");
        System.out.println(r);
        System.out.println(c);
        System.out.println(a);
        System.out.println("");
        
        //Asociamos los objetos canción y artista
        c.setArtista(a);
        
        System.out.println("Mostramos los objetos ahora asociados");
        System.out.println(r);
        System.out.println(c);
        System.out.println(a);
        System.out.println("");
        
        // Reproducimos la canción con el método reproducir que recibe un objeto de tipo Cancion
        // pero el objeto Reproductor no guarda este objeto en sus atributos (Dependencia de uso)
        r.reporducir(c);
        
        // Hacemos que c apunte a null
        c = null;
        
        System.out.println("Mostramos una última vez los objetos e intentamos reproducir c mientras apunta a null");
        System.out.println(r);
        System.out.println(c);
        System.out.println(a);
        r.reporducir(c);
        
        
    }
    
}
