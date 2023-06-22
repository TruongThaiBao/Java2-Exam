module com.example.db {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.db to javafx.fxml;
    exports com.example.db;
}