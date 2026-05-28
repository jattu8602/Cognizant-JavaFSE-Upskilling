import java.sql.*;

/**
 * Exercise 32: Insert and Update Operations in JDBC
 * StudentDAO with PreparedStatement.
 * 
 * Setup: see JdbcBasicConnection.java for DB setup.
 * Update DB_URL, USER, PASSWORD to match your environment.
 */
class StudentDAO {
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    void insertStudent(String name, String grade) {
        String sql = "INSERT INTO students (name, grade) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, grade);
            ps.executeUpdate();
            System.out.println("Inserted: " + name);
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    void updateStudent(int id, String name, String grade) {
        String sql = "UPDATE students SET name = ?, grade = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, grade);
            ps.setInt(3, id);
            int rows = ps.executeUpdate();
            System.out.println("Updated " + rows + " row(s).");
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }
}

public class JdbcInsertUpdate {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent("Charlie", "A");
        dao.updateStudent(1, "Alice Johnson", "A+");
    }
}
