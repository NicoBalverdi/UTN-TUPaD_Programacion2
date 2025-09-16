package Ejercicio8_Rel1a1;

public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        if(codigoHash != null && fecha != null && usuario != null){
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
}
