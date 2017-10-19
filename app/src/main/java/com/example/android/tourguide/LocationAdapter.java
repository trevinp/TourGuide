package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mResourceID;

    public LocationAdapter(Context context, ArrayList<Location> locations, int resourceID) {
        super(context, 0, locations);
        mResourceID = resourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Location currentLocation = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textViewName);
        nameTextView.setText(currentLocation.getName());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.textViewLocation);
        locationTextView.setText(currentLocation.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageViewImage);
       // imageView.setImageResource(R.drawable.)
        return listItemView;
    }
}
