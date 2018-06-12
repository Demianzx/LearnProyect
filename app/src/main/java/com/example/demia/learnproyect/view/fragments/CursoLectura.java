package com.example.demia.learnproyect.view.fragments;

import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.demia.learnproyect.R;



@SuppressLint("ValidFragment")
public class CursoLectura extends Fragment {



    Button button;
    String explicacion;
    String pregunta;
    String respuesta1;
    String respuesta2;
    String respuesta3;
    String correcto;

    CursoTest cursoTest;

    @SuppressLint("ValidFragment")
    public CursoLectura(String explicacion, String pregunta, String respuesta1, String respuesta2, String respuesta3, String correcto) {
        this.explicacion = explicacion;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.correcto = correcto;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_curso_lectura, container, false);
        TextView explicacion1=(TextView)view.findViewById(R.id.curso_lectura_texto);
        explicacion1.setText(explicacion);
        cursoTest=new CursoTest(pregunta,respuesta1,respuesta2,respuesta3,correcto);

        button =(Button) view.findViewById(R.id.curso_lectura_boton);//inflater.inflate(R.layout.fragment_intro_curso,container,false).findViewById(R.id.classButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                transicionFragment(cursoTest);
            }
        });
        return view;
    }

    public void transicionFragment(android.support.v4.app.Fragment fragment){
        getFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
    }
}