package Ejercicio4_Rel1a1;

public class Main_Ejercicio4 {
    
    public static void main(String[] args) {
        // Instanciamos los objetos
        Banco b = new Banco("Macro", "30516544542");
        Cliente c = new Cliente("Analia Perez", "22883954");
        // Relación de agregación entre tarjeta de credito y banco
        TarjetaDeCredito t = new TarjetaDeCredito("3451467308318832", "01-01-2030", b);
        
        System.out.println("Mostramos los objetos");
        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
        System.out.println("");
        
        // Realizamos la asociación bidireccional entre tarjeta y cliente
        c.setTarjeta(t);
        
        System.out.println("Mostramos los objetos luego de realizar la asociacion");
        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
        System.out.println("");
        
        // Hacemos que t tenga referencia nula
        t = null;
        System.out.println("Mostramos una vez más ahora que el objeto tarjeta tiene una referencia nula");
        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
    }
    
}
