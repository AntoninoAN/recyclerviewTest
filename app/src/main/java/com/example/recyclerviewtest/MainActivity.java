package com.example.recyclerviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<String> dataSet = generateData();

        CustomAdapter adapter = new CustomAdapter(dataSet);

        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(this);

        GridLayoutManager gridLayoutManager = new
                GridLayoutManager(this, 2);

        StaggeredGridLayoutManager staggeredGridLayoutManager
                = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        UserDetail userDetail = new UserDetail();

        Intent intent = new Intent(this, ListViewActivity.class);
        intent.putExtra("User",userDetail);
        startActivity(intent);
    }

    public List<String> generateData(){
        List<String> dataSet = new ArrayList<>();

        for(int i=0; i<1000; i++){
            dataSet.add("Item "+i);
        }
        return dataSet;
    }
}
