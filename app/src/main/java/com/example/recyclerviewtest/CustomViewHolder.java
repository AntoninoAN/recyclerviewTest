package com.example.recyclerviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView tv_counting;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_counting = itemView.findViewById(R.id.tv_counting);
    }
}
