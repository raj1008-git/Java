package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String URL = "jdbc:postgresql://localhost:5432/mentorship_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1008";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            List<Student> students = findAllStudents(connection);
            insertStudent(connection, "Priya", "priya@example.com");

            // READ (all)
            System.out.println("-- All students after insert --");
            printAllStudents(connection);

            // UPDATE
            updateStudentEmail(connection, "Priya", "priya.new@example.com");

            System.out.println("\n-- All students after update --");
            printAllStudents(connection);

            // DELETE
            deleteStudent(connection, "Priya");

            System.out.println("\n-- All students after delete --");
            printAllStudents(connection);
        }
    }

    private static List<Student> findAllStudents(Connection connection) throws SQLException {
        String sql = "SELECT id,name,email FROM students ORDER BY id";
        List<Student> students = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student student = mapRowToStudent(rs);
                students.add(student);
            }
        }
        return students;
    }

    private static Student mapRowToStudent(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        return new Student(id, name, email);
    }

    private static void insertStudent(Connection connection, String name, String email) throws SQLException {
        String sql = "INSERT INTO students(name,email) VALUES(?,?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, email);

            int rowsAffected = ps.executeUpdate();
            System.out.println("Inserted rows: " + rowsAffected);
        }

    }

    private static void printAllStudents(Connection connection) throws SQLException {
        String sql = "SELECT id, name,email FROM students ORDER BY id";
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.printf("ID: %d | Name: %s | Email: %s%n", rs.getInt("id"), rs.getString("name"),
                        rs.getString("email"));
            }
        }
    }

    private static void updateStudentEmail(Connection connection, String name, String newEmail) throws SQLException {
        String sql = "UPDATE students SET email=? WHERE name =?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, newEmail);
            ps.setString(2, name);

            int rowsAffected = ps.executeUpdate();
            System.out.println("\nDeleted rows: " + rowsAffected);
        }
    }

    private static void deleteStudent(Connection connection, String name) throws SQLException {
        String sql = "DELETE FROM students WHERE name=?";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, name);

            int rowsAffected = ps.executeUpdate();
            System.out.println("\nDeleted rows" + rowsAffected);
        }
    }
}