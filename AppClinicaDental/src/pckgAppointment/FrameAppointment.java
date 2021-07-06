/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgAppointment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pckgMenu.MenuMain;

/**
 *
 * @author allec
 */
public class FrameAppointment extends javax.swing.JFrame {

    private int x, y;
    private AdminCita adminCita;

    /**
     * Creates new form FrameAppointments
     */
    public FrameAppointment() {
        initComponents();
        setPropertiesGUI();
        adminCita = new AdminCita();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toggleButtonGroup = new javax.swing.ButtonGroup();
        toggleTableButtonGroup = new javax.swing.ButtonGroup();
        jButtonMin = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jLabelBarraCabecera = new javax.swing.JLabel();
        jSeparatorFondo = new javax.swing.JSeparator();
        jPanelVerCitas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCita = new javax.swing.JTable();
        jLabelTitleV = new javax.swing.JLabel();
        jToggleButtonCancels = new javax.swing.JToggleButton();
        jToggleButtonWait = new javax.swing.JToggleButton();
        jToggleButtonChecked = new javax.swing.JToggleButton();
        jPanelAgendarCita = new javax.swing.JPanel();
        labelTitutloVisualizar1 = new javax.swing.JLabel();
        jLabel2p = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldSearching = new javax.swing.JTextField();
        jTextFieldMins = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePatients = new javax.swing.JTable();
        jLabelBusqueda1 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jButtonSave = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldHora = new javax.swing.JTextField();
        jLabelHora = new javax.swing.JLabel();
        jComboTiempo = new javax.swing.JComboBox<>();
        jLabelNotificacion = new javax.swing.JLabel();
        jPanelFondo = new javax.swing.JPanel();
        toggleButtonVisualizar = new javax.swing.JToggleButton();
        toggleButtonAgendar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/min1.png"))); // NOI18N
        jButtonMin.setBorder(null);
        jButtonMin.setBorderPainted(false);
        jButtonMin.setContentAreaFilled(false);
        jButtonMin.setFocusPainted(false);
        jButtonMin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/min2.png"))); // NOI18N
        jButtonMin.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/min2.png"))); // NOI18N
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 50, 50));

        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/exit1.png"))); // NOI18N
        jButtonClose.setBorder(null);
        jButtonClose.setBorderPainted(false);
        jButtonClose.setContentAreaFilled(false);
        jButtonClose.setFocusPainted(false);
        jButtonClose.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/exit2.png"))); // NOI18N
        jButtonClose.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/exit2.png"))); // NOI18N
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 60, 50));

        jLabelBarraCabecera.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabelBarraCabecera.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBarraCabecera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBarraCabecera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/barra.png"))); // NOI18N
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

        jPanelVerCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCita.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTableCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableCita.setCellSelectionEnabled(true);
        jTableCita.setFocusable(false);
        jTableCita.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTableCita.setShowGrid(false);
        jTableCita.setShowVerticalLines(true);
        jTableCita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableCita);

        jPanelVerCitas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 990, 690));

        jLabelTitleV.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabelTitleV.setText("Listado citas");
        jPanelVerCitas.add(jLabelTitleV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        toggleTableButtonGroup.add(jToggleButtonCancels);
        jToggleButtonCancels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttoncancel1.png"))); // NOI18N
        jToggleButtonCancels.setBorder(null);
        jToggleButtonCancels.setBorderPainted(false);
        jToggleButtonCancels.setContentAreaFilled(false);
        jToggleButtonCancels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonCancels.setFocusPainted(false);
        jToggleButtonCancels.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttoncancel2.png"))); // NOI18N
        jToggleButtonCancels.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttoncancel3.png"))); // NOI18N
        jToggleButtonCancels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCancelsActionPerformed(evt);
            }
        });
        jPanelVerCitas.add(jToggleButtonCancels, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 50, 41));

        toggleTableButtonGroup.add(jToggleButtonWait);
        jToggleButtonWait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonwait1.png"))); // NOI18N
        jToggleButtonWait.setBorder(null);
        jToggleButtonWait.setBorderPainted(false);
        jToggleButtonWait.setContentAreaFilled(false);
        jToggleButtonWait.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonWait.setFocusPainted(false);
        jToggleButtonWait.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonwait2.png"))); // NOI18N
        jToggleButtonWait.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonwait3.png"))); // NOI18N
        jToggleButtonWait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonWaitActionPerformed(evt);
            }
        });
        jPanelVerCitas.add(jToggleButtonWait, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 50, 41));

        toggleTableButtonGroup.add(jToggleButtonChecked);
        jToggleButtonChecked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonchecked1.png"))); // NOI18N
        jToggleButtonChecked.setBorder(null);
        jToggleButtonChecked.setBorderPainted(false);
        jToggleButtonChecked.setContentAreaFilled(false);
        jToggleButtonChecked.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonChecked.setFocusPainted(false);
        jToggleButtonChecked.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonchecked2.png"))); // NOI18N
        jToggleButtonChecked.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonchecked3.png"))); // NOI18N
        jToggleButtonChecked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCheckedActionPerformed(evt);
            }
        });
        jPanelVerCitas.add(jToggleButtonChecked, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 115, 50, 41));

        getContentPane().add(jPanelVerCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 1070, 780));

        jPanelAgendarCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitutloVisualizar1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        labelTitutloVisualizar1.setText("Agendar cita");
        jPanelAgendarCita.add(labelTitutloVisualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2p.setFont(new java.awt.Font("Berlin Sans FB", 0, 48)); // NOI18N
        jLabel2p.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2p.setText(":");
        jLabel2p.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelAgendarCita.add(jLabel2p, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 347, 30, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPanelAgendarCita.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 125, 410, 5));

        jTextFieldSearching.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSearchingMouseClicked(evt);
            }
        });
        jTextFieldSearching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchingKeyReleased(evt);
            }
        });
        jPanelAgendarCita.add(jTextFieldSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 410, 30));

        jTextFieldMins.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextFieldMins.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMins.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jPanelAgendarCita.add(jTextFieldMins, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 50, 30));

        jTablePatients.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePatients.setCellSelectionEnabled(true);
        jTablePatients.setFocusable(false);
        jTablePatients.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTablePatients.setShowGrid(false);
        jTablePatients.setShowVerticalLines(true);
        jTablePatients.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablePatients);

        jPanelAgendarCita.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1010, 130));

        jLabelBusqueda1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelBusqueda1.setText("Paciente:");
        jPanelAgendarCita.add(jLabelBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, 30));

        jDateChooserFecha.setDateFormatString("EEEE d MMM y");
        jDateChooserFecha.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jDateChooserFecha.setMaxSelectableDate(new java.util.Date(4102470084000L));
        jPanelAgendarCita.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 180, 30));

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonSave1.png"))); // NOI18N
        jButtonSave.setBorder(null);
        jButtonSave.setBorderPainted(false);
        jButtonSave.setContentAreaFilled(false);
        jButtonSave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonSave2.png"))); // NOI18N
        jButtonSave.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/buttonSave2.png"))); // NOI18N
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelAgendarCita.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelFecha.setText("Fecha de la cita:");
        jPanelAgendarCita.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, 30));

        jTextFieldHora.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jTextFieldHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanelAgendarCita.add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 50, 30));

        jLabelHora.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabelHora.setText("Hora de la cita:");
        jPanelAgendarCita.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 160, 30));

        jComboTiempo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jComboTiempo.setFocusable(false);
        jPanelAgendarCita.add(jComboTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 80, 30));

        jLabelNotificacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanelAgendarCita.add(jLabelNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 620, 40));

        getContentPane().add(jPanelAgendarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 1070, 780));

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toggleButtonGroup.add(toggleButtonVisualizar);
        toggleButtonVisualizar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        toggleButtonVisualizar.setForeground(new java.awt.Color(0, 0, 0));
        toggleButtonVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/seeA1.png"))); // NOI18N
        toggleButtonVisualizar.setBorder(null);
        toggleButtonVisualizar.setBorderPainted(false);
        toggleButtonVisualizar.setContentAreaFilled(false);
        toggleButtonVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggleButtonVisualizar.setFocusPainted(false);
        toggleButtonVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonVisualizar.setLabel("Visualizar Citas");
        toggleButtonVisualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/seeP2.png"))); // NOI18N
        toggleButtonVisualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/seeP3.png"))); // NOI18N
        toggleButtonVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonVisualizarActionPerformed(evt);
            }
        });
        jPanelFondo.add(toggleButtonVisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 130, -1));

        toggleButtonGroup.add(toggleButtonAgendar);
        toggleButtonAgendar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        toggleButtonAgendar.setForeground(new java.awt.Color(0, 0, 0));
        toggleButtonAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/aggA1.png"))); // NOI18N
        toggleButtonAgendar.setBorder(null);
        toggleButtonAgendar.setBorderPainted(false);
        toggleButtonAgendar.setContentAreaFilled(false);
        toggleButtonAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggleButtonAgendar.setFocusPainted(false);
        toggleButtonAgendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleButtonAgendar.setLabel("Agendar Cita");
        toggleButtonAgendar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/aggA2.png"))); // NOI18N
        toggleButtonAgendar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pckgAppointment/imgs/aggA3.png"))); // NOI18N
        toggleButtonAgendar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toggleButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleButtonAgendarActionPerformed(evt);
            }
        });
        jPanelFondo.add(toggleButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, -1));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        dispose();
        MenuMain.menuVisible();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jLabelBarraCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jLabelBarraCabeceraMouseDragged

    private void jLabelBarraCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBarraCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabelBarraCabeceraMousePressed

    private void toggleButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonVisualizarActionPerformed
        jPanelAgendarCita.setVisible(false);
        jPanelVerCitas.setVisible(true);
        jTableCita.setModel(adminCita.seeAllAppoints(0));
        jTableCita.getColumnModel().getColumn(3).setMinWidth(0);
        jTableCita.getColumnModel().getColumn(3).setMaxWidth(0);
        jTableCita.getColumnModel().getColumn(3).setWidth(0);
    }//GEN-LAST:event_toggleButtonVisualizarActionPerformed

    private void toggleButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleButtonAgendarActionPerformed
        jPanelAgendarCita.setVisible(true);
        jPanelVerCitas.setVisible(false);
        setInicialComponents();

    }//GEN-LAST:event_toggleButtonAgendarActionPerformed

    private void jToggleButtonWaitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonWaitActionPerformed
        jTableCita.setModel(adminCita.seeAllAppoints(0));
        jLabelTitleV.setText("Citas pendientes");
    }//GEN-LAST:event_jToggleButtonWaitActionPerformed

    private void jToggleButtonCheckedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCheckedActionPerformed
        jTableCita.setModel(adminCita.seeAllAppoints(1));
        jLabelTitleV.setText("Citas atendidas");
    }//GEN-LAST:event_jToggleButtonCheckedActionPerformed

    private void jToggleButtonCancelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCancelsActionPerformed
        jTableCita.setModel(adminCita.seeAllAppoints(2));
        jLabelTitleV.setText("Citas canceladas");
    }//GEN-LAST:event_jToggleButtonCancelsActionPerformed

    private void jTextFieldSearchingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSearchingMouseClicked
        Font font = new Font("Segoe UI Semilight", Font.PLAIN, 18);
        jTextFieldSearching.setText("");
        jTextFieldSearching.setForeground(Color.black);
        jTextFieldSearching.setFont(font);
    }//GEN-LAST:event_jTextFieldSearchingMouseClicked

    private void jTextFieldSearchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchingKeyReleased
        TableRowSorter<TableModel> tableFilter = new TableRowSorter<TableModel>(jTablePatients.getModel());
        jTablePatients.setRowSorter(tableFilter);
        tableFilter.setRowFilter(RowFilter.regexFilter(jTextFieldSearching.getText()));
    }//GEN-LAST:event_jTextFieldSearchingKeyReleased

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        Object[] botones = {"Aceptar", "Cancelar"};
        String dpi = "";
        int opcionElegida = JOptionPane.showOptionDialog(null, "Guardar esta nueva cita?", "Alerta",
                JOptionPane.YES_NO_CANCEL_OPTION, 2, null, botones, null);
        if (opcionElegida == 0) {
            try {
                dpi = jTablePatients.getModel().getValueAt(jTablePatients.getSelectedRow(), 0).toString();
            } catch (Exception e) {
                e.getMessage();
                JOptionPane.showMessageDialog(null, "Porfavor, selecione un paciente", "Alerta", 2);
            }
            Date fecha = jDateChooserFecha.getDate();
            String hora = jTextFieldHora.getText() + ":" + jTextFieldMins.getText()
                    + " " + jComboTiempo.getSelectedItem().toString();

            boolean bandera = adminCita.registerAppoint(fecha, hora, dpi);
            if (bandera == true) {
                jLabelNotificacion.setForeground(new Color(30, 215, 96));
                jLabelNotificacion.setText("Registro exitoso");
            } else {
                jLabelNotificacion.setForeground(Color.RED);
                jLabelNotificacion.setText("E R R O R al guardar, revise los campos");
            }
        } else {
            System.out.println("Cancelar operacion");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboTiempo;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel2p;
    private javax.swing.JLabel jLabelBarraCabecera;
    private javax.swing.JLabel jLabelBusqueda1;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNotificacion;
    private javax.swing.JLabel jLabelTitleV;
    private javax.swing.JPanel jPanelAgendarCita;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelVerCitas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorFondo;
    private javax.swing.JTable jTableCita;
    private javax.swing.JTable jTablePatients;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldMins;
    private javax.swing.JTextField jTextFieldSearching;
    private javax.swing.JToggleButton jToggleButtonCancels;
    private javax.swing.JToggleButton jToggleButtonChecked;
    private javax.swing.JToggleButton jToggleButtonWait;
    private javax.swing.JLabel labelTitutloVisualizar1;
    private javax.swing.JToggleButton toggleButtonAgendar;
    private javax.swing.ButtonGroup toggleButtonGroup;
    private javax.swing.JToggleButton toggleButtonVisualizar;
    private javax.swing.ButtonGroup toggleTableButtonGroup;
    // End of variables declaration//GEN-END:variables

    private void setPropertiesGUI() {
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0));
        jPanelFondo.setBackground(new Color(0xEDF0F2));
        jPanelAgendarCita.setVisible(false);
        jPanelAgendarCita.setBackground(Color.WHITE);
        jPanelVerCitas.setVisible(false);
        jPanelVerCitas.setBackground(Color.WHITE);
        jTableCita.setDefaultEditor(Object.class, null);
        jTablePatients.setDefaultEditor(Object.class, null);
        jComboTiempo.setBackground(Color.WHITE);

        UIManager.put("ToolTip.background", new Color(0xEDF0F2));
        UIManager.put("ToolTip.foreground", Color.BLACK);
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 12));
        jToggleButtonWait.setToolTipText("Ver citas pendientes");
        jToggleButtonChecked.setToolTipText("Ver citas atendidas");
        jToggleButtonCancels.setToolTipText("Ver citas canceladas");

        final JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cancelItem = new JMenuItem("Cancelar cita");
        cancelItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object[] botones = {"Aceptar", "Cancelar"};
                int opcionElegida = JOptionPane.showOptionDialog(null, "Desea cancelar esta cita?", "Alerta",
                        JOptionPane.YES_NO_CANCEL_OPTION, 2, null, botones, null);
                if (opcionElegida == 0) {
                    String idCita = jTableCita.getModel().getValueAt(jTableCita.getSelectedRow(), 3).toString();
                    adminCita.cancelAppoint(idCita);
                } else {
                    System.out.println("Cancela cancelItem");
                }
            }
        });
        popupMenu.add(cancelItem);
        jTableCita.setComponentPopupMenu(popupMenu);
    }

    private void setInicialComponents() {
        jTablePatients.setModel(adminCita.listPatients());
        Font font = new Font("Segoe UI Semilight", Font.ITALIC, 18);
        jTextFieldSearching.setText("Escriba DPI, Nombre o Apellido...");
        jTextFieldSearching.setForeground(new Color(153, 153, 153));
        jTextFieldSearching.setFont(font);
        jTextFieldHora.setText("");
        jTextFieldMins.setText("");
        jLabelTitleV.setText("Listado de citas");
        jDateChooserFecha.setDate(null);
        jComboTiempo.removeAllItems();
        jComboTiempo.addItem("a. m.");
        jComboTiempo.addItem("p. m.");
    }
}
