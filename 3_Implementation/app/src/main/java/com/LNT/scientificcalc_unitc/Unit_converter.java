package com.LNT.scientificcalc_unitc;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Unit_converter extends AppCompatActivity {
    EditText editText;
    TextView textView2, textView4, valueOfPounds;
    Button button, temp, length, distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueOfPounds = findViewById(R.id.valueOfPounds);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        temp = findViewById(R.id.temp);
        length = findViewById(R.id.length);
        distance = findViewById(R.id.distance);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                convertFromKillogramToPound();
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                convertFromCtoF();
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                convertFromCtoF();
            }
        });
        length.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                convertFromMtoCm();
            }
        });
        distance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                convertFromMtoKm();
            }
        });


    }

    private void convertFromKillogramToPound() {
        String kilogram=editText.getText().toString();
        Double kilo=Double.parseDouble(kilogram);
        double pounds=kilo*2.205;
        textView4.setText(""+ pounds+"P");
    }
    private void convertFromCtoF() {
        String celsius = editText.getText().toString();
        Double Cel = Double.parseDouble(celsius);
        double faherenheit = ((Cel) * (1.8)) + 32;
        textView4.setText("" + faherenheit +"F");
    }
    private void convertFromMtoCm() {
        String meter = editText.getText().toString();
        Double length = Double.parseDouble(meter);
        double Cmeter = length*100;
        textView4.setText("" + Cmeter +"cm");
    }
    private void convertFromMtoKm() {
        String meter = editText.getText().toString();
        Double distance = Double.parseDouble(meter);
        double Kmeter = distance/1000;
        textView4.setText("" + Kmeter +"Km");
    }
}
