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

public class SenecaMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seneca_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.SenecaMap);
        mapFragment.getMapAsync(this);


        Button btnChange= (Button)findViewById(R.id.btnSeType);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        Button btnZomIn=(Button)findViewById(R.id.btnSeZoomIn);
        Button btnZomOut=(Button)findViewById(R.id.btnSeZoomOut);
    }

    //clickEvent for zoom-In and zoomOut
    public void onZoomView(View v){
        if (v.getId()==R.id.btnSeZoomIn){
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if (v.getId()==R.id.btnSeZoomOut){
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
        LatLng senecaNewMarket = new LatLng(44.035259, -79.474038);
        mMap.addMarker(new MarkerOptions().position(senecaNewMarket).title("New Market Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.logoseneca))).
                setSnippet("16655 Yonge St., Unit 3 Newmarket, Ontario L3X 1V6");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senecaNewMarket));


        // Add a marker in Toronto and move the camera
        LatLng senecaNewnham = new LatLng(44.796280, -79.347788);
        mMap.addMarker(new MarkerOptions().position(senecaNewnham).title("Newnhan Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.logoseneca))).
                setSnippet("1750 Finch Ave. East Toronto, Ontario M2J 2X5");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senecaNewnham));

        // Add a marker in Toronto and move the camera
        LatLng senecaMarkham = new LatLng(43.850114, -79.367448);
        mMap.addMarker(new MarkerOptions().position(senecaMarkham).title("Markham Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.logoseneca))).
                setSnippet("8 The Seneca Way(Highway 7 and Highway 404) Markham, Ontario L3R 5Y1");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senecaMarkham));

        // Add a marker in Toronto and move the camera
        LatLng senecaKing = new LatLng(43.955137, -79.518611);
        mMap.addMarker(new MarkerOptions().position(senecaKing).title("King Compus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.logoseneca))).
                setSnippet("13990 Dufferin St. King City, Ontario L7B 1B3");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senecaKing));

        // Add a marker in Toronto and move the camera
        LatLng senecaJane = new LatLng(43.718274, -79.509815);
        mMap.addMarker(new MarkerOptions().position(senecaJane).title("Jane Campus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.logoseneca))).
                setSnippet("21 Beverly Hills Drive Toronto, Ontario M3L 1A2");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senecaJane));

        // Add a marker in Toronto and move the camera
        LatLng senecaYork = new LatLng(43.771370, -79.498791);
        mMap.addMarker(new MarkerOptions().position(senecaYork).title("Jane Campus").
                icon(BitmapDescriptorFactory.fromResource(R.mipmap.logoseneca))).
                setSnippet("70 The Pond Road Toronto, Ontario M3J 3M6");
        //moves the camera focus to reffered latite and Altitute
        mMap.moveCamera(CameraUpdateFactory.newLatLng(senecaYork));

        mMap.animateCamera(CameraUpdateFactory.zoomTo(12),700, null);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.zoomTo(7.5f));;
    }
}
