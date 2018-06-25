package com.example.nasir.syednasirgohary_comp304_assignment5;
/*
 * Name: Syed Nasir Gohary
 * Subject: COMP304-003
 * Assignment05
 * Centennial College
 * Date: 2018/04/
 * */
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DurhamMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durham_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.DurahMap);
        mapFragment.getMapAsync(this);

        //Reference to Buttons
        Button btnChange= (Button)findViewById(R.id.btnDType);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Changing the map types
                if(mMap.getMapType()==GoogleMap.MAP_TYPE_NORMAL){
                    mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                }

                else if(mMap.getMapType()==GoogleMap.MAP_TYPE_SATELLITE){
                    mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                } else if(mMap.getMapType()==GoogleMap.MAP_TYPE_HYBRID){
                    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                }
            }
        });
        //Reference to Buttons
        Button btnZomIn=(Button)findViewById(R.id.btnDZoomIn);
        Button btnZomOut=(Button)findViewById(R.id.btnDzoomOut);
    }

    //clickEvent for zoom-In and zoomOut
    public void onZoomView(View v){
        if (v.getId()==R.id.btnDZoomIn){
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if (v.getId()==R.id.btnDzoomOut){
            mMap.animateCamera(CameraUpdateFactory.zoomOut());
        }
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Toronto and move the camera
        LatLng durhamSixNation = new LatLng(43.942452, -78.896255);
        mMap.addMarker(new MarkerOptions().position(durhamSixNation).title("Oshawa Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.durham))).
                setSnippet("2000 Simcoe Street North Oshawa, Ontario L1H 7K4");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(durhamSixNation));

        // Add a marker in Toronto and move the camera
        LatLng durhamWhitBy = new LatLng(43.871524, -78.900611);
        mMap.addMarker(new MarkerOptions().position(durhamWhitBy).title("Whitby Campus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.durham))).
                setSnippet("1610 Champlain Ave #130 Whitby, ON L1N 9B2");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(durhamWhitBy));

        // Add a marker in Toronto and move the camera
        LatLng durhamCfood = new LatLng(43.872578, -78.902868);
        mMap.addMarker(new MarkerOptions().position(durhamCfood).title("Centre for Food").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.durham))).
                setSnippet("1604 Champlain Ave #130 Whitby, ON L1N 9B2");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(durhamCfood));

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(12f));


    }
}
