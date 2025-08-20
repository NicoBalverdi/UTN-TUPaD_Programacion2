package Ejercicio7;
// Validación de nota entre 0 y 10 (do-while)

// Importamos el scanner
import java.util.Scanner;

public class MainEjercicio7 {
    
    public static void main(String[] args) {
        // Creamos el scanner para recibir las notas
        Scanner input = new Scanner(System.in);
        
        // Declaración de variables
        int nota;
        
        System.out.println("VALIDACIÓN DE NOTAS ENTRE 0 Y 10");
        
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
            
            if(nota >= 0 && nota <= 10)
                System.out.println("Nota guardada correctamente!");
            else
                System.out.print("Nota invalida. ");
        } while (nota < 0 || nota > 10);
    }
}
