package Ejer14_Dep_Creacion;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        if(formato != null && proyecto != null){
            Render r = new Render(formato);
            r.setProyecto(proyecto);
            System.out.println(r);
        }
    }

    @Override
    public String toString() {
        return "EditorVideo sin atributos";
    }
    
}
