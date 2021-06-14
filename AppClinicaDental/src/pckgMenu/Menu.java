/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgMenu;

import Conexion.BDConnection;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import pckgAppointment.FrameAppointment;
import pckgConsultation.FrameConsultation;

/**
 *
 * @author allec
 */
public class Menu extends javax.swing.JFrame {

    Connection instance = BDConnection.createInstance();
    int x, y;

    /**
     * Creates new form Menu
     */
    public Menu() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanelFondo.setBackground(new Color(0, 0, 0, 0));
//        instance = BDConnection.createInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jButtonConsul = new javax.swing.JButton();
        jButtonPatient = new javax.swing.JButton();
        jButtonMin = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonService = new javax.swing.JButton();
        jButtonAppoint = new javax.swing.JButton();
        jLabelCabecera = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icConsulta.png"))); // NOI18N
        jButtonConsul.setBorder(null);
        jButtonConsul.setBorderPainted(false);
        jButtonConsul.setContentAreaFilled(false);
        jButtonConsul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 190, 250));

        jButtonPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icPaci.png"))); // NOI18N
        jButtonPatient.setBorder(null);
        jButtonPatient.setBorderPainted(false);
        jButtonPatient.setContentAreaFilled(false);
        jButtonPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, 220));

        jButtonMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min1.png"))); // NOI18N
        jButtonMin.setBorder(null);
        jButtonMin.setBorderPainted(false);
        jButtonMin.setContentAreaFilled(false);
        jButtonMin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min2.png"))); // NOI18N
        jButtonMin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/min2.png"))); // NOI18N
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 70, 60));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit1.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit2.png"))); // NOI18N
        jButtonSalir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit2.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 70, 60));

        jButtonService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icServicios.png"))); // NOI18N
        jButtonService.setBorder(null);
        jButtonService.setBorderPainted(false);
        jButtonService.setContentAreaFilled(false);
        jButtonService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServiceActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonService, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 260, 230));

        jButtonAppoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icCita.png"))); // NOI18N
        jButtonAppoint.setBorder(null);
        jButtonAppoint.setBorderPainted(false);
        jButtonAppoint.setContentAreaFilled(false);
        jButtonAppoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppointActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAppoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 260, 220));

        jLabelCabecera.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabelCabecera.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCabecera.setText("        Menu principal");
        jLabelCabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
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
        jPanelFondo.add(jLabelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1070, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/fondo.png"))); // NOI18N
        jPanelFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1200, 810));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabelCabeceraMouseDragged

    private void jLabelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabelCabeceraMousePressed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPatientActionPerformed
//        FramePatient frame = new FramePatient();
//        frame.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jButtonPatientActionPerformed

    private void jButtonServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServiceActionPerformed
//        FrameService frame = new FrameService();
//        frame.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jButtonServiceActionPerformed

    private void jButtonConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulActionPerformed
        FrameConsultation frame = new FrameConsultation();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsulActionPerformed

    private void jButtonAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppointActionPerformed
        FrameAppointment frame = new FrameAppointment();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAppointActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (SQLException ex) {
                    ex.getCause();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAppoint;
    private javax.swing.JButton jButtonConsul;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonPatient;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}