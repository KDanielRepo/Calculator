package com.pkisi.dkuc.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calc extends AppCompatActivity implements View.OnClickListener {

    float a;
    float b;
    float c;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bCzyszczenie,bPotega,bPierwastek,bDzielenie,bMnozenie,bOdejmowanie,bPlus,bPrzecinek,bW;
    private TextView text;
    boolean set;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b0 = findViewById(R.id.b0);
        b0.setOnClickListener(this);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = findViewById(R.id.b9);
        b9.setOnClickListener(this);

        bCzyszczenie = findViewById(R.id.bCzyszczenie);
        bCzyszczenie.setOnClickListener(this);
        bPotega = findViewById(R.id.bPotega);
        bPotega.setOnClickListener(this);
        bPierwastek = findViewById(R.id.bPierwiastek);
        bPierwastek.setOnClickListener(this);
        bDzielenie = findViewById(R.id.bDzielenie);
        bDzielenie.setOnClickListener(this);
        bMnozenie = findViewById(R.id.bMnozenie);
        bMnozenie.setOnClickListener(this);
        bOdejmowanie = findViewById(R.id.bOdejmowanie);
        bOdejmowanie.setOnClickListener(this);
        bPlus = findViewById(R.id.bPlus);
        bPlus.setOnClickListener(this);
        bPrzecinek = findViewById(R.id.bPrzecinek);
        bPrzecinek.setOnClickListener(this);
        bW = findViewById(R.id.bW);
        bW.setOnClickListener(this);
        text = findViewById(R.id.Text);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b0:
                text.setText(text.getText()+"0");
                break;
            case R.id.b1:
                text.setText(text.getText()+"1");
                break;
            case R.id.b2:
                text.setText(text.getText()+"2");
                break;
            case R.id.b3:
                text.setText(text.getText()+"3");
                break;
            case R.id.b4:
                text.setText(text.getText()+"4");
                break;
            case R.id.b5:
                text.setText(text.getText()+"5");
                break;
            case R.id.b6:
                text.setText(text.getText()+"6");
                break;
            case R.id.b7:
                text.setText(text.getText()+"7");
                break;
            case R.id.b8:
                text.setText(text.getText()+"8");
                break;
            case R.id.b9:
                text.setText(text.getText()+"9");
                break;
            case R.id.bOdejmowanie:

                break;
            case R.id.bDzielenie:
                break;
            case R.id.bPlus:
                break;
            case R.id.bMnozenie:
                break;
            case R.id.bPotega:
                break;
            case R.id.bPierwiastek:
                break;
            case R.id.bPrzecinek:
                break;
            case R.id.bCzyszczenie:
                break;
            case R.id.bW:
                break;

        }
    }


    /*@Override
    public void onClick(View view) {
dodawanie
       a+b=c;
       bW=c;
       a=c;

odejmowanie
       a-b=c;
       bW=c;
       a=c;

mnozenie
       a*b=c;
       bW=c;
       a=c;

mnozenie
       a/b=c;
       bW=c;
       a=c;

potegowanie
       a*a=c;
       bW=c;
       a=c;

pierwiastkowanie
       Math.sqrt(a)=c;
       bW=c;
       a=c;

    }*/
}
