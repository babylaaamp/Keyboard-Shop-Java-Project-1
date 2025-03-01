package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Component extends MainPanel {

    private JTextField kbNameBox, kbBrandBox, kbLayoutBox, kbSwitchBox, kbConnectionBox, kbPriceBox, kbStockBox;

    public Component() {
        super("Keyshop Shop");
        GuiComponent();
    }

    private void GuiComponent() {
        // ... (existing code to create labels and text fields)

        //create add button
        JButton addButton = new JButton("Add");
        addButton.setFont(UIManager.getFont("Label.font"));
        addButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addButton.setBackground(CommonConstant.ADDBUTTON_COLOR);
        addButton.setForeground(Color.BLACK);
        addButton.setBounds(80,370,100,25);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = kbNameBox.getText();
                String brand = kbBrandBox.getText();
                int switchType = Integer.parseInt(kbSwitchBox.getText());
                String layout = kbLayoutBox.getText();
                int connectionType = Integer.parseInt(kbConnectionBox.getText());
                double price = Double.parseDouble(kbPriceBox.getText());
                int stock = Integer.parseInt(kbStockBox.getText());

                db.JDBC.addKeyboard(name, brand, switchType, layout, connectionType, price, stock);
                JOptionPane.showMessageDialog(null, "Keyboard added successfully!");
            }
        });
        add(addButton);

        //create delete button
        JButton delButton = new JButton("Delete");
        delButton.setFont(UIManager.getFont("Label.font"));
        delButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delButton.setBackground(CommonConstant.DELETEBUTTON_COLOR);
        delButton.setForeground(Color.BLACK);
        delButton.setBounds(190,370,100,25);
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int keyboardId = Integer.parseInt(JOptionPane.showInputDialog("Enter Keyboard ID to delete:"));
                db.JDBC.deleteKeyboard(keyboardId);
                JOptionPane.showMessageDialog(null, "Keyboard deleted successfully!");
            }
        });
        add(delButton);

        //create clear button
        JButton editButton = new JButton("Clear");
        editButton.setFont(UIManager.getFont("Label.font"));
        editButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        editButton.setBackground(Color.GRAY);
        editButton.setForeground(Color.BLACK);
        editButton.setBounds(300,370,100,25);
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kbNameBox.setText("");
                kbBrandBox.setText("");
                kbLayoutBox.setText("");
                kbSwitchBox.setText("");
                kbConnectionBox.setText("");
                kbPriceBox.setText("");
                kbStockBox.setText("");
            }
        });
        add(editButton);
    }
}