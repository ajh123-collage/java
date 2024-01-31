package uk.minersonline.java_college;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example window");

        frame.setLocation(new Point(100, 100));
        frame.setPreferredSize(new Dimension(900, 900));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(10,10));
        frame.getContentPane().add(mainPanel);
        mainPanel.add(new JTextField());
        mainPanel.add(new JButton("Option 1"));
        mainPanel.add(new JButton("Option 2"));
        mainPanel.add(new JButton("Option 3"));
        mainPanel.add(new JButton("Option 4"));
        mainPanel.add(new JButton("Option 5"));


        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}