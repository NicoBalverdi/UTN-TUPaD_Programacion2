package Ejercicio6;
// Contador de Positivos, Negativos y Ceros (for)

// Importamos el scanner
import java.util.Scanner;

public class MainEjercicio6 {
    
    public static void main(String[] args) {
        // Creamos el scanner para capturar los 10 valores
        Scanner input = new Scanner(System.in);
        
        // Declaramos cada contador
        int num;
        int cont_positivos = 0;
        int cont_negativos= 0;
        int cont_cero = 0;
        
        System.out.println("CONTADOR DE POSITIVOS, NEGATIVOS Y CEROS ENTRE 10 NÚMEROS");
        
        /* Creamos un ciclo for que iterará 10 veces e incrementará el valor
           de cada contador según corresponda.
        */
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el " + i + " de 10 números: ");
            num = Integer.parseInt(input.nextLine());
            
            if(num == 0)
                cont_cero++;
            else if(num > 0)
                cont_positivos++;
            else
                cont_negativos++;
        }
        
        // Devolvemos el valor de los contadores
        System.out.println("Cantidad de positivos: " + cont_positivos);
        System.out.println("Cantidad de ceros: " + cont_cero);
        System.out.println("Cantidad de negativos: " + cont_negativos);
    }
}
