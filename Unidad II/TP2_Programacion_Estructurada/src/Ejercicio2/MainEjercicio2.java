package Ejercicio2;
// Determinar el mayor de 3 números enteros

// Importamos el Scanner
import java.util.Scanner;

public class MainEjercicio2 {
    
    public static void main(String[] args) {
        
        // Creamos el scanner para recibir los imputs del usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos un vector que almacenará los inputs
        int[] numeros = new int[3];
        
        // Solicitamos los números al usuario
        System.out.println(" ENCONTRAR EL MAYOR ");
        System.out.println("Le solicitamos 3 números enteros");
        for (int i = 1; i < numeros.length + 1; i++) {
            System.out.print("Número " + i +":");
            numeros[i-1] = Integer.parseInt(input.nextLine());
        }
        
        // Le mostramos al usuario el mayor de los valores ingresados
        System.out.print("El mayor de los números ingresados es: ");
        System.out.println(mayorNumDelVector(numeros));
        
    }
    
    /**
     * Recibe un vector de enteros y evalua sus elementos desde el indice 0
     * para encontrar el valor máximo dentro de este.
     * @param nums vector de enteros
     * @return el mayor de los valores enteros del vector
     */
    private static int mayorNumDelVector(int[] nums) {
        int mayor = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(mayor < nums[i])
                mayor = nums[i];
        }
        return mayor;
    }
}
