package Ejercicio6_Rel1a1;

public class Reserva {
    
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(String fecha, String hora, Mesa mesa) {
        if(fecha != null && hora != null && mesa != null){
            this.fecha = fecha;
            this.hora = hora;
            this.mesa = mesa;
        }
    }

    public void setCliente(Cliente cliente) {
        if(cliente != null)
            this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", cliente=" + cliente + '}';
    }
    
    
}
