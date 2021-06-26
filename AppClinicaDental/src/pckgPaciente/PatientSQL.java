/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.util.*;
import java.sql.*;
import pckgMenu.MenuMain;

/**
 *
 * @author allec
 */
public class PatientSQL {

    Connection instance = MenuMain.getInstance();

    public List<Patient> selectAllPatientsFromBD() {
        String sql = "SELECT dpi, nombre, apellido, fechaNacimiento, direccion, telefono, celular FROM paciente;";
        try {
            Statement st = instance.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Patient> listaPacientes = new ArrayList<Patient>();
            while (rs.next()) {
                Patient paciente = new Patient();
                paciente.setDpi(rs.getString(1));
                paciente.setNombre(rs.getString(2));
                paciente.setApellido(rs.getString(3));
                paciente.setFechaNac(rs.getString(4));
                paciente.setDireccion(rs.getString(5));
                paciente.setTel(rs.getString(6));
                paciente.setCel(rs.getString(7));
                listaPacientes.add(paciente);
            }
            return listaPacientes;
        } catch (SQLException ex) {
            ex.getCause();
            return null;
        }
    }

    public boolean insertPatientToBD(Patient paciente) {

        PreparedStatement pst;
        boolean status;
        try {
            pst = instance.prepareStatement("INSERT INTO paciente(dpi, nombre, apellido, fechaNacimiento, direccion, "
                    + "telefono, celular)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, paciente.getDpi());
            pst.setString(2, paciente.getNombre());
            pst.setString(3, paciente.getApellido());
            pst.setString(4, paciente.getFechaNac());
            pst.setString(5, paciente.getDireccion());
            pst.setString(6, paciente.getTel());
            pst.setString(7, paciente.getCel());
            pst.executeUpdate();
            status = true;
            return status;
        } catch (SQLException ex) {
//            ex.printStackTrace();
            status = false;
            return status;
        }
    }
}
