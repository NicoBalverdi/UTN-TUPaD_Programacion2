package Ejer12_Dep_Uso;

public class Impuesto {
    
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        if (monto > 0.00)
            this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setContibuyente(Contribuyente contribuyente) {
        if(contribuyente != null)
            this.contribuyente = contribuyente;
        else
            System.out.println("Datos incorrectos");
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
    
    
}
