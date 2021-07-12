/*
 * clase a desarrollar en un futuro
 */
package pckgEnvioFactura;

import Iinterfazes.iEnvioFactura;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author allec
 */
public class EnvioYahoo implements iEnvioFactura {

    @Override
    public void enviarFactura(String toAddress, String subject, String mensaje, File filename) {
        System.out.println("No desarrollado aun");   
        JOptionPane.showMessageDialog(null, "No desarrollado aun", "Alerta", 0);
    }

}
