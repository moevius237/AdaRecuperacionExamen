package Examen2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection conn;
    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbrecuperacion","root","admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConn() {
        return conn;
    }

    public DatabaseConnection() {
    }
}
