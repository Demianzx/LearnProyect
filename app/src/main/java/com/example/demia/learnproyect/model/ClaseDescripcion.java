package com.example.demia.learnproyect.model;

/**
 * Created by demia on 11/06/2018.
 */

public class ClaseDescripcion {
    private String titulo;
    private String picture;
    private String descripcion;

    public ClaseDescripcion(String titulo, String picture, String descripcion) {

        this.titulo = titulo;
        this.picture = picture;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
