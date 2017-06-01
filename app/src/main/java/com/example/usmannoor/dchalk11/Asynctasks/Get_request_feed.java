package com.example.usmannoor.dchalk11.Asynctasks;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Base64;

import com.example.usmannoor.dchalk11.DAO.RequestDao;
import com.example.usmannoor.dchalk11.CoreClasses.Problem;
import com.example.usmannoor.dchalk11.JDBC.Db_conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Noman on 6/1/2017.
 */

/**
 * Fetches all the data related to the problems submitted by the users
 */
public class Get_request_feed extends AsyncTask {
    RequestDao requestDao;

    /**
     *
     * @param requestDao
     */
    public Get_request_feed(RequestDao requestDao) {
        this.requestDao = requestDao;
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        Db_conn db_conn = new Db_conn();
        Connection connection = db_conn.Connect();

        PreparedStatement preparedStatement = null;
        int id = 0;


        try {


            String query = "Select * from noman_sc_project.requests";

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
                int i=0;

            if (rs.next()) {
                i++;
                System.out.print("*********"+i);

                String picture64string = rs.getString("picture");
                System.out.print(picture64string);
                byte[] bytarray = Base64.decode(picture64string, Base64.DEFAULT);
                Bitmap bmimage = BitmapFactory.decodeByteArray(bytarray, 0, bytarray.length);


                //String pictureblob, int floated_by, Double lat, Double lon, boolean status
                requestDao.prob.add(new Problem(bmimage, rs.getDouble("lat"), rs.getDouble("lon"), false));

            } else {
            }
            requestDao.listflag = 1;
           // System.out.println(rs.);
            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
