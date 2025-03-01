package gui;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {
    //constructor
    public MainPanel(String title) {
        //set title
        super(title);
        //gui size
        setSize(854,480);

        //close on exit
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //absolute layout
        setLayout(null);

        //load gui in center
        setLocationRelativeTo(null);

        //no resize
        setResizable(false);

        //background color
        getContentPane().setBackground(ColorCode.BG_COLOR);
    }
}
