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
        pictures.add(new Picture("https://cdn.hispantv.com/hispanmedia/files/images/thumbnail/20180108/09101417_xl.jpg", "Programacion Web","4 dias","5","Ejemplo de descripcion del curso actual","blablabla sobre el tema","Pregunta 1","Respuesta 1","Respuesta 2","Respuesta 3","3","algo"));
        pictures.add(new Picture("https://cdn.hispantv.com/hispanmedia/files/images/thumbnail/20180108/09101417_xl.jpg", "Programacion Web","4 dias","5","Te vamos a explicar que es la programación web y demás cosas sobre ella","La programación de los sitios web es una de las disciplinas dentro del mundo de Internet que más se ha desarrollado y no deja de sorprender día a día con las posibilidades que abre y genera, ya que no sólo consigue satisfacer necesidades que se generan, sino que sin la generación de necesidades ofrecen servicios a los usuarios que éstos no habían imaginado. En principio, el gran desarrollo de Internet se fundamentó en la posibilidad de enlazar a través de hipervículos diferentes páginas web lo que generó la enorme interconexión que es hoy Internet. Esta base que inició esta red, fué desarrollada y generó el lenguaje ícono de las páginas web que es HTML.Pero, como decíamos, la creatividad humana no tiene límites y lejos de contentarse con el desarrollo del lenguaje HTML, enriqueciéndolo en su sintaxis, aparecieron otro lenguajes, que a su vez desataron una reacción en cadena con respecto a las operaciones que se podían lograr en un sitio web. De esta forma, apareció el lenguaje Java, que mejoró sustancialmente la interacción con el usuario, de manera que éste anexó una sensación de amigabilidad y usabilidad en Internet, contribuyendo a que su utilización sea mayor.Los servidores, que son los vinculantes, entre nuestro sitio web y los usuarios, comenzaron a adaptarse a estas nuevas tecnologías y lenguajes y mejorar sus servicios, permitiendo que ha través de programas se pudieran generar un diálogo on line con los usuarios de forma de que éstos recibieran la información que buscaran más rápido y de forma más eficiente. De esta manera de Java nació Java Script, que ha su vez incentivó a la creación de otros lenguajes que apuntaron a el mismo objetivo como PHP, y así constantemente se están buscando mejoras y nuevas alternativas, todas que apuntan a la interacción del usuario con el sitio. Por todo esto que estamos indicando antes, la programación del sitio web tiene la misma importancia que el diseño web, no se trata de poner uno por encima de otro, los dos se complementan y hacen que la eficiencia del sitio web sea importante. Está demostrado que los sitios más visitados son los que brindan un servicio más “personalizado” al usuario y esto se logra pura y exclusivamente a través de la programación web, que a través de conocer los gustos y tendencias del usuario, utiliza estos datos para proporcionarle al mismo información que más le interesa.","¿Cómo se fundamento el principio del internet?"," En principio, el gran desarrollo de Internet se fundamentó en la posibilidad de enlazar a través de hipervículos diferentes páginas web lo que generó la enorme interconexión que es hoy Internet. ","Oie no lo ze",", la programación del sitio web tiene la misma importancia que el diseño web, no se trata de poner uno por encima de otro, los dos se complementan y hacen que la eficiencia del sitio web sea importante ","3","algo"));
        //pictures.add(new Picture("http://moodle.ciep.cga.udg.mx/pluginfile.php/748/course/overviewfiles/banner-calculo-diferencial.png", "Historia de las computadoras","2 dias","1","Ejemplo de descripcion del curso actual"));
       // pictures.add(new Picture("http://cdn2.wallpapersok.com/uploads/picture/627/62627/differencialnye-uravneniya.jpg", "Ingenieria de software","3 dias","4","Ejemplo de descripcion del curso actual"));
        //pictures.add(new Picture("http://conceptodefinicion.de/wp-content/uploads/2014/07/Qu%C3%ADmica3-300x183.jpg", "Quimica","7 dias","7","Ejemplo de descripcion del curso actual"));
        return pictures;
    }


}
