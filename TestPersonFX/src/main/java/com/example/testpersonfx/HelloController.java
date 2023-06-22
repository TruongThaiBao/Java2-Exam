package com.example.testpersonfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, Integer> idColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> addressColumn;
    @FXML
    private TableColumn<Person, String> cityColumn;

    @FXML
    private TextField idField, lastNameField, firstNameField, addressField, cityField;


    @FXML
    protected void onHelloButtonClick() {
        Person person = new Person();
        person.setLastName(lastNameField.getText());
        person.setFirstName(firstNameField.getText());
        person.setAddress(addressField.getText());
        person.setCity(cityField.getText());

        PreparedStatement preparedStatement = null;
        try {
            Connection conn = Conect.getInstance();
            System.out.println("Connected to database!");
            String sql = "INSERT INTO Person(LastName, FirstName, Address, City) VALUES (?,?,?,?)";
            preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, person.getLastName());
            preparedStatement.setString(2, person.getFirstName());
            preparedStatement.setString(3, person.getAddress());
            preparedStatement.setString(4, person.getCity());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Insert Successful");
                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                personTable.getItems().add(person);
                if (generatedKeys.next()) {
                    int generatedId = generatedKeys.getInt(1);
                    person.setPersonID(generatedId);
                }
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

    @FXML
    protected void onDeleteButtonClick() {
        Person selectedPerson = personTable.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            int personID = selectedPerson.getPersonID();
            CRUD.Delete(personID);
            personTable.getItems().remove(selectedPerson);
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("personID"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        cityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));

        ObservableList<Person> personList = FXCollections.observableArrayList();
        personTable.setItems(personList);

        try {
            ResultSet resultSet = CRUD.read("Person");
            while (resultSet.next()) {
                int id = resultSet.getInt("PersonID");
                String lastName = resultSet.getString("LastName");
                String firstName = resultSet.getString("FirstName");
                String address = resultSet.getString("Address");
                String city = resultSet.getString("City");

                Person person = new Person(id, lastName, firstName, address, city);
                personList.add(person);
            }
        } catch (SQLException e) {
            System.out.println("Failed to fetch data from the database.");
            e.printStackTrace();
        }
    }
}
