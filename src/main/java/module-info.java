module com.example.javafx_acceso_bbdd_jdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_acceso_bbdd_jdbc to javafx.fxml;
    exports com.example.javafx_acceso_bbdd_jdbc;
}