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

public class CentennialCollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centennial_college);

        Button btnShowAll=(Button)findViewById(R.id.btnViewAllCenAddress);
        btnShowAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CentennialCollegeActivity.this,CentennialMapActivity.class));
            }
        });
        //Initializing string array and Assigning the CollegeName array into it.
        ListView mainContentLsView = (ListView) findViewById(R.id.centCollegeListView);
        final String[] CentennialCollege = getResources().getStringArray(R.array.centennial_college);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CentennialCollege);
        mainContentLsView.setAdapter(adapter);


        //onClick event listerns method
        mainContentLsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:

                        startActivity(new Intent(CentennialCollegeActivity.this,CentennialMapActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(CentennialCollegeActivity.this,CentennialMapActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(CentennialCollegeActivity.this,CentennialMapActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(CentennialCollegeActivity.this,CentennialMapActivity.class));
                        break;
                }
            }
        });



    }
}

