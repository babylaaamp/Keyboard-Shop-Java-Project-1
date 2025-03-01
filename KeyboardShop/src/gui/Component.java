package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Component extends MainPanel {

    private JTextField kbNameBox, kbBrandBox, kbLayoutBox, kbSwitchBox, kbConnectionBox, kbPriceBox, kbStockBox;
    private JTable table;
    private DefaultTableModel tableModel;

    public Component() {
        super("Keyshop Shop");
        GuiComponent();
        loadTableData(); // Load data into the table when the GUI starts
    }

    private void GuiComponent() {
        // Create and add labels and text fields
        JLabel kbNameLabel = new JLabel("Name");
        kbNameLabel.setBounds(50, 10, 100, 30);
        kbNameLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbNameLabel);

        kbNameBox = new JTextField();
        kbNameBox.setBounds(170, 10, 200, 25);
        kbNameBox.setBackground(ColorCode.BOX_COLOR);
        kbNameBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbNameBox);

        JLabel kbBrandLabel = new JLabel("Brand");
        kbBrandLabel.setBounds(50, 50, 100, 30);
        kbBrandLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbBrandLabel);

        kbBrandBox = new JTextField();
        kbBrandBox.setBounds(170, 50, 200, 25);
        kbBrandBox.setBackground(ColorCode.BOX_COLOR);
        kbBrandBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbBrandBox);

        JLabel kbLayoutLabel = new JLabel("Layout");
        kbLayoutLabel.setBounds(50, 90, 100, 30);
        kbLayoutLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbLayoutLabel);

        kbLayoutBox = new JTextField();
        kbLayoutBox.setBounds(170, 90, 200, 25);
        kbLayoutBox.setBackground(ColorCode.BOX_COLOR);
        kbLayoutBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbLayoutBox);

        JLabel kbSwitchLabel = new JLabel("Switch Type");
        kbSwitchLabel.setBounds(50, 130, 100, 30);
        kbSwitchLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbSwitchLabel);

        kbSwitchBox = new JTextField();
        kbSwitchBox.setBounds(170, 130, 200, 25);
        kbSwitchBox.setBackground(ColorCode.BOX_COLOR);
        kbSwitchBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbSwitchBox);

        JLabel kbConnectionLabel = new JLabel("Connection Type");
        kbConnectionLabel.setBounds(50, 170, 120, 30);
        kbConnectionLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbConnectionLabel);

        kbConnectionBox = new JTextField();
        kbConnectionBox.setBounds(170, 170, 200, 25);
        kbConnectionBox.setBackground(ColorCode.BOX_COLOR);
        kbConnectionBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbConnectionBox);

        JLabel kbPriceLabel = new JLabel("Price");
        kbPriceLabel.setBounds(50, 210, 100, 30);
        kbPriceLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbPriceLabel);

        kbPriceBox = new JTextField();
        kbPriceBox.setBounds(170, 210, 200, 25);
        kbPriceBox.setBackground(ColorCode.BOX_COLOR);
        kbPriceBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbPriceBox);

        JLabel kbStockLabel = new JLabel("Stock");
        kbStockLabel.setBounds(50, 250, 100, 30);
        kbStockLabel.setForeground(ColorCode.TEXT_COLOR);
        add(kbStockLabel);

        kbStockBox = new JTextField();
        kbStockBox.setBounds(170, 250, 200, 25);
        kbStockBox.setBackground(ColorCode.BOX_COLOR);
        kbStockBox.setForeground(ColorCode.TEXT_COLOR);
        add(kbStockBox);

        // Create the table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Brand");
        tableModel.addColumn("Switch Type");
        tableModel.addColumn("Layout");
        tableModel.addColumn("Connection Type");
        tableModel.addColumn("Price");
        tableModel.addColumn("Stock");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(400, 10, 450, 200); // Reduced height
        add(scrollPane);

        // Add button
        JButton addButton = new JButton("Add");
        addButton.setBounds(50, 300, 100, 30);
        addButton.setBackground(ColorCode.ADDBUTTON_COLOR);
        addButton.setForeground(Color.BLACK);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addKeyboard();
            }
        });
        add(addButton);

        // Delete button
        JButton delButton = new JButton("Delete");
        delButton.setBounds(170, 300, 100, 30);
        delButton.setBackground(ColorCode.DELETEBUTTON_COLOR);
        delButton.setForeground(Color.BLACK);
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteKeyboard();
            }
        });
        add(delButton);

        // Clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(290, 300, 100, 30);
        clearButton.setBackground(Color.GRAY);
        clearButton.setForeground(Color.BLACK);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
        add(clearButton);

        // Update button
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(410, 300, 100, 30);
        updateButton.setBackground(Color.ORANGE);
        updateButton.setForeground(Color.BLACK);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateKeyboard();
            }
        });
        add(updateButton);

        // View Switch Types button
        JButton viewSwitchTypesButton = new JButton("Switch Types");
        viewSwitchTypesButton.setBounds(50, 350, 150, 30);
        viewSwitchTypesButton.setBackground(Color.CYAN);
        viewSwitchTypesButton.setForeground(Color.BLACK);
        viewSwitchTypesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSwitchTypes();
            }
        });
        add(viewSwitchTypesButton);

        // View Connection Types button
        JButton viewConnectionTypesButton = new JButton("Connection Types");
        viewConnectionTypesButton.setBounds(220, 350, 180, 30);
        viewConnectionTypesButton.setBackground(Color.CYAN);
        viewConnectionTypesButton.setForeground(Color.BLACK);
        viewConnectionTypesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewConnectionTypes();
            }
        });
        add(viewConnectionTypesButton);

        setVisible(true);
    }

    private void addKeyboard() {
        String name = kbNameBox.getText();
        String brand = kbBrandBox.getText();
        int switchType = Integer.parseInt(kbSwitchBox.getText());
        String layout = kbLayoutBox.getText();
        int connectionType = Integer.parseInt(kbConnectionBox.getText());
        double price = Double.parseDouble(kbPriceBox.getText());
        int stock = Integer.parseInt(kbStockBox.getText());

        db.JDBC.addKeyboard(name, brand, switchType, layout, connectionType, price, stock);
        JOptionPane.showMessageDialog(this, "Keyboard added successfully!");
        clearFields();
        loadTableData(); // Refresh the table
    }

    private void deleteKeyboard() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        int keyboardId = (int) tableModel.getValueAt(selectedRow, 0);
        db.JDBC.deleteKeyboard(keyboardId);
        JOptionPane.showMessageDialog(this, "Keyboard deleted successfully!");
        loadTableData(); // Refresh the table
    }

    private void updateKeyboard() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        int keyboardId = (int) tableModel.getValueAt(selectedRow, 0);
        String name = kbNameBox.getText();
        String brand = kbBrandBox.getText();
        int switchType = Integer.parseInt(kbSwitchBox.getText());
        String layout = kbLayoutBox.getText();
        int connectionType = Integer.parseInt(kbConnectionBox.getText());
        double price = Double.parseDouble(kbPriceBox.getText());
        int stock = Integer.parseInt(kbStockBox.getText());

        db.JDBC.updateKeyboard(keyboardId, name, brand, switchType, layout, connectionType, price, stock);
        JOptionPane.showMessageDialog(this, "Keyboard updated successfully!");
        clearFields();
        loadTableData(); // Refresh the table
    }

    private void clearFields() {
        kbNameBox.setText("");
        kbBrandBox.setText("");
        kbLayoutBox.setText("");
        kbSwitchBox.setText("");
        kbConnectionBox.setText("");
        kbPriceBox.setText("");
        kbStockBox.setText("");
    }

    private void loadTableData() {
        tableModel.setRowCount(0); // Clear existing data
        try (Connection conn = db.JDBC.getConnection()) {
            String sql = "SELECT * FROM keyboard";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("keyboard_id"),
                        rs.getString("name"),
                        rs.getString("brand"),
                        rs.getInt("switch_type"),
                        rs.getString("key_layout"),
                        rs.getInt("connection_type"),
                        rs.getDouble("price"),
                        rs.getInt("stock")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void viewSwitchTypes() {
        DefaultTableModel switchTableModel = new DefaultTableModel();
        switchTableModel.addColumn("Switch ID");
        switchTableModel.addColumn("Switch Name");

        try (Connection conn = db.JDBC.getConnection()) {
            String sql = "SELECT * FROM switch_types";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                switchTableModel.addRow(new Object[]{
                        rs.getInt("switch_id"),
                        rs.getString("switch_name")
                });
            }

            JTable switchTable = new JTable(switchTableModel);
            JScrollPane scrollPane = new JScrollPane(switchTable);
            JFrame frame = new JFrame("Switch Types");
            frame.add(scrollPane);
            frame.setSize(300, 200);
            frame.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void viewConnectionTypes() {
        DefaultTableModel connectionTableModel = new DefaultTableModel();
        connectionTableModel.addColumn("Connection ID");
        connectionTableModel.addColumn("Connection Name");

        try (Connection conn = db.JDBC.getConnection()) {
            String sql = "SELECT * FROM connection_types";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                connectionTableModel.addRow(new Object[]{
                        rs.getInt("connection_id"),
                        rs.getString("connection_name")
                });
            }

            JTable connectionTable = new JTable(connectionTableModel);
            JScrollPane scrollPane = new JScrollPane(connectionTable);
            JFrame frame = new JFrame("Connection Types");
            frame.add(scrollPane);
            frame.setSize(300, 200);
            frame.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}