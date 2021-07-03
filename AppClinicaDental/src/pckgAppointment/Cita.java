/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

import java.util.Date;
import pckgPaciente.Patient;

/**
 *
 * @author allec
 */
public class Cita {

    private Integer idCita;
    private Date fecha;
    private String hora;
    private Short status;
    private Patient paciente_idPaciente;

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Patient getPaciente_idPaciente() {
        return paciente_idPaciente;
    }

    public void setPaciente_idPaciente(Patient paciente_idPaciente) {
        this.paciente_idPaciente = paciente_idPaciente;
    }

//    public Integer getPaciente_idPaciente() {
//        return paciente_idPaciente;
//    }
//
//    public void setPaciente_idPaciente(Integer paciente_idPaciente) {
//        this.paciente_idPaciente = paciente_idPaciente;
//    }
}
