package Ejercicio11;
// Cálculo de descuento especial usando variable global

// Traemos el scanner
import java.util.Scanner;

public class MainEjercicio11 {
    
    // Variable global
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("El precio final con descuento es: " + calcularDescuentoEspecial(precio));
    }
    
    /**
     * Obtiene el precio final de un producto aplicando el descuento correspondiente e informa
     * al cliente de cuanto se ha ahorrado.
     * @param precio valor tipo double, indica el costo original del producto.
     * @return valor tipo double resultante de aplicar el descuento al precio original.
     */
    private static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;
    }
}
