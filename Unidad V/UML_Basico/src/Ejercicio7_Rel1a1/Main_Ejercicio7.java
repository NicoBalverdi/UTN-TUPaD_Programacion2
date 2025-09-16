package Ejercicio7_Rel1a1;

public class Main_Ejercicio7 {
    
    public static void main(String[] args) {
        // Se instancian los objetos
        Motor m = new Motor("naftero", "53155431");
        // Agregación de motor al objeto auto en su constructor
        Vehiculo v = new Vehiculo("JDF999LM", "Megane", m);
        Conductor c = new Conductor("Pablo", "B1");
        
        System.out.println("Se muestran los objetos");
        System.out.println(m);
        System.out.println(v);
        System.out.println(c);
        System.out.println("");
        
        // Se asocian bidireccionalmente los objetos Vehiculo y Conuctor
        c.setVehiculo(v);
        
        System.out.println("Se muestran los objetos luego de la asociacion");
        System.out.println(m);
        System.out.println(v);
        System.out.println(c);
        System.out.println("");
        
        // Ahora v apunta a null
        v = null;
        
        System.out.println("Una ultima impresion");
        System.out.println(m);
        System.out.println(v);
        System.out.println(c);
        
    }
    
}
