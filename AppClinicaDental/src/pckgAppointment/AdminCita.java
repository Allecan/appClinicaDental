/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allec
 */
public class AdminCita {

    CitaSQL csql = new CitaSQL();

    public DefaultTableModel seeAllAppoints(int status) {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Nombre Paciente");
        modelTable.addColumn("Fecha");
        modelTable.addColumn("Hora");

        List<Cita> listaCitas = csql.selectAllAppoints(status);
        String[] datos = new String[3];

        for (int i = 0; i < listaCitas.size(); i++) {
            datos[0] = String.valueOf(listaCitas.get(i).getPaciente_idPaciente().getNombre());
            datos[1] = String.valueOf(listaCitas.get(i).getFecha());
            datos[2] = String.valueOf(listaCitas.get(i).getHora());
            modelTable.addRow(datos);
        }
        return modelTable;
    }

}
