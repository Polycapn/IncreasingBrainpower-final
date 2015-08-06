package com.example.polycap.increasingbrainpower.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.polycap.increasingbrainpower.R;
import com.example.polycap.increasingbrainpower.Titles;

/**
 * Created by Polycap on 7/24/2015.
 */
@SuppressWarnings("ALL")
public class DetailsActivity extends AppCompatActivity {
    private static final String EXTRA_NAME = "details_activity";

    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_cards);

        Intent intent = getIntent();
        final String detailsTitle = intent.getStringExtra(EXTRA_NAME);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(detailsTitle);

        loadBackdrop();


    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(Titles.getRandompicture()).centerCrop().into(imageView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {

            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);

    }
}
