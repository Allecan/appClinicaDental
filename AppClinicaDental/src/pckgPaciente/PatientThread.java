package pckgPaciente;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author allec
 */
public class PatientThread extends Thread {

    int n = 3;
    int option = 0;
    JLabel label;

    public PatientThread(JLabel labelUI) {
        this.label = labelUI;
    }

    @Override
    public void run() {
        try {
            while (n != -1) {
                if (n == 0) {
                    label.setText(" ");
                    label.setIcon(null);
                    label.setVisible(false);
                } else {
                    label.setText("Registro Correcto " + "(" + String.valueOf(n) + ")");
                    n -= 1;
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
