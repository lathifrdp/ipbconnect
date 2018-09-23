package com.example.lathifrdp.demoapp.model;

import com.google.gson.annotations.SerializedName;

public class UserProfile {
//    @SerializedName("photo")
//    private byte[] photo;

    @SerializedName("address")
    private String address;

    @SerializedName("mobileNumber")
    private String mobileNumber;

    @SerializedName("currentJob")
    private String currentJob;

    public UserProfile(String address, String mobileNumber, String currentJob) {
//        this.photo = photo;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.currentJob = currentJob;
    }

//    public byte[] getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(byte[] photo) {
//        this.photo = photo;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }
}
