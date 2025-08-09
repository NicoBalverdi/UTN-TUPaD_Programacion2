
package tp1_ejercicio4;

// Importamos el paquete del objeto Scanner
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Creamos el objeto que capturará los inputs del usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables
        String nombre;
        int edad;

        // Solicitar y capturar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        // Imprimimos los valores capturados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
    }

}
