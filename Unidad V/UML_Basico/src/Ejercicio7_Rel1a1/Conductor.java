package Ejercicio7_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Conductor {
    
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        if(nombre != null && licencia != null){
            this.nombre = nombre;
            this.licencia = licencia;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo != null && vehiculo.getConductor() != this)
            vehiculo.setConductor(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("Nombre", nombre)
                .append("Licencia", licencia)
                .append("Modelo Vehiculo", vehiculo != null ? vehiculo.getModelo() : null)
                .append("Patente Vehiculo", vehiculo != null ? vehiculo.getPatente() : null)
                .toString();
    }
}
