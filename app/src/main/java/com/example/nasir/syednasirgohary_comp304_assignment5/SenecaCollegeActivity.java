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

public class SenecaCollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seneca_college);

        //Reference to Buttons and its ClickEvenListener
        Button btnViewAllSenecaAddress=findViewById(R.id.btnViewAllSenecaAddresses);
        btnViewAllSenecaAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
            }
        });

        //Initializing string array and Assigning the CollegeName array into it.
        ListView senecaLsView = (ListView) findViewById(R.id.SenecaListView);
        final String[] SenecaCollege = getResources().getStringArray(R.array.seneca_college);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SenecaCollege);
        senecaLsView.setAdapter(adapter);

        senecaLsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:
                        startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(SenecaCollegeActivity.this,SenecaMapActivity.class));
                        break;
                }
            }
        });
    }
}
