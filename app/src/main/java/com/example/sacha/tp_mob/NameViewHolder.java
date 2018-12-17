package com.example.sacha.tp_mob;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sacha on 12/12/2018.
 */

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;

    public NameViewHolder(@NonNull View itemView){
        super(itemView);
        textViewName = itemView.findViewById(R.id.textView_item);
    }


    public void setContent(String name){
        textViewName.setText(name);
    }
}
