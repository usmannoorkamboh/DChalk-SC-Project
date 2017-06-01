package com.example.usmannoor.dchalk11.BO;

import com.example.usmannoor.dchalk11.Asynctasks.Connect_to_database;
import com.example.usmannoor.dchalk11.CoreClasses.User;
import com.example.usmannoor.dchalk11.Asynctasks.Authenticate;
import com.example.usmannoor.dchalk11.Asynctasks.Signup;

import java.sql.Connection;

/**
 * Created by Noman on 6/1/2017.
 */

public class UsersDAO {


    public Connection connection;
    public int user_ID_login = -1;
    public int signupflag=2;
    public void connect_to_db() {
        System.out.print(connection + "+here");

        Connect_to_database connect_to_database = new Connect_to_database(this);
        connect_to_database.execute();
        while (connection == null) {

            //System.out.print("");
        }
         System.out.print(connection + "+++++++");


    }

    public int authenticate(String username, String password) {
        //connect_to_db();
        Authenticate authenticate = new Authenticate(username, password, this);
        authenticate.execute();

        while (user_ID_login == -1) {
        }
        return user_ID_login;


    }
    public int signup(User u){
      Signup signup=new Signup(u,this);
        signup.execute();
        while (signupflag == 2) {

        }
        return signupflag;
    }

}
