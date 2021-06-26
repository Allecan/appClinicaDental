/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author allec
 */
public class AdminPatient {

    PatientSQL psql = new PatientSQL();

    public boolean registrarPaciente(String DPI, String nombre, String apellido, String[] fechaNac,
            String direccion, String tel, String Cel) throws SQLException {

        Patient paciente = new Patient();
        paciente.setDpi(DPI);
        paciente.setNombre(nombre);
        paciente.setApellido(apellido);
        paciente.setFechaNac(fechaNac[0] + "-" + convertMonthDate(fechaNac[1]) + "-" + fechaNac[2]);
        paciente.setDireccion(direccion);
        paciente.setTel(tel);
        paciente.setCel(Cel);;
        boolean status = psql.insertPatientToBD(paciente);
        if (status == true) {
            System.out.println("Insert succes");
        } else {
            System.out.println("Insert failed");
        }
        return status;
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
            datos[3] = determinarEdad(listad.get(i).getFechaNac());
            datos[4] = listad.get(i).getDireccion();
            datos[5] = listad.get(i).getTel();
            datos[6] = listad.get(i).getCel();
            modelTable.addRow(datos);
        }
        return modelTable;
    }

    public String determinarEdad(String fechaNac) {
        LocalDate birthDate = LocalDate.parse(fechaNac);

        LocalDate currentDate = LocalDate.now();
        // validate inputs ...
        int edad = Period.between(birthDate, currentDate).getYears();
        return String.valueOf(edad);
//        String h = String.valueOf(java.time.LocalDate.now());
//        System.out.println(h);
    }

    private String convertMonthDate(String month) {
        if (month.equals("enero")) {
            return "01";
        } else if (month.equals("febrero")) {
            return "02";
        } else if (month.equals("marzo")) {
            return "03";
        } else if (month.equals("abril")) {
            return "04";
        } else if (month.equals("mayo")) {
            return "05";
        } else if (month.equals("junio")) {
            return "06";
        } else if (month.equals("julio")) {
            return "07";
        } else if (month.equals("agosto")) {
            return "08";
        } else if (month.equals("septiembre")) {
            return "09";
        } else if (month.equals("octubre")) {
            return "10";
        } else if (month.equals("noviembre")) {
            return "11";
        } else if (month.equals("diciembre")) {
            return "12";
        } else {
            return null;
        }
    }
}
