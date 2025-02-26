package gui;

import javax.swing.*;
import java.awt.*;

public class Component extends MainPanel {

    public Component() {
        super("Keyshop Shop");
        GuiComponent();
    }

    private void GuiComponent() {
        //create keyboard name label
        JLabel kbName = new JLabel("Name");

        //position
        kbName.setBounds(100,10,100,30);

        //font color
        kbName.setForeground(CommonConstant.TEXT_COLOR);

        //font size
        kbName.setFont(new Font("Segoe UI",Font.BOLD,14));

        //center text
        kbName.setHorizontalAlignment(SwingConstants.LEFT);

        //add to gui
        add(kbName);

        //create KEYBOARD SHOP text
        JLabel kbBrand = new JLabel("KEYBOARD SHOP");
        kbBrand.setBounds(450,5,400,30);
        kbBrand.setForeground(CommonConstant.kbHEADER_COLOR);
        kbBrand.setFont(new Font("Junkshop LaekLai",Font.PLAIN,30));
        kbBrand.setHorizontalAlignment(SwingConstants.CENTER);
        add(kbBrand);

        //create keyboard name text field
        JTextField kbNameBox = new JTextField();
        kbNameBox.setBounds(250,10,150,25);
        kbNameBox.setBackground(CommonConstant.BOX_COLOR);
        kbNameBox.setForeground(CommonConstant.TEXT_COLOR);
        kbNameBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbNameBox);

        //create keyboard brand label
        JLabel kbHEADER = new JLabel("Brand");
        kbHEADER.setBounds(100,60,100,30);
        kbHEADER.setForeground(CommonConstant.TEXT_COLOR);
        kbHEADER.setFont(new Font("Segoe UI",Font.BOLD,14));
        kbHEADER.setHorizontalAlignment(SwingConstants.LEFT);
        add(kbHEADER);

        //create keyboard brand text field
        JTextField kbBrandBox = new JTextField();
        kbBrandBox.setBounds(250,60,150,25);
        kbBrandBox.setBackground(CommonConstant.BOX_COLOR);
        kbBrandBox.setForeground(CommonConstant.TEXT_COLOR);
        kbBrandBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbBrandBox);

        //create keyboard layout label
        JLabel kbLayout = new JLabel("Layout");
        kbLayout.setBounds(100,110,100,30);
        kbLayout.setForeground(CommonConstant.TEXT_COLOR);
        kbLayout.setFont(new Font("Segoe UI",Font.BOLD,14));
        kbLayout.setHorizontalAlignment(SwingConstants.LEFT);
        add(kbLayout);

        //create keyboard layout box
        JTextField kbLayoutBox = new JTextField();
        kbLayoutBox.setBounds(250,110,150,25);
        kbLayoutBox.setBackground(CommonConstant.BOX_COLOR);
        kbLayoutBox.setForeground(CommonConstant.TEXT_COLOR);
        kbLayoutBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbLayoutBox);

        //create keyboard switch label
        JLabel kbSwitch = new JLabel("Switch Type");
        kbSwitch.setBounds(100,160,100,30);
        kbSwitch.setForeground(CommonConstant.TEXT_COLOR);
        kbSwitch.setFont(new Font("Segoe UI",Font.BOLD,14));
        kbSwitch.setHorizontalAlignment(SwingConstants.LEFT);
        add(kbSwitch);

        //create keyboard switch box
        JTextField kbSwitchBox = new JTextField();
        kbSwitchBox.setBounds(250,160,150,25);
        kbSwitchBox.setBackground(CommonConstant.BOX_COLOR);
        kbSwitchBox.setForeground(CommonConstant.TEXT_COLOR);
        kbSwitchBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbSwitchBox);

        //create keyboard connection label
        JLabel kbConnection = new JLabel("Connection Type");
        kbConnection.setBounds(100,210,200,30);
        kbConnection.setForeground(CommonConstant.TEXT_COLOR);
        kbConnection.setFont(new Font("Segoe UI",Font.BOLD,14));
        kbConnection.setHorizontalAlignment(SwingConstants.LEFT);
        add(kbConnection);

        //create keyboard connection box
        JTextField kbConnectionBox = new JTextField();
        kbConnectionBox.setBounds(250,210,150,25);
        kbConnectionBox.setBackground(CommonConstant.BOX_COLOR);
        kbConnectionBox.setForeground(CommonConstant.TEXT_COLOR);
        kbConnectionBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbConnectionBox);

        //create keyboard price label
        JLabel kbPrice = new JLabel("Price");
        kbPrice.setBounds(100,260,200,30);
        kbPrice.setForeground(CommonConstant.TEXT_COLOR);
        kbPrice.setFont(new Font("Segoe UI",Font.BOLD,14));
        kbPrice.setHorizontalAlignment(SwingConstants.LEFT);
        add(kbPrice);

        //create keyboard connection box
        JTextField kbPriceBox = new JTextField();
        kbPriceBox.setBounds(250,260,150,25);
        kbPriceBox.setBackground(CommonConstant.BOX_COLOR);
        kbPriceBox.setForeground(CommonConstant.TEXT_COLOR);
        kbPriceBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbPriceBox);

        //create keyboard stock label
        JLabel kbStock = new JLabel("Stock");
        kbStock.setBounds(100,310,200,30);
        kbStock.setForeground(CommonConstant.TEXT_COLOR);
        kbStock.setFont(new Font("Segoe UI",Font.BOLD,14));
        kbStock.setHorizontalAlignment(SwingConstants.LEFT);
        add(kbStock);

        //create keyboard connection box
        JTextField kbStockBox = new JTextField();
        kbStockBox.setBounds(250,310,150,25);
        kbStockBox.setBackground(CommonConstant.BOX_COLOR);
        kbStockBox.setForeground(CommonConstant.TEXT_COLOR);
        kbStockBox.setFont(new Font("Segoe UI",Font.PLAIN,14));
        add(kbStockBox);

        //create add button
        JButton addButton = new JButton("Add");
        addButton.setFont(new Font("Segoe UI",Font.BOLD,14));

        //change cursor to hand when hover over button
        addButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        addButton.setBackground(CommonConstant.ADDBUTTON_COLOR);
        addButton.setForeground(Color.BLACK);
        addButton.setBounds(80,370,100,25);
        add(addButton);

        //create delete button
        JButton delButton = new JButton("Delete");
        delButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        delButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delButton.setBackground(CommonConstant.DELETEBUTTON_COLOR);
        delButton.setForeground(Color.BLACK);
        delButton.setBounds(190,370,100,25);
        add(delButton);

        //create clear button
        JButton editButton = new JButton("Clear");
        editButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        editButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        editButton.setBackground(Color.GRAY);
        editButton.setForeground(Color.BLACK);
        editButton.setBounds(300,370,100,25);
        add(editButton);
    }
}
