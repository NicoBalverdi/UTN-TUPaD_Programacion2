package Ejercicio9_Rel1a1;

public class CitaMedica {
    
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        if(fecha != null && hora != null){
            this.fecha = fecha;
            this.hora = hora;
        }
    }

    public void setPaciente(Paciente paciente) {
        if(paciente != null)
            this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        if(profesional != null)
            this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }
    
    
}
