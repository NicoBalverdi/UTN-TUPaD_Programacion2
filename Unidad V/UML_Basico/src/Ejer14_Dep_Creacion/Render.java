package Ejer14_Dep_Creacion;

public class Render {
    
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        if(formato != null)
            this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        if(proyecto != null)
            this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    
}
