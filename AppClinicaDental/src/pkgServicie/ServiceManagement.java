/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;
import Conexion.BDConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Erick
 */
public class ServiceManagement{
    public DefaultTableModel showService() throws SQLException {
        String valor = "";
       // JTable servicios = null;
        try {
            Connection Instance = BDConnection.createInstance();
            DefaultTableModel modelo = new DefaultTableModel();
//             {
//                @Override
//                public boolean isCellEditable(int fila, int col) {
//                    return col == 3;
//                }
//            };
            modelo.addColumn("Servicio");
            modelo.addColumn("Precio Q.");
           // servicios.setModel(modelo);
            
            String sql = "";
            if (valor.equals(""))
            {
                sql="SELECT * FROM servicio";
            }
            String[] datos = new String[3];
            Statement st = Instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                modelo.addRow(datos);
            }
           return modelo; 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return null;
    }
}
