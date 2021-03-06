package com.padcmyanmar.padc7.nna.eventbrite.eventbrite_assignment.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.padcmyanmar.padc7.nna.eventbrite.eventbrite_assignment.R;
import com.padcmyanmar.padc7.nna.eventbrite.eventbrite_assignment.view.adapters.EventAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvEvent = findViewById(R.id.rv_event);
        rvEvent.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false));

        EventAdapter eventAdapter = new EventAdapter();
        rvEvent.setAdapter(eventAdapter);

    }


}
