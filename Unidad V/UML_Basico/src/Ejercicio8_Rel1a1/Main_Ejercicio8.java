package Ejercicio8_Rel1a1;

public class Main_Ejercicio8 {
    
    public static void main(String[] args) {
        // Se instancian los objetos
        Usuario u = new Usuario("Nico", "elcorreo@mail.com");
        // Documento tiene todos los argumentos necesarios en su constructor para crear un ojeto
        // de tipo FirmaDigital (composición y agregación a traves de un mismo constructor)
        Documento d = new Documento("El titulo", "Mucho texto", "042fj942ksd084...", "01-09-2025", u);
        
        System.out.println("Se muestran los objetos instanciados");
        System.out.println(u);
        System.out.println(d);
        System.out.println("");
        
        // Eliminamos el documento cambiando su referencia a null
        d = null;
        
        System.out.println("Se muestran los objetos una ultima vez");
        System.out.println(u);
        System.out.println(d);
    }
    
}
