package com.example.usmannoor.dchalk11.DAO;

import com.example.usmannoor.dchalk11.CoreClasses.User;
import com.example.usmannoor.dchalk11.Asynctasks.Authenticate;
import com.example.usmannoor.dchalk11.Asynctasks.Signup;

import java.sql.Connection;

/**
 * Created by Noman on 6/1/2017.
 */

/**
 * class used to handle signup and sign in funtions.
 */
public class UsersDAO {


    public Connection connection;
    public int user_ID_login = -1;
    public int signupflag=2;

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public int authenticate(String username, String password) {
        //connect_to_db();
        Authenticate authenticate = new Authenticate(username, password, this);
        authenticate.execute();

        while (user_ID_login == -1) {
        }
        return user_ID_login;


    }

    /**
     *
     * @param u
     * @return
     */
    public int signup(User u){
      Signup signup=new Signup(u,this);
        signup.execute();
        while (signupflag == 2) {

        }
        return signupflag;
    }

}
