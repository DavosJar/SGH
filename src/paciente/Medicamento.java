package paciente;

import java.util.Date;

public class Medicamento {
    private String nombre;
    private String cantidad;
    private String frecuencia;
    private Date fechaPrescripcion;
    private String observaciones;

    private Obsevaciones estado;

    private Historial historial;

    public Medicamento(String nombre, String dosis, String frecuencia, Date fechaPrescripcion, String observaciones) {
        this.nombre = nombre;
        this.cantidad = getCantidad();
        this.frecuencia = frecuencia;
        this.fechaPrescripcion = fechaPrescripcion;
        this.observaciones = observaciones;
    }

    public Medicamento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Date getFechaPrescripcion() {
        return fechaPrescripcion;
    }

    public void setFechaPrescripcion(Date fechaPrescripcion) {
        this.fechaPrescripcion = fechaPrescripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                ", dosis='" + cantidad + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", fecha prescriccion='" + fechaPrescripcion + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
