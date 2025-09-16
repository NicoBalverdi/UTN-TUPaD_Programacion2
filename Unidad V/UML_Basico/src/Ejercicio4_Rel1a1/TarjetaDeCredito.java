package Ejercicio4_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        if(numero != null && fechaVencimiento != null && banco != null){
            this.numero = numero;
            this.fechaVencimiento = fechaVencimiento;
            this.banco = banco;
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this)
            cliente.setTarjeta(this);
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("numero", numero)
                .append("fechaVencimiento", fechaVencimiento)
                .append("banco", banco)
                .append("nombre cliente", cliente != null ? cliente.getNombre() : null)
                .append("DNI cliente", cliente != null ? cliente.getDni() : null)
                .toString();
    }
    
}
