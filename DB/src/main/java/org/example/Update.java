package org.example;

import java.sql.*;

public class Update {
    public static void Update(int id , int quantity , String email){
        Connection conn = ConnectDBSingleTon.getInstance();
        try {
            String sql = "UPDATE test SET Quantity = ? , Email = ?  WHERE OrderID = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println("Connected to database!");
            statement = conn.prepareStatement(sql);
            statement.setInt(1, quantity);
            statement.setString(2,email);
            statement.setInt(3,id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data deleted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}