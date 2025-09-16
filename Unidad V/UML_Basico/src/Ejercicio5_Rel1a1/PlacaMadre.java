package Ejercicio5_Rel1a1;

public class PlacaMadre {
    
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        if(modelo != null && chipset != null){
            this.modelo = modelo;
            this.chipset = chipset;
        }
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    
}
