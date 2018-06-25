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
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class CentennialMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centennial_map);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.CentennialMap);
        mapFragment.getMapAsync(this);

        //Reference to Buttons
        Button btnChange= (Button)findViewById(R.id.btnCType);
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
        Button btnZomIn=(Button)findViewById(R.id.btnCZoomIn);
        Button btnZomOut=(Button)findViewById(R.id.btnCzoomOut);

    }

    //clickEvent for zoom-In and zoomOut
    public void onZoomView(View v){
        if (v.getId()==R.id.btnCZoomIn){
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if (v.getId()==R.id.btnCzoomOut){
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
        //marker in Progress Compus and move the camera
        LatLng progressCompus = new LatLng(43.784401, -79.229276);
        mMap.addMarker(new MarkerOptions().position(progressCompus).title("Progress Compus").icon(BitmapDescriptorFactory.fromResource(R.mipmap.centennial))).setSnippet("941 Progress Ave, Scarborough, ON M1G 3T8");
        mMap.moveCamera(CameraUpdateFactory.newLatLng(progressCompus));
        //marker for morning side compus
        LatLng trontMorningSide= new LatLng(43.786668,-79.192882);
        mMap.addMarker(new MarkerOptions().position(trontMorningSide).title("Morning Side Compus").icon(BitmapDescriptorFactory.fromResource(R.mipmap.centennial))).setSnippet("755 Morningside Ave, Scarborough,ON M1C 4Z4");
        mMap.moveCamera(CameraUpdateFactory.newLatLng(trontMorningSide));
        //marker for Ashtonbee compuse
        LatLng ashtonbee=new LatLng(43.730703,-79.290422);
        mMap.addMarker(new MarkerOptions().position(ashtonbee).title("Ashtonbee Compus").icon(BitmapDescriptorFactory.fromResource(R.mipmap.centennial))).setSnippet("75 Ashtonbee Rd B2-11 75, Scarborough,ON M1L 4C9");
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ashtonbee));

        //marker for Center for art
        LatLng artStory= new LatLng(43.684367,-79.348863);
        mMap.addMarker(new MarkerOptions().position(artStory).title("Story Arts Compus ").icon(BitmapDescriptorFactory.fromResource(R.mipmap.centennial))).setSnippet("951 Carlaw Ave, Toronto, ON M4K 3M2");

        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(artStory));

        //marker for Center for art
        LatLng pickering= new LatLng(43.833037,-79.086306);
        mMap.addMarker(new MarkerOptions().position(pickering).title("Pickering Compus").icon(BitmapDescriptorFactory.fromResource(R.mipmap.centennial))).setSnippet("1340 Pickering Pkwy, Pickering, ON L1V");

        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pickering));


        mMap.animateCamera(CameraUpdateFactory.zoomTo(12),700, null);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(10.5f));
    }

}
