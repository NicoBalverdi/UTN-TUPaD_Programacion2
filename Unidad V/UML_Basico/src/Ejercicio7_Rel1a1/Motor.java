package Ejercicio7_Rel1a1;

public class Motor {
    
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        if(tipo != null && numeroSerie != null){
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
    
    
}
