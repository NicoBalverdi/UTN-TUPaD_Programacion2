package Ejercicio8_Rel1a1;

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String codigo, String fecha, Usuario usuario) {
        if(titulo != null && contenido != null && codigo != null && fecha != null && usuario != null){
            this.titulo = titulo;
            this.contenido = contenido;
            firma = new FirmaDigital(codigo, fecha, usuario);
        }
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }
    
    
}
