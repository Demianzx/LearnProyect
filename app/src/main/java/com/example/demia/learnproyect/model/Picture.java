package com.example.demia.learnproyect.model;

/**
 * Created by demia on 27/02/2018.
 */

public class Picture {
    private String picture;
    private String userName;
    private String time;
    private String like_number = "0";
    private String descripcion;

    public Picture(String picture, String userName, String time, String like_number,String descripcion) {
        this.picture = picture;
        this.userName = userName;
        this.time = time;
        this.like_number = like_number;
        this.descripcion=descripcion;
    }

    public String getPicture() {
        return picture;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLike_number() {
        return like_number;
    }

    public void setLike_number(String like_number) {
        this.like_number = like_number;
    }
}
