package Clase_Empleado;

public class Prueba_Empleado {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan Rodriguez", "Encargado", 754999.99);
        Empleado empleado2 = new Empleado(2, "Ana Martinez", "Contadora", 1200000);
        Empleado empleado3 = new Empleado("Roberto Jimenez", "Operario");
        Empleado empleado4 = new Empleado("Alan Torres", "Mantenimiento");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        System.out.println("");
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
        empleado1.actualizarSalario(7.5);
        empleado4.actualizarSalario(130000);
        System.out.println("");
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
    }
    
}
