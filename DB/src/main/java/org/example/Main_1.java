package org.example;

import java.sql.*;

public class Main_1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String password = "";
        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");
            statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM test");
            Object rs;
                while (resultset.next()){
                    int id = resultset.getInt("OrderID");
                    int idpd = resultset.getInt("ProductID");
                    int quantity = resultset.getInt("Quantity");
                    String email = resultset.getString("Email");
                    System.out.println(id);
                    System.out.println(idpd);
                }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}