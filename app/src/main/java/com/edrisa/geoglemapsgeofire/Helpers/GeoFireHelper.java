package com.edrisa.geoglemapsgeofire.Helpers;

import android.util.Log;
import android.widget.Toast;

import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

public class GeoFireHelper {
    private static final String TAG = "GeoFireHelper";
    private GeoFire geoFire;
    private String reference;

    public void setReference(String reference) {
        this.reference = reference;
    }

    public GeoFireHelper(DatabaseReference reference){
        this.geoFire = new GeoFire(reference);
    }

    public void setLocationToFirebase(double lat, double lng){
        geoFire.setLocation(this.reference, new GeoLocation(lat, lng), new GeoFire.CompletionListener() {
            @Override
            public void onComplete(String key, DatabaseError error) {
                if(error != null){
                    Log.e(TAG, "Setting location to firebase");
                }else{
                    Log.i(TAG, "Location set successfully");
                }
            }
        });
    }
}
