package Ejercicio1_Rel1a1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String foto) {
        if(numero != null && fechaEmision != null && foto != null){
            this.numero = numero;
            this.fechaEmision = fechaEmision;
            this.foto = new Foto(foto);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
    
    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("numero", numero)
                .append("fechaEmision", fechaEmision)
                .append("foto", foto)
                // mostramos parte del objeto
                .append("nombre del titular", titular != null ? titular.getNombre() : null)
                .append("DNI del titular", titular != null ? titular.getDni() : null)
                .toString();
    }
}
