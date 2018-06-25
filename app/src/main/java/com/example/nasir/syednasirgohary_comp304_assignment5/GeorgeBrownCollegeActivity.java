package com.example.nasir.syednasirgohary_comp304_assignment5;
/*
 * Name: Syed Nasir Gohary
 * Subject: COMP304-003
 * Assignment05
 * Centennial College
 * Date: 2018/04/
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class GeorgeBrownCollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_george_brown_college);

        //Reference to button and setting its events listeners
        Button btnViewAllGbrownAddress=(Button)findViewById(R.id.btnViewAllGbrowAddress);
        btnViewAllGbrownAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GeorgeBrownCollegeActivity.this,GbrowMapActivity.class));
            }
        });

        //Initializing string array and Assigning the CollegeName array into it.
        ListView georgeBrownLsView = (ListView) findViewById(R.id.GeorgeBrownListView);
        final String[] G_BrownCollege = getResources().getStringArray(R.array.george_brown);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, G_BrownCollege);
        georgeBrownLsView.setAdapter(adapter);

        georgeBrownLsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(GeorgeBrownCollegeActivity.this,GbrowMapActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(GeorgeBrownCollegeActivity.this,GbrowMapActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(GeorgeBrownCollegeActivity.this,GbrowMapActivity.class));
                        break;
                }
            }
        });
    }
}
