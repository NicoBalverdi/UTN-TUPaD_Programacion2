package Ejercicio1;
// Verficiación de año bisiesto

// Importamos el Scanner
import java.util.Scanner;

public class MainEjercicio1 {
    
    public static void main(String[] args) {
        
        // Creamos el scanner para recibir los imputs del usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos la variable que almacenará el año
        int anio;
        
        // Solicitamos el año al usuario
        System.out.println(" REVISAR AÑO BISIESTO ");
        System.out.print("Por favor, ingrese el año: ");
        anio = Integer.parseInt(input.nextLine());
        
        // Revisamos el año ingresado
        if(esBisisesto(anio))
            System.out.println("El año " + anio + " es bisiesto!");
        else
            System.out.println("El año " + anio + " no es bisiesto");
    }
    
    /**
     ** Determina si un año es bisiesto.
     * Un año es bisiesto si es divisible por 4 y no por 100, salvo que sea divisible por 400.
     * @param anio año a evaluar
     * @return true si es bisiesto y false en caso contrario.
     */
    private static boolean esBisisesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    
}
