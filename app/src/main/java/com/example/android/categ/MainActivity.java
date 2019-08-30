package com.example.android.categ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list= new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.apple, "item_1"));
        main_list.add(new Model(R.drawable.banana, "item_2"));
        main_list.add(new Model(R.drawable.beans, "item_3"));
        main_list.add(new Model(R.drawable.beetroot, "item_4"));

        adapter = new CustomAdapter(main_list,getApplicationContext());

        recyclerView.setAdapter(adapter);
    }
}









