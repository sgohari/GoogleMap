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

public class DurhamCollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durham_college);

        //Reference to Buttons and its ClickevenListener
        Button btnViewAllDurham=(Button)findViewById(R.id.btnViewAllDurhamAddress);
        btnViewAllDurham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DurhamCollegeActivity.this,DurhamMapActivity.class));
            }
        });

        //Initializing string array and Assigning the CollegeName array into it.
        ListView durhamLsView = (ListView) findViewById(R.id.DurhamListView);
        final String[] DurhamCollege = getResources().getStringArray(R.array.durham_college);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DurhamCollege);
        durhamLsView.setAdapter(adapter);

        durhamLsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(DurhamCollegeActivity.this,DurhamMapActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(DurhamCollegeActivity.this,DurhamMapActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(DurhamCollegeActivity.this,DurhamMapActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(DurhamCollegeActivity.this,DurhamMapActivity.class));
                        break;
                }
            }
        });

    }
}
