package com.example.api;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactHolder> {


    private Context context;
    private List<ContactDetailsModel> contactDetailsModelList;


    public ContactAdapter(Context context) {
        this.context = context;
        contactDetailsModelList = new ArrayList<>();
    }

    public void addList(List<ContactDetailsModel> contactDetailsModels)
    {
        if(contactDetailsModelList!=null)
        {
            contactDetailsModelList.clear();
            notifyDataSetChanged();

            contactDetailsModelList.addAll(contactDetailsModels);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.activity_list,viewGroup,false);
        return new ContactHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder contactHolder, int position) {

        ContactDetailsModel contactDetailsmodel =  contactDetailsModelList.get(position);

        contactHolder.setDetails(contactDetailsmodel);




    }

    @Override
    public int getItemCount() {

        return contactDetailsModelList.size();
    }


    public class ContactHolder extends RecyclerView.ViewHolder {


        private TextView txtid, txtname, txtemail, txtaddress, txtgender, txtmobile, txthome, txtoffice;


        public ContactHolder(@NonNull View itemView) {
            super(itemView);
            txtid = itemView.findViewById(R.id.txtid);
            txtname = itemView.findViewById(R.id.txtname);
            txtemail=itemView.findViewById(R.id.txtemail);
            txtaddress = itemView.findViewById(R.id.txtaddress);
            txtgender = itemView.findViewById(R.id.txtgender);
            txtmobile= itemView.findViewById(R.id.txtmobile);
            txthome=itemView.findViewById(R.id.txthome);
            txtoffice = itemView.findViewById(R.id.txtoffice);
        }

        public void setDetails(ContactDetailsModel contactdetailmodel)
        {
            txtid.setText("Id :" +contactdetailmodel.getId());
            txtname.setText("Name : " +contactdetailmodel.getName());
            txtemail.setText("Email :" +contactdetailmodel.getEmail());
            txtgender.setText("Gender :" +contactdetailmodel.getGender());
            txtaddress.setText("Address :" +contactdetailmodel.getAddress());
            txtmobile.setText("Mobile : " +contactdetailmodel.getPhonemodel().getMobile());
            txthome.setText("Home : " +contactdetailmodel.getPhonemodel().getHome());
            txtoffice.setText("Office :" +contactdetailmodel.getPhonemodel().getOffice());

        }
    }


}
