package com.example.polycap.increasingbrainpower;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.polycap.increasingbrainpower.Activity.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Polycap on 7/30/2015.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    List<Titles> title;


    public MainAdapter() {
        super();
        title = new ArrayList<>();
        Titles gridtitles = new Titles();
        gridtitles.setTitles("Breath Deep");
        gridtitles.setThumbnail(R.drawable.breathdeep);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Meditate");
        gridtitles.setThumbnail(R.drawable.meditate);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Sit Up Straight");
        gridtitles.setThumbnail(R.drawable.situpstraight);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Phosphotidyl Serine");
        gridtitles.setThumbnail(R.drawable.phosphatidylserine);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Develop Intuition");
        gridtitles.setThumbnail(R.drawable.intuition);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Use Subconscious");
        gridtitles.setThumbnail(R.drawable.subconsciousmind);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Vinpocetine");
        gridtitles.setThumbnail(R.drawable.vinpocetine);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Rosemary");
        gridtitles.setThumbnail(R.drawable.rosemary);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Gingko Biloba");
        gridtitles.setThumbnail(R.drawable.ginkgoleaves);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Brain Foods");
        gridtitles.setThumbnail(R.drawable.brainfoods);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Huperzine A");
        gridtitles.setThumbnail(R.drawable.huperzinea);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Listen to Mozart");
        gridtitles.setThumbnail(R.drawable.calmmozarton);
        title.add(gridtitles);

        gridtitles = new Titles();
        gridtitles.setTitles("Alpha-Lipoic Acid");
        gridtitles.setThumbnail(R.drawable.alphalipoicacid);
        title.add(gridtitles);


        gridtitles = new Titles();
        gridtitles.setTitles("Ask Questions");
        gridtitles.setThumbnail(R.drawable.askquestion);
        title.add(gridtitles);


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_titles, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int i) {
        Titles current = title.get(i);
        holder.title.setText(current.getTitles());
        holder.imgThumbnail.setImageResource(current.getThumbnail());
        holder.row.setOnClickListener(holder);

    }


    @Override
    public int getItemCount() {
        return title.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imgThumbnail;
        TextView title;
        View row;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textView);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            row = itemView.findViewById(R.id.row);
        }


        @Override
        public void onClick(View view) {
            view.getContext().startActivity(new Intent(view.getContext(), DetailsActivity.class));

        }
    }


}
