package paciente;

import java.util.Date;

public class Cita {
    private Date fechaSolitud;
    private Date fechaProgramada;
    private String motivo;
    private Estado estado;

    private Historial historial;

    public Cita(Date fechaSolitud, Date fechaProgramada, String motivo) {
        this.fechaSolitud = fechaSolitud;
        this.fechaProgramada = fechaProgramada;
        this.motivo = motivo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Date getFechaSolitud() {
        return fechaSolitud;
    }

    public void setFechaSolitud(Date fechaSolitud) {
        this.fechaSolitud = fechaSolitud;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Cita{" + "fechaSolitud=" + fechaSolitud + ", fechaProgramada=" + fechaProgramada + ", motivo=" + motivo + '}';
    }
}
