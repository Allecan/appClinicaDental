/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckgPaciente;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author allec
 */
public class RoundJTextField extends JTextField {
    public RoundJTextField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
    }
}
