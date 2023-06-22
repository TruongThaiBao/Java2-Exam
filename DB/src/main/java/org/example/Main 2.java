package org.example;

import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Insert(95,5,5,"Hello");
        Delete.Delete(1);
        Update.Update(1,5,"Hello2");
    }
    public static void Insert(int id, int pdid, int quantity, String email){
        Connection conn = ConnectDBSingleTon.getInstance();
        try {
            System.out.println("Connected to database!");
            String sql = "INSERT INTO test(OrderID,ProductID,Quantity,Email) VALUES (?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setInt(2,pdid);
            statement.setInt(3,quantity);
            statement.setString(4,email);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                System.out.println("Insert Successful");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}