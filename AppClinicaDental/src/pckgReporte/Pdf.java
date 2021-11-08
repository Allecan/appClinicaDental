/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgReporte;

import ClasesAbstractas.FormatDate;
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
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author ddani
 */
public class Pdf extends FormatDate{

    public void generatePdf(String NombrePaciente, String Total, JTable jTableServicies) {
        try {
            FileOutputStream archivo;
            File file = new File("src/pckgReporte/pdf/factura.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            //Imagen
            Image img = Image.getInstance("src/pckgReporte/imgs/logo.jpg");
           /* Image image = null;
            try {
                image =  Image.getInstance(img);//carga imagen
                image.scaleAbsolute(40,50);//cambia tamaño
                image.setAbsolutePosition(25, 705);//coloca imagen en la posicion
                
            } catch (Exception e) {
            }
            doc.add(image);*/
            
            //Titulo del documento
            Font cursiva = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.ITALIC, BaseColor.BLACK);
            Paragraph titulo = new Paragraph("Clinica Dental Dr. Kelvin Cano",cursiva);
            titulo.setAlignment(1);
            doc.add(titulo);
                        
            //Fecha del documento
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();            
            fecha.add("\n"+"Emision de Factura:"+"\n"+ "Fecha: " + dateFormat(date, "dd-MM-yyyy") + "\n" + "Hora: " + dateFormat(date, "hh:mm aa"));
                
            PdfPTable Encabezado = new PdfPTable(3);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{10f, 80f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            Encabezado.addCell(img);

            String frase1 = "ODONTOLOGIA GENERAL Y ORTODONCIA";
            String frase2 = "Colegiado 1891";
            String Dir = "4av, 1-82 Chiantla, Huehuetenango";
            String Tel = "7778-9015";

            //Encabezado.addCell("");
            Encabezado.addCell("\n" +frase1 + "\n" + frase2 + "\nDireccion: " + Dir + "\nTelefono: " + Tel);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);

            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Nombre del Paciente: " + NombrePaciente + "\n\n");
            doc.add(cli);

            PdfPTable tabla = new PdfPTable(2);
            tabla.setWidthPercentage(100);
            float[] ColumnaTabla = new float[]{40f, 15f};
            tabla.setWidths(ColumnaTabla);
            tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl1 = new PdfPCell(new Phrase("Servicio", negrita));
            PdfPCell cl2 = new PdfPCell(new Phrase("Costo", negrita));

            cl1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            cl2.setBackgroundColor(BaseColor.LIGHT_GRAY);

            tabla.addCell(cl1);
            tabla.addCell(cl2);

            for (int i = 0; i < jTableServicies.getRowCount(); i++) {
                String Servicio = jTableServicies.getValueAt(i, 1).toString();
                String Precio = "Q. " + jTableServicies.getValueAt(i, 2).toString();

                tabla.addCell(Servicio);
                tabla.addCell(Precio);

            }

            doc.add(tabla);

            Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: Q. " + Total);

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
