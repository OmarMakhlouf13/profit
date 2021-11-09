package com.example.profit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Food extends AppCompatActivity {


    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        spinner= (Spinner) findViewById(R.id.spinner2);

        ArrayList<String> arraylist1=new ArrayList<>();
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
                if (pos==2){
                    Intent intent= new Intent(getApplicationContext(),Proten.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}