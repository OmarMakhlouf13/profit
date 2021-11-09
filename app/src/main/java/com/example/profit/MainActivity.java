package com.example.profit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textmain=findViewById(R.id.textMain);
        TextView textselect=findViewById(R.id.textSelect);
        ImageView imgmain=findViewById(R.id.imgm);
        ImageView imgpro=findViewById(R.id.proten);
        ImageView imgfood=findViewById(R.id.food);
        ImageView imgwele=findViewById(R.id.wele);
        Button buttonproten=findViewById(R.id.buttonProten);
        Button buttonfood=findViewById(R.id.buttonFood);
        Button buttonwele=findViewById(R.id.butwele);


        buttonproten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proten=new Intent(getApplicationContext(),Proten.class);
                startActivity(proten);

            }
        });
        buttonfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food=new Intent(getApplicationContext(),Food.class);
                startActivity(food);

            }
        });
        buttonwele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wele=new Intent(getApplicationContext(),wele.class);
                startActivity(wele);

            }
        });



    }
}