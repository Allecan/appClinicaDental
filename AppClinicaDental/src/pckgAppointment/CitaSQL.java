/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pckgMenu.MenuMain;
import pckgPaciente.Patient;
import pckgPaciente.PatientSQL;

/**
 *
 * @author allec
 */
public class CitaSQL {

    private Connection instance = MenuMain.getInstance();
    private Patient paciente = new Patient();
    private PatientSQL psql = new PatientSQL();

    public boolean insertAppoint(Cita cita) {
        PreparedStatement pst;
        try {
            pst = instance.prepareStatement("INSERT INTO cita(fecha, hora, status, paciente_idPaciente) "
                    + "VALUES(?,?,?,?)");
            pst.setString(1, String.valueOf(cita.getFecha()));
            pst.setString(2, String.valueOf(cita.getHora()));
            pst.setShort(3, cita.getStatus());
            pst.setInt(4, cita.getPaciente_idPaciente().getIdPaciente());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

    }

    public List<Cita> selectAllAppoints(int status) {
        java.sql.Date sqlDate;
        String sql = "SELECT fecha, hora, paciente_idPaciente FROM cita "
                + "WHERE status =" + status + " ORDER BY fecha ASC, hora ASC";
        try {
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Cita> listaCitas = new ArrayList<Cita>();
            while (rs.next()) {
                Cita cita = new Cita();
                cita.setFecha(sqlDate = new java.sql.Date(rs.getDate(1).getTime()));
                cita.setHora(rs.getString(2));
                paciente = psql.findPatient(String.valueOf(rs.getInt(3)));
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
