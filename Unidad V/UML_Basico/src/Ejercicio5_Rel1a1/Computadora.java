package Ejercicio5_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Computadora {
    
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String placa, String chipset) {
        if(marca != null && numeroSerie != null && placa != null && chipset != null){
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            placaMadre = new PlacaMadre(placa, chipset);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this)
            propietario.setComputadora(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("Marca", marca)
                .append("Numero Serie", numeroSerie)
                .append("Placa Madre", placaMadre)
                .append("Propietario", propietario != null ? propietario.getNombre() : null)
                .append("DNI Propietario", propietario != null ? propietario.getDni() : null)
                .toString();
    }
}
