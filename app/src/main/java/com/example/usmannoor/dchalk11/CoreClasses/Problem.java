package com.example.usmannoor.dchalk11.CoreClasses;

/**
 * Created by Noman on 5/31/2017.
 */

public class Problem {
   private String pictureblob;
    private  Double lat;
    private Double lon;
    private boolean status;


    public String getPictureblob() {
        return pictureblob;
    }

    public void setPictureblob(String pictureblob) {
        this.pictureblob = pictureblob;
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
}
