package com.example.profit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView welcome=findViewById(R.id.imgw);
        ImageView welcome1=findViewById(R.id.imgw1);

        Thread Welcome=new Thread(){
        public void run (){
            try {
                sleep(2000);
                Intent mainactivity=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainactivity);
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        };
        Welcome.start();

    }
}