package com.example.usmannoor.dchalk11.Asynctasks;

import android.os.AsyncTask;

import com.example.usmannoor.dchalk11.BO.UsersDAO;
import com.example.usmannoor.dchalk11.JDBC.Db_conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Noman on 5/31/2017.
 */

public class Authenticate extends AsyncTask {
    String uname;
    String pass;
    Connection connection;
    UsersDAO usersDAO;

    public Authenticate(String usernamem, String password, UsersDAO usersDAO) {
        uname = usernamem;
        pass = password;
        this.usersDAO = usersDAO;

    }

    @Override
    protected Object doInBackground(Object[] objects) {
        //TODO VERIFY

        Db_conn db_conn = new Db_conn();
        connection = db_conn.Connect();

        PreparedStatement preparedStatement = null;
        int id=0;


        try {


            String query = "Select id,uname from noman_sc_project.User where uname='"+uname+"' and password='"+pass+"'";
            //preparedStatement = connection.prepareStatement(query);

            //preparedStatement.setString(1, uname);

            //preparedStatement.setString(2, pass);
            Statement statement=connection.createStatement();
            ResultSet rs = statement.executeQuery(query);


            if (rs.next()) {
                String uname = rs.getString("uname");
                 id = rs.getInt("id");
                usersDAO.user_ID_login = id;
            } else {
                usersDAO.user_ID_login = -1;
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("ID="+id);
        return id;

    }


    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }
}
