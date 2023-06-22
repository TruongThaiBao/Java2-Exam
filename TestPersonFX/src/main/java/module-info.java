module com.example.testpersonfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testpersonfx to javafx.fxml;
    exports com.example.testpersonfx;
}