/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pckgMenu.MenuMain;

/**
 *
 * @author Erick
 */
public class ServiceSQL {

    private Connection instance = MenuMain.getInstance();

    Service sv = new Service();

    public List<Service> SelectServices() {
        String sql = "SELECT idServicio, nombre, precio FROM servicio where deshabilitar = 1";
        try {
            List<Service> listaServicios = new ArrayList<Service>();
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Service servicio = new Service();
                servicio.setIdServicio(rs.getInt(1));
                servicio.setNombre(rs.getString(2));
                servicio.setPrecio(rs.getString(3));
                listaServicios.add(servicio);
            }
            return listaServicios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            return null;
        }
    }

    public List<Service> SelectservicesDisabled() {
        String sql = "SELECT idServicio, nombre, precio FROM servicio where deshabilitar = 0";
        try {
            List<Service> listaServicios = new ArrayList<Service>();
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Service servicio = new Service();
                servicio.setIdServicio(rs.getInt(1));
                servicio.setNombre(rs.getString(2));
                servicio.setPrecio(rs.getString(3));
                listaServicios.add(servicio);
            }
            return listaServicios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            return null;
        }
    }

    public String[] selectServiceById(int idServicio) {
        String[] datos = new String[3];
        String sql = "SELECT idServicio, nombre, precio FROM servicio where idServicio = " + idServicio;
        try {
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
            }
            return datos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            return null;
        }
    }

    public int insertService(Service service) {
        try {
            PreparedStatement pst
                    = instance.prepareStatement("INSERT INTO Servicio (nombre, precio, deshabilitar) values(?,?,?)");
            pst.setString(1, service.getNombre());
            pst.setString(2, service.getPrecio());
            pst.setInt(3, service.isEnable());
            int status = pst.executeUpdate();
            return status;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
        return 0;
    }

    //Deshabilitar Servicio 
    public void updateStatusServiceSQL(int idService, int status) {
        PreparedStatement pst;
        try {
            pst = instance.prepareStatement("UPDATE servicio SET deshabilitar = " + status
                    + " WHERE idServicio = " + idService);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }
}
