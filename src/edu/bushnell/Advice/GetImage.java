package edu.bushnell.Advice;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GetImage {
    public JLabel getImage(String filename) {
        return new JLabel(new ImageIcon(getClass().getResource("/resources/"+filename)));
    }
}
