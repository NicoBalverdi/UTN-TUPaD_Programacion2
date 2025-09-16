package Ejer12_Dep_Uso;

public class Calculadora {
    
    public double calcular(Impuesto imp){
        if(imp != null)
            return imp.getMonto() * 0.21;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Calculadora sin atributos";
    }
    
    
}
