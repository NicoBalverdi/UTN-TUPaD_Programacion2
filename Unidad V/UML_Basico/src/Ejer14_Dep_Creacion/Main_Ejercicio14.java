package Ejer14_Dep_Creacion;

public class Main_Ejercicio14 {
    
    public static void main(String[] args) {
        // Instanciamos los 2 primeros objetos, el objeto de tipo Render se creará luego
        EditorVideo ev = new EditorVideo();
        Proyecto p = new Proyecto("Pelicula", "1:50:40");
        
        System.out.println("Se muestran los objetos creados hasta ahora");
        System.out.println(ev);
        System.out.println(p);
        System.out.println("");
        
        // Se crea el objeto de tipo Render a través del método exportar() del objeto tipo EditorVideo
        // como se verá al imprimir los objetos, ev no guarda el objeto Render en sus atributos
        // esto indica una dependecia de creación.
        
        System.out.println("Ahora se imprimen todos los objetos");
        System.out.println(ev);
        System.out.println(p);
        ev.exportar(".mp4", p);
    }
    
}
