package com.example.profit;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class wele extends AppCompatActivity {

    TextView textmain;
    TextView texth;
    TextView textw;
    TextView textl;
    TextView textcm;
    TextView textkg;
    TextView textres;
    EditText editcm;
    EditText editkg;
    Button buttoncal;
    Button buttonla;
    Button buttonsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wele);

         textmain=findViewById(R.id.text1);
         texth=findViewById(R.id.texth);
         textw=findViewById(R.id.textW);
         textl=findViewById(R.id.texth);
         textcm=findViewById(R.id.textcm);
         textkg=findViewById(R.id.textkg);
         textres=findViewById(R.id.textres);
         editcm=findViewById(R.id.edicm);
         editkg=findViewById(R.id.edikg);
         buttoncal=findViewById(R.id.butcalc);
         buttonla=findViewById(R.id.butlas);
         buttonsave=findViewById(R.id.butsave);

    }


    public void claculate(View view) {

        double n1=Double.parseDouble(String.valueOf(editkg.getText()));
        double n2=Double.parseDouble(String.valueOf(editcm.getText()));

        double result=n1*1.7;

        textres.setText("Needed protein in a day is: "+Double.toString(result)+" g");


    }

    public void load(View view) {

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson=new Gson();
        String str= prefs.getString("protein","");
        String proteinResult=gson.fromJson(str,String.class);
        textres.setText(proteinResult);
    }

    public void save(View view) {
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=prefs.edit();
        Gson gson=new Gson();
        String str= (String) textres.getText();
        String gsonString=gson.toJson(str);
        editor.putString("protein", gsonString);
        editor.commit();
    }
}