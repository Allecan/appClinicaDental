/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgMenu;

import java.awt.Color;
import javax.swing.JLabel;
import pckgAppointment.FrameAppointment;
import pckgConsultation.FrameConsultation;
import pkgServicie.FrameService;
import pckgPaciente.FramePatient;
import pckgEnvioFactura.FormMail;

/**
 *
 * @author allec
 */
public class Menu extends javax.swing.JFrame {

    private int x, y; //variables que sirven para obtener cordenadas para poder mover el Frame Menu

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setPropertiesGUI(); //metodo para establecer las propiedades graficas del Frame Menu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMin = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelCabecera = new javax.swing.JLabel();
        jPanelFondo = new javax.swing.JPanel();
        jButtonConsul = new javax.swing.JButton();
        jButtonPatient = new javax.swing.JButton();
        jButtonSend = new javax.swing.JButton();
        jButtonService = new javax.swing.JButton();
        jButtonAppoint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 60, 50));

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
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 60, 50));

        jLabelCabecera.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabelCabecera.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/barra.png"))); // NOI18N
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
        getContentPane().add(jLabelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icConsulta.png"))); // NOI18N
        jButtonConsul.setBorder(null);
        jButtonConsul.setBorderPainted(false);
        jButtonConsul.setContentAreaFilled(false);
        jButtonConsul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsul.setFocusPainted(false);
        jButtonConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsulActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, 250));

        jButtonPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icPaci.png"))); // NOI18N
        jButtonPatient.setBorder(null);
        jButtonPatient.setBorderPainted(false);
        jButtonPatient.setContentAreaFilled(false);
        jButtonPatient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPatient.setFocusPainted(false);
        jButtonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 210, 220));

        jButtonSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/paper-plane (1).png"))); // NOI18N
        jButtonSend.setBorder(null);
        jButtonSend.setBorderPainted(false);
        jButtonSend.setContentAreaFilled(false);
        jButtonSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSend.setFocusPainted(false);
        jButtonSend.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/paper-plane.png"))); // NOI18N
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 260, 230));

        jButtonService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icServicios.png"))); // NOI18N
        jButtonService.setBorder(null);
        jButtonService.setBorderPainted(false);
        jButtonService.setContentAreaFilled(false);
        jButtonService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonService.setFocusPainted(false);
        jButtonService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServiceActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonService, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 260, 230));

        jButtonAppoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/icAppoint.png"))); // NOI18N
        jButtonAppoint.setBorder(null);
        jButtonAppoint.setBorderPainted(false);
        jButtonAppoint.setContentAreaFilled(false);
        jButtonAppoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAppoint.setFocusPainted(false);
        jButtonAppoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppointActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAppoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 260, 220));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 770));

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

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        //minimizar el Frame Menu
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        //Salir del sistema
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPatientActionPerformed
        //instancia nueva para acceder al modulo, Frame, de Paciente
        FramePatient frame = new FramePatient();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPatientActionPerformed

    private void jButtonServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServiceActionPerformed
        FrameService frame = new FrameService();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonServiceActionPerformed

    private void jButtonConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsulActionPerformed
        FrameConsultation frame = new FrameConsultation();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsulActionPerformed

    private void jButtonAppointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppointActionPerformed
        //instancia nueva para acceder al modulo, Frame, de Citas
        FrameAppointment frame = new FrameAppointment();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAppointActionPerformed

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        FormMail mail = new FormMail();
        mail.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSendActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAppoint;
    private javax.swing.JButton jButtonConsul;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonPatient;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JButton jButtonService;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables

    private void setPropertiesGUI() {
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanelFondo.setBackground(new Color(0xEDF0F2));
        jLabelCabecera.setHorizontalTextPosition(JLabel.CENTER);
        jLabelCabecera.setText("Menu Principal");
    }
}
