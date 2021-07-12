/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;

import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkgServicie.ServiceSQL;

/**
 *
 * @author Erick
 */
public class ServiceManagement {

    private final ServiceSQL sSql = new ServiceSQL();

    /*Funcion que muestra la tabla de servicios en FrameService*/
    public DefaultTableModel showService() {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Codigo");
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Precio");
        List<Service> listaServicios = sSql.SelectServices();
        String[] datos = new String[3];
        for (int i = 0; i < listaServicios.size(); i++) {
            datos[0] = String.valueOf(listaServicios.get(i).getIdServicio());
            datos[1] = listaServicios.get(i).getNombre();
            datos[2] = "Q. " + listaServicios.get(i).getPrecio();

            modelTable.addRow(datos);
        }
        return modelTable;
    }

    //Funcion que muestre los servicios deshabilitados
    public DefaultTableModel showServiceDisable() {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Codigo");
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Precio");
        List<Service> listaServicios = sSql.SelectservicesDisabled();
        String[] datos = new String[3];
        for (int i = 0; i < listaServicios.size(); i++) {
            datos[0] = String.valueOf(listaServicios.get(i).getIdServicio());
            datos[1] = listaServicios.get(i).getNombre();
            datos[2] = "Q. " + listaServicios.get(i).getPrecio();

            modelTable.addRow(datos);
        }
        return modelTable;
    }

    /*Funcion que valida que el nombre unicamente tenga letras*/
    public boolean validateName(String nameofService) {
        int i = 0, ascii;
        char caracter;
        while (i < nameofService.length()) {
            caracter = nameofService.toUpperCase().charAt(i);
            ascii = (int) caracter;
            if (ascii != 165 && (ascii < 65 || ascii > 90) && ascii != 32) {
                /*165 = ñ, 48-57 = letras, 32 = espacio*/
                i++;
                JOptionPane.showMessageDialog(null, "Unicamente ingrese letras", "Error", 0);
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    /*Funcion que valida que el precio unicamente sean numeros y decimales, no valida que hayan numero antes o despues de un
    punto decimal*/
    public boolean validatePrice(String Price) {
        int i = 0, ascii;
        char caracter;
        while (i < Price.length()) {
            caracter = Price.toUpperCase().charAt(i);
            ascii = (int) caracter;
            if (ascii != 46 && (ascii < 48 || ascii > 57)) {
                i++;
                JOptionPane.showMessageDialog(null, "Unicamente ingrese numeros", "Error", 0);
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public void registryService(String nameofService, String Price, Boolean enable) {
        validateName(nameofService);
        validatePrice(Price);
        Service servicio = new Service();
        servicio.setNombre(nameofService);
        servicio.setPrecio(Price);
        servicio.setEnable(true);
        int status = sSql.insertService(servicio);
        if (status > 0) {
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "Error el registrar");
        }
    }

    //Funcion para Deshabilitar un servicio
    public void disableService(String idServicio) {
        int id = Integer.parseInt(idServicio);
        sSql.updateStatusServiceSQL(id, 0);
    }

    //Funcion para habilitar un servicio
    public void enableService(String idServicio) {
        int id = Integer.parseInt(idServicio);
        sSql.updateStatusServiceSQL(id, 1);
    }
}
