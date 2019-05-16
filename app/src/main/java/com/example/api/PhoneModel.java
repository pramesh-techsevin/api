package com.example.api;

import com.google.gson.annotations.SerializedName;

public class PhoneModel {

    @SerializedName("mobile")
    private String mobile;
    @SerializedName("home")
    private String home;
    @SerializedName("office")
    private String office;

    public PhoneModel() {
    }

    public PhoneModel(String mobile, String home, String office) {
        this.mobile = mobile;
        this.home = home;
        this.office = office;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }


    @Override
    public String toString() {
        return "PhoneModel{" +
                "mobile='" + mobile + '\'' +
                ", home='" + home + '\'' +
                ", office='" + office + '\'' +
                '}';
    }
}