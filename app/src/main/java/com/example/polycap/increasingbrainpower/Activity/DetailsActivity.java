package com.example.polycap.increasingbrainpower.Activity;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import com.example.polycap.increasingbrainpower.R;

/**
 * Created by Polycap on 7/24/2015.
 */
public class DetailsActivity extends AppCompatActivity {
    private static final String EXTRA_NAME = "details_activity";

    private Toolbar toolbar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity_layout);


        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        DetailsFragment detailsFragment = new DetailsFragment();
//        FragmentManager manager = getFragmentManager();
//        FragmentTransaction transaction= manager.beginTransaction();
//        transaction.add(R.id.main_detailscontent,detailsFragment,"frag");
//
//        Intent intent = getIntent();
//        final String details = intent.getStringExtra(EXTRA_NAME);
//
//        CollapsingToolbarLayout collapsingToolbarLayout =
//                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        collapsingToolbarLayout.setTitle(details);
//
//        loadBackdrop();
//
//
//    }
//
//    private void loadBackdrop() {
//        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
//        Glide.with(this).load(Titles.getRandomPic()).centerCrop().into(imageView);
//    }
//

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
