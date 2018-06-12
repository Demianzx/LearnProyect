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
    private String explicacion;
    private String pregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String correcta;
    private String Resultado;

    public Picture(String picture, String userName, String time, String like_number, String descripcion, String explicacion, String pregunta, String respuesta1, String respuesta2, String respuesta3, String correcta,String resultado) {
        this.picture = picture;
        this.userName = userName;
        this.time = time;
        this.like_number = like_number;
        this.descripcion = descripcion;
        this.explicacion = explicacion;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.correcta = correcta;
        this.Resultado=resultado;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setResultado(String resultado) {
        Resultado = resultado;
    }

    public String getPicture() {
        return picture;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }
}
