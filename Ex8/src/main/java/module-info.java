module com.example.ex8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ex8 to javafx.fxml;
    exports com.example.ex8;
}