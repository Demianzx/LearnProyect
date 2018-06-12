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
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.demia.learnproyect.R;



@SuppressLint("ValidFragment")
public class CursoTest extends Fragment {

    Button button;
    Resultado resultado;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;

    String pregunta;
    String respuesta1;
    String respuesta2;
    String respuesta3;
    int correcto;
    boolean acertado=false;

    public CursoTest(String pregunta, String respuesta1, String respuesta2, String respuesta3, String correcto) {
        //this.resultado = resultado;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.correcto = Integer.parseInt(correcto);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_curso_test, container, false);
        r1=(RadioButton)view.findViewById(R.id.opcionRespuesta1);
        r2=(RadioButton)view.findViewById(R.id.opcionrespuesta2);
        r3=(RadioButton)view.findViewById(R.id.opcionRespuesta3);

        TextView preguntaTV=(TextView)view.findViewById(R.id.curso_test_pregunta);
        preguntaTV.setText(pregunta);
        TextView respuesta1TV=(TextView)view.findViewById(R.id.textoRespuesta1);
        respuesta1TV.setText(respuesta1);
        TextView respuesta2TV=(TextView)view.findViewById(R.id.textoRespuesta2);
        respuesta2TV.setText(respuesta2);
        TextView respuesta3TV=(TextView)view.findViewById(R.id.textoRespuesta3);
        respuesta3TV.setText(respuesta3);



        if(r1.isChecked()==true){
            r2.setChecked(false);
            r3.setChecked(false);
        }else if(r2.isChecked()==true){
            r1.setChecked(false);
            r3.setChecked(false);
        }else{
            r1.setChecked(false);
            r2.setChecked(false);
        }




        button =(Button) view.findViewById(R.id.siguientePaginaTest);//inflater.inflate(R.layout.fragment_intro_curso,container,false).findViewById(R.id.classButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado=new Resultado(acertado);
                transicionFragment(resultado);
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    public void transicionFragment(android.support.v4.app.Fragment fragment){
        getFragmentManager().beginTransaction().replace(R.id.container,fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .addToBackStack(null).commit();
    }
}
