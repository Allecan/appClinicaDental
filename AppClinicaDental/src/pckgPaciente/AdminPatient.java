/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allec
 */
public class AdminPatient {

    PatientSQL psql = new PatientSQL();

    public void registrarPaciente(String DPI, String nombre, String apellido, String fechaNac,
            String direccion, String tel, String Cel) throws SQLException {

        Patient paciente = new Patient();
        paciente.setDpi(DPI);
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setFechaNac(fechaNac);
        paciente.setDireccion(direccion);
        paciente.setTel(tel);
        paciente.setCel(Cel);;
        int status = psql.insertPatientToBD(paciente);
        if (status == 0) {
            System.out.println("Consulta no realizada");
        }
        else{System.out.println("Insert correcto");}
    }

    public DefaultTableModel seeAllPatients() {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("DPI");
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Apellido");
        modelTable.addColumn("Edad");
        modelTable.addColumn("Direccion");
        modelTable.addColumn("Telefono");
        modelTable.addColumn("Celular");

        List<Patient> listad = psql.selectAllPatientsFromBD();
        String[] datos = new String[7];

        for (int i = 0; i < listad.size(); i++) {
            datos[0] = listad.get(i).getDpi();
            datos[1] = listad.get(i).getNombre();
            datos[2] = listad.get(i).getApellido();
            datos[3] = listad.get(i).getFechaNac();
            datos[4] = listad.get(i).getDireccion();
            datos[5] = listad.get(i).getTel();
            datos[6] = listad.get(i).getCel();
            modelTable.addRow(datos);
        }
        return modelTable;
    }

    public void determinarEdad(String fechaNac) {

    }
//    public static void setConnection(Connection instanceFromForm) {
//        instance = instanceFromForm;
//    }
}
