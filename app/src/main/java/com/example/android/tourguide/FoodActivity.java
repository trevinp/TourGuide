package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.tourguide.R.layout.tour_list;

public class FoodActivity extends AppCompatActivity {

    // test comment
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(tour_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("food 1","123 Main"));
        locations.add(new Location("food 2","456 Main"));
        locations.add(new Location("food 3","789 Main"));
        LocationAdapter adapter = new LocationAdapter(this, locations, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
