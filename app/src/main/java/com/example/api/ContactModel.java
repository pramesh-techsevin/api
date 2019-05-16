package com.example.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContactModel {

    @SerializedName("contacts")
    private List<ContactDetailsModel> contacdetailsmodel;

    public ContactModel(List<ContactDetailsModel> contacdetailsmodel) {
        this.contacdetailsmodel = contacdetailsmodel;
    }

    public List<ContactDetailsModel> getContacdetailsmodel() {
        return contacdetailsmodel;
    }

    public void setContacdetailsmodel(List<ContactDetailsModel> contacdetailsmodel) {
        this.contacdetailsmodel = contacdetailsmodel;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "contacdetailsmodel=" + contacdetailsmodel +
                '}';
    }
}


