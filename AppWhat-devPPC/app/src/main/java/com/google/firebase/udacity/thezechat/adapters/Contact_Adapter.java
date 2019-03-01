package com.google.firebase.udacity.thezechat.adapters;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.udacity.thezechat.models.Contact_AppWhat;

import java.util.List;

public class Contact_Adapter extends RecyclerView.Adapter<Contact_Adapter.ContactViewHolder> {

    List<Contact_AppWhat> contactAppWhatList ;

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImage ;
        TextView profileNom ;
        TextView dernierTexte ;
        TextView dateContact ;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.ImageProfile) ;
            profileNom = itemView.findViewById(R.id.NomContact) ;
            dernierTexte = itemView.findViewById(R.id.DernierTxt) ;
            dateContact = itemView.findViewById(R.id.Date) ;
        }
    }

    public Contact_Adapter (List<Contact_AppWhat> listeContact) {
        this.contactAppWhatList = listeContact ;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_view, viewGroup, false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(view) ;
        return contactViewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        Contact_AppWhat contactAppWhat = contactAppWhatList.get(i) ;
        contactViewHolder.profileNom.setText(contactAppWhat.getPrenom() + " " + contactAppWhat.getNom());
        contactViewHolder.dernierTexte.setText(contactAppWhat.getDernierTexte());
        contactViewHolder.dateContact.setText(contactAppWhat.getDateDernierContact());
        contactViewHolder.profileImage.setImageResource(contactAppWhat.getImageProfile());
    }

    @Override
    public int getItemCount() {
        return contactAppWhatList.size();
    }
}
