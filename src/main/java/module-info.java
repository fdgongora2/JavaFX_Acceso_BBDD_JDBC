module com.example.javafx_acceso_bbdd_jdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.mariadb.jdbc;
    requires java.sql;


    opens com.example.javafx_acceso_bbdd_jdbc to javafx.fxml;
    exports com.example.javafx_acceso_bbdd_jdbc;
}