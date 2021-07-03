/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pckgMenu.MenuMain;
import pckgPaciente.Patient;
import pckgPaciente.PatientSQL;

/**
 *
 * @author allec
 */
public class CitaSQL {

    Connection instance = MenuMain.getInstance();
    Patient paciente = new Patient();
    PatientSQL psql = new PatientSQL();

    public List<Cita> selectAllAppoints(int status) {
        String sql = "SELECT fecha, hora, paciente_idPaciente FROM cita "
                + "WHERE status =" + status + " ORDER BY fecha ASC, hora ASC";
        try {
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Cita> listaCitas = new ArrayList<Cita>();
            while (rs.next()) {
                Cita cita = new Cita();
                cita.setFecha(rs.getDate(1));
                cita.setHora(rs.getString(2));
                paciente = psql.findPatient(rs.getInt(3));
                cita.setPaciente_idPaciente(paciente);
                listaCitas.add(cita);
            }
            return listaCitas;
        } catch (SQLException ex) {
            ex.getMessage();
            return null;
        }
    }
//    
}
