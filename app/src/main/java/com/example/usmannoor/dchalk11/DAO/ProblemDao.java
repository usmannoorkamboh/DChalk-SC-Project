package com.example.usmannoor.dchalk11.DAO;

import android.graphics.drawable.BitmapDrawable;

import com.example.usmannoor.dchalk11.Asynctasks.ProblemUpload;

/**
 * Created by Noman on 6/1/2017.
 */

/**
 * Used to upload the problem contacts with async activities
 */
public class ProblemDao {
    public int uploadflag = -1;

    /**
     *
     * @param user_id
     * @param lat
     * @param lon
     * @param imgview
     * @return
     */
    public int upload(int user_id, Double lat, Double lon, BitmapDrawable imgview) {
        ProblemUpload problemUpload = new ProblemUpload(user_id, lat, lon, imgview, this);
        problemUpload.execute();

        while (uploadflag == -1) {


        }
        return uploadflag;
    }


}
