package Ejercicio9;
// Composición de funciones para calcular costo de envío y total de compra

// Importamos el scanner
import java.util.Scanner;

public class MainEjercicio9 {
    
    // Declaramos las variables continuas
    private static final int VALOR_KG_NAC = 5;
    private static final int VALOR_KG_INT = 10;
    
    public static void main(String[] args) {
        // Creamos el Scanner para solicitar los datos al usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables
        double precioProducto;
        double pesoPaquete;
        String zonaEnvio;
        double costoEnvio;
        double costoTotal;
        
        // Solicitamos los datos
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete (Kg): ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zonaEnvio = input.nextLine();
        while (!zonaEnvio.equalsIgnoreCase("Nacional") && !zonaEnvio.equalsIgnoreCase("Internacional")) {
            System.out.print("Error, por favor ingrese Nacional o Internacional: ");
            zonaEnvio = input.nextLine();
        }
        
        // Le detallamos los costos al usuario
        costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);
        System.out.println("El costo de envío es: " + costoEnvio);
        
        costoTotal = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo total de su compra es: " + costoTotal);
        
    }
    
    /**
     * Calcula el costo de envio de un paquete aplicando las tarifas por Kg
     * que correspondand según el destino.
     * @param peso valor de tipo double, indica el peso en Kg del producto
     * @param zona valor de tipo String, indica la tarifa que aplica
     * @return un valor de tipo double obtenido de la multiplicación
     * tarifa * Kg
     */
    private static double calcularCostoEnvio(double peso, String zona){
        if(zona.equalsIgnoreCase("Nacional"))
            return VALOR_KG_NAC * peso;
        else
            return VALOR_KG_INT * peso;
    }
    
    /**
     * Calcula el costo total de una compra
     * @param precioProducto valor de tipo double, indica el precio del prodcuto
     * @param costoEnvio valor de tipo double, indica el costo del envio
     * @return valor de tipo double resultante de la suma de ambos parámetros.
     */
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
