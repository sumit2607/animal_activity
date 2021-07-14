package com.example.animal_activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Animal>animalArrayList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        animaladapter animaladapter=new animaladapter(animalArrayList,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animaladapter);
    }

    private void initData() {
        animalArrayList =new ArrayList<>();
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));
        animalArrayList.add(new Animal("mongus","meo",R.drawable.downloadpuppy));



    }
    public void onitemClicked(Animal animal,int position){
        new AlertDialog.Builder(this)
                .setTitle("hey message is")
                .setMessage(
                        animal.getName()+"\n"
                        +animal.getSound()+"\n"
                ).show();


    }


}