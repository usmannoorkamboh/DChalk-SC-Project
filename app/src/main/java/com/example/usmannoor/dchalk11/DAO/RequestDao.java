package com.example.usmannoor.dchalk11.DAO;

import android.graphics.BitmapFactory;

import com.example.usmannoor.dchalk11.Asynctasks.Get_request_feed;
import com.example.usmannoor.dchalk11.CoreClasses.Problem;
import com.example.usmannoor.dchalk11.R;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by Noman on 5/31/2017.
 */

/**
 * Gets the list of problems form db
 */
public class RequestDao{
    public ArrayList<Problem> prob=new ArrayList<Problem>();

    public int listflag   =-1;

    public ArrayList<Problem> get_data(){
        Get_request_feed get_request_feed=new Get_request_feed(this);
        get_request_feed.execute();
        while(listflag==-1){


           // System.out.print(prob.size());

        }

        prob.add(new Problem(BitmapFactory.decodeResource(null, R.drawable.camerabutton),12.0,12.0,false));
        prob.add(new Problem(BitmapFactory.decodeResource(null, R.drawable.bg),12.0,12.0,false));
        prob.add(new Problem(BitmapFactory.decodeResource(null, R.drawable.bg),12.0,12.0,false));
        prob.add(new Problem(BitmapFactory.decodeResource(null, R.drawable.bg),12.0,12.0,false));



        return prob;
    }


}
