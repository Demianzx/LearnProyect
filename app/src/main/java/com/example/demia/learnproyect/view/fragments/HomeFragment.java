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
        //showToolbar("Inicio",false,view);
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
        pictures.add(new Picture("https://cdn.hispantv.com/hispanmedia/files/images/thumbnail/20180108/09101417_xl.jpg", "Algebra Lineal","4 dias","5"));
        pictures.add(new Picture("https://dev-res.thumbr.io/libraries/45/01/lib/1370151995235.jpg?size=854x493s&ext=jpg", "Calculo Diferencial","8 dias","2"));
        pictures.add(new Picture("http://moodle.ciep.cga.udg.mx/pluginfile.php/748/course/overviewfiles/banner-calculo-diferencial.png", "Calculo Vectorial","2 dias","1"));
        pictures.add(new Picture("http://cdn2.wallpapersok.com/uploads/picture/627/62627/differencialnye-uravneniya.jpg", "Calculo Integral","3 dias","4"));
        pictures.add(new Picture("http://conceptodefinicion.de/wp-content/uploads/2014/07/Qu%C3%ADmica3-300x183.jpg", "Quimica","7 dias","7"));
        return pictures;
    }
    /*public void showToolbar(String title, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);

        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);



    }*/
}
