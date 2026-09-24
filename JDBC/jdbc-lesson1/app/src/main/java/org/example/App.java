package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    private static final String URL = "jdbc:postgresql://localhost:5432/mentorship_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1008";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            transferCredits(connection, "Raj", "Asha", 30);
        }
    }

    private static void transferCredits(Connection connection, String fromName, String toName, int amount)
            throws SQLException {
        connection.setAutoCommit(false);

        try {
            deductCredits(connection, fromName, amount);
            if (true)
                throw new RuntimeException("Simulated crash before second step!");
            addCredits(connection, toName, amount);
            connection.commit();
            System.out.println("Transfer successful: " + amount + "credits from" + fromName + "to" + toName);
        } catch (Exception e) {
            connection.rollback();
            System.out.println("Transfer failed and was rolled back. Reason:" + e.getMessage());
        } finally {
            connection.setAutoCommit(true);
        }
    }

    private static void deductCredits(Connection connection, String name, int amount) throws SQLException {
        String sql = "UPDATE students SET credits= credits- ? WHERE name=?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, amount);
            ps.setString(2, name);
            ps.executeUpdate();
        }
    }

    private static void addCredits(Connection connection, String name, int amount) throws SQLException {
        String sql = "UPDATE students SET credits=credits+ ? WHERE name=?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, amount);
            ps.setString(2, name);
            ps.executeUpdate();
        }
    }
}