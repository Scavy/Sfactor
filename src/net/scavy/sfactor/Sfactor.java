package net.scavy.sfactor;

/**
 * Created by Scavy on 22.03.2014
 *
 * Project: SFactor
 *
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Sfactor {
    public static void main(String[] arg) {
        createWindow();
    }
    private static void createWindow() {
        //Create and set up the window.
        JFrame frame = new JFrame("Scavy Simple GUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));

        JLabel textLabel = new JLabel("Test label", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        JButton closeButton = new JButton("Close");
        closeButton.setPreferredSize(new Dimension(100, 20));
        frame.getContentPane().add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
