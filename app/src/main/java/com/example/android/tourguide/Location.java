package com.example.android.tourguide;

public class Location {

    private String mName;
    private String mAddress;
    private int mResourceID;

    public int getResourceID() {
        return mResourceID;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }


    public Location(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public Location(String name, String address, int resourceid) {
        mName = name;
        mAddress = address;
        mResourceID = resourceid;
    }
}
