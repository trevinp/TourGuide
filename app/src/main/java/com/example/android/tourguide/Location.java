package com.example.android.tourguide;

public class Location {

    private String mName;
    private String mAddress;
    private String mDescription;

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

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }


    public Location(String name, String address, String description) {
        mName = name;
        mAddress = address;
        mDescription = description;
    }
}
