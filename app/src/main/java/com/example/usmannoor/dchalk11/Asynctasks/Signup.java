package com.example.usmannoor.dchalk11.Asynctasks;

import android.os.AsyncTask;

import com.example.usmannoor.dchalk11.DAO.UsersDAO;
import com.example.usmannoor.dchalk11.CoreClasses.User;
import com.example.usmannoor.dchalk11.JDBC.Db_conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Noman on 6/1/2017.
 */

public class Signup extends AsyncTask {
    Connection conn;
    User user;
    UsersDAO usersDAO;

    /**
     *
     * @param u
     * @param ud
     */
    public Signup(User u, UsersDAO ud) {
        user = u;
        usersDAO = ud;


    }

    @Override
    protected Object doInBackground(Object[] objects) {
        Db_conn db_conn = new Db_conn();
        conn = db_conn.Connect();

        String query = "insert into noman_sc_project.User (uname,password,email,name) values('" +
                user.getUsername() +"','"+
                user.getPassword() +"','"+
                user.getEmail() +"','"+
                user.getName() + "')";
        System.out.println(query);
        //preparedStatement = connection.prepareStatement(query);

        //preparedStatement.setString(1, uname);

        //preparedStatement.setString(2, pass);
        try {
            Statement statement = conn.createStatement();

            int a = statement.executeUpdate(query);


            statement.close();
            conn.close();
            usersDAO.signupflag=a;
            return a;


        } catch (SQLException e) {
            e.printStackTrace();
        }

        //TODO JDBC SIGNUP CONnECT


        return null;
    }
}
