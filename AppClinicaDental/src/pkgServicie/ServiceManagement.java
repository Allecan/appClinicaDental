/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkgServicie.ServiceSQL;
/**
 *
 * @author Erick
 */
public class ServiceManagement {
    private ResultSet rs2;
    private final ServiceSQL sq = new ServiceSQL();
    private int insert;
    
    /*Funcion que muestra la tabla de servicios en FrameService*/
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
    /*Funcion que valida que el nombre unicamente tenga letras*/
    public boolean validateName(String nameofService){
        int i=0, ascii;
        char caracter;
        while(i < nameofService.length()){
            caracter = nameofService.toUpperCase().charAt(i);
            ascii = (int) caracter;
            if(ascii != 165 && (ascii < 65 || ascii > 90) && ascii !=32){ /*165 = ñ, 48-57 = letras, 32 = espacio*/
                i++;
                JOptionPane.showMessageDialog(null, "Unicamente ingrese letras", "Error", 0);
                return false;    
            }else 
                return true;
        }    
        return false;
    }
    /*Funcion que valida que el precio unicamente sean numeros y decimales, no valida que hayan numero antes o despues de un
    punto decimal*/
    public boolean validatePrice(String Price){
        int i=0, ascii;
        char caracter;
        while(i < Price.length()){
            caracter = Price.toUpperCase().charAt(i);
            ascii = (int) caracter;
            if(ascii != 46 && (ascii < 48 || ascii > 57)){ 
                i++;
                JOptionPane.showMessageDialog(null, "Unicamente ingrese numeros", "Error", 0);
                return false;    
            }else
                return true;
        }
        return false;  
    }
    
    
    public void getServiceValues(String nameofService, String Price, Boolean enable) {
        validateName(nameofService);
        validatePrice(Price);
        Service serv = new Service();
        serv.setNameofService(nameofService);
        serv.setPrice(Price);
        serv.setEnable(true);
        insert = sq.insertService(serv);
        if (insert > 0) {
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "Error el registrar");
        }
    }
}
