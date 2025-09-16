package Ejercicio5_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
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

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null && computadora.getPropietario() != this)
            computadora.setPropietario(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("Nombre", nombre)
                .append("DNI", dni)
                .append("Computadora", computadora != null ? computadora.getMarca() : null)
                .append("Nro Serie de Computadora", computadora != null ? computadora.getNumeroSerie() : null)
                .toString();
    }
}
