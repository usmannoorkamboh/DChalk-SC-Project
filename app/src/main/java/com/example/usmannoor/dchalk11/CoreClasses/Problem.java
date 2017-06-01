package com.example.usmannoor.dchalk11.CoreClasses;

import android.graphics.Bitmap;

/**
 * Created by Noman on 5/31/2017.
 */

/**
 * Problem
 */
public class Problem {
    Bitmap bmimage  ;
    private int floated_by;



    private  Double lat;
    private Double lon;
    private boolean status;

    /**
     *
     * @param pictureblob
     * @param lat
     * @param lon
     * @param status
     */
    public Problem(Bitmap pictureblob,  Double lat, Double lon, boolean status) {
        this.bmimage = pictureblob;
         this.lat = lat;
        this.lon = lon;
        this.status = status;
    }

    public Bitmap getBmimage() {
        return bmimage;
    }

    public void setBmimage(Bitmap bmimage) {
        this.bmimage = bmimage;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getFloated_by() {
        return floated_by;
    }

    public void setFloated_by(int floated_by) {
        this.floated_by = floated_by;
    }
}
