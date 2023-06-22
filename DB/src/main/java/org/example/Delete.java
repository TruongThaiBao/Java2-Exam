package org.example;

import java.sql.*;

public class Delete {

    public static void Delete(int id){
        Connection conn = ConnectDBSingleTon.getInstance();
        try {
            String sql = "DELETE FROM test WHERE OrderID = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println("Connected to database!");
            ResultSet resultset = statement.executeQuery("SELECT * FROM test");
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
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