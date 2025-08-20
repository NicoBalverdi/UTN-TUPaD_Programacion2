package Ejercicio5;
// Suma de números pares (while)

// Importamos el scanner
import java.util.Scanner;

public class MainEjercicio5 {
    
    public static void main(String[] args) {
        // Creamos el scanner que obtendrá los números del usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variables del programa
        int num;
        int suma = 0;
        boolean centinela = true;
        
        // Solicitamos al usuario que ingrese números o el 0 para finalizar.
        System.out.println("SUMA DE NÚMEROS PARES");
        while(centinela) {
            System.out.print("Ingrese un número (0 para finalizar la ejecución): ");
            num = Integer.parseInt(input.nextLine());
            if(num != 0){
                if(esPar(num))
                    suma += num;
            } else {
                centinela = false;
            }
        }
        
        System.out.println("Los números pares ingresados dan como resultado: " + suma);
    }
    /**
     * Indica si un número es par o impar a partir del resto de su división por 2.
     * @param num valor entero a comprobar.
     * @return valor booleano true si el resto es 0, caso contrario da false.
     */
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
