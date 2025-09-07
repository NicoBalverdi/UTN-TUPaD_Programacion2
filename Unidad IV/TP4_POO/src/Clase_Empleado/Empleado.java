package Clase_Empleado;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    private static int contadorId = 100;
    
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        if(nombre == null) {
            System.out.println("Debe introducir el nombre del empleado");
        } else {
            this.nombre = nombre;
        }
    }

    public void setPuesto(String puesto) {
        if(puesto == null) {
            System.out.println("No ha introducido un puesto para el empleado");
        } else {
            this.puesto = puesto;
        }
    }

    public void setSalario(double salario) {
        if(salario <= 0) {
            System.out.println("No ha introducido un salario válido para el empleado");
        } else {
            this.salario = salario;
        }
    }
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        this(contadorId, nombre, puesto, 400000.00);
        contadorId++;
    }
    
    public void actualizarSalario(double porcentaje) {
        setSalario(this.salario += this.salario * (porcentaje / 100));
    }
    
    public void actualizarSalario(int aumento) {
        setSalario(this.salario += aumento);
    }
    
    @Override
    public String toString() {
        return "Empleado [ID = " + id + ", Nombre = " + nombre + ", Puesto = " + puesto + ", Salario = $" + salario + "]";
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
