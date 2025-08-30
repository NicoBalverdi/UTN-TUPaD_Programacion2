package Ejercicio4;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if(huevosPuestos >= 0)
            this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarEstado() {
        System.out.println("Estado de la gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos producidos: " + huevosPuestos);
    }
    
    public void ponerHuevo() {
        huevosPuestos += 1;
    }
    
    public void envejecer() {
        edad += 1;
    }
}
