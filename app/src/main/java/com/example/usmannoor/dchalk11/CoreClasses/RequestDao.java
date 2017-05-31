package com.example.usmannoor.dchalk11.CoreClasses;

import java.util.ArrayList;

/**
 * Created by Noman on 5/31/2017.
 */

public class RequestDao {
    public ArrayList<Problem> get_data(){
        ArrayList<Problem> prob=new ArrayList<Problem>();
        prob.add(new Problem("sdsada",1,12.0,12.0,false));
        prob.add(new Problem("sdsada",1,12.0,12.0,false));
        prob.add(new Problem("sdsada",1,12.0,12.0,false));
        prob.add(new Problem("sdsada",1,12.0,12.0,false));


        return prob;
    }


}
