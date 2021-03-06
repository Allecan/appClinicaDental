/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgServicie;

import Iinterfazes.iControlUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import pckgMenu.MenuMain;
import pkgServicie.ServiceManagement;

/**
 *
 * @author Erick
 */
public class FrameService extends javax.swing.JFrame implements iControlUI{

    private int x, y;
    private ServiceManagement sm;

    /**
     * Creates new form Servicies
     */
    public FrameService() {
        initComponents();
        setPropertiesGUI();
        sm = new ServiceManagement();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFondo = new javax.swing.ButtonGroup();
        jPopupMenu = new javax.swing.JPopupMenu();
        buttonGroupTable = new javax.swing.ButtonGroup();
        jButtonMin = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jLabelBarraCabecera = new javax.swing.JLabel();
        jSeparatorFondo = new javax.swing.JSeparator();
        jPanelAddServicie = new javax.swing.JPanel();
        jLabelBusqueda1 = new javax.swing.JLabel();
        labelTitutloVisualizar1 = new javax.swing.JLabel();
        jLabelBusqueda2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextFieldNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonSaveData = new javax.swing.JButton();
        jPanelShowServicies = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableServicies = new javax.swing.JTable();
        jLabelTitleV = new javax.swing.JLabel();
        jToggleButtonDisableSV = new javax.swing.JToggleButton();
        jToggleButtonEnabledSV = new javax.swing.JToggleButton();
        jPanelFondo = new javax.swing.JPanel();
        jtoggleButtonVisualizar = new javax.swing.JToggleButton();
        jtoggleButtonNewService = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/min1.png"))); // NOI18N
        jButtonMin.setBorder(null);
        jButtonMin.setBorderPainted(false);
        jButtonMin.setContentAreaFilled(false);
        jButtonMin.setFocusPainted(false);
        jButtonMin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/min2.png"))); // NOI18N
        jButtonMin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/min2.png"))); // NOI18N
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 50, 50));

        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/exit1.png"))); // NOI18N
        jButtonClose.setBorder(null);
        jButtonClose.setBorderPainted(false);
        jButtonClose.setContentAreaFilled(false);
        jButtonClose.setFocusPainted(false);
        jButtonClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/exit2.png"))); // NOI18N
        jButtonClose.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/exit2.png"))); // NOI18N
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 60, 50));

        jLabelBarraCabecera.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabelBarraCabecera.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBarraCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBarraCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/barra.png"))); // NOI18N
        jLabelBarraCabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jLabelBarraCabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelBarraCabeceraMouseDragged(evt);
            }
        });
        jLabelBarraCabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelBarraCabeceraMousePressed(evt);
            }
        });
        getContentPane().add(jLabelBarraCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jSeparatorFondo.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorFondo.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorFondo.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparatorFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 10, 790));

        jPanelAddServicie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBusqueda1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelBusqueda1.setText("Precio del servicio:");
        jPanelAddServicie.add(jLabelBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 30));

        labelTitutloVisualizar1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        labelTitutloVisualizar1.setText("Registrar nuevo servicio");
        jPanelAddServicie.add(labelTitutloVisualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelBusqueda2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelBusqueda2.setText("Nombre servicio:");
        jPanelAddServicie.add(jLabelBusqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, 30));
        jPanelAddServicie.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 410, 10));

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextFieldNombre.setBorder(null);
        jPanelAddServicie.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 410, -1));
        jPanelAddServicie.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 410, 10));

        jTextFieldPrecio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextFieldPrecio.setBorder(null);
        jPanelAddServicie.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 410, -1));

        jButtonSaveData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonSave1.png"))); // NOI18N
        jButtonSaveData.setBorder(null);
        jButtonSaveData.setBorderPainted(false);
        jButtonSaveData.setContentAreaFilled(false);
        jButtonSaveData.setFocusPainted(false);
        jButtonSaveData.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonSave2.png"))); // NOI18N
        jButtonSaveData.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonSave2.png"))); // NOI18N
        jButtonSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveDataActionPerformed(evt);
            }
        });
        jPanelAddServicie.add(jButtonSaveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        getContentPane().add(jPanelAddServicie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 1070, 780));

        jPanelShowServicies.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableServicies.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTableServicies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableServicies.setCellSelectionEnabled(true);
        jTableServicies.setFocusable(false);
        jTableServicies.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTableServicies.setShowGrid(false);
        jTableServicies.setShowVerticalLines(true);
        jTableServicies.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTableServicies);

        jPanelShowServicies.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 990, 690));

        jLabelTitleV.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabelTitleV.setText("Lista de servicios");
        jPanelShowServicies.add(jLabelTitleV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonGroupTable.add(jToggleButtonDisableSV);
        jToggleButtonDisableSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/buttonDisable1.png"))); // NOI18N
        jToggleButtonDisableSV.setBorder(null);
        jToggleButtonDisableSV.setBorderPainted(false);
        jToggleButtonDisableSV.setContentAreaFilled(false);
        jToggleButtonDisableSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonDisableSV.setFocusPainted(false);
        jToggleButtonDisableSV.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/buttonDisable2.png"))); // NOI18N
        jToggleButtonDisableSV.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/buttonDisable3.png"))); // NOI18N
        jToggleButtonDisableSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonDisableSVActionPerformed(evt);
            }
        });
        jPanelShowServicies.add(jToggleButtonDisableSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 115, 50, 41));

        buttonGroupTable.add(jToggleButtonEnabledSV);
        jToggleButtonEnabledSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/buttonEnable1.png"))); // NOI18N
        jToggleButtonEnabledSV.setBorder(null);
        jToggleButtonEnabledSV.setBorderPainted(false);
        jToggleButtonEnabledSV.setContentAreaFilled(false);
        jToggleButtonEnabledSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonEnabledSV.setFocusPainted(false);
        jToggleButtonEnabledSV.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/buttonEnable2.png"))); // NOI18N
        jToggleButtonEnabledSV.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/buttonEnable3.png"))); // NOI18N
        jToggleButtonEnabledSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEnabledSVActionPerformed(evt);
            }
        });
        jPanelShowServicies.add(jToggleButtonEnabledSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 50, 41));

        getContentPane().add(jPanelShowServicies, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 1070, 780));

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroupFondo.add(jtoggleButtonVisualizar);
        jtoggleButtonVisualizar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jtoggleButtonVisualizar.setForeground(new java.awt.Color(0, 0, 0));
        jtoggleButtonVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/seeA1.png"))); // NOI18N
        jtoggleButtonVisualizar.setText("Visualizar Servicios");
        jtoggleButtonVisualizar.setBorder(null);
        jtoggleButtonVisualizar.setBorderPainted(false);
        jtoggleButtonVisualizar.setContentAreaFilled(false);
        jtoggleButtonVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtoggleButtonVisualizar.setFocusPainted(false);
        jtoggleButtonVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtoggleButtonVisualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/seeP2.png"))); // NOI18N
        jtoggleButtonVisualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/seeP3.png"))); // NOI18N
        jtoggleButtonVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtoggleButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtoggleButtonVisualizarActionPerformed(evt);
            }
        });
        jPanelFondo.add(jtoggleButtonVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, -1));

        buttonGroupFondo.add(jtoggleButtonNewService);
        jtoggleButtonNewService.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jtoggleButtonNewService.setForeground(new java.awt.Color(0, 0, 0));
        jtoggleButtonNewService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/addS1.png"))); // NOI18N
        jtoggleButtonNewService.setText("Nuevo Servicio");
        jtoggleButtonNewService.setBorder(null);
        jtoggleButtonNewService.setBorderPainted(false);
        jtoggleButtonNewService.setContentAreaFilled(false);
        jtoggleButtonNewService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtoggleButtonNewService.setFocusPainted(false);
        jtoggleButtonNewService.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtoggleButtonNewService.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/addS2.png"))); // NOI18N
        jtoggleButtonNewService.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgServicie/imgs/addS3.png"))); // NOI18N
        jtoggleButtonNewService.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtoggleButtonNewService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtoggleButtonNewServiceActionPerformed(evt);
            }
        });
        jPanelFondo.add(jtoggleButtonNewService, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, -1));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBarraCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabelBarraCabeceraMouseDragged

    private void jLabelBarraCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabelBarraCabeceraMousePressed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();
        MenuMain.menuVisible();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jtoggleButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtoggleButtonVisualizarActionPerformed
        jPanelAddServicie.setVisible(false);
        jPanelShowServicies.setVisible(true);
        jTableServicies.setModel(sm.showService());
        jLabelTitleV.setText("Listado de servicios");
    }//GEN-LAST:event_jtoggleButtonVisualizarActionPerformed

    private void jtoggleButtonNewServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtoggleButtonNewServiceActionPerformed
        jPanelAddServicie.setVisible(true);
        jPanelShowServicies.setVisible(false);
    }//GEN-LAST:event_jtoggleButtonNewServiceActionPerformed

    private void jButtonSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveDataActionPerformed
        String nombre = jTextFieldNombre.getText();
        String precio = jTextFieldPrecio.getText();
        sm.registryService(nombre, precio, true);
    }//GEN-LAST:event_jButtonSaveDataActionPerformed

    private void jToggleButtonDisableSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonDisableSVActionPerformed
        jTableServicies.setModel(sm.showServiceDisable());
        jLabelTitleV.setText("Servicios Deshabilitados");
       
    }//GEN-LAST:event_jToggleButtonDisableSVActionPerformed

    private void jToggleButtonEnabledSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEnabledSVActionPerformed
         jTableServicies.setModel(sm.showService());
        jLabelTitleV.setText("Servicios Habilitados");
    }//GEN-LAST:event_jToggleButtonEnabledSVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFondo;
    private javax.swing.ButtonGroup buttonGroupTable;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonSaveData;
    private javax.swing.JLabel jLabelBarraCabecera;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelBusqueda2;
    private javax.swing.JLabel jLabelTitleV;
    private javax.swing.JPanel jPanelAddServicie;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelShowServicies;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparatorFondo;
    private javax.swing.JTable jTableServicies;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JToggleButton jToggleButtonDisableSV;
    private javax.swing.JToggleButton jToggleButtonEnabledSV;
    private javax.swing.JToggleButton jtoggleButtonNewService;
    private javax.swing.JToggleButton jtoggleButtonVisualizar;
    private javax.swing.JLabel labelTitutloVisualizar1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPropertiesGUI() {
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanelFondo.setBackground(new Color(0xEDF0F2));
        jPanelAddServicie.setVisible(false);
        jPanelAddServicie.setBackground(Color.WHITE);
        jPanelShowServicies.setVisible(false);
        jPanelShowServicies.setBackground(Color.WHITE);
        jTableServicies.setDefaultEditor(Object.class, null);
        UIManager.put("ToolTip.background", new Color(0xEDF0F2));
        UIManager.put("ToolTip.foreground", Color.BLACK);
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 12));
        jToggleButtonDisableSV.setToolTipText("Ver servicios deshabilitados");
        jToggleButtonEnabledSV.setToolTipText("Ver servicios habilitados");
        
        createMenuHabilitar(jPopupMenu);
        createMenuDeshabilitar(jPopupMenu);
        jTableServicies.setComponentPopupMenu(jPopupMenu);
    }

    private void createMenuHabilitar(JPopupMenu jPopupMenu) {
        JMenuItem disable = new JMenuItem("Habilitar servicio");
        disable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] botones = {"Aceptar", "Cancelar"};
                int opcionElegida = JOptionPane.showOptionDialog(null, "Desea deshabilitar este servicio?", "Alerta",
                        JOptionPane.YES_NO_CANCEL_OPTION, 2, null, botones, null);
                if (opcionElegida == 0) {
                    String idServicio = jTableServicies.getModel().getValueAt(jTableServicies.getSelectedRow(), 0).toString();
                    sm.enableService(idServicio);
                    jTableServicies.setModel(sm.showService());
                } else {
                    System.out.println("Cancela cancelItem");
                }
            }
        });
        jPopupMenu.add(disable);
    }

    private void createMenuDeshabilitar(JPopupMenu jPopupMenu) {
        JMenuItem enabled = new JMenuItem("Deshabilitar servicio");
        enabled.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] botones = {"Aceptar", "Cancelar"};
                int opcionElegida = JOptionPane.showOptionDialog(null, "Desea cancelar esta cita?", "Alerta",
                        JOptionPane.YES_NO_CANCEL_OPTION, 2, null, botones, null);
                if (opcionElegida == 0) {
                    String idServicio = jTableServicies.getModel().getValueAt(jTableServicies.getSelectedRow(), 0).toString();
                    sm.disableService(idServicio);
                    jTableServicies.setModel(sm.showService());
                } else {
                    System.out.println("Cancela cancelItem");
                }
            }
        });
        jPopupMenu.add(enabled);
    }

    @Override
    public void setInicialComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
