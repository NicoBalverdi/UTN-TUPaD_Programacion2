package Ejercicio7_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        if(patente != null && modelo != null && motor != null){
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this)
            conductor.setVehiculo(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("Patente", patente)
                .append("Modelo", modelo)
                .append("Motor", motor)
                .append("Conductor", conductor != null ? conductor.getNombre() : null)
                .append("Licencia", conductor != null ? conductor.getLicencia() : null)
                .toString();
    }
}
