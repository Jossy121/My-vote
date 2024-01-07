package com.example.myvote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SettingsFragment extends Fragment {


    public SettingsFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View fragmentView = inflater.inflate(R.layout.fragment_settings, container, false);
        RecyclerView recyclerView = fragmentView.findViewById(R.id.recyclerview);


        List<Item_setting> items = new ArrayList<>();
        items.add(new Item_setting("Language", "click to choose a language",R.drawable.baseline_settings_24));
        items.add(new Item_setting("Language", "click to choose a language", R.drawable.baseline_help_outline_24));
        items.add(new Item_setting("Language", "click to choose a language", R.drawable.baseline_notifications_24));



        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new MyAdapter_settings(requireContext(), items));

        return fragmentView;


    }
}