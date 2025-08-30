package Ejercicio5;

public class NaveEspacial {
    private String nombre;
    private int distancia;
    private int velocidad;
    private int combustible;
    private String estado = "En tierra";

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void recargarCombustible(int combustible) {
        if(combustible > 0 && combustible <= 100 && this.combustible < 300)
            this.combustible += combustible;
    }

    public void setEstado(String estado) {
        if(estado.equalsIgnoreCase("En tierra") || estado.equalsIgnoreCase("En orbita"))
        this.estado = estado;
    }
    
    public void avanzar(int kilometros) {
        if(kilometros > 0 && combustible >= 50) {
            distancia += kilometros;
            velocidad += 1500;
            combustible -= 50;
        } else {
            System.out.println("Combustible insuficiente!");
        }
            
    }

    public void despegar() {
        if(combustible >= 100){
            System.out.println("Lanzamiento exitoso!");
            distancia = 100;
            velocidad = 9500;
            combustible -= 100;
            setEstado("En orbita");
        } else {
            System.out.println("Lanzamiento abortado, combustible insuficiente!");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Estado de la nave espacial " + nombre);
        System.out.println("Distancia: " + distancia + " km sobre el nivel del mar");
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Combustible: " + combustible + " unidades");
        System.out.println("Estado: " + estado);
    }
}
