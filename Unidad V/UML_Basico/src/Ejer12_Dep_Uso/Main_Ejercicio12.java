package Ejer12_Dep_Uso;

public class Main_Ejercicio12 {
    
    public static void main(String[] args) {
        // Instanciamos los objetos
        Contribuyente c = new Contribuyente("Don Pepe", "11-27984999-2");
        Impuesto i = new Impuesto(2000.00);
        Calculadora cal = new Calculadora();
        
        System.out.println("Se muestran los objetos creados");
        System.out.println(c);
        System.out.println(i);
        System.out.println(cal);
        System.out.println("");
        
        // Asociamos el objeto Impuesto con el objeto Contribuyente
        i.setContibuyente(c);
        
        System.out.println("Mostramos las asociaciones");
        System.out.println(c);
        System.out.println(i);
        System.out.println(cal);
        System.out.println("");
        
        // Hacemos que el objeto calculadora utilice el objeto impuesto en su método calcular()
        // dado que el objeto impuesto no se guarda en los parámetros de calculadora
        // es una dependencia de uso
        System.out.println("El IVA es de: " + cal.calcular(i));
        
        // la instancia de impuesto ahora apunta a null
        i = null;
        
        System.out.println("Mostramos los objetos e intentamos calcular un impuesto nulo");
        System.out.println(c);
        System.out.println(i);
        System.out.println(cal);
        System.out.println("El IVA es de: " + cal.calcular(i));
        
    }
    
}
