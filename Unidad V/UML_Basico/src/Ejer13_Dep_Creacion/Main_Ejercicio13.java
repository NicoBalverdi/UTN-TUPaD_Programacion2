package Ejer13_Dep_Creacion;

public class Main_Ejercicio13 {
    
    public static void main(String[] args) {
        // Se instancian los objetos, el objeto de tipo CódigoQR será creado más adelante por el objeto
        // de tipo GeneradorQR a través de un método (dependencia de creación)
        Usuario u = new Usuario("Don Pepe", "uncorreo@mail.com");
        GeneradorQR g = new GeneradorQR();
        
        System.out.println("Se muestran los objetos creados hasta ahora");
        System.out.println(u);
        System.out.println(g);
        System.out.println("");
        
        // Creación del objeto CódigoQR y su asociación con Usuario a través del método generar()
        System.out.println("Mostramos, ahora sí, todos los objetos y asociaciones");
        System.out.println(u);
        System.out.println(g);
        g.generar("sitioWeb.com", u);
    }
    
}
