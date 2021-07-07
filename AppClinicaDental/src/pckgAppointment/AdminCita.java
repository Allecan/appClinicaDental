/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pckgPaciente.Patient;
import pckgPaciente.PatientSQL;

/**
 *
 * @author allec
 */
class AdminCita {

    private CitaSQL csql = new CitaSQL();
    private PatientSQL psql = new PatientSQL();

    public DefaultTableModel seeAllAppoints(int status) {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Nombre Paciente");
        modelTable.addColumn("Fecha");
        modelTable.addColumn("Hora");
        modelTable.addColumn("idCIta");
        List<Cita> listaCitas = csql.selectAllAppoints(status);
        String[] datos = new String[4];

        for (int i = 0; i < listaCitas.size(); i++) {
            datos[0] = String.valueOf(listaCitas.get(i).getPaciente_idPaciente().getNombre());
            datos[1] = dateFormat(listaCitas.get(i).getFecha(), "EEEE dd MMMM");
            datos[2] = timeFormat(String.valueOf(listaCitas.get(i).getHora()), "HH:mm:ss", "hh:mm a");
            datos[3] = String.valueOf(listaCitas.get(i).getIdCita());
            modelTable.addRow(datos);
        }
        return modelTable;
    }

    public boolean registerAppoint(Date fecha, String hora, String dpi) {
        Short status = 0;
        Patient paciente = psql.findPatient(dpi);
        java.sql.Date date = java.sql.Date.valueOf(dateFormat(fecha, "yyyy-MM-dd"));
        Cita cita = new Cita();
        cita.setFecha(date);
        cita.setHora(timeFormat(hora, "hh:mm a", "HH:mm:ss"));
        cita.setStatus(status);
        cita.setPaciente_idPaciente(paciente);
        if (csql.insertAppoint(cita) == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelAppoint(String idCita) { 
        if (csql.updateAppoint(Integer.parseInt(idCita)) == true) {
            return true;
        } else {
            return false;
        }
    }

    public DefaultTableModel listPatients() {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("DPI");
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Apellido");

        List<Patient> listaCitas = psql.selectDpiNameLastPatient();
        String[] datos = new String[3];

        for (int i = 0; i < listaCitas.size(); i++) {
            datos[0] = listaCitas.get(i).getDpi();
            datos[1] = listaCitas.get(i).getNombre();
            datos[2] = listaCitas.get(i).getApellido();
            modelTable.addRow(datos);
        }
        return modelTable;
    }

    private String dateFormat(Date date, String format) {
        SimpleDateFormat formato = new SimpleDateFormat(format);
        if (date != null) {
            return formato.format(date);
        }
        return null;
    }

    private String timeFormat(String time, String formatIn, String formatOut) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatIn);
        Date date;
        try {
            date = formatter.parse(time);
            return dateFormat(date, formatOut);
        } catch (ParseException ex) {
            return null;
        }
    }
}
