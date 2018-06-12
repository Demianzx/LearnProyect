package com.example.demia.learnproyect.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demia.learnproyect.R;
import com.example.demia.learnproyect.model.ClaseDescripcion;
import com.example.demia.learnproyect.model.Picture;
import com.example.demia.learnproyect.view.CursoActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by demia on 11/06/2018.
 */

public class ClaseDescripcionAdapter {

    private ArrayList<ClaseDescripcion> pictures;
    private int resource;
    private Activity activity;

    private ImageView imagen;
    private TextView titulo;
    private TextView descripcion;
    private TextView likenumberCard;

    public ClaseDescripcionAdapter(ArrayList<ClaseDescripcion> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    public View getView(ViewGroup parent, int position){

        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);



        return view;
    }

    public int getItemCount() {
        return pictures.size();
    }




    public class PictureViewHolder extends RecyclerView.ViewHolder{


        private ImageView imagen;
        private TextView titulo;
        private TextView descripcion;
        private TextView likenumberCard;

        public PictureViewHolder(View itemView) {
            super(itemView);
            imagen        =(ImageView) itemView.findViewById(R.id.classPicture);
            titulo        =(TextView) itemView.findViewById(R.id.classTittle);
            descripcion            =(TextView) itemView.findViewById(R.id.classDescription);
           // likenumberCard      =(TextView) itemView.findViewById(R.id.likeCheckCard);
        }
    }

}
