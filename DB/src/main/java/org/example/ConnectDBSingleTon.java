package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDBSingleTon {
    private static Connection instance;
    private ConnectDBSingleTon(){};
    public static Connection getInstance(){
        if (instance == null) {
            try {
                instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "");
            }
            catch (SQLException e){
                System.out.println("Failed");
            }
        }
        return instance;
    }

}
