package PersonalMedico;

import paciente.Paciente;

import java.util.ArrayList;

public class Doctor extends PersonalMedico.Personal implements laboresPrimarias{
    private Especialidad especialidad;
    private Enfermero enfermeroAsignado;
    private ArrayList<Paciente> pacientesAsignados = new ArrayList<Paciente>();


    public Doctor(String dni, String fechaIngreso, EstadoActual estadoActual, Especialidad especialidad) {
        super(dni, fechaIngreso, estadoActual);
        this.especialidad = especialidad;
    }
    public Doctor() {
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Enfermero getEnfermeroAsignado() {
        return enfermeroAsignado;
    }

    public void setEnfermeroAsignado(Enfermero enfermeroAsignado) {
        this.enfermeroAsignado = enfermeroAsignado;
    }

    public ArrayList<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void setPacientesAsignados(ArrayList<Paciente> pacientesAsignados) {
        this.pacientesAsignados = pacientesAsignados;
    }

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
        return "Doctor [dni=" + getDni() + ", fechaIngreso=" + getFechaIngreso() + ", estadoActual=" + getEstadoActual() + ", especialidad=" + especialidad + "]";
    }
}
