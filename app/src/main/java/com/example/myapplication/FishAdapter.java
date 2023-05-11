package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FishAdapter extends RecyclerView.Adapter<FishAdapter.ViewHolder>{

    private final List<FIsh> fishes;
    private final LayoutInflater inflater;

    public FishAdapter(List<FIsh> fishes, Context context) {
        this.fishes = fishes;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.f01, parent, false    );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FIsh fIsh = fishes.get(position);
        holder.fishview.setImageResource(fIsh.getFishRes());
        holder.nameView.setText(fIsh.getName());
        holder.descriotionView.setText(fIsh.getDescription());
        holder.populationView.setText(fIsh.getPopulation());

    }

    @Override
    public int getItemCount() {
        return fishes.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder {


        final ImageView fishview;
        final TextView nameView, descriotionView, populationView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fishview = itemView.findViewById(R.id.imageView);
            nameView = itemView.findViewById(R.id.textView2);
            descriotionView = itemView.findViewById(R.id.textView3);
            populationView = itemView.findViewById(R.id.textView4);
        }
    }
}
