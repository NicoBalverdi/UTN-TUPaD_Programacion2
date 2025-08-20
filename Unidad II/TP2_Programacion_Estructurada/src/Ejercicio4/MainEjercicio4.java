package Ejercicio4;
// Calculadora de descuento según categoria

// Importamos el util Scanner
import java.util.Scanner;

public class MainEjercicio4 {
    
    // Declaramos los descuentos como constantes
    private static final double DESCUENTO_A = 0.10;
    private static final double DESCUENTO_B = 0.15;
    private static final double DESCUENTO_C = 0.20;
    
    public static void main(String[] args) {
        // Creamos el scanner que recibe el input del 
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables del programa
        double precio;
        String cat;
        double descuento;
        double precioFinal;
        
        System.out.println("CALCULADORA DE DESCUENTOS");
        
        // Solicitamos precio
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        // Solicitamos categoria y nos aseguramos que sea valida
        System.out.print("Ingrese la categoría del mismo (A, B o C): ");
        cat = input.nextLine();
        while (!cat.equalsIgnoreCase("A") && !cat.equalsIgnoreCase("B") && !cat.equalsIgnoreCase("C")) {
            System.out.print("Categoría inválida. Ingrese A, B o C: ");
            cat = input.nextLine();
        }
        
        // Le mostramos al usuario el precio original, el descuento recibido y el precio final
        switch (cat.toUpperCase()) {
            case "A":
                descuento = DESCUENTO_A * 100;
                precioFinal = aplicarDescuentoSegunCategoria(precio, cat);
                detallarDescuento(precio, descuento, precioFinal);
                break;
            case "B":
                descuento = DESCUENTO_B * 100;
                precioFinal = aplicarDescuentoSegunCategoria(precio, cat);
                detallarDescuento(precio, descuento, precioFinal);
                break;
            default:
                descuento = DESCUENTO_C * 100;
                precioFinal = aplicarDescuentoSegunCategoria(precio, cat);
                detallarDescuento(precio, descuento, precioFinal);
        }
        
    }
    
    /**
     * A partir de un precio y una categoría asociada a un descuento,
     * obtiene el valor del producto aplicando el descuento correspondiente.
     * @param precio valor de tipo double que indica el costo del producto
     * @param cat cadena que indica la categoria, la cual se asocia a un descuento
     * @return retorna un double resultante de aplicar este último sobre el precio.
     */
    private static double aplicarDescuentoSegunCategoria(double precio, String cat) {
        if(cat.equalsIgnoreCase("A"))
            return precio - precio * DESCUENTO_A;
        else if(cat.equalsIgnoreCase("B"))
            return precio - precio * DESCUENTO_B;
        else
            return precio - precio * DESCUENTO_C;
    }
    /**
     * Detalla en pantalla precio, descuento aplicado y precio final de un prodcuto.
     * @param precio valor double que indica el costo de un producto
     * @param descuento valor double indicando el descuento
     * @param precioFinal valor double indicando el valor del producto menos el descuento.
     */
    private static void detallarDescuento(double precio, double descuento, double precioFinal){
        System.out.println("El valor de su producto: " + precio);
        System.out.println("El descuento aplicado: " + descuento + "%");
        System.out.println("Precio Final: " + precioFinal);
    }
}
