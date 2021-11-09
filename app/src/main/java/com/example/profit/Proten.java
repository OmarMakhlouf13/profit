package com.example.profit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Proten extends AppCompatActivity {


    ListView Protens;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proten);

        spinner= (Spinner) findViewById(R.id.spinner1);

        ArrayList<String>arraylist1=new ArrayList<>();
        arraylist1.add(0,"Choose a page");
        arraylist1.add(1,"Home");
        arraylist1.add(2,"Protens");
        arraylist1.add(3,"FOOD");

        ArrayAdapter arrayAdapter1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arraylist1);

        spinner.setAdapter(arrayAdapter1);

    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
            if (pos==1){
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
            if (pos==3){
                Intent intent= new Intent(getApplicationContext(),Food.class);
                startActivity(intent);
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    });




        Protens= (ListView) findViewById(R.id.Protens);


        ArrayList<String>arrayList=new ArrayList<>();

        arrayList.add( "Gold Standard 100% Whey");
        arrayList.add("Syntha-6");
        arrayList.add("Pro JYM");
        arrayList.add("Dymatize ISO100");
        arrayList.add("Seriou Mass");
        arrayList.add("Nitro Tech");
        arrayList.add("Concentrate");
        arrayList.add("Isolate");
        arrayList.add("Pea Protein");
        arrayList.add("Transparent Labs");
        arrayList.add("Muscle Tech Phase");
        arrayList.add("BSN Syntha");
        arrayList.add("Optimum Nutrition Pro Complex");
        arrayList.add("Wheycombines ");
        arrayList.add("iftamper ");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);



        Protens.setAdapter(arrayAdapter);


    }


}