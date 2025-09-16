package Ejercicio9_Rel1a1;

public class Paciente {
    
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        if(nombre != null && obraSocial != null){
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
    
    
}
