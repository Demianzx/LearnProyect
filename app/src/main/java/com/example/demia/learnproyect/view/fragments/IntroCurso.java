package com.example.demia.learnproyect.view.fragments;


import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.adapter.PictureAdapterRecyclerView;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class IntroCurso extends Fragment {

    TextView titulo;
    TextView descripcion;
    String tituloS;
    String descripcionS;
    Button button;
    ImageView imageView;
    String picture;
    String explicacion;
    String pregunta;
    String respuesta1;
    String respuesta2;
    String respuesta3;
    String correcto;

    CursoLectura cursoLectura;

    //@SuppressLint("ValidFragment")
    public IntroCurso(String titulo,String descripcionS,String picture,String explicacion,String pregunta, String respuesta1,String respuesta2, String respuesta3,String correcto) {
        this.tituloS=titulo;
        this.descripcionS=descripcionS;
        this.picture=picture;
        this.explicacion=explicacion;
        this.pregunta=pregunta;
        this.respuesta1=respuesta1;
        this.respuesta2=respuesta2;
        this.respuesta3=respuesta3;
        this.correcto=correcto;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_intro_curso, container, false);
        titulo=(TextView) view.findViewById(R.id.classTittle);
        titulo.setText(tituloS);
        descripcion=(TextView)view.findViewById(R.id.classDescription);
        descripcion.setText(descripcionS);
        imageView=(ImageView)view.findViewById(R.id.classPicture);
        Picasso.get().load(picture).into(imageView);
        cursoLectura=new CursoLectura(explicacion,pregunta,respuesta1,respuesta2,respuesta3,correcto);
        button =(Button) view.findViewById(R.id.classButton);//inflater.inflate(R.layout.fragment_intro_curso,container,false).findViewById(R.id.classButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               transicionFragment(cursoLectura);
            }
        });

/*
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
*/

        return view;
    }
    public void transicionFragment(android.support.v4.app.Fragment fragment){
        getFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
    }

}
