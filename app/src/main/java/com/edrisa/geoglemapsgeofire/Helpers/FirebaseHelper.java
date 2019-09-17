package com.edrisa.geoglemapsgeofire.Helpers;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseHelper {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    public FirebaseHelper(String reference){
        this.firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = firebaseDatabase.getReference(reference);
    }

    public DatabaseReference getDatabaseReference() {
        return databaseReference;
    }
}
