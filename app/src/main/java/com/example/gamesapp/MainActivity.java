package com.example.gamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1. data
    ArrayList<GameModel> gamesList;
    //2. adapter view
    RecyclerView recyclerView;
    //3. adapter
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        gamesList=new ArrayList<GameModel>();
        gamesList.add(new GameModel(R.drawable.card1,"Horizon Chase"));
        gamesList.add(new GameModel(R.drawable.card2,"PUBG"));
        gamesList.add(new GameModel(R.drawable.card3,"Head Ball 2"));
        gamesList.add(new GameModel(R.drawable.card4,"Hooked on You"));
        gamesList.add(new GameModel(R.drawable.card5,"Fifa 2022"));
        gamesList.add(new GameModel(R.drawable.card6,"Fortnite"));
        myAdapter=new MyAdapter(this,gamesList);
        RecyclerView.LayoutManager layoutManager=new
                LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myAdapter);

    }
}