package Ejercicio2;

public class Mascota {
    private String nombre = "Timon";
    private String especie = "Cannis lupus";
    private int Edad = 4;
    
    void mostrarInfo() {
        System.out.println("Información de la mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + Edad);
    }
    
    void cumplirAnios() {
        Edad += 1;
    }
}
