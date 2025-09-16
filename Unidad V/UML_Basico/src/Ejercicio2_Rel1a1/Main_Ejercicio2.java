package Ejercicio2_Rel1a1;

public class Main_Ejercicio2 {
    
    public static void main(String[] args) {
        // Instanciamos los objetos
        Bateria b = new Bateria("LitioMax", 4500);
        Usuario u = new Usuario("Pepito", "38887123");
        // Al momento de instanciar el objeto celular se observa la relación de agregación con Bateria
        Celular c = new Celular("103496589803674", "Motorola", "Edge", b);
        
        System.out.println("Se muestran los objetos");
        System.out.println(b);
        System.out.println(u);
        System.out.println(c);
        System.out.println("");
        
        // Asociamos los objetos Usuario y Celular
        u.setCelular(c);
        
        System.out.println("Mostramos los objetos luego de asociarlos");
        System.out.println(b);
        System.out.println(u);
        System.out.println(c);
        System.out.println("");
        
        // hacemos que c tenga una referencia nula y comprobamos que el objeto b no se vea afectado
        c = null;
        System.out.println("Enseñamos los objetos una última vez");
        System.out.println(b);
        System.out.println(u);
        System.out.println(c);
    }
    
}
