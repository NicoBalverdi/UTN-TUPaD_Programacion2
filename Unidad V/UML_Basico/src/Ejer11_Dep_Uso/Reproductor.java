package Ejer11_Dep_Uso;

public class Reproductor {
    
    public void reporducir(Cancion pista){
        if(pista != null)
            System.out.println("Reproduciendo: " + pista);
        else
            System.out.println("Error, formato invalido.");
    }

    @Override
    public String toString() {
        return "Reproductor sin atributos";
    }
    
    
}
