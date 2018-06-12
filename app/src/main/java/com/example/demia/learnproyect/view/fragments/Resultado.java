package com.example.demia.learnproyect.view.fragments;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.view.BottomBar;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class Resultado extends Fragment {

Button button;
boolean correcto;

    public Resultado(boolean correcto) {
        this.correcto = correcto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultado, container, false);
        button =(Button) view.findViewById(R.id.claseFinalizar);//inflater.inflate(R.layout.fragment_intro_curso,container,false).findViewById(R.id.classButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(getActivity(), BottomBar.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
