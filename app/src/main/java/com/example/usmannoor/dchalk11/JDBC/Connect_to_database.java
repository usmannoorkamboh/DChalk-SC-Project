package com.example.usmannoor.dchalk11.JDBC;

import android.os.AsyncTask;

import com.example.usmannoor.dchalk11.CoreClasses.JDBC_SETUP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Noman on 5/31/2017.
 */

public class Connect_to_database extends AsyncTask {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://foxi.wuffhost.ovh/noman_sc_project";
    //  Database credentials
    static final String USER = "noman_JAVA";
    static final String PASS = "!@#$1234";
    Connection conn = null;
    JDBC_SETUP jdbc_setup=null;
    public Connect_to_database(JDBC_SETUP jdbcs){
        jdbc_setup=jdbcs;


    }


    @Override
    protected Object doInBackground(Object[] objects) {
        System.out.println("------------------------Connecting to database...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //STEP 3: Open a connection
        System.out.println("------------------------Connecting to database...");
        try {
            jdbc_setup.conn =  DriverManager.getConnection(DB_URL,USER,PASS);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(jdbc_setup.conn +"------------------------Connected to database...");


        return conn;
    }

    protected void onPostExecute(Connection conn) {
    }

}
