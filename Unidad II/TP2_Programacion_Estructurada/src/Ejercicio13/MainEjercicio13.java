package Ejercicio13;
// Impresión recursiva de arrays antes y después de modificar un elemento

import java.util.Scanner;

public class MainEjercicio13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inicializamos el vector precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        double nuevoValor;
        int indice;
        
        // Le mostramos al usuario los precios originales
        System.out.println("Precios Originales");
        imprimirVectorRecur(precios, 0);
        
        // Reutilizamos código del ejercicio anterior.
        System.out.print("Ingrese un nuevo valor que reemplazará alguno de los anteriormente mostrados: ");
        nuevoValor = Double.parseDouble(input.nextLine());
        System.out.print("Indique la posición donde colocará ese valor: ");
        indice = Integer.parseInt(input.nextLine());
        
        modificarVector(precios, nuevoValor, indice);
        
        System.out.print("Indique desde dónde desea recorrer el vector (min = 0, max = 4)");
        indice = Integer.parseInt(input.nextLine());
        
        imprimirVectorRecur(precios, indice);
    }
    
    private static void imprimirVectorRecur(double[] vector, int indice){
        if(indice < vector.length){
            System.out.println("Precio $" + vector[indice]);
            imprimirVectorRecur(vector, indice + 1);
        }
    }
    
    private static void modificarVector(double[] vector, double nuevoValor, int indice){
        if(indice > 0 && indice < vector.length)
            vector[indice] = nuevoValor;
        else
            System.out.println("Error, indice fuera de rango");
    }
    
}
