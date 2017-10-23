package com.example.android.tourguide;

public class Location {

    private String mName;
    private String mAddress;
    private int mResourceID;

    public int getResourceID() {
        return mResourceID;
    }

    public void setResourceID(int mResourceID) {
        this.mResourceID = mResourceID;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
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
