package com.example.cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> listCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCard = new ArrayList<>();
        listCard.add(new Card());
        listCard.add(new Card());
        listCard.add(new Card());
        listCard.add(new Card());
        listCard.add(new Card());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recCards);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(this, listCard);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setAdapter(recycleViewAdapter);
    }
}
