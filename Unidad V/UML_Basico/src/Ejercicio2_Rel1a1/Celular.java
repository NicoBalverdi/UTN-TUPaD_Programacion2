package Ejercicio2_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        if(imei != null && marca != null && modelo != null && bateria != null){
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
        }
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this)
            usuario.setCelular(this);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("imei", imei)
                .append("marca", marca)
                .append("modelo", modelo)
                .append("bateria", bateria)
                .append("nombre usuario", usuario != null ? usuario.getNombre() : null)
                .append("dni usuario", usuario != null ? usuario.getDni() : null)
                .toString();
    }
    
    
}
