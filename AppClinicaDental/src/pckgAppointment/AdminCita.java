/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

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
public class AdminCita {

    private CitaSQL csql = new CitaSQL();
    private PatientSQL psql = new PatientSQL();

    public DefaultTableModel seeAllAppoints(int status) {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Nombre Paciente");
        modelTable.addColumn("Fecha");
        modelTable.addColumn("Hora");

        List<Cita> listaCitas = csql.selectAllAppoints(status);
        String[] datos = new String[3];

        for (int i = 0; i < listaCitas.size(); i++) {
            datos[0] = String.valueOf(listaCitas.get(i).getPaciente_idPaciente().getNombre());
            datos[1] = dateFormat(listaCitas.get(i).getFecha(), "EEEE dd MMMM");
            datos[2] = String.valueOf(listaCitas.get(i).getHora());
            modelTable.addRow(datos);
        }
        return modelTable;
    }

    public boolean registerAppoint(String fecha, String hora, String dpi) {
        Short status = 0;
        Patient paciente = psql.findPatient(dpi);
        java.sql.Date date = java.sql.Date.valueOf(fecha);
        Cita cita = new Cita();
        cita.setFecha(date);
        cita.setHora(hora);
        cita.setStatus(status);
        cita.setPaciente_idPaciente(paciente);
        if (csql.insertAppoint(cita) == true) {
            return true;
        } else {
            return false;
        }
//        boolean state = ;
//        System.out.println(""+state);
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

//    private String dateFormat(Date date) {
//        SimpleDateFormat formato = new SimpleDateFormat("EEEE dd MMMM");
//        if (date != null) {
//            
//            return formato.format(date);
//        }
//        return null;
//    }
    public String dateFormat(Date date, String format) {
        SimpleDateFormat formato = new SimpleDateFormat(format);
        if (date != null) {
            return formato.format(date);
        }
        return null;
    }
}
