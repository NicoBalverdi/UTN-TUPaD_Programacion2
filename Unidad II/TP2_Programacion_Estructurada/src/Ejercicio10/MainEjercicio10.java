package Ejercicio10;
// Actualización de stock a partir de venta y recepción de productos

// Importamos Scanner
import java.util.Scanner;

public class MainEjercicio10 {
    
    public static void main(String[] args) {
        // Creamos el scanner
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int stockActual;
        int cantidadRecibida;
        int cantidadVendida;
        
        // Solicitamos los datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        // Actualizamos y mostramos el stock actual
        stockActual = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + stockActual);
    }
    /**
     * Actualiza el stock a partir de las existencias, las ventas y reposición de un producto.
     * @param stockActual valor tipo entero, indica las existencias
     * @param cantidadVendida valor tipo entero, indica cuantos productos se han vendido
     * @param cantidadRecibida valor tipo entero, indica la cuantos productos del mismo tipo han llegado
     * @return un valor entero resultante de la suma de existencias y reposiciones del producto
     * menos la cantidad vendida.
     */
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return cantidadRecibida + stockActual - cantidadVendida;
    }
}
