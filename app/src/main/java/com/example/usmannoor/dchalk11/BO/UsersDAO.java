package com.example.usmannoor.dchalk11.BO;

import android.os.AsyncTask;

import com.example.usmannoor.dchalk11.Asynctasks.Connect_to_database;

import java.sql.Connection;

/**
 * Created by Noman on 6/1/2017.
 */

public class UsersDAO {


    public Connection connection;
    public void connect_to_db() {
        Connect_to_database connect_to_database=new Connect_to_database(this);
        connect_to_database.execute();
        while (connection==null){

            //System.out.print("");
        }

        System.out.print(connection+"+++++++");


    }

    public int authenticate(String username, String password){



        return 0;

    }

}
