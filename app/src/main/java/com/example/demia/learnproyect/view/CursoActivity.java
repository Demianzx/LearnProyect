package com.example.demia.learnproyect.view;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.view.fragments.CursoLectura;
import com.example.demia.learnproyect.view.fragments.CursoTest;
import com.example.demia.learnproyect.view.fragments.IntroCurso;
import com.example.demia.learnproyect.view.fragments.Resultado;

public class CursoActivity extends AppCompatActivity {

    CursoLectura cursoLectura=new CursoLectura();
    CursoTest cursoTest=new CursoTest();
    Resultado resultado=new Resultado();
    IntroCurso introCurso=new IntroCurso();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);
        transicionFragment(introCurso);
    }
    public void transicionFragment(android.support.v4.app.Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
    }
}
