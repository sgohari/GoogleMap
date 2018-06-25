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

public class MohawkMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private static  final LatLng MohawkCollege= new LatLng(43.238761,-79.888082);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohawk_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.MohawkMap);
        mapFragment.getMapAsync(this);

        //Reference to buttons
        Button btnChange= (Button)findViewById(R.id.btnMType);
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
        Button btnZomIn=(Button)findViewById(R.id.btnMZoomIn);
        Button btnZomOut=(Button)findViewById(R.id.btnCzoomOut);
    }
    //clickEvent for zoom-In and zoomOut
    public void onZoomView(View v){
        if (v.getId()==R.id.btnMZoomIn){
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if (v.getId()==R.id.btnMZoomOut){
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

        //Add a marker in Hamilton and move the camera
        LatLng mohakHamilton = new LatLng(43.238761,-79.888082);
        mMap.addMarker(new MarkerOptions().position(mohakHamilton).title("Fennell Compus")
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.mohawklogo)))
                .setSnippet("135 Fennell Avenue West Hamilton Ontario L9C 0E5");
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mohakHamilton));

        // Add a marker in Toronto and move the camera
        LatLng mohawkOhsweken = new LatLng(43.070805, -80.114614);
        mMap.addMarker(new MarkerOptions().position(mohawkOhsweken).title("OSTTC Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.mohawklogo))).
                setSnippet("16 Sunrise Court Ohsweken Ontario N0A1M0");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mohawkOhsweken));

        // Add a marker in Toronto and move the camera
        LatLng mohawkSixNation = new LatLng(43.151426, -80.225441);
        mMap.addMarker(new MarkerOptions().position(mohawkSixNation).title("Six Nations Polytechnic Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.mohawklogo))).
                setSnippet("2160 Fourth Line Ohsweken Ontario N0A 1M0");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mohawkSixNation));

        // Add a marker in Toronto and move the camera
        LatLng mohawkStoneyGreek = new LatLng(43.226187, -79.712838);
        mMap.addMarker(new MarkerOptions().position(mohawkStoneyGreek).title("Stoney Creek Campus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.mohawklogo))).
                setSnippet("481 Barton Street Stoney Creek Ontario L8E 2L7");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mohawkStoneyGreek));

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(30.1f));
    }
}
