package Ejercicio5;

public class MainEjercicio5 {
    
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.setNombre("Dragon 5");
        nave.recargarCombustible(50);
        nave.mostrarEstado();
        nave.despegar();
        System.out.println("\n");
        
        nave.recargarCombustible(100);
        nave.recargarCombustible(100);
        nave.mostrarEstado();
        System.out.println("\n");
        
        nave.despegar();
        nave.mostrarEstado();
        System.out.println("\n");
        
        nave.avanzar(40);
        nave.mostrarEstado();
    }
    
}
