package com.example.sacha.tp_mob;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sacha on 12/12/2018.
 */

public class NameAdapteur extends RecyclerView.Adapter<NameViewHolder> {

    List<String> nameList;

    public NameAdapteur() {
        nameList = new ArrayList<>();
    }

    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);

        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder nameViewHolder, int i) {
        nameViewHolder.setContent(nameList.get(i));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void updateData(List<String> nameList){
        this.nameList.clear();
        this.nameList.addAll(nameList);

        notifyDataSetChanged();
    }
}
