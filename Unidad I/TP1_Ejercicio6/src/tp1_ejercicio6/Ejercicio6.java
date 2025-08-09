
package tp1_ejercicio6;

public class Ejercicio6 {

    /*Escribe un programa que muestre el siguiente mensaje en consola:  
    Nombre: Juan Pérez  
    Edad: 30 años  
    Dirección: "Calle Falsa 123"  
    Usa caracteres de escape (\n, \") en System.out.println().*/
    
    public static void main(String[] args) {
        
        // Declaramos la variable
        String mensaje;
        
        // Escribimos el mensaje utilizando los caracteres de escape
        mensaje = "Nombre: Juan Pérez\nEdad: 30 años\nDirrecion: \"Calle Falsa 123\"";
        
        // Lo mostramos
        System.out.println(mensaje);
        
    }

}
