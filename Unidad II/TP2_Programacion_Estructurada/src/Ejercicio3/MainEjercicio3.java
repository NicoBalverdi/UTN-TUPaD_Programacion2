package Ejercicio3;
// Clasificación de edad

// Importamos scanner
import java.util.Scanner;

public class MainEjercicio3 {
    
    public static void main(String[] args) {
        // Creamos el scanner para recibir los inputs del usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos las variable que almacenará la edad
        int edad;
        
        // Solicitamos la edad al usuario
        System.out.println("CLASIFICACIÓN SEGÚN SU EDAD");
        System.out.print("Por favor, ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su clasificación es: " + clasificarEdad(edad));
    }
    
    /**
     * Clasifica a qué grupo corresponde la edad ingresada por el usuario.
     * Menores de 12 años se clasifican como niños, de 12 a 17 son adolescentes,
     * entre 18 y 59 son adultos y, por último, adulto mayor desde 60 en adelante
     * @param edad Un entero que indica la edad
     * @return Una cadena indicando la clasificación correspondiente
     */
    private static String clasificarEdad(int edad) {
        if(edad >= 0 && edad < 12)
            return "Niño";
        else if(edad >= 12 && edad <= 17)
            return "Adolescente";
        else if (edad >= 18 && edad <= 59)
            return "Adulto";
        else if (edad >= 60)
            return "Adulto Mayor";
        return "No se permiten edades inferiores a 0";
    }
}
