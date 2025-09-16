package Ejercicio10_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Titular {
    
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

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

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if(cuenta != null && cuenta.getTitular() != this)
            cuenta.setTitular(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("Nombre", nombre)
                .append("DNI", dni)
                .append("CBU Cuenta", cuenta != null ? cuenta.getCbu() : null)
                .append("Saldo Cuenta", cuenta != null ? cuenta.getSaldo() : null)
                .toString();
    }
}
