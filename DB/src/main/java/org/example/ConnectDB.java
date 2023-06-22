package org.example;

import java.sql.*;

public class ConnectDB {
    public static Connection getConnetion() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return conn;
    }

}