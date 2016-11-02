package com.example.akihiro.anbayasiroulette_e14c1004;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView card_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_recycler = (RecyclerView)findViewById(R.id.card_recycler);
        card_recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        card_recycler.setHasFixedSize(true);
        card_recycler.setItemAnimator(new DefaultItemAnimator());

        card_recycler.setAdapter(new RecycleAdapter(AnbayashiData.createAnbayashiDataList()));


    }
}
