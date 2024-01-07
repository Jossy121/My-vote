package com.example.myvote;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter_settings extends RecyclerView.Adapter<MyViewHolder_setting>{

    Context context;
    List<Item_setting> items;


    public MyAdapter_settings(Context context, List<Item_setting> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder_setting onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder_setting(LayoutInflater.from(context).inflate(R.layout.item_view_settings,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder_setting holder, int position) {

        holder.set_desView.setText(items.get(position).getSet_des());
        holder.settingView.setText(items.get(position).getSettings1());
        holder.imageView.setImageResource(items.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
