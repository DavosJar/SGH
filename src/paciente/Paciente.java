package paciente;
import persona.Persona;

import java.util.ArrayList;

public class Paciente extends Persona {
    private String dni;
    private String fechaIngreso;
    private String ocupacion;
    private String observaciones;

    private Historial historial;
    private ArrayList<Cita> citaList;

    public Paciente(String dni, String fechaIngreso, String ocupacion, String observaciones) {
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.ocupacion = ocupacion;
        this.observaciones = observaciones;
    }

    public Paciente() {
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public ArrayList<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(ArrayList<Cita> citaList) {
        this.citaList = citaList;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void solicitarCita(String doctro){
        //TODO
    }
    public void cancelarCita(String cita){
        //TODO
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "dni='" + dni + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}

