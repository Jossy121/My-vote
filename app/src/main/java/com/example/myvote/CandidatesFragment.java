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

public class CandidatesFragment extends Fragment {


    public CandidatesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View fragmentView = inflater.inflate(R.layout.fragment_candidates, container, false);
        RecyclerView recyclerView = fragmentView.findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Donald trump", "Republican", "Business man", "Make america great again", "Health care", "Economic reforms on tax", "right to firearms", R.drawable.donald));
        items.add(new Item("Obama", "Democrats", "Us Senator District-5", "Change we can believe in", "Health care significant impact", "ObamaCare", "Consumer Protection Act", R.drawable.obama_pic));
        items.add(new Item("clinton", "Democrats", "Us Senator", "Health care significant impact", "Tax cuts", "Better School", "Human Right Protection", R.drawable.clinton));
        items.add(new Item("bush", "Republican", "US vice President", "Yes, America can", "Health care significant impact", "No child left behind act", "Education of low income and minority", R.drawable.bush));
        items.add(new Item("Donald trump", "Republican", "Business man", "Make america great again", "Health care", "Economic reforms on tax", "right to firearms", R.drawable.donald));
        items.add(new Item("Obama", "Democrats", "Us Senator District-5", "Change we can believe in", "Health care significant impact", "ObamaCare", "Consumer Protection Act", R.drawable.obama_pic));
        items.add(new Item("clinton", "Democrats", "Us Senator", "Health care significant impact", "Tax cuts", "Better School", "Human Right Protection", R.drawable.clinton));
        items.add(new Item("bush", "Republican", "US vice President", "Yes, America can", "Health care significant impact", "No child left behind act", "Education of low income and minority", R.drawable.bush));
        items.add(new Item("Donald trump", "Republican", "Business man", "Make america great again", "Health care", "Economic reforms on tax", "right to firearms", R.drawable.donald));
        items.add(new Item("Obama", "Democrats", "Us Senator District-5", "Change we can believe in", "Health care significant impact", "ObamaCare", "Consumer Protection Act", R.drawable.obama_pic));
        items.add(new Item("clinton", "Democrats", "Us Senator", "Health care significant impact", "Tax cuts", "Better School", "Human Right Protection", R.drawable.clinton));
        items.add(new Item("bush", "Republican", "US vice President", "Yes, America can", "Health care significant impact", "No child left behind act", "Education of low income and minority", R.drawable.bush));

        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new MyAdapter(requireContext(), items));

        return fragmentView;






    }

}



