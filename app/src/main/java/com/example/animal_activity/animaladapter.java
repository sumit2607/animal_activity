package com.example.animal_activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class animaladapter extends RecyclerView.Adapter<animalviewholder> {
    private ArrayList<Animal>userlist;
    private ItemClickListener itemClickListener;

    public animaladapter(ArrayList<Animal>animalArrayList,ItemClickListener itemClickListener){
        userlist=animalArrayList;
        this.itemClickListener=itemClickListener;
    }

    @NonNull

    @Override
    public animalviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itmedesign,parent,false);
        return new animalviewholder(view,itemClickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull  animalviewholder holder, int position) {
        Animal animal=userlist.get(position);
        holder.setData(animal);
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }
}
