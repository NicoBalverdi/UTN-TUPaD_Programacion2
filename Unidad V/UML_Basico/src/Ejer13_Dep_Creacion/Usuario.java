package Ejer13_Dep_Creacion;

public class Usuario {
    
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        if(nombre != null && email != null){
            this.nombre = nombre;
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
}
