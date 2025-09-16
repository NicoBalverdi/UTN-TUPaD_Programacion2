package Ejercicio10_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CuentaBancaria {
    
    private String cbu;
    private Double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, Double saldo, String clave) {
        if(cbu != null && saldo >= 0.00 && clave != null){
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(clave);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuenta() != this)
            titular.setCuenta(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("CBU", cbu)
                .append("Saldo", saldo)
                .append("Clave", clave)
                .append("Nombre Titular", titular != null ? titular.getNombre() : null)
                .append("DNI Titualr", titular != null ? titular.getDni() : null)
                .toString();
    }
}
