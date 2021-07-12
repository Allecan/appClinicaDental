/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iinterfazes;

import java.io.File;

/**
 *
 * @author allec
 */
public interface iEnvioFactura {
    void enviarFactura(String toAddress, String subject, 
           String mensaje, File filename);
}
