package com.example.myvote;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView,partyView,posView,descView,desc2View,desc3View,desc4View;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview_set);
        nameView = itemView.findViewById(R.id.settings1);
        partyView = itemView.findViewById(R.id.set_des);
        posView = itemView.findViewById(R.id.current_pos);
        descView = itemView.findViewById(R.id.desc);
        desc2View = itemView.findViewById(R.id.desc2);
        desc3View = itemView.findViewById(R.id.desc3);
        desc4View = itemView.findViewById(R.id.desc4);
    }
}
