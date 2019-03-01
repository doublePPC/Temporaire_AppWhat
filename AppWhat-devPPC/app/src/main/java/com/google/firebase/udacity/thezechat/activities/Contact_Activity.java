
package com.google.firebase.udacity.thezechat.activities;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.udacity.thezechat.adapters.Contact_Adapter;
import com.google.firebase.udacity.thezechat.models.Contact_AppWhat;

import java.util.ArrayList;
import java.util.List;

public class Contact_Activity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private RecyclerView.LayoutManager layoutManager ;
    private Contact_Adapter contactAdapter ;


/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_view_recycler);

        List<Contact_AppWhat> listeContact = new ArrayList<>();
        listeContact.add(new Contact_AppWhat("Kermel", "Anton", "empty", "17/01/2019"));
        listeContact.add(new Contact_AppWhat("Hann", "Ilina", "empty", "21/01/2019"));
        listeContact.add(new Contact_AppWhat("LeFrançois", "Émilie", "empty", "31/01/2019"));
        listeContact.add(new Contact_AppWhat("Turmel", "Roger", "empty", "02/02/2019"));
        listeContact.add(new Contact_AppWhat("Yltin", "Asibeth", "empty", "11/01/2019"));
        listeContact.add(new Contact_AppWhat("Cantin", "Lothaire", "empty", "29/12/2018"));
        listeContact.add(new Contact_AppWhat("Odongo", "Léa", "empty", "24/12/2018"));
        listeContact.add(new Contact_AppWhat("Odongo", "Olouf", "empty", "09/02/2019"));
        listeContact.add(new Contact_AppWhat("Waloumba", "Angeline", "empty", "10/02/2019"));
        listeContact.add(new Contact_AppWhat("Tremblay", "Éric", "empty", "31/01/2019"));

        recyclerView = findViewById(R.id.contact_recyclerview) ;
        layoutManager = new LinearLayoutManager(this) ;
        recyclerView.setLayoutManager(layoutManager) ;
        contactAdapter = new Contact_Adapter(listeContact) ;
        recyclerView.setAdapter(contactAdapter);
    }
    */

    public void Open_Activity() {
        //section hard-code pour test (création d'une liste de contact)
        //cette liste devrait être un paramètre de la méthode
        List<Contact_AppWhat> listeContact = new ArrayList<>();
        listeContact.add(new Contact_AppWhat("Kermel", "Anton", "empty", "17/01/2019"));
        listeContact.add(new Contact_AppWhat("Hann", "Ilina", "empty", "21/01/2019"));
        listeContact.add(new Contact_AppWhat("LeFrançois", "Émilie", "empty", "31/01/2019"));
        listeContact.add(new Contact_AppWhat("Turmel", "Roger", "empty", "02/02/2019"));
        listeContact.add(new Contact_AppWhat("Yltin", "Asibeth", "empty", "11/01/2019"));
        listeContact.add(new Contact_AppWhat("Cantin", "Lothaire", "empty", "29/12/2018"));
        listeContact.add(new Contact_AppWhat("Odongo", "Léa", "empty", "24/12/2018"));
        listeContact.add(new Contact_AppWhat("Odongo", "Olouf", "empty", "09/02/2019"));
        listeContact.add(new Contact_AppWhat("Waloumba", "Angeline", "empty", "10/02/2019"));
        listeContact.add(new Contact_AppWhat("Tremblay", "Éric", "empty", "31/01/2019"));

        recyclerView = findViewById(R.id.contact_recyclerview) ;
        layoutManager = new LinearLayoutManager(this) ;
        recyclerView.setLayoutManager(layoutManager) ;
        contactAdapter = new Contact_Adapter(listeContact) ;
        recyclerView.setAdapter(contactAdapter);
    }
}
