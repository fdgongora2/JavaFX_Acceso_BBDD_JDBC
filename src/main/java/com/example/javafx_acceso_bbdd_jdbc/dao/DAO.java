package com.example.javafx_acceso_bbdd_jdbc.dao;

import javafx.collections.FXCollections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    private static final String db = "jdbc:mariadb://localhost:5555/noinch?useSSL=false";
    private static final String usuario = "root";
    private static final String contrasenia = "root";

    public void buildData() {

    }


}
