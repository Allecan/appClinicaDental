/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgConsultation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pckgMenu.MenuMain;

/**
 *
 * @author Erick
 */
public class ConsultationSQL {
     private Connection instance = MenuMain.getInstance();
     private Consultation cosul = new Consultation();
     
     public int insertConsultation(){
          try {
            instance = (com.mysql.jdbc.Connection) MenuMain.getInstance();
            PreparedStatement pst = 
                    instance.prepareStatement("INSERT INTO consulta (fecha, hora, observaciones, total) values(?,?,?,?)");
//            pst.setString(1, service.getNameofService());
//            pst.setString(2, service.getPrice());
//            pst.setInt(3, service.isEnable());
            int registro = pst.executeUpdate();
            return registro;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } 
        return 0;
     }
    
}
