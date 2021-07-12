/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgConsultation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pckgMenu.MenuMain;

/**
 *
 * @author Erick
 */
public class ConsultationSQL {

    private Connection instance = MenuMain.getInstance();

    public boolean insertConsultation(Consultation consul) {
        PreparedStatement pst;
        try {
            pst = instance.prepareStatement("INSERT INTO consulta(fecha, cita_idCita) "
                    + "VALUES(?,?)");
            pst.setString(1, consul.getFecha());
            pst.setInt(2, consul.getCita_idCita());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean updateConsultation(Consultation consul) {
        PreparedStatement pst;
        try {
            pst = instance.prepareStatement("UPDATE consulta SET hora = ?, observaciones = ?, "
                    + "total = ? WHERE idConsulta = " + getLastConsul());
            pst.setString(1, consul.getHora());
            pst.setString(2, consul.getObservaciones());
            pst.setFloat(3, consul.getTotal());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean insertConsulDetail(int idServicio){
        PreparedStatement pst;
        try {
            pst = instance.prepareStatement("INSERT INTO detalleconsulta(consulta_idConsulta, servicio_idServicio) "
                    + "VALUES(?,?)");
            pst.setInt(1, getLastConsul());
            pst.setInt(2, idServicio);
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

    }

    private int getLastConsul() {
        String sql = "SELECT idConsulta FROM consulta ORDER BY idConsulta DESC LIMIT 1";

        try {
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int idConsul = 0;
            while (rs.next()) {
                idConsul = rs.getInt(1);
            }
            return idConsul;
        } catch (SQLException ex) {
            ex.getMessage();
            return 0;
        }
    }
}
