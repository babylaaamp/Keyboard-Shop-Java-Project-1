package gui;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Make visible
                new Component().setVisible(true);
            }
        });
    }
}