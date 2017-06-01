package com.example.usmannoor.dchalk11.Asynctasks;

import android.os.AsyncTask;

import com.example.usmannoor.dchalk11.DAO.UsersDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Noman on 5/31/2017.
 */

/**
 * CLass used to connect to the database
 */
public class Connect_to_database extends AsyncTask {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://foxi.wuffhost.ovh/noman_sc_project";
    //  Database credentials
    static final String USER = "noman_JAVA";
    static final String PASS = "!@#$1234";
/*
    static final String DB_URL = "jdbc:mysql://foxi.wuffhost.ovh/noman_test";
    //  Database credentials
    static final String USER = "noman_lollol";
    static final String PASS = "lollol";
*/

    UsersDAO usersDAO;
    Connection conn = null;

    /**
     *
     * @param ud
     */
    public Connect_to_database(UsersDAO ud){
        this.usersDAO=ud;

    }
    @Override
    protected Connection doInBackground(Object[] objects) {
        System.out.println("------------------------Connecting to database...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //STEP 3: Open a connection
        System.out.println("------------------------Connecting to database...");
        try {
            this.conn =  DriverManager.getConnection(DB_URL,USER,PASS);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(this.conn +"------------------------Connected to database...");




        if(usersDAO!=null){
            usersDAO.connection=this.conn;

        }
        return conn;
    }

    @Override
    protected void onPostExecute(Object o) {
        System.out.println(this.conn +"------------------------herere");


    }


}
