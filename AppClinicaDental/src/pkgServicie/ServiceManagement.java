/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import pkgServicie.ServiceSQL;
/**
 *
 * @author Erick
 */
public class ServiceManagement {
    ResultSet rs2;
    ServiceSQL sq = new ServiceSQL();
    
    public DefaultTableModel showService() throws SQLException {
        rs2 = sq.SelectServices();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Servicio");
        modelo.addColumn("Precio Q.");
        String[] datos = new String[3];
        while (rs2.next()) {
            datos[0] = rs2.getString(2);
            datos[1] = rs2.getString(3);
            modelo.addRow(datos);
        }
        return modelo;

    }
}
