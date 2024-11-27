package edu.bushnell;

import java.awt.Font;
import javax.swing.*;
public class GUI {
    public static JLabel text(String textStr, int x, int y, int width, int height, int fontSize) {
        JLabel label = new JLabel(textStr);
        label.setBounds(x, y, width, height);
        label.setFont(new Font("Sans-Serif", Font.BOLD, fontSize));
        return label;
    }
    public static JButton button(String textStr, int x, int y, int width, int height, int fontSize) {
        JButton button = new JButton(textStr);
        button.setBounds(x, y, width, height);
        button.setFont(new Font("Sans-Serif", Font.BOLD, fontSize));
        return button;
    }
}
