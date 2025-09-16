package Ejercicio1_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Titular {
    
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
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
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte != null & pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("nombre", nombre)
                .append("dni", dni)
                // mostramos parte del objeto
                .append("numero de pasaporte", pasaporte != null ? pasaporte.getNumero() : null)
                .append("fecha de emision", pasaporte != null ? pasaporte.getFechaEmision() : null)
                .append("Foto", pasaporte != null ? pasaporte.getFoto() : null)
                .toString();
    }
    
}
