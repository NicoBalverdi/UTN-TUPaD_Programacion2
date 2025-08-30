package Ejercicio4;

public class MainEjercicio4 {
    
    public static void main(String[] args) {
        Gallina g = new Gallina();
        
        g.setIdGallina(114);
        g.setEdad(1);
        g.setHuevosPuestos(0);
        
        g.mostrarEstado();
        System.out.println("\n");
        
        g.ponerHuevo();
        g.ponerHuevo();
        g.ponerHuevo();
        g.envejecer();
        g.mostrarEstado();
        
    }
    
}
