package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.layout.tour_list;

public class OutdoorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tour_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.redwood),getString(R.string.redwood_location)));
        locations.add(new Location(getString(R.string.merritt),getString(R.string.merritt_location)));
        locations.add(new Location(getString(R.string.harbor),getString(R.string.harbor_location)));
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
