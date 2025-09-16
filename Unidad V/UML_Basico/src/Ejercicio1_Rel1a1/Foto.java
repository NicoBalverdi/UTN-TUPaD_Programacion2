package Ejercicio1_Rel1a1;

public class Foto {
    
    private String imagen;
    private static final String FORMATO = "4x4";

    public Foto(String imagen) {
        if(imagen != null)
            this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Foto{ " + "imagen=" + imagen + "," + " formato=" + FORMATO + '}';
    }
    
}
