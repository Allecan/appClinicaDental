/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;
import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pckgMenu.MenuMain;

/**
 *
 * @author Erick
 */
public class ServiceSQL {
    Connection instance;
    MenuMain menu = new MenuMain();
    
    public ResultSet SelectServices(){
        try {
            instance = (Connection) menu.getInstance();
            String sql= "SELECT * FROM servicio where deshabilitar = 1";  
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } 
        return null;
    }

}
