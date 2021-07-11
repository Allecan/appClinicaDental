/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Connection;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pckgConsultation.FrameReport.jTableService2;
import pckgMenu.MenuMain;

/**
 *
 * @author ddani
 */
public class Pdf {
    
    Connection instance = (Connection) MenuMain.getInstance();
    
    
    public void pdf(String NombrePaciente, String Total ){
        try {
            FileOutputStream archivo;
            File file = new File("src/pdf/sevicio" + "2" + ".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/pckgReporte/imgs/logo.jpg");
            
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");
            
            PdfPTable Encabezado = new PdfPTable(3);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{60f, 10f, 70f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);
            
            String NombreClinica = "Clinica Dental";
            String NombreDr =   "Kelvin Cano";
            String frase1 = "ODONTOLOGIA GENERAL Y ORTODONCIA";
            String frase2 ="Colegiado 1891";
            String Dir = "Huehuetenango";
            
            Encabezado.addCell("");
            Encabezado.addCell(NombreClinica + "\nDoctor: " + NombreDr + "\n" + frase1 + "\n" + frase2 + "\nDireccion: " + Dir);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Nombre del Paciente: " + NombrePaciente + "\n\n");
            doc.add(cli);
            
            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(100);
            float[] ColumnaTabla = new float[]{30f, 15f};
            tabla.setWidths(ColumnaTabla);
            tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("Servicio", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("Costo", negrita));
          
            cl1.setBackgroundColor(BaseColor.ORANGE);
            cl2.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(cl1);
            tabla.addCell(cl2);

            for (int i = 0; i < jTableService2.getRowCount(); i++) {
                String Servicio = jTableService2.getValueAt(i, 0).toString();
                String Precio = jTableService2.getValueAt(i, 1).toString();
               
                tabla.addCell(Servicio);
                tabla.addCell(Precio);
                
            }
            
            doc.add(tabla);
           
            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total: " + Total);


            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);
            
            doc.close();
            archivo.close();

            Desktop.getDesktop().open(file);
            
        } catch (DocumentException | FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
