module com.example.ex7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex7 to javafx.fxml;
    exports com.example.ex7;
}