package Ejercicio12;
// Modificación de un array de precios y visualización de resultados.

import java.util.Scanner;

public class MainEjercicio12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicializamos un array con valores de tipo double
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Declaramos las variables
        double nuevoValor;
        int indice;
        
        // Mostramos los precios originales
        System.out.println("Precios Originales");
        imprimirVector(precios);
        
        // Solicitamos al usuario un nuevo valor y que indique donde colocarlo
        System.out.print("Ingrese un nuevo valor que reemplazará alguno de los anteriormente mostrados: ");
        nuevoValor = Double.parseDouble(input.nextLine());
        System.out.print("Indique la posición donde colocará ese valor: ");
        indice = Integer.parseInt(input.nextLine());
        
        // Modificamos el array
        modificarVector(precios, nuevoValor, indice);
        
        // Reimprimimos el array
        System.out.println("Precios Modificados");
        imprimirVector(precios);
    }
    /**
     * Recorre un vector de precios imprimiendo el valor de los indices uno debajo del otro
     * @param precios recibe un array
     */
    private static void imprimirVector(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("$" + vector[i]);
        }
    }
    /**
     * Recibe un vector con precios y modifica uno de sus valores
     * @param precios valor de tipo array, vector a modificar.
     * @param nuevoValor valor de tipo double, nuevo elemento que reemplazará un valor del array
     * @param indice valor de tipo entero, indica la posición donde se reemplazará el valor.
     */
    private static void modificarVector(double[] vector, double nuevoValor, int indice){
        if(indice > 0 && indice < vector.length)
            vector[indice] = nuevoValor;
        else
            System.out.println("Error, indice fuera de rango");
    }
    
}
