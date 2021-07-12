/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgEnvioFactura;

import Iinterfazes.iEnvioFactura;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Erick
 */
public class EnvioGmail implements iEnvioFactura {

    @Override
    public void enviarFactura(String toAddress, String subject,
            String mensaje, File filename) {

        try {
            String miCorreo = "devxehuetan21@gmail.com";
            String miPass = "TwWfV$FuR7dSUb";

            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getDefaultInstance(properties);
//        session.setDebug(true);

            BodyPart bp = new MimeBodyPart();
            bp.setContent(mensaje, "text/plain; charset=UTF-8");

            BodyPart pdf = new MimeBodyPart();
            pdf.setDataHandler(new DataHandler(new FileDataSource(filename.getPath())));
            pdf.setFileName("Factura Clinica Dr.Kelvin Cano.pdf");

            MimeMultipart multi = new MimeMultipart();
            multi.addBodyPart(bp);
            multi.addBodyPart(pdf);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(miCorreo));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
            message.setSubject(subject);
            message.setContent(multi);

            Transport tr = session.getTransport("smtp");
            tr.connect(miCorreo, miPass);
            tr.sendMessage(message, message.getAllRecipients());
            tr.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
