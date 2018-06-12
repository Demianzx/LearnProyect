package com.example.demia.learnproyect.view;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.view.fragments.CursoLectura;
import com.example.demia.learnproyect.view.fragments.CursoTest;
import com.example.demia.learnproyect.view.fragments.IntroCurso;
import com.example.demia.learnproyect.view.fragments.Resultado;

public class CursoActivity extends AppCompatActivity {


    IntroCurso introCurso;


   FragmentManager fragmentManager =getFragmentManager();
   FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
   String titulo;
   String descripcion;
   String picture;


    //IntroCurso introCurso= new IntroCurso();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String titulo=getIntent().getExtras().getString("titulo");
        String descripcion=getIntent().getExtras().getString("descripcion");
        String picture=getIntent().getExtras().getString("picture");
        String explicacion=getIntent().getExtras().getString("explicacion");
        String pregunta=getIntent().getExtras().getString("pregunta");
        String respuesta1=getIntent().getExtras().getString("respuesta1");
        String respuesta2=getIntent().getExtras().getString("respuesta2");
        String respuesta3=getIntent().getExtras().getString("respuesta3");
        String correcta=getIntent().getExtras().getString("correcta");
        setContentView(R.layout.activity_curso);
        introCurso=new IntroCurso(titulo,descripcion,picture,explicacion,pregunta,respuesta1,respuesta2,respuesta3,correcta);
        //fragmentTransaction.add(R.id.container);
        transicionFragment(introCurso);
    }
    public void transicionFragment(android.support.v4.app.Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
    }
}
