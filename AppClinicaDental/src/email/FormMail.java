/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import pckgMenu.MenuMain;

/**
 *
 * @author Erick
 */
public class FormMail extends javax.swing.JFrame {
    int x,y;
    BuildEmail BE = new BuildEmail();

    /**
     * Creates new form FormMail
     */
    public FormMail() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonMin = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelCabecera = new javax.swing.JLabel();
        jLabelFileSubject = new javax.swing.JLabel();
        jLabelFileChooser = new javax.swing.JLabel();
        jLabelDestinatario = new javax.swing.JLabel();
        jLabelFileBody = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextFieldSubject = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldDestinatario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jFileChooserFacturaPDF = new javax.swing.JFileChooser();
        jButtonSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaBody = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min1.png"))); // NOI18N
        jButtonMin.setBorder(null);
        jButtonMin.setBorderPainted(false);
        jButtonMin.setContentAreaFilled(false);
        jButtonMin.setFocusPainted(false);
        jButtonMin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min2.png"))); // NOI18N
        jButtonMin.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min2.png"))); // NOI18N
        jButtonMin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min2.png"))); // NOI18N
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, 50));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit1.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setFocusPainted(false);
        jButtonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit2.png"))); // NOI18N
        jButtonSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit2.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 60, 50));

        jLabelCabecera.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabelCabecera.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/barra.png"))); // NOI18N
        jLabelCabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelCabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelCabeceraMouseDragged(evt);
            }
        });
        jLabelCabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCabeceraMousePressed(evt);
            }
        });
        jPanel1.add(jLabelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jLabelFileSubject.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelFileSubject.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFileSubject.setText("Asunto: ");
        jPanel1.add(jLabelFileSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 130, 30));

        jLabelFileChooser.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelFileChooser.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFileChooser.setText("Escoja Factura:");
        jPanel1.add(jLabelFileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, 30));

        jLabelDestinatario.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelDestinatario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDestinatario.setText("Destinatario : ");
        jPanel1.add(jLabelDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, 30));

        jLabelFileBody.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelFileBody.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFileBody.setText("Mensaje: ");
        jPanel1.add(jLabelFileBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 130, 30));

        jSeparator3.setPreferredSize(new java.awt.Dimension(48, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 490, 10));

        jTextFieldSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 490, 30));

        jSeparator2.setPreferredSize(new java.awt.Dimension(48, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 490, 10));
        jPanel1.add(jTextFieldDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 490, 30));

        jSeparator1.setPreferredSize(new java.awt.Dimension(48, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 490, 10));

        jFileChooserFacturaPDF.setCurrentDirectory(new java.io.File("C:\\Users\\ASUS\\Documents\\URL\\4to año 2\\7mo. Interciclo 2\\Analisis y Diseño II"));
        jPanel1.add(jFileChooserFacturaPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 300));

        jButtonSend.setText("Send");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, -1, -1));

        jTextAreaBody.setColumns(20);
        jTextAreaBody.setRows(5);
        jScrollPane1.setViewportView(jTextAreaBody);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 490, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabeceraMouseDragged
        //metodo para establecer la posicion de la ventana cuando se arrastre el boton por la cabecera
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabelCabeceraMouseDragged

    private void jLabelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabeceraMousePressed
        //metodo que obtiene cordenadas actuales del Frame mediante la cabecera
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabelCabeceraMousePressed

    private void jTextFieldSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubjectActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        //minimizar el Frame Menu
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
        MenuMain.menuVisible();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        try {
            BE.sendEmail(jTextFieldDestinatario.getText(), jTextFieldSubject.getText(), jTextAreaBody.getText(), jFileChooserFacturaPDF.getSelectedFile());
        } catch (MessagingException | IOException ex) {
            Logger.getLogger(FormMail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.LojTextFieldDestinatarioger(FormMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JFileChooser jFileChooserFacturaPDF;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JLabel jLabelDestinatario;
    private javax.swing.JLabel jLabelFileBody;
    private javax.swing.JLabel jLabelFileChooser;
    private javax.swing.JLabel jLabelFileSubject;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaBody;
    private javax.swing.JTextField jTextFieldDestinatario;
    private javax.swing.JTextField jTextFieldSubject;
    // End of variables declaration//GEN-END:variables
}
