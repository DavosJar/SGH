package PersonalMedico;

public class Personal extends persona.Persona{
    private String dni;
    private String fechaIngreso;
    private String estadoActual;


    public Personal(String dni, String fechaIngreso, String especialidad) {
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.estadoActual = estadoActual;
    }

    public Personal() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    @Override
    public String toString() {
        return "PersonalMedico.Personal [dni=" + dni + ", fechaIngreso=" + fechaIngreso + ", estadoActual=" + estadoActual + "]";
    }
}
