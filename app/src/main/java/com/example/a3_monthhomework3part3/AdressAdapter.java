package com.example.a3_monthhomework3part3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdressAdapter extends RecyclerView.Adapter<AdressViewHolder> {
    private ArrayList<String> dataAdress;

    public AdressAdapter(ArrayList<String> dataAdress) {
        this.dataAdress = dataAdress;
    }

    @NonNull
    @Override
    public AdressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdressViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adress, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdressViewHolder holder, int position) {
        holder.bind(dataAdress.get(position));
    }

    @Override
    public int getItemCount() {
        return dataAdress.size();
    }
}
