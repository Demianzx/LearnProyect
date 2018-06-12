package com.example.demia.learnproyect.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.adapter.PictureAdapterRecyclerView;
import com.example.demia.learnproyect.model.Picture;
import com.example.demia.learnproyect.view.BottomBar;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //showToolbar("Cursos",true);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);
        
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView= new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture,getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures (){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://cdn.hispantv.com/hispanmedia/files/images/thumbnail/20180108/09101417_xl.jpg", "Introducción a la Programación","4 dias","5","Te vamos a dar un remojón a la introducción de programación  y demás cosas sobre ella","Se llama Programación a la implementación de un algoritmo en un determinado lenguaje de programación, para realizar un programa.Algoritmo es una secuencia no ambigua, finita y ordenada de instrucciones que han de seguirse para resolver un problema.Programa (Software en inglés) es una secuencia de instrucciones que una computadora puede interpretar y ejecutar.El proceso de creación de software es materia de la ingeniería del software, una de las ramas propias de la Ingeniería Informática.Según Niklaus Wirth un programa está formado por algoritmos y estructura de datos.Se han propuesto diversas técnicas de programación, cuyo objetivo es mejorar tanto el proceso de creación de software como su mantenimiento. Entre ellas se pueden mencionar las programaciones lineal, estructurada, modular y orientada a objetos.","¿Qué es la programación?"," La implementación de un algoritmo en un determinado lenguaje de programación, para realizar un programa.","Algoritmo "," Está formado por algoritmos y estructura de datos.","3","algo"));

                pictures.add(new Picture("https://cdn.hispantv.com/hispanmedia/files/images/thumbnail/20180108/09101417_xl.jpg", "Historia de las computadoras","4 dias","5","Historia sobre las computadoras y algunos datos de ellas "," Primera Generación: Tubo de Vació (1951-1958)Para entrar en la primera generación hemos de retomar el hilo narrativo donde lo dejamos, en la eniac. Un año antes de que se lograra acabar esta computadora, se unió al equipo un matemático húngaro, John von Neumann, que estaba destinado hacer uno de los cerebros más preclaros de la investigación en este campo.Participo en los trabajos de la eniac y tuvo su ocasión de reflexionar acerca de los principios del aparato que iba a entrar en funcionamiento dentro de poco tiempo.La eniac estaba cableada y conectada de manera que pudieron realizar un tipo de cálculos. Cada vez que se quería cambiar de actividad, se debía rehacer todo el trabajo, lo cual necesitaba una previa planificación y un trabajo de varias horas.Von Neumann maduro una idea luminosa para superar estas limitaciones lógicas, agilizar las funciones y alcanzar mayor fiabilidad.Características de esta Generación: \n♠ Tubos de vacío\n♠ Grandes dimensiones\n♠ Altos consumo de energía. El voltaje de los tubos era de 300.v y la posibilidad de fundirse era grande.\n♠ Uso de tarjetas perforadas. Se utilizaba un modelo de codificación de la información originado en el siglo pasado, las tarjetas perforadas.\n♠ Almacenamiento de información en un tambor magnético interior. ","Menciona 3 Características de la primera generación :","Algoritmo","  Tubos de vacío , Grandes dimensiones ,  Altos consumo de energía. El voltaje de los tubos era de 300.v y la posibilidad de fundirse era grande. ","No lo sé", "3","algo"));

        //pictures.add(new Picture("http://moodle.ciep.cga.udg.mx/pluginfile.php/748/course/overviewfiles/banner-calculo-diferencial.png", "Historia de las computadoras","2 dias","1","Ejemplo de descripcion del curso actual"));
       // pictures.add(new Picture("http://cdn2.wallpapersok.com/uploads/picture/627/62627/differencialnye-uravneniya.jpg", "Ingenieria de software","3 dias","4","Ejemplo de descripcion del curso actual"));
        //pictures.add(new Picture("http://conceptodefinicion.de/wp-content/uploads/2014/07/Qu%C3%ADmica3-300x183.jpg", "Quimica","7 dias","7","Ejemplo de descripcion del curso actual"));
        return pictures;
    }


}
