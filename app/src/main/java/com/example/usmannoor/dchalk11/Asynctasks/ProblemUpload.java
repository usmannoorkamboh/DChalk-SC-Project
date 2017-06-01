package com.example.usmannoor.dchalk11.Asynctasks;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.util.Base64;

import com.example.usmannoor.dchalk11.DAO.ProblemDao;
import com.example.usmannoor.dchalk11.JDBC.Db_conn;

import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Noman on 6/1/2017.
 */

/**
 * Class for uploading a problem or report
 */
public class ProblemUpload extends AsyncTask {
    int user_id;
    BitmapDrawable imgview;
    Double lat;
    Double lon;
    ProblemDao pdao;

    /**
     *
     * @param userid
     * @param lat
     * @param lon
     * @param imgview
     * @param problemDao
     */
    public ProblemUpload(int userid, double lat, Double lon, BitmapDrawable imgview, ProblemDao problemDao) {
        this.user_id = userid;
        this.lat = lat;
        this.lon = lon;
        this.imgview = imgview;
        pdao = problemDao;

    }

    @Override
    protected Object doInBackground(Object[] objects) {


        Db_conn db_conn = new Db_conn();
        Connection conn = db_conn.Connect();


        Bitmap bmp = imgview.getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        String  encoded = Base64.encodeToString(byteArray, Base64.DEFAULT);

        //System.out.println(byteArray.toString());


        try {


            String query = "insert into noman_sc_project.requests (u_id,lat,lon,picture) " +
                    "values(" + user_id + "," + lat + "," + lon + ",'" + encoded + "')";

            System.out.println(query);

            Statement statement = conn.createStatement();

            int a = statement.executeUpdate(query);


            statement.close();
            conn.close();
            pdao.uploadflag = a;
            return a;


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;
    }
}
