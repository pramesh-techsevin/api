package com.example.api;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.api.network.ApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ContactAdapter contactAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactAdapter = new ContactAdapter(this);

        recyclerView =findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(contactAdapter);

        loadContactList();


    }


    private void loadContactList() {

        Call<ContactModel> call = ApiClient.getApiInterface().getContactList();

       final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait while we get list..");
        progressDialog.show();


        call.enqueue(new Callback<ContactModel>() {
            @Override
            public void onResponse(Call<ContactModel> call, Response<ContactModel> response) {

                if(response.isSuccessful())
                {
                    Log.d("check","data = "+ response.body());

                    List<ContactDetailsModel> contactDetailsModelList = new ArrayList<>();
                    contactDetailsModelList = response.body().getContacdetailsmodel();
                    contactAdapter.addList(contactDetailsModelList);

                    progressDialog.dismiss();
                }else {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onFailure(Call<ContactModel> call, Throwable t) {

                if(!call.isCanceled())
                {
                    progressDialog.dismiss();
                    Toast.makeText(MainActivity.this, "Check Internet,something went wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
