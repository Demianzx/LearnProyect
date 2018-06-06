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
import com.example.demia.learnproyect.model.Picture;
import com.example.demia.learnproyect.view.CursoActivity;
import com.example.demia.learnproyect.view.fragments.IntroCurso;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by demia on 27/02/2018.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;


    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;

    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);

        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        Picture picture= pictures.get(position);
        holder.usernameCard.setText(picture.getUserName());
        holder.timeCard.setText(picture.getTime());
        holder.likenumberCard.setText(picture.getLike_number());
        Picasso.get().load(picture.getPicture()).into(holder.picture_Card);

        holder.picture_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity,CursoActivity.class);
                activity.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{


        private ImageView picture_Card;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likenumberCard;

        public PictureViewHolder(View itemView) {
            super(itemView);
            picture_Card        =(ImageView) itemView.findViewById(R.id.pictureImageCard);
            usernameCard        =(TextView) itemView.findViewById(R.id.userNameCard);
            timeCard            =(TextView) itemView.findViewById(R.id.timeCard);
            likenumberCard      =(TextView) itemView.findViewById(R.id.likeCheckCard);
        }
    }
}
