package Ejercicio2_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        if(nombre != null && dni != null){
            this.nombre = nombre;
            this.dni = dni;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this)
            celular.setUsuario(this);
    }
    
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("nombre", nombre)
                .append("DNI", dni)
                .append("marca celular", celular != null ? celular.getMarca() : null)
                .append("modelo celular", celular != null ? celular.getModelo() : null)
                .append("bateria celular", celular != null ? celular.getBateria() : null)
                .toString();
    }
}
