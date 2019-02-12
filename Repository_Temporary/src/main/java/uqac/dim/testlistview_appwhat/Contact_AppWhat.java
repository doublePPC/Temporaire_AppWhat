package uqac.dim.testlistview_appwhat;

//import android.media.Image;

import android.media.Image;

public class Contact_AppWhat {
    private String nom;
    private String prenom;
    private String dernierTexte;
    private String dateDernierContact;
    private int imageId ;

    public Contact_AppWhat(String nom, String prenom, String dernierTexte, String dateDernierContact) {
        this.nom = nom;
        this.prenom = prenom;
        this.dernierTexte = dernierTexte;
        this.dateDernierContact = dateDernierContact;
        this.imageId = R.drawable.imagepardefaut ;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDernierTexte() {
        return dernierTexte;
    }

    public String getDateDernierContact() {
        return dateDernierContact;
    }

    public int getImageProfile() {
        return imageId;
    }
}
