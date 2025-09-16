package Ejercicio1_Rel1a1;

public class Main_Ejercicio1 {
    
    public static void main(String[] args) {
        // Se genera la instancia de cada objeto
        Titular t = new Titular("Pedro Picapiedra", "1.294.336");
        // Al crear el pasaporte se crea la foto (Composición)
        Pasaporte p = new Pasaporte("991890", "15-03-2007", "Rostro del titular");
        
        System.out.println("Se muestran los objetos sin estar asociados");
        System.out.println(t);
        System.out.println(p);
        System.out.println("");
        
        
        // Realizamos la asociación (bidireccional en este caso)
        t.setPasaporte(p);
        
        System.out.println("Verificamos su correcta asocición");
        System.out.println(t);
        System.out.println(p);
        System.out.println("");
        
        // Rompemos las relaciones entre los objetos al cambiar la referencia de p a null
        p = null;
        
        System.out.println("Veamos cómo quedan las relaciones con la referencia nula de p");
        System.out.println(t);
        System.out.println(p);
    }
    
}
