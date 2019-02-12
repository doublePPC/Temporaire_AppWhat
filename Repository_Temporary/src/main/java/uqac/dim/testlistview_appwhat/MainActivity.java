package uqac.dim.testlistview_appwhat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private RecyclerView.LayoutManager layoutManager ;
    private Contact_Adapter contactAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //section hard-code pour test (création d'une liste de contact)
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
