package com.example.android.tourguide;

public class Location {

    private String mName;
    private String mAddress;

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
}
