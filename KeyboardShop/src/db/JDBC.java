package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/KeyboardShopGUI";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "password"; // Replace with your MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Example method to add a keyboard
    public static void addKeyboard(String name, String brand, int switchType, String layout, int connectionType, double price, int stock) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();
            String sql = "INSERT INTO keyboard (name, brand, switch_type, key_layout, connection_type, price, stock) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
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
        } finally {
            close(conn, stmt, null);
        }
    }

    // Example method to delete a keyboard by ID
    public static void deleteKeyboard(int keyboardId) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = getConnection();
            String sql = "DELETE FROM keyboard WHERE keyboard_id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, keyboardId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn, stmt, null);
        }
    }

    // Add more methods for update, select, etc.
}