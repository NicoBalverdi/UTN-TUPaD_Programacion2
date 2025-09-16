package Ejer13_Dep_Creacion;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario){
        if(valor != null && usuario != null){
            CodigoQR qr = new CodigoQR(valor);
            qr.setUsuario(usuario);
            System.out.println(qr);
        }
    }

    @Override
    public String toString() {
        return "GeneradorQR sin atributos";
    }
    
    
}
