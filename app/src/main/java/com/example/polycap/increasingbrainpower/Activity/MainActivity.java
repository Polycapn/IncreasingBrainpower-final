package com.example.polycap.increasingbrainpower.Activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.polycap.increasingbrainpower.MainAdapter;
import com.example.polycap.increasingbrainpower.R;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    private MainAdapter adapter;
    private Toolbar toolbar;
    private static final String EXTRA_NAME = "details_activity";

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(android.support.v7.widget.Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_setting) {
            startActivity(new Intent(this, FullscreenActivity.class));
            Toast.makeText(this, "What's up Buddy :D", Toast.LENGTH_SHORT).show();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
