/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.sql.*;
import Conexion.BDConnection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allec
 */
public class Patient {

    private String dpi;
    private String nombre;
    private String apellido;
    private String direccion;
    private String fechaNac;
    private String tel;
    private String cel;

//    static Connection instanceBD;
    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

//    public static void setInstance(Connection instance) {
//        instanceBD = instance;
//    }
    public void insertToBD() throws SQLException {
        Connection instance = BDConnection.createInstance();
        PreparedStatement pst
                = instance.prepareStatement("INSERT INTO paciente(dpi, nombre, apellido, fechaNacimiento, direccion, "
                        + "telefono, celular)VALUES(?,?,?,?,?,?,?)");
        pst.setString(1, this.dpi);
        pst.setString(2, this.nombre);
        pst.setString(3, this.apellido);
        pst.setString(4, this.fechaNac);
        pst.setString(5, this.direccion);
        pst.setString(6, this.tel);
        pst.setString(7, this.cel);
        pst.executeUpdate();
    }

    public DefaultTableModel selectFromBd() {
        DefaultTableModel modelTab = new DefaultTableModel();
        modelTab.addColumn("DPI");
        modelTab.addColumn("Nombre");
        modelTab.addColumn("Apellido");
        modelTab.addColumn("Edad");
        modelTab.addColumn("Direccion");
        modelTab.addColumn("Telefono");
        modelTab.addColumn("Celular");
        String sql = "SELECT * FROM paciente";
        try {
            Statement st = BDConnection.createInstance().createStatement();
            ResultSet rs = st.executeQuery(sql);

            String[] datosConsultaPaciente = new String[7];
            while (rs.next()) {
                datosConsultaPaciente[0] = rs.getString(2);
                datosConsultaPaciente[1] = rs.getString(3);
                datosConsultaPaciente[2] = rs.getString(4);
                datosConsultaPaciente[3] = rs.getString(5);
                datosConsultaPaciente[4] = rs.getString(6);
                datosConsultaPaciente[5] = rs.getString(7);
                datosConsultaPaciente[6] = rs.getString(8);
                modelTab.addRow(datosConsultaPaciente);
            }

        } catch (SQLException ex) {
            ex.getCause();
        }
        System.out.println(modelTab.getRowCount());

        return modelTab;
    }
}
