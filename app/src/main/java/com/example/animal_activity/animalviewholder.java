package com.example.animal_activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class animalviewholder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView sound;
    private ImageView image;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public animalviewholder(@NonNull View itemView,ItemClickListener itemClickListener){
        super(itemView);
        this.itemClickListener=itemClickListener;
        initviews(itemView);
    }

    public void initviews(View itemView){
        name=itemView.findViewById(R.id.name);
        sound=itemView.findViewById(R.id.sound);
        image=itemView.findViewById(R.id.img);
        relativeLayout=itemView.findViewById(R.id.relat);
    }

    public void setData(Animal animal){
        name.setText(animal.getName() + "");
        sound.setText(animal.getSound() + "");
        image.setImageResource(animal.getImage());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onitemClicked(animal,getAdapterPosition());


            }
        });


    }

}
