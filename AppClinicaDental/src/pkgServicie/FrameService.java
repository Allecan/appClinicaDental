/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;


import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pckgMenu.MenuMain;
import pkgServicie.ServiceManagement;
/**
 *
 * @author Erick
 */
public class FrameService extends javax.swing.JFrame {
    int x, y;
    ServiceManagement sm = new ServiceManagement();
    MenuMain menu = new MenuMain();
    ServiceSQL SSQL= new ServiceSQL();

    /**
     * Creates new form Servicies
     */
    public FrameService() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanelRegistrarServicio.setVisible(false);
        jPanelShowServices.setVisible(false);
        jTextFieldNewServicie.setBackground(new Color(0,0,0,0));
        jTextFieldNewServiciePrice.setBackground(new Color(0,0,0,0));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuOpciones = new javax.swing.JPopupMenu();
        jMenuHabilitarServicio = new javax.swing.JMenuItem();
        jMenuDeshabilitarServicio = new javax.swing.JMenuItem();
        jPanelServicie = new javax.swing.JPanel();
        jButtonMinimize = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jButtonShowService = new javax.swing.JButton();
        jButtonAddService = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelShowServices = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelRegistrarServicio = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNewServiciePrice = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNewServicie = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSave = new javax.swing.JButton();
        jLabelCabecera = new javax.swing.JLabel();

        jMenuHabilitarServicio.setText("Habilitar Servicio");
        jMenuHabilitarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHabilitarServicioActionPerformed(evt);
            }
        });
        jPopupMenuOpciones.add(jMenuHabilitarServicio);

        jMenuDeshabilitarServicio.setText("Deshabilitar Servicio");
        jMenuDeshabilitarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDeshabilitarServicioActionPerformed(evt);
            }
        });
        jPopupMenuOpciones.add(jMenuDeshabilitarServicio);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelServicie.setBackground(new java.awt.Color(255, 255, 255));
        jPanelServicie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/min1.png"))); // NOI18N
        jButtonMinimize.setBorderPainted(false);
        jButtonMinimize.setContentAreaFilled(false);
        jButtonMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/min2.png"))); // NOI18N
        jButtonMinimize.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/minus.png"))); // NOI18N
        jButtonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizeActionPerformed(evt);
            }
        });
        jPanelServicie.add(jButtonMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 30));

        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/exit1.png"))); // NOI18N
        jButtonClose.setBorderPainted(false);
        jButtonClose.setContentAreaFilled(false);
        jButtonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/exit2.png"))); // NOI18N
        jButtonClose.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgMenu/imgs/exit2.png"))); // NOI18N
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jPanelServicie.add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 30));

        jButtonShowService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/list.png"))); // NOI18N
        jButtonShowService.setBorderPainted(false);
        jButtonShowService.setContentAreaFilled(false);
        jButtonShowService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonShowService.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/list (1).png"))); // NOI18N
        jButtonShowService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowServiceActionPerformed(evt);
            }
        });
        jPanelServicie.add(jButtonShowService, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jButtonAddService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/dental1.png"))); // NOI18N
        jButtonAddService.setBorderPainted(false);
        jButtonAddService.setContentAreaFilled(false);
        jButtonAddService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddService.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/dental.png"))); // NOI18N
        jButtonAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddServiceActionPerformed(evt);
            }
        });
        jPanelServicie.add(jButtonAddService, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servicios");
        jPanelServicie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jPanelShowServices.setBackground(new java.awt.Color(255, 255, 255));
        jPanelShowServices.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable2.setComponentPopupMenu(jPopupMenuOpciones);
        jScrollPane2.setViewportView(jTable2);

        jPanelShowServices.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 240));

        jPanelServicie.add(jPanelShowServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 480, 250));
        jPanelServicie.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 10, 380));

        jPanelRegistrarServicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("Precio :");
        jPanelRegistrarServicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 40));

        jTextFieldNewServiciePrice.setBorder(null);
        jTextFieldNewServiciePrice.setOpaque(false);
        jTextFieldNewServiciePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNewServiciePriceActionPerformed(evt);
            }
        });
        jPanelRegistrarServicio.add(jTextFieldNewServiciePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 250, 30));
        jPanelRegistrarServicio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 260, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("Sercicio a agregar : ");
        jPanelRegistrarServicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jTextFieldNewServicie.setBorder(null);
        jTextFieldNewServicie.setOpaque(false);
        jTextFieldNewServicie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNewServicieActionPerformed(evt);
            }
        });
        jPanelRegistrarServicio.add(jTextFieldNewServicie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 250, 30));
        jPanelRegistrarServicio.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 260, 20));

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/diskette.png"))); // NOI18N
        jButtonSave.setBorderPainted(false);
        jButtonSave.setContentAreaFilled(false);
        jButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSave.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/diskette (1).png"))); // NOI18N
        jButtonSave.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImgService/floppy-disk (1).png"))); // NOI18N
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelRegistrarServicio.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, -1));

        jPanelServicie.add(jPanelRegistrarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 510, 240));

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
        jPanelServicie.add(jLabelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        getContentPane().add(jPanelServicie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowServiceActionPerformed
        jPanelShowServices.setVisible(true);
        jPanelRegistrarServicio.setVisible(false);
        try {
            jTable2.setModel(sm.showService());
        } catch (SQLException ex) {
            Logger.getLogger(FrameService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonShowServiceActionPerformed

    private void jButtonAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddServiceActionPerformed
        jPanelRegistrarServicio.setVisible(true);
        jPanelShowServices.setVisible(false);
        
    }//GEN-LAST:event_jButtonAddServiceActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();
        MenuMain.menuVisible();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizeActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizeActionPerformed

    private void jTextFieldNewServicieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNewServicieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNewServicieActionPerformed

    private void jTextFieldNewServiciePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNewServiciePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNewServiciePriceActionPerformed

    private void jLabelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabeceraMouseDragged
        //metodo para establecer la posicion de la ventana cuando se arrastre el boton por la cabecera
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabelCabeceraMouseDragged

    private void jLabelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabeceraMousePressed
        //metodo que obtiene cordenadas actuales del Frame mediante la cabecera
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabelCabeceraMousePressed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
         sm.getServiceValues(jTextFieldNewServicie.getText(), jTextFieldNewServiciePrice.getText(), true);
         jTextFieldNewServicie.setText("");
         jTextFieldNewServiciePrice.setText("");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jMenuDeshabilitarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDeshabilitarServicioActionPerformed
        // TODO add your handling code here:
        sm.DisableService(jTable2);
    }//GEN-LAST:event_jMenuDeshabilitarServicioActionPerformed

    private void jMenuHabilitarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHabilitarServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuHabilitarServicioActionPerformed

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
            java.util.logging.Logger.getLogger(FrameService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddService;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonShowService;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCabecera;
    private javax.swing.JMenuItem jMenuDeshabilitarServicio;
    private javax.swing.JMenuItem jMenuHabilitarServicio;
    private javax.swing.JPanel jPanelRegistrarServicio;
    private javax.swing.JPanel jPanelServicie;
    private javax.swing.JPanel jPanelShowServices;
    private javax.swing.JPopupMenu jPopupMenuOpciones;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldNewServicie;
    private javax.swing.JTextField jTextFieldNewServiciePrice;
    // End of variables declaration//GEN-END:variables
}
