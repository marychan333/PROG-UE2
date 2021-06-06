package trafficlight.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private Action botton1, botton2, botton3;

    ButtonListener() {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Green")) {
            botton1.setEnabled(true);
            botton2.setEnabled(false);
            botton3.setEnabled(false);
        }
        if (e.getActionCommand().equals("Yellow")) {
            botton2.setEnabled(true);
            botton1.setEnabled(false);
            botton3.setEnabled(false);
        } else {
            botton3.setEnabled(true);
            botton1.setEnabled(false);
            botton2.setEnabled(false);
        }
    }
}
