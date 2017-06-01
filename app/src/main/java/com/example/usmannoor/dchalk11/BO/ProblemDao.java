package com.example.usmannoor.dchalk11.BO;

import android.widget.ImageView;

import com.example.usmannoor.dchalk11.Asynctasks.ProblemUpload;
import com.example.usmannoor.dchalk11.CoreClasses.Problem;

/**
 * Created by Noman on 6/1/2017.
 */

public class ProblemDao {
    int uploadflag = -1;

    public int upload(int user_id, Double lat, Double lon, ImageView imgview) {
        ProblemUpload problemUpload = new ProblemUpload(user_id, lat, lon, imgview, this);
        problemUpload.execute();

        while (uploadflag == -1) {


        }
        return uploadflag;
    }


}
