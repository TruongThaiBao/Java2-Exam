module com.example.ex10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex10 to javafx.fxml;
    exports com.example.ex10;
}