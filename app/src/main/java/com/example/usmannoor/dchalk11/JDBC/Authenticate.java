package com.example.usmannoor.dchalk11.JDBC;

import android.os.AsyncTask;

import com.example.usmannoor.dchalk11.CoreClasses.User;

/**
 * Created by Noman on 5/31/2017.
 */

public class Authenticate extends AsyncTask{
    String uname;
    String Pass;

    Authenticate(String usernamem ,String password){


    }

    @Override
    protected Object doInBackground(Object[] objects) {
        //TODO QUERY TO JDBC TO CHECK THE USER

        return null;
    }


    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }
}
