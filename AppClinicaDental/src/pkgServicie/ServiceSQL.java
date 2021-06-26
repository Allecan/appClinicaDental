/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;
import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pckgMenu.MenuMain;

/**
 *
 * @author Erick
 */
public class ServiceSQL {
    Connection instance = (Connection) MenuMain.getInstance();
    MenuMain menu = new MenuMain(); 
    Service sv = new Service();
    
    public ResultSet SelectServices(){
        try {
            
            String sql= "SELECT * FROM servicio where deshabilitar = 1";  
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } 
        return null;
    }
    
    public ResultSet SelectservicesDisabled(){
       try {
            
            String sql= "SELECT * FROM servicio where deshabilitar = 0";  
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } 
        return null; 
    }
    
    public int insertService(Service service){
        try {
            instance = (Connection) MenuMain.getInstance();
            PreparedStatement pst = 
                    instance.prepareStatement("INSERT INTO Servicio (nombreservicio, precio, deshabilitar) values(?,?,?)");
            pst.setString(1, service.getNameofService());
            pst.setString(2, service.getPrice());
            pst.setInt(3, service.isEnable());
            int registro = pst.executeUpdate();
            return registro;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } 
        return 0;
    }
    
    //Deshabilitar Servicio 
    public int DisableServiceSQL(int idDisable) {
        int SQL = 0;
        try {
            instance = (Connection) MenuMain.getInstance();
            PreparedStatement pst = instance.prepareStatement("");
            SQL = pst.executeUpdate("UPDATE servicio set deshabilitar ='" + "0" + "'WHERE idservicio='" + idDisable + "'");
            return SQL;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        return SQL;
    }
    
    //Habilitar Servicio
    public int EnableServiceSQL(int idEnable){
        int SQL = 1;
        try {
            instance = (Connection) MenuMain.getInstance();
            PreparedStatement pst = instance.prepareStatement("");
            SQL = pst.executeUpdate("UPDATE servicio set deshabilitar='" + "1" + "'WHERE idservicio='" + idEnable + "'");
            return SQL;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        return SQL;
    }    
}
