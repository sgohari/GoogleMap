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
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reference to ListView
        final ListView listView = (ListView) findViewById(R.id.mainListView);

        //Initializing string array and Assigning the CollegeName array into it.
        String[]seleccollege = getResources().getStringArray(R.array.college_names);

        //Initialzation and assigning of Array Adopter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, seleccollege);
        listView.setAdapter(adapter);

        //ListView onItemClicked Event Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        startActivity(new Intent(MainActivity.this,CentennialCollegeActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,SenecaCollegeActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,GeorgeBrownCollegeActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,MohawkCollegeActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,DurhamCollegeActivity.class));
                        break;
                }
            }
        });

    }
}
