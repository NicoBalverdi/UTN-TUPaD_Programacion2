package Ejer13_Dep_Creacion;

public class CodigoQR {
    
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        if(valor != null)
            this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
    
}
