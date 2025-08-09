
package tp1_ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    
    /** Manejar conversiones de tipo y división en Java.  
    a. Escribe un programa que divida dos números enteros ingresados por el 
    usuario.  
    b. Modifica el código para usar double en lugar de int y compara los 
    resultados.
     * @param args
    */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int resultado1;
        double resultado2;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        // Realizamos las operaciones
        resultado1 = num1 / num2;
        
        // Ahora realizamos una conversión del tipo de dato
        resultado2 = (double)num1 / num2;
        
        System.out.println("El resultado de la división entera es: " + resultado1);
        System.out.println("El resultado de la división con decimales es: " + resultado2);
    }

}
