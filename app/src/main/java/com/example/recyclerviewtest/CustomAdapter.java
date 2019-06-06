package com.example.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CustomAdapter
        extends RecyclerView.Adapter<CustomViewHolder> {

    private List<String> dataSet;

    public CustomAdapter(List<String> dataSet) {
        this.dataSet = dataSet;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout,
                        viewGroup,
                        false);
        CustomViewHolder customViewHolder = new CustomViewHolder(view);
        return customViewHolder;

//        return new CustomViewHolder(
//                LayoutInflater
//                        .from(viewGroup.getContext())
//                        .inflate(
//                                R.layout.item_layout,
//                            viewGroup,
//                false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        customViewHolder.tv_counting.setText(dataSet.get(i));
    }

    @Override
    public int getItemCount() {
        return dataSet != null ? dataSet.size() : 0;
    }
}
