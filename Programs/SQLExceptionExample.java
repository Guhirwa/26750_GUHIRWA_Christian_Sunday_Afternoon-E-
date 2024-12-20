package Programs;
/*
 * Exception: SQLException
 * Description: Simulates a database connection failure by attempting to connect
 *              to a non-existent database.
 * Approach: Uses DriverManager to attempt a connection and catches the SQLException.
 */

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempts to connect to a non-existent database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentDB", "user", "password");
        } catch (java.sql.SQLException e) {
            // Catches and handles the SQLException
            System.out.println("SQLException caught: Database error occurred. " + e.getMessage());
        }
    }
}

