/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgConsultation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import pckgAppointment.Cita;
import pckgAppointment.CitaSQL;
import pkgServicie.Service;
import pkgServicie.ServiceSQL;

/**
 *
 * @author Erick
 */
public class ConsultationManegement {

    private final ServiceSQL ssql = new ServiceSQL();
    private final CitaSQL csql = new CitaSQL();

    public DefaultComboBoxModel listService() {
        DefaultComboBoxModel modelCombo = new DefaultComboBoxModel();
        List<Service> listaCitas = ssql.SelectServices();
        String[] datos = new String[3];

        for (int i = 0; i < listaCitas.size(); i++) {
            datos[0] = String.valueOf(listaCitas.get(i).getIdServicio());
            datos[1] = listaCitas.get(i).getNombre();
            datos[2] = listaCitas.get(i).getPrecio();
            modelCombo.addElement(datos[0]+ "- "+datos[1] + " - Precio: Q" + datos[2]);
        }
        return modelCombo;
    }    
    
    public DefaultTableModel listApointments() {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Nombre Paciente");
        modelTable.addColumn("Fecha");
        modelTable.addColumn("Hora");
        modelTable.addColumn("idCIta");

        List<Cita> listaCitas = csql.selectAllAppoints(0);
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

    public void getToInsert(String service, String fecha, String hora, String paciente) {
        Consultation consul = new Consultation();
        consul.setDate(fecha);
        consul.setTime(hora);
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
