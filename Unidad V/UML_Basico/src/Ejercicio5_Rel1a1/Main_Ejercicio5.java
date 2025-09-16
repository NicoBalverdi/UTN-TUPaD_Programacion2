package Ejercicio5_Rel1a1;

public class Main_Ejercicio5 {
    
    public static void main(String[] args) {
        // Se instancian los objetos
        Propietario p = new Propietario("Juan Pablo", "40693877");
        // Computadora creará a su vez un objeto Placa Madre (relación de composición)
        Computadora c = new Computadora("Lenovo", "22542341235", "LNVB23142", "SKD1244");
        
        System.out.println("Mostramos los objetos");
        System.out.println(p);
        System.out.println(c);
        System.out.println("");
        
        // Realizamos la asociación bidireccional
        p.setComputadora(c);
        
        System.out.println("Estado de los objetos luego de asociarlos");
        System.out.println(p);
        System.out.println(c);
        System.out.println("");
        
        // Hacemos que c apunte a null
        c = null;
        
        System.out.println("Una ultima impresion con el objeto c apuntando a null");
        System.out.println(p);
        System.out.println(c);
    }
    
}
