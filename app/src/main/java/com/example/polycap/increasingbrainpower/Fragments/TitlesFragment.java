//package com.example.polycap.increasingbrainpower.Fragments;
//
//import android.app.ListFragment;
//import android.content.Context;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.polycap.increasingbrainpower.MainAdapter;
//import com.example.polycap.increasingbrainpower.R;
//import com.example.polycap.increasingbrainpower.Titles;
//
//import java.util.ArrayList;
//
///**
// * Created by Polycap on 7/24/2015.
// */
//public class TitlesFragment extends ListFragment {
//
//    public static Context context;
//    private RecyclerView recyclerView;
//    private MainAdapter adapter;
//
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        getData();
//
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.title_fragment, container, false);
//        return view;
//    }
//
//
//    private void getData() {
//        ArrayList<Titles> titles = new ArrayList<>();
//        {
//            titles.add(new Titles("Breath Deep"));
//            titles.add(new Titles("Meditate"));
//            titles.add(new Titles("Sit Up Straight"));
//            titles.add(new Titles("Phosphotidyl Serine"));
//            titles.add(new Titles("Develop your intuition"));
//            titles.add(new Titles("Employ Your SubConscious while You Sleep"));
//            titles.add(new Titles("Vinpocetine"));
//            titles.add(new Titles("Rosemary"));
//            titles.add(new Titles("Gingko Biloba"));
//            titles.add(new Titles("Potential Brain Foods"));
//            titles.add(new Titles("Huperzine A"));
//            titles.add(new Titles("Listen to Mozart"));
//            titles.add(new Titles("Alpha-Lipoic Acid"));
//            titles.add(new Titles("Ask Questions"));
//            titles.add(new Titles("Make a Brainpower Plan"));
//        }
//
//        adapter = new MainAdapter(this,titles);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView = (RecyclerView) recyclerView.findViewById(R.id.my_recycler_view);
//    }
//}