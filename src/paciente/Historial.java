package paciente;

import java.util.ArrayList;

public class Historial {
    private String nummeroExpediente;

    private Paciente paciente;

    private ArrayList<Diagnostico> diagnosticoList;
    private ArrayList<Medicamento> medicamentoList;
    private ArrayList<Cita> citaList;

    public Historial(String nummeroExpediente, Paciente paciente) {
        this.nummeroExpediente = nummeroExpediente;
        this.paciente = paciente;
    }

    public Historial() {
    }

    public ArrayList<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(ArrayList<Cita> citaList) {
        this.citaList = citaList;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Medicamento> getMedicamentoList() {
        return medicamentoList;
    }

    public void setMedicamentoList(ArrayList<Medicamento> medicamentoList) {
        this.medicamentoList = medicamentoList;
    }

    public ArrayList<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(ArrayList<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    public String getNummeroExpediente() {
        return nummeroExpediente;
    }

    public void setNummeroExpediente(String nummeroExpediente) {
        this.nummeroExpediente = nummeroExpediente;
    }

    public void agregarCita(String entrada){
        //TODO
    }

    public void agregarDiagnostico(String diagnostico){
        //TODO
    }

    public void agregarTratamiento(String tratamiento){
        //TODO
    }

    public void agregarReceta(String receta){
        //TODO
    }

    @Override
    public String toString() {
        return "Historial{" +
                "nummeroExpediente='" + nummeroExpediente + '\'' +
                '}';
    }



}
