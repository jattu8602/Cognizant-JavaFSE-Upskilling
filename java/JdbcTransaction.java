import java.sql.*;

/**
 * Exercise 33: Transaction Handling in JDBC
 * Simulates a money transfer between two accounts.
 * 
 * Setup: CREATE TABLE accounts (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), balance DECIMAL(10,2));
 * INSERT INTO accounts (name, balance) VALUES ('Alice', 1000), ('Bob', 500);
 * Update DB_URL, USER, PASSWORD.
 */
public class JdbcTransaction {
    static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "password";

    static void transfer(int fromId, int toId, double amount) {
        String debit = "UPDATE accounts SET balance = balance - ? WHERE id = ? AND balance >= ?";
        String credit = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            conn.setAutoCommit(false);
            try (PreparedStatement psDebit = conn.prepareStatement(debit);
                 PreparedStatement psCredit = conn.prepareStatement(credit)) {
                psDebit.setDouble(1, amount);
                psDebit.setInt(2, fromId);
                psDebit.setDouble(3, amount);
                int rows = psDebit.executeUpdate();
                if (rows == 0) throw new SQLException("Insufficient balance");
                psCredit.setDouble(1, amount);
                psCredit.setInt(2, toId);
                psCredit.executeUpdate();
                conn.commit();
                System.out.println("Transfer successful: $" + amount + " from account " + fromId + " to " + toId);
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transfer failed, rolled back: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        transfer(1, 2, 200);
    }
}
