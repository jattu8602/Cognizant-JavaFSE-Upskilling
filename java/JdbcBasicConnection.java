import java.sql.*;

/**
 * Exercise 31: Basic JDBC Connection
 * 
 * Setup instructions:
 * 1. Add MySQL JDBC driver to classpath: mysql-connector-java-x.x.x.jar
 * 2. Create a database and table:
 *    CREATE DATABASE IF NOT EXISTS testdb;
 *    USE testdb;
 *    CREATE TABLE students (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), grade VARCHAR(2));
 *    INSERT INTO students (name, grade) VALUES ('Alice', 'A'), ('Bob', 'B');
 * 3. Update DB_URL, USER, PASSWORD below.
 */
public class JdbcBasicConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " (" + rs.getString("grade") + ")");
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
