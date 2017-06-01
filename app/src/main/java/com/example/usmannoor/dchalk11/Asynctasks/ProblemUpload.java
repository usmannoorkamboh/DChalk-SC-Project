package com.example.usmannoor.dchalk11.Asynctasks;

import android.os.AsyncTask;
import android.widget.ImageView;

import com.example.usmannoor.dchalk11.BO.ProblemDao;
import com.example.usmannoor.dchalk11.CoreClasses.Problem;

/**
 * Created by Noman on 6/1/2017.
 */

public class ProblemUpload extends AsyncTask {
    int user_id;
    ImageView imgview;
    Double lat;
    Double lon;
    ProblemDao pdao;
    public ProblemUpload(int userid, double lat, Double lon, ImageView imgview, ProblemDao problemDao) {
        this.user_id = userid;
        this.lat = lat;
        this.lon = lon;
        this.imgview = imgview;
    pdao=problemDao;

    }

    @Override
    protected Object doInBackground(Object[] objects) {


        return null;
    }
}
