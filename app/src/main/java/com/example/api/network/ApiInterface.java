package com.example.api.network;

import com.example.api.ContactModel;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("contacts/")
    Call<ContactModel> getContactList();



}
