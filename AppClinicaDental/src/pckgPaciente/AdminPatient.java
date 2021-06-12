/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allec
 */
public class AdminPatient {

//    static Connection instance;
    public static void registrarPaciente(String DPI, String nombre, String apellido, String fechaNac,
            String direccion, String tel, String Cel) throws SQLException {

        Patient paciente = new Patient();
        paciente.setDpi(DPI);
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setFechaNac(fechaNac);
        paciente.setDireccion(direccion);
        paciente.setTel(tel);
        paciente.setCel(Cel);
//        paciente.setInstance();
        paciente.insertToBD();
    }

    public static DefaultTableModel visualiarListadoPaciente() {
        DefaultTableModel modelTab = new DefaultTableModel();
        modelTab.addColumn("DPI");
        modelTab.addColumn("Nombre");
        modelTab.addColumn("Apellido");
        modelTab.addColumn("Edad");
        modelTab.addColumn("Direccion");
        modelTab.addColumn("Telefono");
        modelTab.addColumn("Celular");
        Patient paciente = new Patient();
        modelTab = paciente.selectFromBd();
        System.out.println(modelTab.getRowCount());
        return modelTab;
    }

//    public static void setConnection(Connection instanceFromForm) {
//        instance = instanceFromForm;
//    }
}
