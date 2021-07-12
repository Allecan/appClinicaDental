/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgConsultation;

/**
 *
 * @author Erick
 */
public class Consultation {
    private String fecha;
    private String hora;
    private String observaciones;
    private float Total;
    private int cita_idCita;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public int getCita_idCita() {
        return cita_idCita;
    }

    public void setCita_idCita(int cita_idCita) {
        this.cita_idCita = cita_idCita;
    }
}
