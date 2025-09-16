package Ejercicio2_Rel1a1;

public class Bateria {
    
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        if(modelo != null && capacidad > 0){
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    }
    
    
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
}
