package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.layout.tour_list;

public class KidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tour_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.fairyland),getString(R.string.fairyland_location)));
        locations.add(new Location(getString(R.string.farm),getString(R.string.farm_location)));
        locations.add(new Location(getString(R.string.pump),getString(R.string.pump_location)));
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
