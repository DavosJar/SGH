package PersonalMedico;

import paciente.Paciente;

import java.util.ArrayList;

public class Enfermero extends PersonalMedico.Personal implements laboresPrimarias{
    private String planta;
    private String area;

    private ArrayList<Paciente> pacientesAsignados = new ArrayList<Paciente>();
    private ArrayList <Doctor> doctoresAsignados = new ArrayList<Doctor>();

    public Enfermero(String dni, String fechaIngreso, EstadoActual estadoActual, String planta, String area) {
        super(dni, fechaIngreso, estadoActual);
        this.planta = planta;
        this.area = area;
    }
    public Enfermero() {
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(ArrayList<Paciente> pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }

    public ArrayList<Doctor> getDoctoresAsignados() {
        return doctoresAsignados;
    }

    public void setDoctoresAsignados(ArrayList<Doctor> doctoresAsignados) {
        this.doctoresAsignados = doctoresAsignados;
    }

    @Override
    public void registrarObservacion() {
        System.out.println("Observación registrada");
    }
    public void informarEstadoPaciente(){
        System.out.println("Estado del paciente informado");
    }
    public void asistirUrgencias(){
        System.out.println("Urgencia asistida");
    }

    @Override
    public String toString() {
        return "Enfermero [dni=" + getDni() + ", fechaIngreso=" + getFechaIngreso() + ", estadoActual=" + getEstadoActual() + ", planta=" + planta + ", area=" + area + "]";
    }
}
