package com.example.myvote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.partyView.setText(items.get(position).getParty());
        holder.posView.setText(items.get(position).getCurrent_pos());
        holder.descView.setText(items.get(position).getDesc());
        holder.desc2View.setText(items.get(position).getDesc2());
        holder.desc3View.setText(items.get(position).getDesc3());
        holder.desc4View.setText(items.get(position).getDesc4());
        holder.imageView.setImageResource(items.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}
