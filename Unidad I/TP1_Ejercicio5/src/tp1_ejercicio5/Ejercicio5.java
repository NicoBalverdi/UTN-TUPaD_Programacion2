
package tp1_ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        // Creamos nuestro input
        Scanner input = new Scanner(System.in);
        
        // Declaramos variables
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        //Solicitamos y capturamos los datos
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        // Realizamos las operaciones con ambos números
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double)num1 / num2;
        
        // Imprimimos los resultados
        System.out.println("La suma entre " + num1 + " y " + num2 + " es igual a: " + suma);
        System.out.println("La resta entre " + num1 + " y " + num2 + " es igual a: " + resta);
        System.out.println("La multiplicacion entre " + num1 + " y " + num2 + " da: " + multiplicacion);
        System.out.println("La division entre " + num1 + " y " + num2 + " da: " + division);
        
    }

}
