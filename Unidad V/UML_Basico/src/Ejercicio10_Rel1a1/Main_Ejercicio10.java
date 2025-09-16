package Ejercicio10_Rel1a1;

public class Main_Ejercicio10 {
    
    public static void main(String[] args) {
        // Instanciamos los objetos
        Titular t = new Titular("Ana María", "17883994");
        // Se observa que el constructor de CuentaBancaria contiene lo necesario en sus argumentos para
        // crear un objeto de tipo ClaveSeguridad (composición)
        CuentaBancaria c = new CuentaBancaria("3241543514", 680000.50, "clave123");
        
        System.out.println("Se muestran los objetos");
        System.out.println(t);
        System.out.println(c);
        System.out.println("");
        
        // Realizamos la asociación bidireccional
        t.setCuenta(c);
        
        System.out.println("Mostramos los objetos relacionados");
        System.out.println(t);
        System.out.println(c);
        System.out.println("");
        
        // Hacemos que c apunte a null
        c = null;
        
        System.out.println("Mostramos los objetos ahora que c apunta a null");
        System.out.println(t);
        System.out.println(c);
        
    }
    
}
