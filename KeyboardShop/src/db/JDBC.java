package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/KeyboardShopGUI";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = ""; // Replace with your MySQL password

    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load MySQL JDBC driver!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void addKeyboard(String name, String brand, int switchType, String layout, int connectionType, double price, int stock) {
        try (Connection conn = getConnection()) {
            String sql = "INSERT INTO keyboard (name, brand, switch_type, key_layout, connection_type, price, stock) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, brand);
            stmt.setInt(3, switchType);
            stmt.setString(4, layout);
            stmt.setInt(5, connectionType);
            stmt.setDouble(6, price);
            stmt.setInt(7, stock);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteKeyboard(int keyboardId) {
        try (Connection conn = getConnection()) {
            String sql = "DELETE FROM keyboard WHERE keyboard_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, keyboardId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateKeyboard(int keyboardId, String name, String brand, int switchType, String layout, int connectionType, double price, int stock) {
        try (Connection conn = getConnection()) {
            String sql = "UPDATE keyboard SET name = ?, brand = ?, switch_type = ?, key_layout = ?, connection_type = ?, price = ?, stock = ? WHERE keyboard_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, brand);
            stmt.setInt(3, switchType);
            stmt.setString(4, layout);
            stmt.setInt(5, connectionType);
            stmt.setDouble(6, price);
            stmt.setInt(7, stock);
            stmt.setInt(8, keyboardId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}