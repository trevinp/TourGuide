package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    // test comment
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_list);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("food 1","123 Main", "food description 1"));
        locations.add(new Location("food 2","456 Main", "food description 2"));
       // WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        //listView.setAdapter(adapter);
    }
}
