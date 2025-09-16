package Ejercicio4_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
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
    
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if(tarjeta != null && tarjeta.getCliente() != this)
            tarjeta.setCliente(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("nombre", nombre)
                .append("DNI", dni)
                .append("numero tarjeta", tarjeta != null ? tarjeta.getNumero() : null)
                .append("fecha vencimiento", tarjeta != null ? tarjeta.getFechaVencimiento() : null)
                .append("banco", tarjeta != null ? tarjeta.getBanco() : null)
                .toString();
    }
}
