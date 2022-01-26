package com.example.washitt;
import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.IOException;
import java.security.acl.Permission;
import java.util.List;

public class Location extends AppCompatActivity {

    private Button btnGrant;

    @Override

    protected  void onCreate(Bundle savedInStanceState) {
        super.onCreate ( savedInStanceState );
        setContentView ( R.layout.location );

        if (ContextCompat.checkSelfPermission ( Location.this, Manifest.permission.ACCESS_FINE_LOCATION ) == PackageManager.PERMISSION_GRANTED) {
            startActivity ( new Intent ( Location.this,MapActivity.class ) );

            finish ();
            return;

        }

        btnGrant = findViewById ( R.id.btn_grant );
        btnGrant.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Dexter.withActivity(Location.this).withPermission ( Manifest.permission.ACCESS_FINE_LOCATION )
                        .withListener ( new PermissionListener () {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                       startActivity ( new Intent ( Location.this,MapActivity.class ) );
                        finish ();

                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {

                        if (response.isPermanentlyDenied ()){

                            AlertDialog.Builder builder = new AlertDialog.Builder ( Location.this );
                            builder.setTitle ( "Permission Denied")
                                    .setMessage ( "Permission to access device location is permanently denied. you need to go to setting to allow the permission.")
                                    .setNegativeButton ( "Cancel",null )
                                    .setPositiveButton ( "OK", new DialogInterface.OnClickListener () {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {

                                            Intent intent =new Intent ( );
                                            intent.setAction ( Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                            intent.setData ( Uri.fromParts ( "package",getPackageName (),null ) );

                                        }
                                    } )
                                    .show ();


                        } else{
                            Toast.makeText ( Location.this,"Permission Denied", Toast.LENGTH_SHORT).show ();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

                        token.continuePermissionRequest ();
                    }
                } )

                        .check ();


            }
        } );

    }

}
