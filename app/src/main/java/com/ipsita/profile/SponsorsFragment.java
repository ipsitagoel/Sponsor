package com.ipsita.profile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class SponsorsFragment extends Fragment {
    View v;
    private RecyclerView myrecyclerview;

    private List<Event> lstevent;
    private List<Combo_prof> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_sponsors, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerview2);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstevent);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;
    }
}
