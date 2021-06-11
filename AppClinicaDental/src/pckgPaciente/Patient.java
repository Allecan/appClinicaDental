/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.sql.*;
import Conexion.BDConnection;

/**
 *
 * @author allec
 */
public class Patient {

    String dpi;
    String nombre;
    String apellido;
    String direccion;
    String fechaNac;
    String tel;
    String cel;

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

    public void insertToBD() throws SQLException {
        Connection instance = BDConnection.createInstance();
        PreparedStatement pst
                = instance.prepareStatement("INSERT INTO pacientenuevo(dpi, nombre, apellido, fechaNacimiento, direccion, "
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
}
