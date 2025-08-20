package Ejercicio8;
// Cálculo del Precio Final con impuesto y descuento

// Importamos el Scanner
import java.util.Scanner;

public class MainEjercicio8 {
    
    public static void main(String[] args) {
        // Creamos el Scanner para obtener los datos
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables
        double precioBase;
        double impuesto;
        double descuento;
        double precioFinal;
        
        System.out.println("CALCULAR PRECIO FINAL CON IMPUESTO Y DESCUENTO");
        
        // Solicitamos los valores al usuario
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el procentaje de impuesto (sin el símbolo %): ");
        impuesto = Double.parseDouble(input.nextLine()) / 100;
        System.out.print("Ingrese el procentaje de descuento (sin el símbolo %): ");
        descuento = Double.parseDouble(input.nextLine()) / 100;
        
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El costo final del producto es: " + precioFinal);
    }
    
    /**
     * Obtiene el precio final de un producto calculando el costo de impuestos y
     * realizando descuentos. Tanto el impuesto como el descuento deben ser divididos
     * por 100 previamente para que el método retorne un valor correcto.
     * @param precioBase valor tipo double, costo del producto
     * @param impuesto valor tipo double, porcentaje de impuesto
     * @param descuento valor tipo double, porcentaje de descuento
     * @return un valor de tipo double
     */
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}
