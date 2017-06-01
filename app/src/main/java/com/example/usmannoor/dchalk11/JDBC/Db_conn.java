package com.example.usmannoor.dchalk11.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_conn {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://foxi.wuffhost.ovh/noman_sc_project";
    //  Database credentials
    static final String USER = "noman_JAVA";
    static final String PASS = "!@#$1234";

    Connection conn;

    public Connection Connect() {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //STEP 3: Open a connection
        System.out.println("------------------------Connecting to database...");
        try {
            this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println(this.conn + "------------------------Connected to database...");

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return conn;

    }


}
