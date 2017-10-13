package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView food = (TextView) findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });

        TextView culture = (TextView) findViewById(R.id.culture);

        culture.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent cultureIntent = new Intent(MainActivity.this, CultureActivity.class);
                startActivity(cultureIntent);
            }
        });

        TextView kids = (TextView) findViewById(R.id.kids);

        kids.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent kidsIntent = new Intent(MainActivity.this, KidsActivity.class);
                startActivity(kidsIntent);
            }
        });

        TextView outdoors = (TextView) findViewById(R.id.outdoors);

        outdoors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent outdoorsIntent = new Intent(MainActivity.this, OutdoorsActivity.class);
                startActivity(outdoorsIntent);
            }
        });
    }
}
