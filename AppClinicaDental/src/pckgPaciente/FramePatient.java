/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.awt.Color;

/**
 *
 * @author allecc
 */
public class FramePatient extends javax.swing.JFrame {

    /**
     * Creates new form FramePatient
     */
    public FramePatient() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        jPanelAgregarPaciente.setVisible(false);
        jPanelAgregarPaciente.setBackground(new Color(0, 0, 0, 0));
        jPanelVerPaciente.setVisible(false);
        jPanelVerPaciente.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAgregarPaciente = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanelVerPaciente = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonMin = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAgregarPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Escriba aca datos");
        jPanelAgregarPaciente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 280, -1));

        getContentPane().add(jPanelAgregarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 1050, 720));

        jPanelVerPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("QUIERO VER");
        jPanelVerPaciente.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        getContentPane().add(jPanelVerPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 1050, 720));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 20, 720));

        jButtonMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/5.png"))); // NOI18N
        jButtonMin.setBorder(null);
        jButtonMin.setBorderPainted(false);
        jButtonMin.setContentAreaFilled(false);
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 60, 50));

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/ver1.png"))); // NOI18N
        jButtonVer.setBorder(null);
        jButtonVer.setBorderPainted(false);
        jButtonVer.setContentAreaFilled(false);
        jButtonVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVer.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/ver2.png"))); // NOI18N
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 80, 60));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/3.png"))); // NOI18N
        jButtonSalir.setBorder(null);
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/4.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 50, 50));

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/add.png"))); // NOI18N
        jButtonAdd.setBorder(null);
        jButtonAdd.setBorderPainted(false);
        jButtonAdd.setContentAreaFilled(false);
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/add2.png"))); // NOI18N
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 100, 100));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modulo de pacientes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgPaciente/imgs/fondoPacient.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1220, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1230, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        jPanelAgregarPaciente.setVisible(true);
        jPanelVerPaciente.setVisible(false);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        jPanelVerPaciente.setVisible(true);
        jPanelAgregarPaciente.setVisible(false);
    }//GEN-LAST:event_jButtonVerActionPerformed

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
            java.util.logging.Logger.getLogger(FramePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAgregarPaciente;
    private javax.swing.JPanel jPanelVerPaciente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
