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

public class GbrowMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gbrow_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.GbrownMap);
        mapFragment.getMapAsync(this);

        //Reference to buttons
        Button btnChange= (Button)findViewById(R.id.btnGType);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //checking for switching map types.
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
        Button btnZomIn=(Button)findViewById(R.id.btnGZoomIn);
        Button btnZomOut=(Button)findViewById(R.id.btnGZoomOut);
    }
    //clickEvent for zoom-In and zoomOut
    public void onZoomView(View v){
        if (v.getId()==R.id.btnGZoomIn){
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if (v.getId()==R.id.btnGZoomOut){
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
        LatLng gbrownCasaLoma = new LatLng(43.676120, -79.410520);
        mMap.addMarker(new MarkerOptions().position(gbrownCasaLoma).title("Casa Loma Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.gbrown))).
                setSnippet("160 Kendal Ave, Toronto, ON M5R 1M3");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gbrownCasaLoma));

        // Add a marker in Toronto and move the camera
        LatLng gbrownStJames = new LatLng(43.650934, -79.370200);
        mMap.addMarker(new MarkerOptions().position(gbrownStJames).title("St. James Campus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.gbrown))).
                setSnippet("200 King St E, Toronto, ON M5A 3W8");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gbrownStJames));

        // Add a marker in Toronto and move the camera
        LatLng gbrownWaterFront = new LatLng(43.644070, -79.365427);
        mMap.addMarker(new MarkerOptions().position(gbrownWaterFront).title("Waterfront Campus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.gbrown))).
                setSnippet("51 Dockside Dr, Toronto, ON M5A 1B");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gbrownWaterFront));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14),700, null);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(12.3f));
    }
}
