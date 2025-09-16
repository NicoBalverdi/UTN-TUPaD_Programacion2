package Ejercicio10_Rel1a1;

public class ClaveSeguridad {
    
    private String codigo;
    private int ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        if(codigo != null){
            this.codigo = codigo;
            ultimaModificacion = 0;
        }
    }
    
    public void agregarDias(int dias){
        if(dias > 0)
            ultimaModificacion += dias;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion= hace " + ultimaModificacion + "dias" + '}';
    }
    
    
}
