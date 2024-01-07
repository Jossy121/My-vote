package com.example.myvote;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder_setting extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView settingView,set_desView;

    public MyViewHolder_setting(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview_set);
        settingView = itemView.findViewById(R.id.settings1);
        set_desView = itemView.findViewById(R.id.set_des);
    }
}
