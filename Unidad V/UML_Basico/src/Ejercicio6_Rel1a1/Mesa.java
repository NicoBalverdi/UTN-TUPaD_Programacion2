package Ejercicio6_Rel1a1;

public class Mesa {
    
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        if((numero >= 1 && numero <= 25) && (capacidad >= 1 && capacidad <= 6)){
            this.numero = numero;
            this.capacidad = capacidad;
        }
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
}
