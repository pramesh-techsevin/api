package com.example.api;

import com.google.gson.annotations.SerializedName;

public class ContactDetailsModel {


    @SerializedName("phone")
    private PhoneModel phonemodel;

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("address")
    private String address;

    @SerializedName("gender")
    private String gender;

    public ContactDetailsModel() {
    }

    public ContactDetailsModel(String id, String name, String email, String address, String gender, PhoneModel phonemodel) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phonemodel = phonemodel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PhoneModel getPhonemodel() {
        return phonemodel;
    }

    public void setPhonemodel(PhoneModel phonemodel) {
        this.phonemodel = phonemodel;
    }

    @Override
    public String toString() {
        return "ContactDetailsModel{" +
                "phonemodel=" + phonemodel +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
