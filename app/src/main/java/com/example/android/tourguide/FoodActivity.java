package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.layout.tour_list;

public class FoodActivity extends AppCompatActivity {

    // test comment1
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tour_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.star),getString(R.string.star_location)));
        locations.add(new Location(getString(R.string.spices),getString(R.string.spices_location)));
        locations.add(new Location(getString(R.string.chalet),getString(R.string.chalet_location)));
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
