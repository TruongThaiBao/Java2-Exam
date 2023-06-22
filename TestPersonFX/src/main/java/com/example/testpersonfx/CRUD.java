package com.example.testpersonfx;

import java.sql.*;

public class CRUD {
    private static Connection conn = Conect.getInstance();

    public static ResultSet read(String table) {
        ResultSet rs;
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM " + table;
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public static void Insert(int id, String lastName, String firstName, String address, String city) {
        try {
            System.out.println("Connected to database!");
            String sql = "INSERT INTO Person(PersonID, LastName, FirstName, Address, City) VALUES (?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, lastName);
            statement.setString(3, firstName);
            statement.setString(4, address);
            statement.setString(5, city);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Insert Successful");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

    public static void Delete(int id) {
        try {
            String sql = "DELETE FROM Person WHERE PersonID = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println("Connected to database!");
            ResultSet resultset = statement.executeQuery("SELECT * FROM Person");
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

    public static void Update(int id, String lastName, String firstName, String address, String city) {
        try {
            String sql = "UPDATE Person SET LastName = ?, FirstName = ?, Address = ?, City = ?  WHERE PersonID = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            System.out.println("Connected to database!");
            statement.setString(1, lastName);
            statement.setString(2, firstName);
            statement.setString(3, address);
            statement.setString(4, city);
            statement.setInt(5, id);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

    public static void outputAll() {
        Statement statement = null;
        try {
            Connection connection = Conect.getInstance();
            System.out.println("Connected to database!");
            statement = connection.createStatement();
            ResultSet resultset = CRUD.read("Person");
            resultset.absolute(2);
            while (resultset.next()) {
                int id = resultset.getInt("PersonID");
                String lastName = resultset.getString("LastName");
                System.out.println("ID\tLastName\tFirstName\tAddress\tCity");
                System.out.printf("%d\t", id);
                System.out.printf("%s\t\t", lastName);
                System.out.printf("%s\t\t\t", resultset.getString("FirstName"));
                System.out.printf("%s\t\t", resultset.getString("Address"));
                System.out.println(resultset.getString("City"));
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void save(Person person) throws SQLException {
        PreparedStatement preparedStatement = null;
        try {
            System.out.println("Connected to database!");
            conn = Conect.getInstance();
            String sql = "INSERT INTO Person(PersonID, LastName, FirstName, Address, City) VALUES (?,?,?,?,?)";
            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, person.getPersonID());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getFirstName());
            preparedStatement.setString(4, person.getAddress());
            preparedStatement.setString(5, person.getCity());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Insert Successful");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    public void getDataForTableView(){
//        PreparedStatement preparedStatement = null;
//        String qr = "select * from Person";
//        Connection connection = Conect.getInstance();
//        preparedStatement = connection.createStatement(qr);
//    }
}
