package edu.bushnell;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;

public class Advice {
    public JPanel makeGUI() {
        // Create a JPanel using BoxLayout and set its size
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(300, 450));
        panel.setMaximumSize(new Dimension(300, 450));
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Set panel to a background color based on a RGB hashcode
        String bushnellBlueHashCode = "#011E40";
        Color bushnellBlue = Color.decode(bushnellBlueHashCode);
        panel.setBackground(bushnellBlue);

        // Place an image on the panel as a JLabel
        JLabel logo = new GetImage().getImage("BushnellLogo.png");
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(logo);
        panel.setVisible(true);

        // Create radio buttons
        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        JRadioButton option3 = new JRadioButton("Option 3");

        // Group the radio buttons so that only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        // Add the radio buttons and label to the panel
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);

        panel.setVisible(true);
        return panel;
    }
    
}
