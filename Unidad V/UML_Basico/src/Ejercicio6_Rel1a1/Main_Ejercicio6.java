package Ejercicio6_Rel1a1;

public class Main_Ejercicio6 {
    
    public static void main(String[] args) {
        // Creamos los objetos
        Mesa m = new Mesa(6, 4);
        Cliente c = new Cliente("Don Pepe", "4748814");
        // Reserva solicita un objeto mesa como argumento en su constructor (agregación) 
        Reserva r = new Reserva("20-12-2025", "21 hs", m);
        
        System.out.println("Se muestran los objetos creado");
        System.out.println(m);
        System.out.println(c);
        System.out.println(r);
        System.out.println("");
        
        // Realizamos la asociación unidirecciónal entre Reserva y Cliente
        r.setCliente(c);
        
        System.out.println("Mostamos los objetos ahora asociados");
        System.out.println(m);
        System.out.println(c);
        System.out.println(r);
        System.out.println("");
        
        // Causamos que r tenga una referencia nula
        r = null;
        
        System.out.println("Una ultima impresion de los objetos");
        System.out.println(m);
        System.out.println(c);
        System.out.println(r);
        
    }
    
}
