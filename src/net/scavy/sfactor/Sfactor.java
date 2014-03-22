package net.scavy.sfactor;

/**
 * Created by Scavy on 22.03.2014
 *
 * Project: SFactor
 *
 */

import javax.swing.*;
import java.awt.*;

public class Sfactor {
    public static void main(String[] arg) {
        createWindow();
    }
    private static void createWindow() {
            //Create and set up the window.
            JFrame frame = new JFrame("Scavy Simple GUI");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JLabel textLabel = new JLabel("Test label",SwingConstants.CENTER);
            textLabel.setPreferredSize(new Dimension(300, 100));
            frame.getContentPane().add(textLabel, BorderLayout.CENTER);

            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
    }
}
