/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author allec
 */
public class jComboCustom extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent com) {
        return new jComboCustom();
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/pckgPaciente/imgs/arrow.png")));
        btn.setBackground(Color.decode("#CEF8E9"));
        btn.setBorder(null);
        btn.setContentAreaFilled(true);
        return btn;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(Color.decode("#CEF8E9"));
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);    
    }    
    
    
    
    @Override
    protected ListCellRenderer createRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                list.setSelectionBackground(Color.decode("#4BC088"));
                return this;
            }
        };
    }
}
